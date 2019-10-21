package com.xiaodao.generate;

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
    private static final String DBURL ="jdbc:mysql://192.168.101.41:3306/perception_base";
    private static final String DBUSER ="perception_master";
    private static final String DBPASSWORD ="perception_master";

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
        return this.conn;
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
