package com.xiaodao.admin.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.xiaodao.core.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class SysPost extends BaseEntity {
    /**
     * 岗位ID
     */
    @JsonSerialize(using = ToStringSerializer.class)
    @ApiModelProperty("岗位ID")
    private Long postId;
    /**
     * 岗位编码
     */
    
    @ApiModelProperty("岗位编码")
    private String postCode;
    /**
     * 岗位名称
     */
    
    @ApiModelProperty("岗位名称")
    private String postName;
    /**
     * 显示顺序
     */
    
    @ApiModelProperty("显示顺序")
    private Integer postSort;
    /**
     * 状态（0正常 1停用）
     */
    
    @ApiModelProperty("状态（0正常 1停用）")
    private String status;

}