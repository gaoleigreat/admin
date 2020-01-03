package com.xiaodao.feign.system.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.xiaodao.core.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;

@Data
@Slf4j
public class SysOss  extends BaseEntity{
    /**
     * 
     */
    @JsonSerialize(using = ToStringSerializer.class)
    @ApiModelProperty("")
    private Long id;
    /**
     * 文件名
     */
    
    @ApiModelProperty("文件名")
    private String fileName;
    /**
     * 文件后缀名
     */
    
    @ApiModelProperty("文件后缀名")
    private String fileSuffix;
    /**
     * URL地址
     */
    
    @ApiModelProperty("URL地址")
    private String url;

    /**
     * 服务商
     */
    
    @ApiModelProperty("服务商")
    private Long service;

}