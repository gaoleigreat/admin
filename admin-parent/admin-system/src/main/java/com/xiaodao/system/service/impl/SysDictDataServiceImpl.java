package com.xiaodao.system.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import com.xiaodao.system.mapper.SysDictDataMapper;
import com.xiaodao.system.service.ISysDictDataService;
import com.xiaodao.feign.system.entity.SysDictData;

import java.util.List;
import java.util.Map;


/**
 * @description ISysDictData Service层
 * @author xiaodao
 * @since jdk1.8
 */
@Service
public class SysDictDataServiceImpl implements ISysDictDataService{


     @Autowired
     private SysDictDataMapper sysDictDataMapper;

    @Override
    public int insert(SysDictData sysDictData) {
        return sysDictDataMapper.insert(sysDictData);
    }

    @Override
    public int insertSelective(SysDictData sysDictData) {
        return sysDictDataMapper.insertSelective(sysDictData);
    }

    @Override
    public int batchInsert(List<SysDictData> list) {
        return sysDictDataMapper.batchInsert(list);
    }

    @Override
    public int batchInsertSelective(List<SysDictData> list) {
        return sysDictDataMapper.batchInsertSelective(list);
    }

    @Override
    public int updateByPrimaryKey(SysDictData sysDictData) {
        return sysDictDataMapper.updateByPrimaryKey(sysDictData);
    }

    @Override
    public int updateSelectiveByPrimaryKey(SysDictData sysDictData) {
        return sysDictDataMapper.updateSelectiveByPrimaryKey(sysDictData);
    }

    @Override
    public int batchUpdate(List<SysDictData> list) {
        return sysDictDataMapper.batchUpdate(list);
    }

    @Override
    public int batchUpdateSelective(List<SysDictData> list) {
        return sysDictDataMapper.batchUpdateSelective(list);
    }

    @Override
    public int upsert(SysDictData sysDictData) {
        return sysDictDataMapper.upsert(sysDictData);
    }

    @Override
    public int upsertSelective(SysDictData sysDictData) {
        return sysDictDataMapper.upsertSelective(sysDictData);
    }

    @Override
    public int batchUpsert(List<SysDictData> list) {
        return sysDictDataMapper.batchUpsert(list);
    }

    @Override
    public int batchUpsertSelective(List<SysDictData> list) {
        return sysDictDataMapper.batchUpsertSelective(list);
    }

    @Override
    public int deleteByPrimaryKey(Integer dictCode) {
        return sysDictDataMapper.deleteByPrimaryKey(dictCode);
    }

    @Override
    public int deleteBatchByPrimaryKeys(List<Integer> list) {
        return sysDictDataMapper.deleteBatchByPrimaryKeys(list);
    }

    @Override
    public int delete(SysDictData sysDictData) {
        return sysDictDataMapper.delete(sysDictData);
    }

    @Override
    public SysDictData queryByPrimaryKey(Integer dictCode) {
        return sysDictDataMapper.queryByPrimaryKey(dictCode);
    }

    @Override
    public List<SysDictData> queryBatchPrimaryKeys(List<Integer> list) {
        return sysDictDataMapper.queryBatchPrimaryKeys(list);
    }

    @Override
    public SysDictData queryOne(SysDictData sysDictData) {
        return sysDictDataMapper.queryOne(sysDictData);
    }

    @Override
    public List<SysDictData> queryByCondition(SysDictData sysDictData) {
        return sysDictDataMapper.queryByCondition(sysDictData);
    }

    @Override
    public List<SysDictData> queryFuzzy(SysDictData sysDictData) {
        return sysDictDataMapper.queryFuzzy(sysDictData);
    }

    @Override
    public List<SysDictData> queryByLikeCondition(SysDictData sysDictData) {
        return sysDictDataMapper.queryByLikeCondition(sysDictData);
    }

    @Override
    public int queryCount(SysDictData sysDictData) {
        return sysDictDataMapper.queryCount(sysDictData);
    }

    @Override
    public List<Map<String, Object>> statisticsGroup(SysDictData sysDictData) {
        return sysDictDataMapper.statisticsGroup(sysDictData);
    }

    @Override
    public List<Map<String, Object>> statisticsGroupByDay(SysDictData sysDictData) {
        return sysDictDataMapper.statisticsGroupByDay(sysDictData);
    }

    @Override
    public List<Map<String, Object>> statisticsGroupByMonth(SysDictData sysDictData) {
        return sysDictDataMapper.statisticsGroupByMonth(sysDictData);
    }

    @Override
    public List<Map<String, Object>> statisticsGroupByYear(SysDictData sysDictData) {
        return sysDictDataMapper.statisticsGroupByYear(sysDictData);
    }
}