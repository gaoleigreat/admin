package com.xiaodao.feign.system.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.xiaodao.core.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;

@Data
@Slf4j
public class SysNotice extends BaseEntity {
    /**
     * 公告ID
     */
    @JsonSerialize(using = ToStringSerializer.class)
    @ApiModelProperty("公告ID")
    private Integer noticeId;
    /**
     * 公告标题
     */
    
    @ApiModelProperty("公告标题")
    private String noticeTitle;
    /**
     * 公告类型（1通知 2公告）
     */
    
    @ApiModelProperty("公告类型（1通知 2公告）")
    private String noticeType;
    /**
     * 公告内容
     */
    
    @ApiModelProperty("公告内容")
    private String noticeContent;
    /**
     * 公告状态（0正常 1关闭）
     */
    
    @ApiModelProperty("公告状态（0正常 1关闭）")
    private String status;

}