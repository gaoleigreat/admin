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
public class SysConfig extends BaseEntity {
    /**
     * 参数主键
     */
    @JsonSerialize(using = ToStringSerializer.class)
    @ApiModelProperty("参数主键")
    private Long configId;
    /**
     * 参数名称
     */
    
    @ApiModelProperty("参数名称")
    private String configName;
    /**
     * 参数键名
     */
    
    @ApiModelProperty("参数键名")
    private String configKey;
    /**
     * 参数键值
     */
    
    @ApiModelProperty("参数键值")
    private String configValue;
    /**
     * 系统内置（Y是 N否）
     */
    
    @ApiModelProperty("系统内置（Y是 N否）")
    private String configType;

}