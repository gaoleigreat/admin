package com.xiaodao.generate.util;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Vector;

/**
 * @Author gaolei
 * @Date 2019/11/2 0:33
 * @Version 1.0
 */
@Slf4j
public final class DBConnectionBasePool extends BasePool {
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

    private static DBConnectionBasePool pool = null;

    /**
     * 产生数据连接池
     *
     * @return
     */
    public static synchronized DBConnectionBasePool getInstance() {
        if (pool == null) {
            pool = new DBConnectionBasePool();
        }
        return pool;
    }

    private DBConnectionBasePool() {
        try {
            this.init();
            for (int i = 0; i < normalConnect; i++) {
                Connection c = newConnection();
                if (c != null) {
                    freeConnections.add(c);
                    num++;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    /**
     * 初始化
     *
     * @throws IOException
     */
    private void init()  {
        InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream(propertiesNames);
        Properties p = new Properties();
        try {
            p.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
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
            log.info("创建一个新连接");
        } catch (SQLException e) {
            log.error("无法创建这个url的连接{}",url);
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
        } else if (maxConnect == 0 || checkedOut < maxConnect) {
            con = newConnection();
        }
        if (con != null) {
            checkedOut++;
        }
        numActive++;
        return con;
    }


    @Override
    public void createPool() {
        pool = new DBConnectionBasePool();
        if (pool != null) {
            log.info("创建连接池成功");
        } else {
            log.error("创建连接池失败");
        }

    }

    @Override
    protected synchronized void release() {
        try {
            Enumeration allConnections = freeConnections.elements();
            while (allConnections.hasMoreElements()) {
                Connection con = (Connection) allConnections.nextElement();
                try {
                    con.close();
                    num--;
                } catch (SQLException e) {
                    log.error("无法关闭连接池中的连接");
                }
            }
            freeConnections.removeAllElements();
            numActive = 0;
        } finally {
            super.release();
        }

    }

    @Override
    public synchronized Connection getConnection(long timeout) {
        long startTime = System.currentTimeMillis();
        Connection con;
        while ((con = getConnection()) != null) {
            try {
                wait(timeout);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if ((System.currentTimeMillis() - startTime) >= timeout) {
            return null;
        }
        return con;
    }

    @Override
    public int getnum() {
        return num;
    }

    @Override
    public int getnumActive() {
        return numActive;
    }
}
