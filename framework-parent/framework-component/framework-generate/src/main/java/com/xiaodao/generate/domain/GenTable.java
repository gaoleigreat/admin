package com.xiaodao.generate.domain;


import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * gen_table
 *
 * @author xiaodao
 */
@Data
public class GenTable implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 表名称
     */
    private String tableName;

    /**
     * 表描述
     */
    private String tableComment;

    /**
     * 实体类名称(首字母大写)
     */
    private String className;


    /**
     * 驼峰类名称(首字母小写写)
     */
    private String camelCaseclassName;


    /**
     * 主键信息
     */
    private GenTableColumn pkColumn;



    /**
     * 表列信息
     */
    private List<GenTableColumn> columns;

    /**
     * 是否集成Base
     */
    private String extendsBase;

}