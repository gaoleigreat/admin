package com.xiaodao.system.entity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import java.util.Date;
import java.io.Serializable;
@Data
@Slf4j
@TableName("sys_role_dept")
public class SysRoleDept implements Serializable {

     private static final long serialVersionUID = 1L;


    /**
     *角色ID
     */
    @TableId
    @ApiModelProperty("角色ID")
    private Long roleId;


    /**
     *部门ID
     */
    @TableId
    @ApiModelProperty("部门ID")
    private Long deptId;


}