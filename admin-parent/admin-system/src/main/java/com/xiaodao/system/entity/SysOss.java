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
@TableName("sys_oss")
public class SysOss extends BaseEntity implements Serializable {

     private static final long serialVersionUID = 1L;


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
     *服务商
     */
    
    @ApiModelProperty("服务商")
    private Long service;


}