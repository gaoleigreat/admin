package com.xiaodao.system.entity.entity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import java.util.Date;
import java.io.Serializable;
@Data
@TableName("sys_role")
public class SysRole  {


    /**
     *角色ID
     */
    @TableId
    @ApiModelProperty("角色ID")
    private Long roleId;


    /**
     *角色名称
     */
    
    @ApiModelProperty("角色名称")
    private String roleName;


    /**
     *角色权限字符串
     */
    
    @ApiModelProperty("角色权限字符串")
    private String roleKey;


    /**
     *显示顺序
     */
    
    @ApiModelProperty("显示顺序")
    private Integer roleSort;


    /**
     *数据范围（1：全部数据权限 2：自定数据权限）
     */
    
    @ApiModelProperty("数据范围（1：全部数据权限 2：自定数据权限）")
    private String dataScope;


    /**
     *角色状态（0正常 1停用）
     */
    
    @ApiModelProperty("角色状态（0正常 1停用）")
    private String status;


    /**
     *删除标志（0代表存在 2代表删除）
     */
    
    @ApiModelProperty("删除标志（0代表存在 2代表删除）")
    private String delFlag;


    /**
     *创建者
     */
    
    @ApiModelProperty("创建者")
    private Long createBy;


    /**
     *创建时间
     */
    
    @ApiModelProperty("创建时间")
    private Date createTime;


    /**
     *更新者
     */
    
    @ApiModelProperty("更新者")
    private Long updateBy;


    /**
     *更新时间
     */
    
    @ApiModelProperty("更新时间")
    private Date updateTime;


    /**
     *备注
     */
    
    @ApiModelProperty("备注")
    private String remark;


}