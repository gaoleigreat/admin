package com.xiaodao.generate.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Vector;

/**
 * @Author gaolei
 * @Date 2019/11/2 0:33
 * @Version 1.0
 */
public final class DBConnectionPool extends Pool {
    /**
     * 正在使用的连接数
     */
    private int checkedOut;

    /**
     * 存放产生的链接容器
     */
    private Vector<Connection> freeConnections = new Vector<>();

    private String passWord = null;

    private String url = null;

    private String userName = null;

    private static int num = 0;

    private static int numActive = 0;

    private static DBConnectionPool pool = null;

    /**
     * 产生数据连接池
     *
     * @return
     */
    public static synchronized DBConnectionPool getInstance() {
        if (pool == null) {
            pool = new DBConnectionPool();
        }
        return pool;
    }

    private DBConnectionPool() {

    }

    /**
     * 初始化
     *
     * @throws IOException
     */
    private void init() throws IOException {
        InputStream is = Pool.class.getResourceAsStream(propertiesNames);
        Properties p = new Properties();
        p.load(is);
        this.userName = p.getProperty("userName");
        this.passWord = p.getProperty("passWord");
        this.driverName = p.getProperty("driverName");
        this.url = p.getProperty("url");
        this.maxConnect = Integer.parseInt(p.getProperty("maxConnect"));
        this.normalConnect = Integer.parseInt(p.getProperty("normalConnect"));
    }

    /**
     * 如果不使用某个连接对象，调用此方法将该对象释放到连接池
     *
     * @param con
     */
    public synchronized void freeConnection(Connection con) {
        freeConnections.add(con);
        num++;
        checkedOut--;
        numActive--;
        notifyAll();
    }

    public Connection newConnection() {
        Connection con = null;
        try {
            if (userName == null) {
                con = DriverManager.getConnection(url);
            } else {
                con = DriverManager.getConnection(url, userName, passWord);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return con;
    }

    /**
     * 获取当前空闲数
     *
     * @return
     */
    public int getNum() {
        return num;
    }

    public int getNumActive() {
        return numActive;
    }

    @Override
    public synchronized Connection getConnection() {
        Connection con = null;
        if (freeConnections.size() > 0) {
            num--;
            con = freeConnections.firstElement();
            freeConnections.removeElementAt(0);
            try {
                if (con.isClosed()) {
                    con = getConnection();
                }
            } catch (SQLException e) {
                e.printStackTrace();
                con = getConnection();
            }
        }
        return con;
    }


    @Override
    public void createPool() {

    }


    @Override
    public Connection getConnection(long time) {
        return null;
    }

    @Override
    public int getnum() {
        return 0;
    }

    @Override
    public int getnumActive() {
        return 0;
    }
}
