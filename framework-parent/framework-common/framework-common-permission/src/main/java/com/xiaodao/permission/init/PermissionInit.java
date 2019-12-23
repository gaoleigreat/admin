//package com.xiaodao.permission.init;
//
//
//import com.xiaodao.core.result.RespDataVO;
//import com.xiaodao.core.result.RespVO;
//import com.xiaodao.feign.system.client.BaseServiceClient;
//import com.xiaodao.feign.system.client.SysMenuClient;
//import com.xiaodao.feign.system.client.SysPermissionClient;
//import com.xiaodao.feign.system.entity.BaseService;
//import com.xiaodao.feign.system.entity.SysMenu;
//import com.xiaodao.feign.system.entity.SysPermission;
//import com.xiaodao.permission.annotion.Operation;
//import com.xiaodao.permission.annotion.Resource;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
//import lombok.extern.slf4j.Slf4j;
//import org.apache.commons.collections4.CollectionUtils;
//import org.apache.commons.lang.StringUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.context.event.ApplicationReadyEvent;
//import org.springframework.context.ApplicationListener;
//import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
//import org.springframework.core.io.support.ResourcePatternResolver;
//import org.springframework.core.type.AnnotationMetadata;
//import org.springframework.core.type.MethodMetadata;
//import org.springframework.core.type.classreading.CachingMetadataReaderFactory;
//import org.springframework.core.type.classreading.MetadataReader;
//import org.springframework.core.type.classreading.MetadataReaderFactory;
//import org.springframework.core.type.filter.AnnotationTypeFilter;
//import org.springframework.core.type.filter.TypeFilter;
//import org.springframework.stereotype.Component;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.context.WebApplicationContext;
//import org.springframework.web.method.HandlerMethod;
//import org.springframework.web.servlet.mvc.condition.PatternsRequestCondition;
//import org.springframework.web.servlet.mvc.condition.RequestMethodsRequestCondition;
//import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
//import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;
//
//import java.util.*;
//import java.util.stream.Collectors;
//
//@Component
//@Slf4j
//public class PermissionInit implements ApplicationListener<ApplicationReadyEvent> {
//
//
//    @Value("${spring.application.name}")
//    private String serviceName;
//
//    @Value("${server.servlet.context-path}")
//    private String contextPath;
//
//    private static String serviceKey;
//
//    private static Set<String> serviceAuthorized = new HashSet<>();
//
//    @Autowired
//    private SysPermissionClient sysPermissionClient;
//
//    @Autowired
//    private BaseServiceClient baseServiceClient;
//
//    @Autowired
//    private WebApplicationContext applicationContext;
//
//    @Autowired
//    private SysMenuClient sysMenuClient;
//
//
//    private void initUserPermission() {
//
//
//        //1.扫描权限点
//        List<SysPermission> permissions = getResources();
//        Map<String, List<SysPermission>> collect = permissions.stream().collect(Collectors.groupingBy(SysPermission::getResourceId));
//        Set<Map.Entry<String, List<SysPermission>>> entries = collect.entrySet();
//        entries.forEach(e -> {
//            SysMenu sysMenu = new SysMenu();
//            sysMenu.setMenuName(e.getValue().get(0).getResourceName());
//            sysMenu.setMenuKey(e.getValue().get(0).getResourceId());
//            sysMenu.setMenuType("C");
//            sysMenu.setUrl(e.getValue().get(0).getScope() + "/" +e.getValue().get(0).getResourceId() );
//            sysMenu.setPerms(sysMenu.getUrl().replace("/", ":"));
//
//            sysMenu.setVisible("0");
//            sysMenu.setRemark(sysMenu.getMenuName());
//            SysMenu sysMenu1 = new SysMenu();
//            sysMenu1.setMenuKey(e.getValue().get(0).getScope());
//            RespVO<RespDataVO<SysMenu>> query = sysMenuClient.query(sysMenu1);
//            if (query.getRetCode() == 1){
//                List<SysMenu> list = query.getInfo().getList();
//                if (!CollectionUtils.isEmpty(list)){
//                    sysMenu.setParentId(list.get(0).getMenuId());
//                }
//            }
//            sysMenuClient.insert(sysMenu);
//        });
//        //2.权限点插入数据库
//        RespVO respVO = sysPermissionClient.batchUpsert(permissions);
//    }
//
//    private void initServicePermission() {
//        BaseService baseService = new BaseService();
//        baseService.setServiceName(serviceName);
//        RespVO<RespDataVO<BaseService>> respDataVORespVO = baseServiceClient.queryByCondition(baseService);
//        if (respDataVORespVO.getRetCode() == 1) {
//            List<BaseService> baseServices = respDataVORespVO.getInfo().getList();
//
//            if (CollectionUtils.isEmpty(baseServices)) {
//                baseServices = new ArrayList<>();
//                baseService.setContextPath(contextPath);
//                baseServices.add(baseService);
//                baseServiceClient.batchInsert(baseServices);
//            }
//            SysMenu sysMenu1 = new SysMenu();
//            sysMenu1.setMenuKey(serviceName);
//            RespVO<RespDataVO<SysMenu>> query = sysMenuClient.query(sysMenu1);
//            if (query.getRetCode() == 1 && CollectionUtils.isEmpty(query.getInfo().getList())){
//                for (int i=0;i<baseServices.size();i++){
//                    SysMenu sysMenu = new SysMenu();
//                    sysMenu.setVisible("0");
//                    sysMenu.setMenuKey(serviceName);
//                    sysMenu.setMenuName(serviceName);
//                    sysMenu.setMenuType("M");
//                    sysMenu.setUrl(serviceName);
//                    sysMenu.setPerms(serviceName);
//                    sysMenu.setOrderNum(i);
//                    sysMenu.setParentId(0L);
//                    sysMenuClient.insert(sysMenu);
//                }
//            }
//
//
//        }
////        else {
////            throw new RuntimeException("服务未启动");
////        }
//
////
////        ServicePermission servicePermission = new ServicePermission();
////        servicePermission.setServiceName(serviceName);
////        List<ServicePermission> servicePermissions = securityFeignClient.findServicePermissionList(serviceName);
////        if (!CollectionUtils.isEmpty(servicePermissions)) {
////            Set<String> set = new HashSet<>();
////            for (ServicePermission permission : servicePermissions) {
////                if (null == permission || StringUtils.isEmpty(permission.getAuthorized())) {
////                    continue;
////                }
////                set.add(permission.getAuthorized());
////            }
////            ServicePermissionContext.setServiceAuthorized(set);
////        }
//    }
//
//
//    private List<SysPermission> getResources() {
//
//
//        RequestMappingHandlerMapping mapping = applicationContext.getBean(RequestMappingHandlerMapping.class);
//        // 获取url与类和方法的对应信息
//        Map<RequestMappingInfo, HandlerMethod> map = mapping.getHandlerMethods();
//
//
//        List<SysPermission> sysPermissions = new ArrayList<>();
//        for (Map.Entry<RequestMappingInfo, HandlerMethod> m : map.entrySet()) {
//            try {
//                SysPermission sysPermission = new SysPermission();
//
//                RequestMappingInfo info = m.getKey();
//                HandlerMethod method = m.getValue();
//                Class<?> beanType = method.getBeanType();
//                Api apiAnnotation = beanType.getAnnotation(Api.class);
//                String resourceId = apiAnnotation.value();
//                String resourceName = StringUtils.join(apiAnnotation.tags(), ",");
//                String className = method.getMethod().getDeclaringClass().getName();
//                String methodName = method.getMethod().getName();
//                ApiOperation apiOperation = method.getMethodAnnotation(ApiOperation.class);
//                String operationDesc = apiOperation.value();
//
//                PatternsRequestCondition p = info.getPatternsCondition();
//                for (String url : p.getPatterns()) {
//                    sysPermission.setOperationUrl(url);
//                }
//
//                RequestMethodsRequestCondition methodsCondition = info.getMethodsCondition();
//                for (RequestMethod requestMethod : methodsCondition.getMethods()) {
//                    sysPermission.setOperationType(requestMethod.toString());
//                }
//                sysPermission.setResourceId(resourceId);
//                sysPermission.setResourceName(resourceName);
//                sysPermission.setResourceClass(className);
//                sysPermission.setOperationId(methodName);
//                sysPermission.setOperationName(operationDesc);
//                sysPermission.setOperationMethod(methodName);
//                sysPermission.setScope(serviceName);
//                sysPermissions.add(sysPermission);
//            } catch (Exception e) {
//                log.error("sysPermissionSize: {}", sysPermissions.size());
//                log.error("sysPermission: {}", sysPermissions);
//                continue;
//            }
//            //sysPermissionClient.insert(sysPermission);
//        }
//        return sysPermissions;
//
//    }
//
//    private List<SysPermission> getResource() {
//        List<SysPermission> permissionList = new ArrayList<>();
//        ResourcePatternResolver resourcePatternResolver = new PathMatchingResourcePatternResolver();
//        MetadataReaderFactory metadataReaderFactory = new CachingMetadataReaderFactory();
//        String basePath = ResourcePatternResolver.CLASSPATH_ALL_URL_PREFIX + "/com/xiaodao/**/controller/*Controller.class";
//
//        try {
//
//            org.springframework.core.io.Resource[] resources = resourcePatternResolver.getResources(basePath);
//            TypeFilter typeFilter = new AnnotationTypeFilter(Resource.class);
//
//            for (org.springframework.core.io.Resource resource : resources) {
//
//                MetadataReader metadataReader = metadataReaderFactory.getMetadataReader(resource);
//                if (typeFilter.match(metadataReader, metadataReaderFactory)) {
//                    String resourceId = "";
//                    String resourceName = "";
//                    String resourcePath = "";
//                    AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
//                    Map<String, Object> classMap = annotationMetadata.getAnnotationAttributes(Resource.class.getName());
//                    for (Map.Entry<String, Object> entry : classMap.entrySet()) {
//                        //Resource anno = (Resource) entry.getValue();
//                        if ("value".endsWith(entry.getKey())) {
//                            resourceId = (String) entry.getValue();
//                        }
//                        if ("desc".endsWith(entry.getKey())) {
//                            resourceName = (String) entry.getValue();
//                        }
//                        if ("path".endsWith(entry.getKey())) {
//                            resourcePath = (String) entry.getValue();
//                        }
//                    }
//                    Set<MethodMetadata> set = annotationMetadata.getAnnotatedMethods(Operation.class.getName());
//                    for (MethodMetadata methodMetadata : set) {
//                        SysPermission permission = new SysPermission();
//                        permission.setResourceId(resourceId);
//                        permission.setResourceName(resourceName);
//                        //permission.set(resourcePath);
//                        //  permission.setCreateBy(1L);
//                        // permission.setCreateTime(new Date());
//                        Map<String, Object> methodMap = methodMetadata.getAnnotationAttributes(Operation.class.getName());
//                        for (Map.Entry<String, Object> entry : methodMap.entrySet()) {
//                            if ("value".endsWith(entry.getKey())) {
//                                permission.setOperationId((String) entry.getValue());
//                            }
//                            if ("desc".endsWith(entry.getKey())) {
//                                permission.setOperationName((String) entry.getValue());
//                            }
//
//                            if ("method".endsWith(entry.getKey())) {
//                                RequestMethod[] methods = (RequestMethod[]) entry.getValue();
//                                String str1 = StringUtils.join(methods, ",");
//                                permission.setOperationMethod(str1);
//                            }
//                        }
//                        permission.setScope(serviceName);
//                        permissionList.add(permission);
//                    }
//                }
//            }
//        } catch (Exception e) {
//            log.error("get permission resource error|", e);
//        }
//        return permissionList;
//    }
//
//
//    @Override
//    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
//        try {
//            Thread.sleep(20000);
//            // 初始化服务权限
//            initServicePermission();
//            //初始化用户权限
//            initUserPermission();
//        } catch (Exception e) {
//            log.error("发生错误 {}", e.getMessage());
//            // run(args);
//        }
//    }
//}
