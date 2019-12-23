package com.xiaodao.core.domain;

import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * Entity基类
 *
 * @author ruoyi
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 统计字段
     */
    @ApiModelProperty("页数")
    private int pageIndex;

    /**
     * 统计字段
     */
    @ApiModelProperty("每页数量")
    private int pageSie;

    /**
     * 统计字段
     */
    @ApiModelProperty("统计字段")
    private String statisticalProperty;

    /**
     * 统计方式
     */
    @ApiModelProperty("统计方式(count()、max()、avg()、min()、max()、sum())")
    private String statisticalMethod;

    /**
     * 搜索值
     */
    @ApiModelProperty("搜索值")
    private String searchValue;


    /**
     * 搜索条件
     */
    @ApiModelProperty("搜索条件 eq,ne,gt,ge,lt,le,like,notLike,in,notIn,isNull,isNotNull")
    private String searchCondition;

    /**
     * 排序字段
     */
    @ApiModelProperty("排序字段")
    private String orderBy = "create_time";

    /**
     * 是否升序
     */
    @ApiModelProperty("是否升序(0:升序,1:降序)")
    private int isAsc;

    /**
     * 创建者
     */
    @ApiModelProperty("创建者")
    private Long createBy;

    /**
     * 创建时间
     */
    @ApiModelProperty("创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
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
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    /**
     * 备注
     */
    @ApiModelProperty("备注")
    private String remark;

    @ApiModelProperty("搜索开始时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date beginTime;

    @ApiModelProperty("搜获结束时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date endTime;


}
