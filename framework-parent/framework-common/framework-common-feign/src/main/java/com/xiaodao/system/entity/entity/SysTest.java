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
@TableName("sys_test")
public class SysTest  {


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