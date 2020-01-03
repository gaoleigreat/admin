package com.xiaodao.admin.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.xiaodao.core.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class SysUserPost extends BaseEntity {
    /**
     * 用户ID
     */
    @JsonSerialize(using = ToStringSerializer.class)
    @ApiModelProperty("用户ID")
    private Integer userId;
    /**
     * 岗位ID
     */
    @JsonSerialize(using = ToStringSerializer.class)
    @ApiModelProperty("岗位ID")
    private Integer postId;

}