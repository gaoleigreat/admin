package com.xiaodao.admin.entity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

@Data
@Slf4j
public class SysPermission implements Serializable {

     private static final long serialVersionUID = 1L;


    /**
     *id(权限点)
     */
    @ApiModelProperty("id(权限点)")
    private Long permissionId;


    /**
     *资源id
     */
    
    @ApiModelProperty("资源id")
    private String resourceId;


    /**
     *资源名称
     */
    
    @ApiModelProperty("资源名称")
    private String resourceName;


    /**
     *资源类名称
     */
    
    @ApiModelProperty("资源类名称")
    private String resourceClass;


    /**
     *操作id
     */
    
    @ApiModelProperty("操作id")
    private String operationId;


    /**
     *操作名称
     */
    
    @ApiModelProperty("操作名称")
    private String operationName;


    /**
     *操作方法名称
     */
    
    @ApiModelProperty("操作方法名称")
    private String operationMethod;


    /**
     *操作方法(GET, HEAD, POST, PUT, PATCH, DELETE, OPTIONS, TRACE)
     */
    
    @ApiModelProperty("操作方法(GET, HEAD, POST, PUT, PATCH, DELETE, OPTIONS, TRACE)")
    private String operationType;


    /**
     *接口url
     */
    
    @ApiModelProperty("接口url")
    private String operationUrl;


    /**
     *应用范围
     */
    
    @ApiModelProperty("应用范围")
    private String scope;


}