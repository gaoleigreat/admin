package com.xiaodao.system.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import com.xiaodao.system.mapper.GenTableMapper;
import com.xiaodao.system.service.IGenTableService;
import com.xiaodao.admin.entity.GenTable;

import java.util.List;
import java.util.Map;


/**
 * @description IGenTable Service层
 * @author xiaodao
 * @since jdk1.8
 */
@Service
public class GenTableServiceImpl implements IGenTableService{


     @Autowired
     private GenTableMapper genTableMapper;

    @Override
    public int insert(GenTable genTable) {
        return genTableMapper.insert(genTable);
    }

    @Override
    public int insertSelective(GenTable genTable) {
        return genTableMapper.insertSelective(genTable);
    }

    @Override
    public int batchInsert(List<GenTable> list) {
        return genTableMapper.batchInsert(list);
    }

    @Override
    public int batchInsertSelective(List<GenTable> list) {
        return genTableMapper.batchInsertSelective(list);
    }

    @Override
    public int updateByPrimaryKey(GenTable genTable) {
        return genTableMapper.updateByPrimaryKey(genTable);
    }

    @Override
    public int updateSelectiveByPrimaryKey(GenTable genTable) {
        return genTableMapper.updateSelectiveByPrimaryKey(genTable);
    }

    @Override
    public int batchUpdate(List<GenTable> list) {
        return genTableMapper.batchUpdate(list);
    }

    @Override
    public int batchUpdateSelective(List<GenTable> list) {
        return genTableMapper.batchUpdateSelective(list);
    }

    @Override
    public int upsert(GenTable genTable) {
        return genTableMapper.upsert(genTable);
    }

    @Override
    public int upsertSelective(GenTable genTable) {
        return genTableMapper.upsertSelective(genTable);
    }

    @Override
    public int batchUpsert(List<GenTable> list) {
        return genTableMapper.batchUpsert(list);
    }

    @Override
    public int batchUpsertSelective(List<GenTable> list) {
        return genTableMapper.batchUpsertSelective(list);
    }

    @Override
    public int deleteByPrimaryKey(Long tableId) {
        return genTableMapper.deleteByPrimaryKey(tableId);
    }

    @Override
    public int deleteBatchByPrimaryKeys(List<Long> list) {
        return genTableMapper.deleteBatchByPrimaryKeys(list);
    }

    @Override
    public int delete(GenTable genTable) {
        return genTableMapper.delete(genTable);
    }

    @Override
    public GenTable queryByPrimaryKey(Long tableId) {
        return genTableMapper.queryByPrimaryKey(tableId);
    }

    @Override
    public List<GenTable> queryBatchPrimaryKeys(List<Long> list) {
        return genTableMapper.queryBatchPrimaryKeys(list);
    }

    @Override
    public GenTable queryOne(GenTable genTable) {
        return genTableMapper.queryOne(genTable);
    }

    @Override
    public List<GenTable> queryByCondition(GenTable genTable) {
        return genTableMapper.queryByCondition(genTable);
    }

    @Override
    public List<GenTable> queryFuzzy(GenTable genTable) {
        return genTableMapper.queryFuzzy(genTable);
    }

    @Override
    public List<GenTable> queryByLikeCondition(GenTable genTable) {
        return genTableMapper.queryByLikeCondition(genTable);
    }

    @Override
    public int queryCount(GenTable genTable) {
        return genTableMapper.queryCount(genTable);
    }

    @Override
    public List<Map<String, Object>> statisticsGroup(GenTable genTable) {
        return genTableMapper.statisticsGroup(genTable);
    }

    @Override
    public List<Map<String, Object>> statisticsGroupByDay(GenTable genTable) {
        return genTableMapper.statisticsGroupByDay(genTable);
    }

    @Override
    public List<Map<String, Object>> statisticsGroupByMonth(GenTable genTable) {
        return genTableMapper.statisticsGroupByMonth(genTable);
    }

    @Override
    public List<Map<String, Object>> statisticsGroupByYear(GenTable genTable) {
        return genTableMapper.statisticsGroupByYear(genTable);
    }
}