package com.xiaodao.generate.service;

import com.xiaodao.generate.DataBaseConnection;
import com.xiaodao.generate.domain.GenTable;
import com.xiaodao.generate.domain.GenTableColumn;
import com.xiaodao.generate.mapper.DataDao;
import com.xiaodao.generate.util.GenUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.util.CollectionUtils;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @Author gaolei
 * @Date 2019/10/12 2:39
 * @Version 1.0
 */
public class DataServiceImpl {
    private DataDao dataDao = new DataDao(new DataBaseConnection().getConnection());

    public List<GenTable> getGenTable(String dataBase) throws SQLException {
        List<GenTable> genTables = new ArrayList<>();
        Set<String> tables = dataDao.getAllTable();
        if (CollectionUtils.isEmpty(tables)) {
            return null;
        }
        tables.forEach(t -> {
            try {
                GenTable genTable = new GenTable();
                List<GenTableColumn> tableFileds = dataDao.getTableFileds(t);
                for (GenTableColumn g : tableFileds) {
                    if (g.getKey() != null && g.getKey().equals("PRI")) {
                        genTable.setPkColumn(g);
                        break;
                    }
                }


                genTable.setTableName(t);
                genTable.setColumns(tableFileds);
                GenUtils.initTable(genTable);
                String tableComments = dataDao.getTableComments(dataBase, t);
                if (StringUtils.isNotBlank(tableComments)){
                    tableComments =tableComments.trim();
                    if (tableComments.endsWith("表")){
                        tableComments.substring(0, tableComments.length() - 1);
                    }
                    genTable.setTableComment(tableComments);
                }else {
                    genTable.setTableComment(genTable.getClassName());
                }
                genTables.add(genTable);
                System.out.println(genTable);

            } catch (SQLException e) {
                e.printStackTrace();
            }
        });
        return genTables;
    }

    public static void main(String[] args) throws SQLException {
        DataServiceImpl dataService = new DataServiceImpl();
        List<GenTable> exam = dataService.getGenTable("exam");
        exam.forEach(s->{
            System.out.println(s);
        });
    }
}
