package com.xiaodao.admin.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.xiaodao.core.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;

@Data
@Slf4j
public class SysUser extends BaseEntity {
    /**
     * 用户ID
     */
    @JsonSerialize(using = ToStringSerializer.class)
    @ApiModelProperty("用户ID")
    private Long userId;
    /**
     * 部门ID
     */
    
    @ApiModelProperty("部门ID")
    private Long deptId;
    /**
     * 登录账号
     */
    
    @ApiModelProperty("登录账号")
    private String loginName;
    /**
     * 用户昵称
     */
    
    @ApiModelProperty("用户昵称")
    private String userName;
    /**
     * 用户类型（00系统用户）
     */
    
    @ApiModelProperty("用户类型（00系统用户）")
    private String userType;
    /**
     * 用户邮箱
     */
    
    @ApiModelProperty("用户邮箱")
    private String email;
    /**
     * 手机号码
     */
    
    @ApiModelProperty("手机号码")
    private String phonenumber;
    /**
     * 用户性别（0男 1女 2未知）
     */
    
    @ApiModelProperty("用户性别（0男 1女 2未知）")
    private String sex;
    /**
     * 头像路径
     */
    
    @ApiModelProperty("头像路径")
    private String avatar;
    /**
     * 密码
     */
    
    @ApiModelProperty("密码")
    private String password;
    /**
     * 盐加密
     */
    
    @ApiModelProperty("盐加密")
    private String salt;
    /**
     * 帐号状态（0正常 1停用）
     */
    
    @ApiModelProperty("帐号状态（0正常 1停用）")
    private String status;
    /**
     * 删除标志（0代表存在 2代表删除）
     */
    
    @ApiModelProperty("删除标志（0代表存在 2代表删除）")
    private String delFlag;
    /**
     * 最后登陆IP
     */
    
    @ApiModelProperty("最后登陆IP")
    private String loginIp;
    /**
     * 最后登陆时间
     */
    
    @ApiModelProperty("最后登陆时间")
    private Date loginDate;

}