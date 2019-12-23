package com.xiaodao.generate.util;


import com.xiaodao.generate.config.GenConfig;
import com.xiaodao.generate.constant.GenConstants;
import com.xiaodao.generate.domain.GenTable;
import com.xiaodao.generate.domain.GenTableColumn;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 代码生成器 工具类
 *
 * @author ruoyi
 */
public class GenUtils {
    /**
     * 初始化表信息
     */
    public static void initTable(GenTable genTable) {
        genTable.setClassName(convertClassName(genTable.getTableName()));
        genTable.setCamelCaseclassName(StringUtils.lowerFirst(genTable.getClassName()));
        List<GenTableColumn> columns = genTable.getColumns();
        //获取list对象的某个字段组装成新list
        List<String> javaFileNameList = columns.stream().map(a -> a.getJavaFieldName()).collect(Collectors.toList());
        if (!CollectionUtils.isEmpty(javaFileNameList)) {
            if (javaFileNameList.contains("createBy")
                    && javaFileNameList.contains("createTime")
                    && javaFileNameList.contains("updateBy")
                    && javaFileNameList.contains("updateTime")
                    && javaFileNameList.contains("remark")
                    && new GenConfig().extendsBase == true) {
                genTable.setExtendsBase("true");
            } else {
                genTable.setExtendsBase("false");
            }
        } else {
            genTable.setExtendsBase("false");
        }

    }

    /**
     * 初始化列属性字段
     */
    public static void initColumnField(GenTableColumn column) {
        String dataType = getDbType(column.getJdbcType());
        column.setJdbcType(dataType);
        String columnName = column.getFieldName();
        column.setJdbcType(dataType);
        // 设置java字段名
        column.setJavaFieldName(StringUtils.toCamelCase(columnName));
        if (arraysContains(GenConstants.COLUMNTYPE_STR, dataType)) {
            column.setJavaType(GenConstants.TYPE_STRING);

        } else if (arraysContains(GenConstants.COLUMNTYPE_TIME, dataType)) {
            column.setJavaType(GenConstants.TYPE_DATE);
            column.setJdbcType("TIMESTAMP");
        } else if (arraysContains(GenConstants.COLUMNTYPE_NUMBER, dataType)) {
            // 如果是浮点型
            String[] str = StringUtils.split(StringUtils.substringBetween(column.getJdbcType(), "(", ")"), ",");
            if (str != null && str.length == 2 && Integer.parseInt(str[1]) > 0) {
                column.setJavaType(GenConstants.TYPE_DOUBLE);

            }
            // 如果是整形
            else if (str != null && str.length == 1 && Integer.parseInt(str[0]) <= 10) {
                column.setJavaType(GenConstants.TYPE_INTEGER);
                column.setJdbcType("INTEGER");
            } else if (dataType.equals("INT")) {
                column.setJavaType(GenConstants.TYPE_INTEGER);
                column.setJdbcType("INTEGER");
            }
            // 长整形
            else {
                column.setJavaType(GenConstants.TYPE_LONG);
                column.setJdbcType("BIGINT");
            }
        } else {
            column.setJavaType(GenConstants.TYPE_STRING);
        }

    }

    /**
     * 校验数组是否包含指定值
     *
     * @param arr         数组
     * @param targetValue 值
     * @return 是否包含
     */
    public static boolean arraysContains(String[] arr, String targetValue) {
        return Arrays.asList(arr).contains(targetValue);
    }

    /**
     * 获取模块名
     *
     * @param packageName 包名
     * @return 模块名
     */
    public static String getModuleName(String packageName) {
        int lastIndex = packageName.lastIndexOf(".");
        int nameLength = packageName.length();
        String moduleName = StringUtils.substring(packageName, lastIndex + 1, nameLength);
        return moduleName;
    }

    /**
     * 获取业务名
     *
     * @param tableName 表名
     * @return 业务名
     */
    public static String getBusinessName(String tableName) {
        int lastIndex = tableName.lastIndexOf("_");
        int nameLength = tableName.length();
        String businessName = StringUtils.substring(tableName, lastIndex + 1, nameLength);
        return businessName;
    }

    /**
     * 表名转换成Java类名
     *
     * @param tableName 表名称
     * @return 类名
     */
    public static String convertClassName(String tableName) {
        boolean autoRemovePre = GenConfig.autoRemovePre;
        String tablePrefix = GenConfig.tablePrefix;
        if (autoRemovePre && StringUtils.isNotEmpty(tablePrefix)) {
            tableName = tableName.replaceFirst(tablePrefix, "");
        }
        return StringUtils.convertToCamelCase(tableName);
    }

    /**
     * 获取数据库类型字段
     *
     * @param columnType 列类型
     * @return 截取后的列类型
     */
    public static String getDbType(String columnType) {
        if (StringUtils.indexOf(columnType, "(") > 0) {
            return StringUtils.upperCase(StringUtils.substringBefore(columnType, "("));
        } else {
            return StringUtils.upperCase(columnType);
        }
    }

    /**
     * 获取字段长度
     *
     * @param columnType 列类型
     * @return 截取后的列类型
     */
    public static Integer getColumnLength(String columnType) {
        if (StringUtils.indexOf(columnType, "(") > 0) {
            String length = StringUtils.substringBetween(columnType, "(", ")");
            return Integer.valueOf(length);
        } else {
            return 0;
        }
    }
}