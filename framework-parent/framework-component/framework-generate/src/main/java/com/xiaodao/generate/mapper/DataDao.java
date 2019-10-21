package com.xiaodao.generate.mapper;

import com.xiaodao.generate.DataBaseConnection;
import com.xiaodao.generate.domain.GenTableColumn;
import com.xiaodao.generate.util.GenUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author gaolei
 * @Date 2019/10/12 0:06
 * @Version 1.0
 */
public class DataDao implements IDataDao {
    private Connection conn;

    private PreparedStatement pstmt;

    public DataDao(Connection conn) {
        this.conn = conn;
    }

    @Override
    public Set<String> getAllTable() throws SQLException {
        Set<String> resultSet = new HashSet<>();
        String sql = "show tables";

        this.pstmt = this.conn.prepareStatement(sql);
        ResultSet rs = this.pstmt.executeQuery();

        while (rs.next()) {
            resultSet.add(rs.getString(1));
        }
        return resultSet;
    }

    @Override
    public String getTableComments(String dataBase, String tableName) throws SQLException {
        String sql = "select table_comment from information_schema.tables where table_schema = ? and table_name =?;";
        this.pstmt = this.conn.prepareStatement(sql);
        this.pstmt.setString(1, dataBase);
        this.pstmt.setString(2, tableName);
        ResultSet rs = this.pstmt.executeQuery();

        while (rs.next()) {
            return rs.getString(1);
        }
        return null;
    }

    @Override
    public List<GenTableColumn> getTableFileds(String tableName) throws SQLException {
        List<GenTableColumn> genTableColumns = new ArrayList<>();
        String sql = " show full columns from " + tableName;
        this.pstmt = this.conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            GenTableColumn genTableColumn = new GenTableColumn();
            genTableColumn.setFieldName(rs.getString("Field"));
            genTableColumn.setJdbcType(rs.getString("Type"));
            genTableColumn.setComment(rs.getString("Comment"));
            genTableColumn.setIsNull(rs.getString("Null"));
            genTableColumn.setKey(rs.getString("Key"));
            genTableColumn.setDefaultValue(rs.getString("Default"));
            GenUtils.initColumnField(genTableColumn);
            genTableColumns.add(genTableColumn);
        }
        return genTableColumns;
    }

    public static void main(String[] args) throws SQLException {
        DataBaseConnection dataBaseConnection = new DataBaseConnection();
        DataDao dataDao = new DataDao(dataBaseConnection.getConnection());
        List<GenTableColumn> sys_config = dataDao.getTableFileds("sys_config");
        sys_config.forEach(s -> {
            System.out.println(s);
        }
    );}
}
