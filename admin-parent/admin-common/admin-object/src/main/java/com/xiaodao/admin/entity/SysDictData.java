package com.xiaodao.admin.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.xiaodao.core.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class SysDictData extends BaseEntity {
    /**
     * 字典编码
     */
    @JsonSerialize(using = ToStringSerializer.class)
    @ApiModelProperty("字典编码")
    private Integer dictCode;
    /**
     * 字典排序
     */
    
    @ApiModelProperty("字典排序")
    private Integer dictSort;
    /**
     * 字典标签
     */
    
    @ApiModelProperty("字典标签")
    private String dictLabel;
    /**
     * 字典键值
     */
    
    @ApiModelProperty("字典键值")
    private String dictValue;
    /**
     * 字典类型
     */
    
    @ApiModelProperty("字典类型")
    private String dictType;
    /**
     * 样式属性（其他样式扩展）
     */
    
    @ApiModelProperty("样式属性（其他样式扩展）")
    private String cssClass;
    /**
     * 表格回显样式
     */
    
    @ApiModelProperty("表格回显样式")
    private String listClass;
    /**
     * 是否默认（Y是 N否）
     */
    
    @ApiModelProperty("是否默认（Y是 N否）")
    private String isDefault;
    /**
     * 状态（0正常 1停用）
     */
    
    @ApiModelProperty("状态（0正常 1停用）")
    private String status;

}