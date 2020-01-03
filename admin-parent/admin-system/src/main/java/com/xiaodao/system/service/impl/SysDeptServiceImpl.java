package com.xiaodao.system.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import com.xiaodao.system.mapper.SysDeptMapper;
import com.xiaodao.system.service.ISysDeptService;
import com.xiaodao.admin.entity.SysDept;

import java.util.List;
import java.util.Map;


/**
 * @description ISysDept Service层
 * @author xiaodao
 * @since jdk1.8
 */
@Service
public class SysDeptServiceImpl implements ISysDeptService{


     @Autowired
     private SysDeptMapper sysDeptMapper;

    @Override
    public int insert(SysDept sysDept) {
        return sysDeptMapper.insert(sysDept);
    }

    @Override
    public int insertSelective(SysDept sysDept) {
        return sysDeptMapper.insertSelective(sysDept);
    }

    @Override
    public int batchInsert(List<SysDept> list) {
        return sysDeptMapper.batchInsert(list);
    }

    @Override
    public int batchInsertSelective(List<SysDept> list) {
        return sysDeptMapper.batchInsertSelective(list);
    }

    @Override
    public int updateByPrimaryKey(SysDept sysDept) {
        return sysDeptMapper.updateByPrimaryKey(sysDept);
    }

    @Override
    public int updateSelectiveByPrimaryKey(SysDept sysDept) {
        return sysDeptMapper.updateSelectiveByPrimaryKey(sysDept);
    }

    @Override
    public int batchUpdate(List<SysDept> list) {
        return sysDeptMapper.batchUpdate(list);
    }

    @Override
    public int batchUpdateSelective(List<SysDept> list) {
        return sysDeptMapper.batchUpdateSelective(list);
    }

    @Override
    public int upsert(SysDept sysDept) {
        return sysDeptMapper.upsert(sysDept);
    }

    @Override
    public int upsertSelective(SysDept sysDept) {
        return sysDeptMapper.upsertSelective(sysDept);
    }

    @Override
    public int batchUpsert(List<SysDept> list) {
        return sysDeptMapper.batchUpsert(list);
    }

    @Override
    public int batchUpsertSelective(List<SysDept> list) {
        return sysDeptMapper.batchUpsertSelective(list);
    }

    @Override
    public int deleteByPrimaryKey(Long deptId) {
        return sysDeptMapper.deleteByPrimaryKey(deptId);
    }

    @Override
    public int deleteBatchByPrimaryKeys(List<Long> list) {
        return sysDeptMapper.deleteBatchByPrimaryKeys(list);
    }

    @Override
    public int delete(SysDept sysDept) {
        return sysDeptMapper.delete(sysDept);
    }

    @Override
    public SysDept queryByPrimaryKey(Long deptId) {
        return sysDeptMapper.queryByPrimaryKey(deptId);
    }

    @Override
    public List<SysDept> queryBatchPrimaryKeys(List<Long> list) {
        return sysDeptMapper.queryBatchPrimaryKeys(list);
    }

    @Override
    public SysDept queryOne(SysDept sysDept) {
        return sysDeptMapper.queryOne(sysDept);
    }

    @Override
    public List<SysDept> queryByCondition(SysDept sysDept) {
        return sysDeptMapper.queryByCondition(sysDept);
    }

    @Override
    public List<SysDept> queryFuzzy(SysDept sysDept) {
        return sysDeptMapper.queryFuzzy(sysDept);
    }

    @Override
    public List<SysDept> queryByLikeCondition(SysDept sysDept) {
        return sysDeptMapper.queryByLikeCondition(sysDept);
    }

    @Override
    public int queryCount(SysDept sysDept) {
        return sysDeptMapper.queryCount(sysDept);
    }

    @Override
    public List<Map<String, Object>> statisticsGroup(SysDept sysDept) {
        return sysDeptMapper.statisticsGroup(sysDept);
    }

    @Override
    public List<Map<String, Object>> statisticsGroupByDay(SysDept sysDept) {
        return sysDeptMapper.statisticsGroupByDay(sysDept);
    }

    @Override
    public List<Map<String, Object>> statisticsGroupByMonth(SysDept sysDept) {
        return sysDeptMapper.statisticsGroupByMonth(sysDept);
    }

    @Override
    public List<Map<String, Object>> statisticsGroupByYear(SysDept sysDept) {
        return sysDeptMapper.statisticsGroupByYear(sysDept);
    }
}