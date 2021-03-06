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
public class SysOperLog extends BaseEntity {
    /**
     * 日志主键
     */
    @JsonSerialize(using = ToStringSerializer.class)
    @ApiModelProperty("日志主键")
    private Long operId;
    /**
     * 模块标题
     */
    
    @ApiModelProperty("模块标题")
    private String title;
    /**
     * 业务类型（0其它 1新增 2修改 3删除）
     */
    
    @ApiModelProperty("业务类型（0其它 1新增 2修改 3删除）")
    private Integer businessType;
    /**
     * 方法名称
     */
    
    @ApiModelProperty("方法名称")
    private String method;
    /**
     * 请求方式
     */
    
    @ApiModelProperty("请求方式")
    private String requestMethod;
    /**
     * 操作类别（0其它 1后台用户 2手机端用户）
     */
    
    @ApiModelProperty("操作类别（0其它 1后台用户 2手机端用户）")
    private Integer operatorType;
    /**
     * 操作人员
     */
    
    @ApiModelProperty("操作人员")
    private String operName;
    /**
     * 部门名称
     */
    
    @ApiModelProperty("部门名称")
    private String deptName;
    /**
     * 请求URL
     */
    
    @ApiModelProperty("请求URL")
    private String operUrl;
    /**
     * 主机地址
     */
    
    @ApiModelProperty("主机地址")
    private String operIp;
    /**
     * 操作地点
     */
    
    @ApiModelProperty("操作地点")
    private String operLocation;
    /**
     * 请求参数
     */
    
    @ApiModelProperty("请求参数")
    private String operParam;
    /**
     * 操作状态（0正常 1异常）
     */
    
    @ApiModelProperty("操作状态（0正常 1异常）")
    private Integer status;
    /**
     * 错误消息
     */
    
    @ApiModelProperty("错误消息")
    private String errorMsg;
    /**
     * 操作时间
     */
    
    @ApiModelProperty("操作时间")
    private Date operTime;

}