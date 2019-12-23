package com.xiaodao.datasource.aspect;


import com.xiaodao.core.enums.DataSourceType;
import com.xiaodao.core.utils.StringUtils;
import com.xiaodao.datasource.DynamicDataSourceContextHolder;
import com.xiaodao.datasource.annotation.DB;
import com.xiaodao.datasource.config.DruidProperties;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;


/**
 * 多数据源处理
 */

@Aspect
@Order(1)
@Component
public class DataSourceAspect {
    protected Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private DruidProperties druidProperties;

    @Around(value = "execution(* com.xiaodao..*ServiceImpl.*(..)) ")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        Class<?> className = point.getTarget().getClass();
        //获得访问的方法名
        String methodName = point.getSignature().getName();
        //得到方法的参数的类型
        Class[] argClass = ((MethodSignature) point.getSignature()).getParameterTypes();
        // 得到访问的方法对象
        Method method = className.getMethod(methodName, argClass);
        if (!druidProperties.slaveEnable) {
            return point.proceed();
        } else if (method.isAnnotationPresent(DB.class)) {
            return point.proceed();
        }else if (isSlave(methodName)) {
            // 标记为读库,可以自定义选择数据源
            DynamicDataSourceContextHolder.setDataSourceType(DataSourceType.SLAVE.name());
        } else {
            // 标记为写库
            DynamicDataSourceContextHolder.setDataSourceType(DataSourceType.MASTER.name());
        }

        try {
            return point.proceed();
        } finally {
            // 销毁数据源 在执行方法之后
            DynamicDataSourceContextHolder.clearDataSourceType();
        }
    }


    @Before(value = "@annotation(com.xiaodao.datasource.annotation.DB)")
    public void beforeSwitchDS(JoinPoint point) {
        //获得当前访问的class
        Class<?> className = point.getTarget().getClass();
        //获得访问的方法名
        String methodName = point.getSignature().getName();
        //得到方法的参数的类型
        Class[] argClass = ((MethodSignature) point.getSignature()).getParameterTypes();
        String dataSource = DynamicDataSourceContextHolder.getDataSourceType();
        try {
            // 得到访问的方法对象
            Method method = className.getMethod(methodName, argClass);
            // 判断是否存在@DS注解
            if (method.isAnnotationPresent(DB.class)) {
                DB annotation = method.getAnnotation(DB.class);
                // 取出注解中的数据源名
                dataSource = annotation.value();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 切换数据源
        DynamicDataSourceContextHolder.setDataSourceType(dataSource);
    }


    @After("@annotation(com.xiaodao.datasource.annotation.DB)")
    public void afterSwitchDS(JoinPoint point) {
        if (druidProperties.slaveEnable) {
            DynamicDataSourceContextHolder.setDataSourceType(DataSourceType.SLAVE.name());
        }
    }


    /**
     * 遇到开启事务时，将数据源切换为写
     */
    @Before("@annotation(org.springframework.transaction.annotation.Transactional)")
    public void setReadDataSourceType() {
        DynamicDataSourceContextHolder.setDataSourceType(DataSourceType.MASTER.name());
    }

    /**
     * 事务方法结束后，切换数据源为读
     */
    @After("@annotation(org.springframework.transaction.annotation.Transactional)")
    public void setWriteDataSourceType() {
        if (druidProperties.slaveEnable) {
            DynamicDataSourceContextHolder.setDataSourceType(DataSourceType.SLAVE.name());
        }
    }


    /**
     * 判断是否为读库
     *
     * @param methodName
     * @return
     */

    private boolean isSlave(String methodName) {
        // 方法名以query、find、get开头的方法名走从库
        return StringUtils.startsWithAny(methodName, new String[]{"query", "find", "get", "select"});
    }
}
