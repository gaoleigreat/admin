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
public class GenTableColumn extends BaseEntity {
    /**
     * 编号
     */
    @JsonSerialize(using = ToStringSerializer.class)
    @ApiModelProperty("编号")
    private Long columnId;
    /**
     * 归属表编号
     */
    
    @ApiModelProperty("归属表编号")
    private String tableId;
    /**
     * 列名称
     */
    
    @ApiModelProperty("列名称")
    private String columnName;
    /**
     * 列描述
     */
    
    @ApiModelProperty("列描述")
    private String columnComment;
    /**
     * 列类型
     */
    
    @ApiModelProperty("列类型")
    private String columnType;
    /**
     * JAVA类型
     */
    
    @ApiModelProperty("JAVA类型")
    private String javaType;
    /**
     * JAVA字段名
     */
    
    @ApiModelProperty("JAVA字段名")
    private String javaField;
    /**
     * 是否主键（1是）
     */
    
    @ApiModelProperty("是否主键（1是）")
    private String isPk;
    /**
     * 是否自增（1是）
     */
    
    @ApiModelProperty("是否自增（1是）")
    private String isIncrement;
    /**
     * 是否必填（1是）
     */
    
    @ApiModelProperty("是否必填（1是）")
    private String isRequired;
    /**
     * 是否为插入字段（1是）
     */
    
    @ApiModelProperty("是否为插入字段（1是）")
    private String isInsert;
    /**
     * 是否编辑字段（1是）
     */
    
    @ApiModelProperty("是否编辑字段（1是）")
    private String isEdit;
    /**
     * 是否列表字段（1是）
     */
    
    @ApiModelProperty("是否列表字段（1是）")
    private String isList;
    /**
     * 是否查询字段（1是）
     */
    
    @ApiModelProperty("是否查询字段（1是）")
    private String isQuery;
    /**
     * 查询方式（等于、不等于、大于、小于、范围）
     */
    
    @ApiModelProperty("查询方式（等于、不等于、大于、小于、范围）")
    private String queryType;
    /**
     * 显示类型（文本框、文本域、下拉框、复选框、单选框、日期控件）
     */
    
    @ApiModelProperty("显示类型（文本框、文本域、下拉框、复选框、单选框、日期控件）")
    private String htmlType;
    /**
     * 字典类型
     */
    
    @ApiModelProperty("字典类型")
    private String dictType;
    /**
     * 排序
     */
    
    @ApiModelProperty("排序")
    private Integer sort;
    /**
     * 创建者
     */
    
    @ApiModelProperty("创建者")
    private Long createBy;
    /**
     * 创建时间
     */
    
    @ApiModelProperty("创建时间")
    private Date createTime;
    /**
     * 更新者
     */
    
    @ApiModelProperty("更新者")
    private Long updateBy;
    /**
     * 更新时间
     */
    
    @ApiModelProperty("更新时间")
    private Date updateTime;

}