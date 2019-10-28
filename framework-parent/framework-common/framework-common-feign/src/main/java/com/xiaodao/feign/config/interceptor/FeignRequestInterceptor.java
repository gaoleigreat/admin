package com.xiaodao.feign.config.interceptor;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

/**
 * Feign请求拦截器（设置请求头，传递请求参数）
 *
 * @Author xxx
 * @Date 2019/6/18 16:03
 * 说明：服务间进行feign调用时，不会传递请求头信息。
 * 通过实现RequestInterceptor接口，完成对所有的Feign请求,传递请求头和请求参数。
 */
@Component
public class FeignRequestInterceptor implements RequestInterceptor {

    @Value("${spring.application.name}")
    private String serviceName;

    @Override
    public void apply(RequestTemplate requestTemplate) {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        Enumeration<String> headerNames = request.getHeaderNames();
        if (headerNames != null) {
            while (headerNames.hasMoreElements()) {
                String name = headerNames.nextElement();
                String values = request.getHeader(name);
                if ("content-length".equals(name)){
                    continue;
                }
                requestTemplate.header(name, values);
            }
        }
        // 设置request中的attribute到header:主要是设置自行设置的token、userId等信息，以便转发到Feign调用的服务
        /*Enumeration<String> reqAttrbuteNames = request.getAttributeNames();
        if (reqAttrbuteNames != null) {
            while (reqAttrbuteNames.hasMoreElements()) {
                String attrName = reqAttrbuteNames.nextElement();
                String values = request.getAttribute(attrName).toString();
                requestTemplate.header(attrName, values);
            }
        }*/
        //requestTemplate.header("fromService", serviceName);
    }
}