package com.xiaodao.system.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import com.xiaodao.system.mapper.GenTableColumnMapper;
import com.xiaodao.system.service.IGenTableColumnService;
import com.xiaodao.admin.entity.GenTableColumn;

import java.util.List;
import java.util.Map;


/**
 * @description IGenTableColumn Service层
 * @author xiaodao
 * @since jdk1.8
 */
@Service
public class GenTableColumnServiceImpl implements IGenTableColumnService{


     @Autowired
     private GenTableColumnMapper genTableColumnMapper;

    @Override
    public int insert(GenTableColumn genTableColumn) {
        return genTableColumnMapper.insert(genTableColumn);
    }

    @Override
    public int insertSelective(GenTableColumn genTableColumn) {
        return genTableColumnMapper.insertSelective(genTableColumn);
    }

    @Override
    public int batchInsert(List<GenTableColumn> list) {
        return genTableColumnMapper.batchInsert(list);
    }

    @Override
    public int batchInsertSelective(List<GenTableColumn> list) {
        return genTableColumnMapper.batchInsertSelective(list);
    }

    @Override
    public int updateByPrimaryKey(GenTableColumn genTableColumn) {
        return genTableColumnMapper.updateByPrimaryKey(genTableColumn);
    }

    @Override
    public int updateSelectiveByPrimaryKey(GenTableColumn genTableColumn) {
        return genTableColumnMapper.updateSelectiveByPrimaryKey(genTableColumn);
    }

    @Override
    public int batchUpdate(List<GenTableColumn> list) {
        return genTableColumnMapper.batchUpdate(list);
    }

    @Override
    public int batchUpdateSelective(List<GenTableColumn> list) {
        return genTableColumnMapper.batchUpdateSelective(list);
    }

    @Override
    public int upsert(GenTableColumn genTableColumn) {
        return genTableColumnMapper.upsert(genTableColumn);
    }

    @Override
    public int upsertSelective(GenTableColumn genTableColumn) {
        return genTableColumnMapper.upsertSelective(genTableColumn);
    }

    @Override
    public int batchUpsert(List<GenTableColumn> list) {
        return genTableColumnMapper.batchUpsert(list);
    }

    @Override
    public int batchUpsertSelective(List<GenTableColumn> list) {
        return genTableColumnMapper.batchUpsertSelective(list);
    }

    @Override
    public int deleteByPrimaryKey(Long columnId) {
        return genTableColumnMapper.deleteByPrimaryKey(columnId);
    }

    @Override
    public int deleteBatchByPrimaryKeys(List<Long> list) {
        return genTableColumnMapper.deleteBatchByPrimaryKeys(list);
    }

    @Override
    public int delete(GenTableColumn genTableColumn) {
        return genTableColumnMapper.delete(genTableColumn);
    }

    @Override
    public GenTableColumn queryByPrimaryKey(Long columnId) {
        return genTableColumnMapper.queryByPrimaryKey(columnId);
    }

    @Override
    public List<GenTableColumn> queryBatchPrimaryKeys(List<Long> list) {
        return genTableColumnMapper.queryBatchPrimaryKeys(list);
    }

    @Override
    public GenTableColumn queryOne(GenTableColumn genTableColumn) {
        return genTableColumnMapper.queryOne(genTableColumn);
    }

    @Override
    public List<GenTableColumn> queryByCondition(GenTableColumn genTableColumn) {
        return genTableColumnMapper.queryByCondition(genTableColumn);
    }

    @Override
    public List<GenTableColumn> queryFuzzy(GenTableColumn genTableColumn) {
        return genTableColumnMapper.queryFuzzy(genTableColumn);
    }

    @Override
    public List<GenTableColumn> queryByLikeCondition(GenTableColumn genTableColumn) {
        return genTableColumnMapper.queryByLikeCondition(genTableColumn);
    }

    @Override
    public int queryCount(GenTableColumn genTableColumn) {
        return genTableColumnMapper.queryCount(genTableColumn);
    }

    @Override
    public List<Map<String, Object>> statisticsGroup(GenTableColumn genTableColumn) {
        return genTableColumnMapper.statisticsGroup(genTableColumn);
    }

    @Override
    public List<Map<String, Object>> statisticsGroupByDay(GenTableColumn genTableColumn) {
        return genTableColumnMapper.statisticsGroupByDay(genTableColumn);
    }

    @Override
    public List<Map<String, Object>> statisticsGroupByMonth(GenTableColumn genTableColumn) {
        return genTableColumnMapper.statisticsGroupByMonth(genTableColumn);
    }

    @Override
    public List<Map<String, Object>> statisticsGroupByYear(GenTableColumn genTableColumn) {
        return genTableColumnMapper.statisticsGroupByYear(genTableColumn);
    }
}