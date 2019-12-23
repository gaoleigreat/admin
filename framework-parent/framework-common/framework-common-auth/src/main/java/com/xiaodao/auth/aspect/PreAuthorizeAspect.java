package com.xiaodao.auth.aspect;


import com.xiaodao.auth.annotation.HasPermissions;
import com.xiaodao.core.constant.Constants;
import com.xiaodao.core.exception.ForbiddenException;
import com.xiaodao.core.result.RespDataVO;
import com.xiaodao.core.result.RespVO;
import com.xiaodao.core.utils.ServletUtils;
import com.xiaodao.feign.system.client.SysMenuClient;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Optional;

@Aspect
@Component
@Slf4j
public class PreAuthorizeAspect {
    @Autowired
    private SysMenuClient sysMenuClient;

    @Around("@annotation(com.xiaodao.auth.annotation.HasPermissions)")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        Signature signature = point.getSignature();
        MethodSignature methodSignature = (MethodSignature) signature;
        Method method = methodSignature.getMethod();
        HasPermissions annotation = method.getAnnotation(HasPermissions.class);
        if (annotation == null) {
            return point.proceed();
        }
        String authority = new StringBuilder(annotation.value()).toString();
        if (has(authority)) {
            return point.proceed();
        } else {
            throw new ForbiddenException();
        }
    }

    private boolean has(String authority) {
        // 用超管帐号方便测试，拥有所有权限
        HttpServletRequest request = ServletUtils.getRequest();
        String tmpUserKey = request.getHeader(Constants.CURRENT_ID);
        if (Optional.ofNullable(tmpUserKey).isPresent()) {
            Long userId = Long.valueOf(tmpUserKey);
            log.debug("userid:{}", userId);
            if (userId.longValue() == 1L) {
                return true;
            }
            RespVO<RespDataVO<String>> respDataVORespVO = sysMenuClient.selectPermsByUserId(userId);
            if (respDataVORespVO.getRetCode() == 1) {
                List<String> permissions = respDataVORespVO.getInfo().getList();
                if (!CollectionUtils.isEmpty(permissions)) {
                    return permissions.stream().anyMatch(authority::equals);
                }
            }
        }
        return false;
    }
}