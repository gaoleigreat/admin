package com.xiaodao.admin.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.xiaodao.core.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class BaseService extends BaseEntity {
    /**
     * 服务Id
     */
    @JsonSerialize(using = ToStringSerializer.class)
    @ApiModelProperty("服务Id")
    private Long serviceId;
    /**
     * 服务名
     */
    
    @ApiModelProperty("服务名")
    private String serviceName;
    /**
     * 服务路径
     */
    
    @ApiModelProperty("服务路径")
    private String contextPath;

}