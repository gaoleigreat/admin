package com.xiaodao.auth.init;


import cn.hutool.core.collection.CollectionUtil;
import com.xiaodao.core.result.RespDataVO;
import com.xiaodao.core.result.RespVO;
import com.xiaodao.feign.system.client.SysMenuClient;
import com.xiaodao.admin.entity.SysMenu;
import com.xiaodao.admin.entity.SysPermission;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.mvc.condition.PatternsRequestCondition;
import org.springframework.web.servlet.mvc.condition.RequestMethodsRequestCondition;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@Component
@Slf4j
public class SysMenuInit implements ApplicationListener<ApplicationReadyEvent> {


    @Value("${spring.application.name}")
    private String serviceName;

    @Value("${server.servlet.context-path}")
    private String contextPath;


    @Value("${server.servlet.gateway.context-path:/}")
    private String gateWayPath;

    @Value("${spring.application.menu.name:系统管理}")
    private String muluName;


    @Autowired
    private WebApplicationContext applicationContext;

    @Autowired
    private SysMenuClient sysMenuClient;


    private void initSysMenu() {
        if (StringUtils.isEmpty(gateWayPath) || gateWayPath.equals("/")) {
            gateWayPath = "";
        }



        //1.扫描权限点
        List<SysPermission> permissions = getResources();


        Map<String, Map<String, List<SysPermission>>> map = permissions.stream()
                .collect(Collectors.groupingBy(SysPermission::getScope,
                        Collectors.groupingBy(SysPermission::getResourceId)));

        Set<Map.Entry<String, Map<String, List<SysPermission>>>> entries = map.entrySet();
        entries.forEach(e -> {
            //获取服务名 目录
            String serviceName = e.getKey();
            SysMenu mulu = new SysMenu();
            mulu.setParentId(0L);
            mulu.setMenuKey(serviceName);
            mulu.setMenuName(muluName);
            mulu.setUrl(gateWayPath + "/" + serviceName + "/view/");
            mulu.setPerms(serviceName);
            mulu.setMenuType("M");
            mulu.setOrderNum(0);
            mulu.setMetnod("GET");
            RespVO<RespDataVO<SysMenu>> respVOSysMenus = sysMenuClient.queryByCondition(mulu);
            if (respVOSysMenus.getRetCode() == 1 ) {
               List<SysMenu> sysMenus = respVOSysMenus.getInfo().getList();
               if (!CollectionUtil.isEmpty(sysMenus)){
                   mulu.setMenuId(sysMenus.get(0).getMenuId());
                   sysMenuClient.updateByPrimaryKey(mulu);
               }else {
                   sysMenuClient.insert(mulu);
               }
            }

            mulu = sysMenuClient.queryByCondition(mulu).getInfo().getList().get(0);
            Map<String, List<SysPermission>> value = e.getValue();
            Set<Map.Entry<String, List<SysPermission>>> entriesClass = value.entrySet();
            for (Map.Entry<String, List<SysPermission>> aClass : entriesClass) {
                List<SysPermission> sysPermissions = aClass.getValue();
                //类名称 key
                String className = aClass.getKey();
                SysMenu caiDan = new SysMenu();
                caiDan.setMenuType("C");
                caiDan.setParentId(mulu.getMenuId());
                caiDan.setMenuKey(className);
                caiDan.setMenuName(sysPermissions.get(0).getResourceName());
                caiDan.setOrderNum(0);
                caiDan.setUrl(mulu.getUrl() + "/" + className + "/view/");
                caiDan.setPerms(mulu.getPerms() + ":" + className);
                caiDan.setMetnod("GET");
                RespVO<RespDataVO<SysMenu>> respVOCaiDans = sysMenuClient.queryByCondition(caiDan);
                if (respVOCaiDans.getRetCode() == 1 ) {
                    List<SysMenu> caiDans = respVOCaiDans.getInfo().getList();
                    if (!CollectionUtil.isEmpty(caiDans)){
                        caiDan.setMenuId(caiDans.get(0).getMenuId());
                        sysMenuClient.updateByPrimaryKey(caiDan);
                    }else {
                        sysMenuClient.insert(caiDan);
                    }
                }

                RespVO<RespDataVO<SysMenu>> query = sysMenuClient.queryByCondition(caiDan);
                caiDan = query.getInfo().getList().get(0);
                //具体权限
                for (int i = 0; i < sysPermissions.size(); i++) {
                    SysMenu sysMenu = new SysMenu();
                    SysPermission s = sysPermissions.get(i);
                    sysMenu.setMenuName(s.getOperationId());
                    sysMenu.setMenuKey(s.getOperationMethod());
                    sysMenu.setUrl(gateWayPath + "/" + serviceName + s.getOperationUrl());
                    sysMenu.setPerms(caiDan.getPerms() + ":" + s.getOperationMethod());
                    sysMenu.setMenuType("F");
                    sysMenu.setOrderNum(0);
                    sysMenu.setParentId(caiDan.getMenuId());
                    sysMenu.setMetnod(s.getOperationType());


                    RespVO<RespDataVO<SysMenu>> respVOButtons = sysMenuClient.queryByCondition(sysMenu);
                    if (respVOCaiDans.getRetCode() == 1 ) {
                        List<SysMenu> buttons = respVOButtons.getInfo().getList();
                        if (!CollectionUtil.isEmpty(buttons)){
                            sysMenu.setMenuId(buttons.get(0).getMenuId());
                            sysMenuClient.updateByPrimaryKey(sysMenu);
                        }else {
                            sysMenuClient.insert(sysMenu);
                        }
                    }
                }


            }
        });


    }


    private List<SysPermission> getResources() {


        RequestMappingHandlerMapping mapping = applicationContext.getBean(RequestMappingHandlerMapping.class);
        // 获取url与类和方法的对应信息
        Map<RequestMappingInfo, HandlerMethod> map = mapping.getHandlerMethods();


        List<SysPermission> sysPermissions = new ArrayList<>();
        for (Map.Entry<RequestMappingInfo, HandlerMethod> m : map.entrySet()) {
            try {
                SysPermission sysPermission = new SysPermission();

                RequestMappingInfo info = m.getKey();
                HandlerMethod method = m.getValue();
                Class<?> beanType = method.getBeanType();
                Api apiAnnotation = beanType.getAnnotation(Api.class);
                String resourceId = apiAnnotation.value();
                String resourceName = StringUtils.join(apiAnnotation.tags(), ",");
                String className = method.getMethod().getDeclaringClass().getName();
                String methodName = method.getMethod().getName();
                ApiOperation apiOperation = method.getMethodAnnotation(ApiOperation.class);
                String operationDesc = apiOperation.notes();
                String operationValue = apiOperation.value();

                PatternsRequestCondition p = info.getPatternsCondition();
                for (String url : p.getPatterns()) {
                    sysPermission.setOperationUrl(url);
                }

                RequestMethodsRequestCondition methodsCondition = info.getMethodsCondition();
                for (RequestMethod requestMethod : methodsCondition.getMethods()) {
                    sysPermission.setOperationType(requestMethod.toString());
                }
                sysPermission.setResourceId(resourceId);
                sysPermission.setResourceName(resourceName);
                sysPermission.setResourceClass(className);
                sysPermission.setOperationId(operationValue);
                sysPermission.setOperationName(operationDesc);
                sysPermission.setOperationMethod(methodName);
                sysPermission.setScope(serviceName);
                sysPermissions.add(sysPermission);
            } catch (Exception e) {
                continue;
            }
        }
        return sysPermissions;

    }


    @Override
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
        try {
            Thread.sleep(20000);
            // 初始化服务权限
            initSysMenu();

        } catch (Exception e) {
            log.error("发生错误 {}", e.getMessage());
        }
    }
}
