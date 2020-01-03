package com.xiaodao.admin.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.xiaodao.core.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class Districts extends BaseEntity {
    /**
     * 编号
     */
    @JsonSerialize(using = ToStringSerializer.class)
    @ApiModelProperty("编号")
    private Integer id;
    /**
     * 上级编号
     */
    
    @ApiModelProperty("上级编号")
    private Integer pid;
    /**
     * 层级
     */
    
    @ApiModelProperty("层级")
    private Long deep;
    /**
     * 名称
     */
    
    @ApiModelProperty("名称")
    private String name;
    /**
     * 拼音
     */
    
    @ApiModelProperty("拼音")
    private String pinyin;
    /**
     * 拼音缩写
     */
    
    @ApiModelProperty("拼音缩写")
    private String pinyinShor;
    /**
     * 扩展名
     */
    
    @ApiModelProperty("扩展名")
    private String extName;

}