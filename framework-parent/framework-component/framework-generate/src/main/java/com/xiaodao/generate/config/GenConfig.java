package com.xiaodao.generate.config;

import com.xiaodao.generate.util.PropsUtil;

import java.util.Properties;

/**
 * 读取代码生成相关配置
 *
 * @author ruoyi
 */
public class GenConfig {
    /**
     * 作者
     */
    public static String author;

    /**
     * 生成包名
     */
    public static String packageName;

    /**
     * 生成包名
     */
    public static String packagePath;
    /**
     * 模块名
     */
    public static String moduleName;

    /**
     * 自动去除表前缀，默认是true
     */
    public static boolean autoRemovePre;

    /**
     * 是否继承Base，默认是true
     */
    public static boolean extendsBase;

    /**
     * 表前缀(类名不会包含表前缀)
     */
    public static String tablePrefix;
    private static String propertiesNames = "generate-INF.properties";

    static {

        Properties conf = PropsUtil.loadProps(propertiesNames);
        author = PropsUtil.getString(conf, "author", "xiaodao");
        packageName = PropsUtil.getString(conf, "packageName", "com.xiaodao");
        packagePath = "/" + packageName.replace(".", "/");
        moduleName = PropsUtil.getString(conf, "moduleName", "system");
        autoRemovePre = PropsUtil.getBoolean(conf, "autoRemovePre", false);
        tablePrefix = PropsUtil.getString(conf, "author", "xiaodao");
        extendsBase = PropsUtil.getBoolean(conf, "extendsBase", false);
    }


}
