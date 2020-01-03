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
public class SysLogininfor extends BaseEntity {
    /**
     * 访问ID
     */
    @JsonSerialize(using = ToStringSerializer.class)
    @ApiModelProperty("访问ID")
    private Long infoId;
    /**
     * 登录账号
     */
    
    @ApiModelProperty("登录账号")
    private String loginName;
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
     * 登录状态（0成功 1失败）
     */
    
    @ApiModelProperty("登录状态（0成功 1失败）")
    private String status;
    /**
     * 提示消息
     */
    
    @ApiModelProperty("提示消息")
    private String msg;
    /**
     * 访问时间
     */
    
    @ApiModelProperty("访问时间")
    private Date loginTime;

}