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
@TableName("sys_dict_type")
public class SysDictType extends BaseEntity implements Serializable {

     private static final long serialVersionUID = 1L;


     /**
     *字典主键
     */
    @TableId
    @ApiModelProperty("字典主键")
    private Long dictId;


     /**
     *字典名称
     */
    
    @ApiModelProperty("字典名称")
    private String dictName;


     /**
     *字典类型
     */
    
    @ApiModelProperty("字典类型")
    private String dictType;


     /**
     *状态（0正常 1停用）
     */
    
    @ApiModelProperty("状态（0正常 1停用）")
    private String status;


    
    
    
    


    
    
    
    


    
    
    
    


    
    
    
    


     /**
     *备注
     */
    
    @ApiModelProperty("备注")
    private String remark;


}