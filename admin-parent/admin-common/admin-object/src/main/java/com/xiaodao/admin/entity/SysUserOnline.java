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
public class SysUserOnline extends BaseEntity {
    /**
     * 用户会话id
     */
    @JsonSerialize(using = ToStringSerializer.class)
    @ApiModelProperty("用户会话id")
    private String sessionid;
    /**
     * 登录账号
     */
    
    @ApiModelProperty("登录账号")
    private String loginName;
    /**
     * 部门名称
     */
    
    @ApiModelProperty("部门名称")
    private String deptName;
    /**
     * 登录IP地址
     */
    
    @ApiModelProperty("登录IP地址")
    private String ipaddr;
    /**
     * 登录地点
     */
    
    @ApiModelProperty("登录地点")
    private String loginLocation;
    /**
     * 浏览器类型
     */
    
    @ApiModelProperty("浏览器类型")
    private String browser;
    /**
     * 操作系统
     */
    
    @ApiModelProperty("操作系统")
    private String os;
    /**
     * 在线状态on_line在线off_line离线
     */
    
    @ApiModelProperty("在线状态on_line在线off_line离线")
    private String status;
    /**
     * session创建时间
     */
    
    @ApiModelProperty("session创建时间")
    private Date startTimestamp;
    /**
     * session最后访问时间
     */
    
    @ApiModelProperty("session最后访问时间")
    private Date lastAccessTime;
    /**
     * 超时时间，单位为分钟
     */
    
    @ApiModelProperty("超时时间，单位为分钟")
    private Integer expireTime;

}