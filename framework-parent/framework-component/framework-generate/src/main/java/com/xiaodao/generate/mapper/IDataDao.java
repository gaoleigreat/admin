package com.xiaodao.generate.mapper;

import com.xiaodao.generate.domain.GenTable;
import com.xiaodao.generate.domain.GenTableColumn;

import java.sql.SQLException;
import java.util.List;
import java.util.Set;

/**
 * @Author gaolei
 * @Date 2019/10/11 23:28
 * @Version 1.0
 */
public interface IDataDao {
    /**
     * 获取所有的表格
     *
     * @return
     */
    Set<String> getAllTable() throws SQLException;

    /**
     * 获取表格注释
     *
     * @param dataBase
     * @param tableName
     * @return
     */
    String getTableComments(String dataBase, String tableName) throws SQLException;


    /**
     * 获取表格字段
     *
     * @param tableName
     * @return
     */
    List<GenTableColumn> getTableFileds(String tableName) throws SQLException;




}
