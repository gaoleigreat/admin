package com.xiaodao.admin.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.xiaodao.core.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class SysDictType extends BaseEntity {
    /**
     * 字典主键
     */
    @JsonSerialize(using = ToStringSerializer.class)
    @ApiModelProperty("字典主键")
    private Long dictId;
    /**
     * 字典名称
     */
    
    @ApiModelProperty("字典名称")
    private String dictName;
    /**
     * 字典类型
     */
    
    @ApiModelProperty("字典类型")
    private String dictType;
    /**
     * 状态（0正常 1停用）
     */
    
    @ApiModelProperty("状态（0正常 1停用）")
    private String status;

}