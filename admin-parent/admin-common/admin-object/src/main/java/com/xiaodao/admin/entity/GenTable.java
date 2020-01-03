package com.xiaodao.admin.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.xiaodao.core.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class GenTable extends BaseEntity {
    /**
     * 编号
     */
    @JsonSerialize(using = ToStringSerializer.class)
    @ApiModelProperty("编号")
    private Long tableId;
    /**
     * 表名称
     */
    
    @ApiModelProperty("表名称")
    private String tableName;
    /**
     * 表描述
     */
    
    @ApiModelProperty("表描述")
    private String tableComment;
    /**
     * 实体类名称
     */
    
    @ApiModelProperty("实体类名称")
    private String className;
    /**
     * 使用的模板（crud单表操作 tree树表操作）
     */
    
    @ApiModelProperty("使用的模板（crud单表操作 tree树表操作）")
    private String tplCategory;
    /**
     * 生成包路径
     */
    
    @ApiModelProperty("生成包路径")
    private String packageName;
    /**
     * 生成模块名
     */
    
    @ApiModelProperty("生成模块名")
    private String moduleName;
    /**
     * 生成业务名
     */
    
    @ApiModelProperty("生成业务名")
    private String businessName;
    /**
     * 生成功能名
     */
    
    @ApiModelProperty("生成功能名")
    private String functionName;
    /**
     * 生成功能作者
     */
    
    @ApiModelProperty("生成功能作者")
    private String functionAuthor;
    /**
     * 其它生成选项
     */
    
    @ApiModelProperty("其它生成选项")
    private String options;

}