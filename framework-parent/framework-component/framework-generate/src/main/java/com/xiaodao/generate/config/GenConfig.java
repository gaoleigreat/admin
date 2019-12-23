package com.xiaodao.generate.config;

import com.xiaodao.generate.util.PropsUtil;
import lombok.Data;

import java.util.Properties;

/**
 * 读取代码生成相关配置
 *
 * @author ruoyi
 */
@Data
public class GenConfig {
    /**
     * 作者
     */
    public  String author;

    /**
     * 生成包名
     */
    public  String packageName;

    /**
     * 生成包路径
     */
    public  String packagePath;
    /**
     * 模块名
     */
    public  String moduleName;

    /**
     * 自动去除表前缀，默认是true
     */
    public static boolean autoRemovePre;

    /**
     * 是否继承Base，默认是true
     */
    public  boolean extendsBase;


    /**
     * feignClient的包
     */
    public  String feignClientPackageName;

    /**
     * entityPackageName
     */
    public  String entityPackageName;

    /**
     * daoPackageName
     */
    public  String daoPackageName;

    /**
     * servicePackageName
     */
    public  String servicePackageName;

    /**
     * serviceImplPackageName
     */
    public  String serviceImplPackageName;

    /**
     * controllerPackageName
     */
    public  String controllerPackageName;


    /**
     * mapperPackageName
     */
    public  String mapperPackageName;


    private String email;


    /**
     * 表前缀(类名不会包含表前缀)
     */
    public static String tablePrefix;
    private static String propertiesNames = "generate-INF.properties";

    static {

        Properties conf = PropsUtil.loadProps(propertiesNames);
        tablePrefix = PropsUtil.getString(conf, "tablePrefix", "xiaodao");
        autoRemovePre = PropsUtil.getBoolean(conf, "autoRemovePre", false);

    }

    public GenConfig() {
        Properties conf = PropsUtil.loadProps(propertiesNames);
        this.author = PropsUtil.getString(conf, "author", "xiaodao");
        this.packageName = PropsUtil.getString(conf, "packageName", "com.xiaodao");
        this.packagePath = "/" + packageName.replace(".", "/");
        this.moduleName = PropsUtil.getString(conf, "moduleName", "system");
        this.extendsBase = PropsUtil.getBoolean(conf, "extendsBase", false);
        this.feignClientPackageName = PropsUtil.getString(conf,"feignClient.packageName",packageName+".feign."+moduleName+"."+"client");
        this.entityPackageName = PropsUtil.getString(conf,"entity.packageName",packageName+".feign."+moduleName+"."+"entity");
        this.daoPackageName = PropsUtil.getString(conf,"dao.packageName",packageName+"."+moduleName+"."+"mapper");
        this.servicePackageName = PropsUtil.getString(conf,"service.packageName",packageName+"."+moduleName+".service");
        this.serviceImplPackageName = PropsUtil.getString(conf,"serviceImpl.packageName",packageName+"."+moduleName+".service.impl");
        this.controllerPackageName = PropsUtil.getString(conf,"controller.packageName",packageName+"."+moduleName+".controller");
        this.mapperPackageName =PropsUtil.getString(conf,"mapper.packageName",mapperPackageName+"."+moduleName+".controller");
        this.email =PropsUtil.getString(conf,"email","xiaodao");
        this.extendsBase = PropsUtil.getBoolean(conf,"extendsBase",true);


    }
}
