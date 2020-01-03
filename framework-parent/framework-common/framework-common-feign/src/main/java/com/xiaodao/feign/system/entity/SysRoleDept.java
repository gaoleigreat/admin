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
public class SysRoleDept extends BaseEntity {
    /**
     * 角色ID
     */
    @JsonSerialize(using = ToStringSerializer.class)
    @ApiModelProperty("角色ID")
    private Long roleId;
    /**
     * 部门ID
     */
    @JsonSerialize(using = ToStringSerializer.class)
    @ApiModelProperty("部门ID")
    private Long deptId;

}