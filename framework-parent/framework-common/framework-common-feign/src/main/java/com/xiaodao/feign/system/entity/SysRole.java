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
public class SysRole extends BaseEntity {
    /**
     * 角色ID
     */
    @JsonSerialize(using = ToStringSerializer.class)
    @ApiModelProperty("角色ID")
    private Long roleId;
    /**
     * 角色名称
     */
    
    @ApiModelProperty("角色名称")
    private String roleName;
    /**
     * 角色权限字符串
     */
    
    @ApiModelProperty("角色权限字符串")
    private String roleKey;
    /**
     * 显示顺序
     */
    
    @ApiModelProperty("显示顺序")
    private Integer roleSort;
    /**
     * 数据范围（1：全部数据权限 2：自定数据权限）
     */
    
    @ApiModelProperty("数据范围（1：全部数据权限 2：自定数据权限）")
    private String dataScope;
    /**
     * 角色状态（0正常 1停用）
     */
    
    @ApiModelProperty("角色状态（0正常 1停用）")
    private String status;
    /**
     * 删除标志（0代表存在 2代表删除）
     */
    
    @ApiModelProperty("删除标志（0代表存在 2代表删除）")
    private String delFlag;

}