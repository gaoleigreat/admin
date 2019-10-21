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
@TableName("sys_notice")
public class SysNotice extends BaseEntity implements Serializable {

     private static final long serialVersionUID = 1L;


     /**
     *公告ID
     */
    @TableId
    @ApiModelProperty("公告ID")
    private Long noticeId;


     /**
     *公告标题
     */
    
    @ApiModelProperty("公告标题")
    private String noticeTitle;


     /**
     *公告类型（1通知 2公告）
     */
    
    @ApiModelProperty("公告类型（1通知 2公告）")
    private String noticeType;


     /**
     *公告内容
     */
    
    @ApiModelProperty("公告内容")
    private String noticeContent;


     /**
     *公告状态（0正常 1关闭）
     */
    
    @ApiModelProperty("公告状态（0正常 1关闭）")
    private String status;


     /**
     *创建者
     */
    
    @ApiModelProperty("创建者")
    private Long bigint;


    
    
    
    


    
    
    
    


    
    
    
    


     /**
     *备注
     */
    
    @ApiModelProperty("备注")
    private String remark;


}