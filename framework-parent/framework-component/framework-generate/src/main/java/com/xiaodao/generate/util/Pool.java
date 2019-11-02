package com.xiaodao.generate.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @Author gaolei
 * @Date 2019/11/1 23:41
 * @Version 1.0
 */
public abstract class Pool {
    public String propertiesNames = "connection-INF.properties";

    /**
     * 定义唯一实例
     */
    private static Pool instance = null;

    /**
     * 最大连接数
     */
    protected int maxConnect = 100;

    /**
     * 保持连接数
     */
    protected int normalConnect = 10;

    /**
     * 驱动字符串
     */
    protected String driverName = null;

    /**
     * 驱动变量
     */
    protected Driver driver = null;


    protected Pool() {
        init();
        loadDrivers(driverName);
    }

    /**
     * 初始化所有从配置文件中读取的成员变量
     */
    private void init() {
        try {
            InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream(propertiesNames);
            Properties p = new Properties();
            p.load(is);
            this.driverName = p.getProperty("driverName");
            this.maxConnect = Integer.parseInt(p.getProperty("maxConnect"));
            this.normalConnect = Integer.parseInt(p.getProperty("normalConnect"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 装在和注册所有JDBC驱动程序
     *
     * @param dri
     */
    protected void loadDrivers(String dri) {
        String driverClassName = dri;
        try {
            driver = (Driver) Class.forName(driverClassName).newInstance();
            DriverManager.registerDriver(driver);
        } catch (InstantiationException | ClassNotFoundException | SQLException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    /**
     * 创建连接池
     */
    public abstract void createPool();

    /**
     * 单例模式 返回数据库连接池的实例
     *
     * @return
     * @throws ClassNotFoundException
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    public static synchronized Pool getInstance() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        if (instance == null) {
            instance.init();
            instance = (Pool) Class.forName("com.xiaodao.generate.util.Pool").newInstance();
        }
        return instance;
    }

    /**
     * 获取一个可用的连接，如果没有则新建一个，且小于最大连接限制
     *
     * @return
     */
    public abstract Connection getConnection();

    /**
     * 获得一个连接，且有时间限制
     *
     * @param time
     * @return
     */
    public abstract Connection getConnection(long time);

    /**
     * 获取当前空闲的连接数
     *
     * @return
     */
    public abstract int getnum();

    /**
     * 获取当前工作的连接数
     *
     * @return
     */
    public abstract int getnumActive();

    /**
     * 撤销驱动
     */
    protected synchronized void release() {
        try {
            DriverManager.deregisterDriver(driver);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
