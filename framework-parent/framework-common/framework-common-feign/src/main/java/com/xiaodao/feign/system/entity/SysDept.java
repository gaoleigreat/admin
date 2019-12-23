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
public class SysDept extends BaseEntity {
    /**
     * 部门id
     */
    @JsonSerialize(using = ToStringSerializer.class)
    @ApiModelProperty("部门id")
    private Long deptId;
    /**
     * 父部门id
     */
    
    @ApiModelProperty("父部门id")
    private Integer parentId;
    /**
     * 祖级列表
     */
    
    @ApiModelProperty("祖级列表")
    private String ancestors;
    /**
     * 部门名称
     */
    
    @ApiModelProperty("部门名称")
    private String deptName;
    /**
     * 显示顺序
     */
    
    @ApiModelProperty("显示顺序")
    private Integer orderNum;
    /**
     * 负责人
     */
    
    @ApiModelProperty("负责人")
    private String leader;
    /**
     * 联系电话
     */
    
    @ApiModelProperty("联系电话")
    private String phone;
    /**
     * 邮箱
     */
    
    @ApiModelProperty("邮箱")
    private String email;
    /**
     * 部门状态（0正常 1停用）
     */
    
    @ApiModelProperty("部门状态（0正常 1停用）")
    private String status;
    /**
     * 删除标志（0代表存在 2代表删除）
     */
    
    @ApiModelProperty("删除标志（0代表存在 2代表删除）")
    private String delFlag;

}