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
@TableName("sys_oss")
public class SysOss  {


    /**
     *
     */
    @TableId
    @ApiModelProperty("")
    private Long id;


    /**
     *文件名
     */
    
    @ApiModelProperty("文件名")
    private String fileName;


    /**
     *文件后缀名
     */
    
    @ApiModelProperty("文件后缀名")
    private String fileSuffix;


    /**
     *URL地址
     */
    
    @ApiModelProperty("URL地址")
    private String url;


    /**
     *创建时间
     */
    
    @ApiModelProperty("创建时间")
    private Date createTime;


    /**
     *上传人
     */
    
    @ApiModelProperty("上传人")
    private Long createBy;


    /**
     *服务商
     */
    
    @ApiModelProperty("服务商")
    private Long service;


}