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
@TableName("sys_test")
public class SysTest extends BaseEntity implements Serializable {

     private static final long serialVersionUID = 1L;


     /**
     *
     */
    @TableId
    @ApiModelProperty("")
    private Long id;


     /**
     *姓名
     */
    
    @ApiModelProperty("姓名")
    private String name;


}