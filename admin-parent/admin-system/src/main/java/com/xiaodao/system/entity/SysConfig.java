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
@TableName("sys_config")
public class SysConfig extends BaseEntity implements Serializable {

     private static final long serialVersionUID = 1L;


     /**
     *参数主键
     */
    @TableId
    @ApiModelProperty("参数主键")
    private Long configId;


     /**
     *参数名称
     */
    
    @ApiModelProperty("参数名称")
    private String configName;


     /**
     *参数键名
     */
    
    @ApiModelProperty("参数键名")
    private String configKey;


     /**
     *参数键值
     */
    
    @ApiModelProperty("参数键值")
    private String configValue;


     /**
     *系统内置（Y是 N否）
     */
    
    @ApiModelProperty("系统内置（Y是 N否）")
    private String configType;


    
    
    
    


    
    
    
    


    
    
    
    


    
    
    
    


     /**
     *备注
     */
    
    @ApiModelProperty("备注")
    private String remark;


}