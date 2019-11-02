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
@TableName("gen_table")
public class GenTable implements Serializable {

     private static final long serialVersionUID = 1L;


    /**
     *编号
     */
    @TableId
    @ApiModelProperty("编号")
    private Long tableId;


    /**
     *表名称
     */
    
    @ApiModelProperty("表名称")
    private String tableName;


    /**
     *表描述
     */
    
    @ApiModelProperty("表描述")
    private String tableComment;


    /**
     *实体类名称
     */
    
    @ApiModelProperty("实体类名称")
    private String className;


    /**
     *使用的模板（crud单表操作 tree树表操作）
     */
    
    @ApiModelProperty("使用的模板（crud单表操作 tree树表操作）")
    private String tplCategory;


    /**
     *生成包路径
     */
    
    @ApiModelProperty("生成包路径")
    private String packageName;


    /**
     *生成模块名
     */
    
    @ApiModelProperty("生成模块名")
    private String moduleName;


    /**
     *生成业务名
     */
    
    @ApiModelProperty("生成业务名")
    private String businessName;


    /**
     *生成功能名
     */
    
    @ApiModelProperty("生成功能名")
    private String functionName;


    /**
     *生成功能作者
     */
    
    @ApiModelProperty("生成功能作者")
    private String functionAuthor;


    /**
     *其它生成选项
     */
    
    @ApiModelProperty("其它生成选项")
    private String options;


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