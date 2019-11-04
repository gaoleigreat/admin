package com.xiaodao.system.entity.entity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import java.util.Date;
import java.io.Serializable;
@Data
@TableName("sys_user_role")
public class SysUserRole  {


    /**
     *用户ID
     */
    @TableId
    @ApiModelProperty("用户ID")
    private Long userId;


    /**
     *角色ID
     */
    @TableId
    @ApiModelProperty("角色ID")
    private Long roleId;


}