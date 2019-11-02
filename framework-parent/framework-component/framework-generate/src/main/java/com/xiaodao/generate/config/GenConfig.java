package com.xiaodao.generate.config;


import lombok.Data;

/**
 * 读取代码生成相关配置
 *
 * @author ruoyi
 */
public class GenConfig {
    /**
     * 作者
     */
    public static String author = "高磊";

    /**
     * 生成包路径
     */
    public static String packageName = "com.xiaodao.system";


    /**
     * 模块名
     */
    public static String moduleName = "system";

    /**
     * 自动去除表前缀，默认是true
     */
    public static boolean autoRemovePre = false;

    /**
     * 表前缀(类名不会包含表前缀)
     */
    public static String tablePrefix = "sys";


    /**
     * 表前缀(类名不会包含表前缀)
     */
    public static boolean extendsBase = true;

    public static String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        GenConfig.author = author;
    }

    public static String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        GenConfig.packageName = packageName;
    }

    public static boolean getAutoRemovePre() {
        return autoRemovePre;
    }

    public void setAutoRemovePre(boolean autoRemovePre) {
        GenConfig.autoRemovePre = autoRemovePre;
    }

    public static String getTablePrefix() {
        return tablePrefix;
    }

    public void setTablePrefix(String tablePrefix) {
        GenConfig.tablePrefix = tablePrefix;
    }

    public static String getModuleName() {
        return moduleName;
    }

    public static void setModuleName(String moduleName) {
        GenConfig.moduleName = moduleName;
    }

    public static boolean isAutoRemovePre() {
        return autoRemovePre;
    }
}
