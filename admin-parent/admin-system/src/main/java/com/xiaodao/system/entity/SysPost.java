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
@TableName("sys_post")
public class SysPost implements Serializable {

     private static final long serialVersionUID = 1L;


    /**
     *岗位ID
     */
    @TableId
    @ApiModelProperty("岗位ID")
    private Long postId;


    /**
     *岗位编码
     */
    
    @ApiModelProperty("岗位编码")
    private String postCode;


    /**
     *岗位名称
     */
    
    @ApiModelProperty("岗位名称")
    private String postName;


    /**
     *显示顺序
     */
    
    @ApiModelProperty("显示顺序")
    private Integer postSort;


    /**
     *状态（0正常 1停用）
     */
    
    @ApiModelProperty("状态（0正常 1停用）")
    private String status;


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