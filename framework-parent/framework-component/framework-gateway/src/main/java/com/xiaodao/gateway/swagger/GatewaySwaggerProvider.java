package com.xiaodao.gateway.swagger;

import lombok.AllArgsConstructor;
import org.springframework.cloud.gateway.config.GatewayProperties;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.support.NameUtils;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaodao
 * @description
 * @since 2019/7/15
 **/
@Component
@Primary
@AllArgsConstructor
public class GatewaySwaggerProvider implements SwaggerResourcesProvider {

    public static final String API_URL = "/v2/api-docs";

    private final RouteLocator routeLocator;

    private final GatewayProperties gatewayProperties;


    @Override
    public List<SwaggerResource> get() {
      /*  List<SwaggerResource> swaggerResources = new ArrayList<>();
        swaggerResources.add(swaggerResource("用户服务","/api-exam-user/v2/api-docs")) ;
        swaggerResources.add(swaggerResource("工程服务","/api-project/v2/api-docs")) ;
        swaggerResources.add(swaggerResource("文件服务","/api-file/v2/api-docs")) ;
        swaggerResources.add(swaggerResource("沉降服务","/api-settlement/v2/api-docs")) ;
        swaggerResources.add(swaggerResource("报表服务","/api-report/v2/api-docs")) ;
        swaggerResources.add(swaggerResource("权限服务","/api-auth/v2/api-docs")) ;
        return swaggerResources;*/
        List<SwaggerResource> resources = new ArrayList<>();
        List<String> routes = new ArrayList<>();
        //取出gateway的route
        routeLocator.getRoutes().subscribe(route -> routes.add(route.getId()));
        //结合配置的route-路径(Path)，和route过滤，只获取有效的route节点
        gatewayProperties.getRoutes().stream().filter(routeDefinition -> routes.contains(routeDefinition.getId()))
                .forEach(routeDefinition -> routeDefinition.getPredicates().stream()
                        .filter(predicateDefinition -> ("Path").equalsIgnoreCase(predicateDefinition.getName()))
                        .forEach(predicateDefinition -> resources.add(swaggerResource(routeDefinition.getId(),
                                predicateDefinition.getArgs().get(NameUtils.GENERATED_NAME_PREFIX + "0")
                                        .replace("/**", API_URL)))));
        return resources;


    }


    private SwaggerResource swaggerResource(String name, String location) {
        SwaggerResource swaggerResource = new SwaggerResource();
        swaggerResource.setLocation(location);
        swaggerResource.setName(name);
        swaggerResource.setSwaggerVersion("2.0");
        return swaggerResource;
    }

}
