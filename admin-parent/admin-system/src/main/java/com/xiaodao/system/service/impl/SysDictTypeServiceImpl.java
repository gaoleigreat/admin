package com.xiaodao.system.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import com.xiaodao.system.mapper.SysDictTypeMapper;
import com.xiaodao.system.service.ISysDictTypeService;
import com.xiaodao.feign.system.entity.SysDictType;

import java.util.List;
import java.util.Map;


/**
 * @description ISysDictType Service层
 * @author xiaodao
 * @since jdk1.8
 */
@Service
public class SysDictTypeServiceImpl implements ISysDictTypeService{


     @Autowired
     private SysDictTypeMapper sysDictTypeMapper;

    @Override
    public int insert(SysDictType sysDictType) {
        return sysDictTypeMapper.insert(sysDictType);
    }

    @Override
    public int insertSelective(SysDictType sysDictType) {
        return sysDictTypeMapper.insertSelective(sysDictType);
    }

    @Override
    public int batchInsert(List<SysDictType> list) {
        return sysDictTypeMapper.batchInsert(list);
    }

    @Override
    public int batchInsertSelective(List<SysDictType> list) {
        return sysDictTypeMapper.batchInsertSelective(list);
    }

    @Override
    public int updateByPrimaryKey(SysDictType sysDictType) {
        return sysDictTypeMapper.updateByPrimaryKey(sysDictType);
    }

    @Override
    public int updateSelectiveByPrimaryKey(SysDictType sysDictType) {
        return sysDictTypeMapper.updateSelectiveByPrimaryKey(sysDictType);
    }

    @Override
    public int batchUpdate(List<SysDictType> list) {
        return sysDictTypeMapper.batchUpdate(list);
    }

    @Override
    public int batchUpdateSelective(List<SysDictType> list) {
        return sysDictTypeMapper.batchUpdateSelective(list);
    }

    @Override
    public int upsert(SysDictType sysDictType) {
        return sysDictTypeMapper.upsert(sysDictType);
    }

    @Override
    public int upsertSelective(SysDictType sysDictType) {
        return sysDictTypeMapper.upsertSelective(sysDictType);
    }

    @Override
    public int batchUpsert(List<SysDictType> list) {
        return sysDictTypeMapper.batchUpsert(list);
    }

    @Override
    public int batchUpsertSelective(List<SysDictType> list) {
        return sysDictTypeMapper.batchUpsertSelective(list);
    }

    @Override
    public int deleteByPrimaryKey(Long dictId) {
        return sysDictTypeMapper.deleteByPrimaryKey(dictId);
    }

    @Override
    public int deleteBatchByPrimaryKeys(List<Long> list) {
        return sysDictTypeMapper.deleteBatchByPrimaryKeys(list);
    }

    @Override
    public int delete(SysDictType sysDictType) {
        return sysDictTypeMapper.delete(sysDictType);
    }

    @Override
    public SysDictType queryByPrimaryKey(Long dictId) {
        return sysDictTypeMapper.queryByPrimaryKey(dictId);
    }

    @Override
    public List<SysDictType> queryBatchPrimaryKeys(List<Long> list) {
        return sysDictTypeMapper.queryBatchPrimaryKeys(list);
    }

    @Override
    public SysDictType queryOne(SysDictType sysDictType) {
        return sysDictTypeMapper.queryOne(sysDictType);
    }

    @Override
    public List<SysDictType> queryByCondition(SysDictType sysDictType) {
        return sysDictTypeMapper.queryByCondition(sysDictType);
    }

    @Override
    public List<SysDictType> queryFuzzy(SysDictType sysDictType) {
        return sysDictTypeMapper.queryFuzzy(sysDictType);
    }

    @Override
    public List<SysDictType> queryByLikeCondition(SysDictType sysDictType) {
        return sysDictTypeMapper.queryByLikeCondition(sysDictType);
    }

    @Override
    public int queryCount(SysDictType sysDictType) {
        return sysDictTypeMapper.queryCount(sysDictType);
    }

    @Override
    public List<Map<String, Object>> statisticsGroup(SysDictType sysDictType) {
        return sysDictTypeMapper.statisticsGroup(sysDictType);
    }

    @Override
    public List<Map<String, Object>> statisticsGroupByDay(SysDictType sysDictType) {
        return sysDictTypeMapper.statisticsGroupByDay(sysDictType);
    }

    @Override
    public List<Map<String, Object>> statisticsGroupByMonth(SysDictType sysDictType) {
        return sysDictTypeMapper.statisticsGroupByMonth(sysDictType);
    }

    @Override
    public List<Map<String, Object>> statisticsGroupByYear(SysDictType sysDictType) {
        return sysDictTypeMapper.statisticsGroupByYear(sysDictType);
    }
}