package com.xiaodao.admin.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.xiaodao.core.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class SysMenu extends BaseEntity {
    /**
     * 菜单ID
     */
    @JsonSerialize(using = ToStringSerializer.class)
    @ApiModelProperty("菜单ID")
    private Long menuId;
    /**
     * 菜单名称
     */
    
    @ApiModelProperty("菜单名称")
    private String menuName;
    /**
     * 菜单标识
     */
    
    @ApiModelProperty("菜单标识")
    private String menuKey;
    /**
     * 菜单布局
     */
    
    @ApiModelProperty("菜单布局")
    private String menuLay;
    /**
     * 父菜单ID
     */
    
    @ApiModelProperty("父菜单ID")
    private Long parentId;
    /**
     * 打开方式
     */
    
    @ApiModelProperty("打开方式")
    private String target;
    /**
     * 显示顺序
     */
    
    @ApiModelProperty("显示顺序")
    private Integer orderNum;
    /**
     * 请求地址
     */
    
    @ApiModelProperty("请求地址")
    private String url;
    /**
     * 菜单类型（M目录 C菜单 F按钮）
     */
    
    @ApiModelProperty("菜单类型（M目录 C菜单 F按钮）")
    private String menuType;
    /**
     * 菜单状态（0显示 1隐藏）
     */
    
    @ApiModelProperty("菜单状态（0显示 1隐藏）")
    private String visible;
    /**
     * 权限标识
     */
    
    @ApiModelProperty("权限标识")
    private String perms;
    /**
     * 菜单图标
     */
    
    @ApiModelProperty("菜单图标")
    private String icon;
    /**
     * 请求方法
     */
    
    @ApiModelProperty("请求方法")
    private String metnod;

}