package com.xiaodao.system.entity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import java.util.Date;
import java.io.Serializable;
@Data
@Slf4j
@TableName("sys_logininfor")
public class SysLogininfor implements Serializable {

     private static final long serialVersionUID = 1L;


    /**
     *访问ID
     */
    @TableId
    @ApiModelProperty("访问ID")
    private Long infoId;


    /**
     *登录账号
     */
    
    @ApiModelProperty("登录账号")
    private String loginName;


    /**
     *登录IP地址
     */
    
    @ApiModelProperty("登录IP地址")
    private String ipaddr;


    /**
     *登录地点
     */
    
    @ApiModelProperty("登录地点")
    private String loginLocation;


    /**
     *浏览器类型
     */
    
    @ApiModelProperty("浏览器类型")
    private String browser;


    /**
     *操作系统
     */
    
    @ApiModelProperty("操作系统")
    private String os;


    /**
     *登录状态（0成功 1失败）
     */
    
    @ApiModelProperty("登录状态（0成功 1失败）")
    private String status;


    /**
     *提示消息
     */
    
    @ApiModelProperty("提示消息")
    private String msg;


    /**
     *访问时间
     */
    
    @ApiModelProperty("访问时间")
    private Date loginTime;


}