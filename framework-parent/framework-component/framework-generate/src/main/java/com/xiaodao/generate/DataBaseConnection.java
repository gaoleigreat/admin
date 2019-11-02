package com.xiaodao.generate;

import com.xiaodao.generate.util.DBConnectionPool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @Author gaolei
 * @Date 2019/10/11 23:19
 * @Version 1.0
 */
public class DataBaseConnection {
    private static final String DBDRIVER ="com.mysql.cj.jdbc.Driver";
    private static final String DBURL ="jdbc:mysql://49.235.172.6:3306/perception_base";
    private static final String DBUSER ="root";
    private static final String DBPASSWORD ="Changeme_123";

    private Connection conn = null;

    public DataBaseConnection() {
        try {
            Class.forName(DBDRIVER);
            this.conn = DriverManager.getConnection(DBURL,DBUSER,DBPASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }


    public Connection getConnection(){
        return DBConnectionPool.getInstance().getConnection();
    }

    public void close(){
        if (this.conn  !=null){
            try {
                this.conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
