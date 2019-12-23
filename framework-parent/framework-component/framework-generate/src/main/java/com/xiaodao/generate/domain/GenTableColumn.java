package com.xiaodao.generate.domain;


import lombok.Data;

import java.io.Serializable;

/**
 * 代码生成业务字段表 gen_table_column
 *
 * @author ruoyi
 */
@Data
public class GenTableColumn implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 字段名
     */
    private String fieldName;
    /**
     * 字段类型
     */
    private String jdbcType;
    /**
     * 字段注释
     */
    private String comment;
    /**
     * 是否为空(NO YES)
     */
    private String isNull;
    /**
     * 默认值
     */
    private String defaultValue;

    /**
     * 键值类型 PRI
     */
    private String key;
    /**
     * java 类型
     */
    private String javaType;

    /**
     * java 字段名稱
     */
    private String javaFieldName;

}