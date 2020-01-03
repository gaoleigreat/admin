package com.xiaodao.system.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import com.xiaodao.system.mapper.SysRoleDeptMapper;
import com.xiaodao.system.service.ISysRoleDeptService;
import com.xiaodao.admin.entity.SysRoleDept;

import java.util.List;
import java.util.Map;


/**
 * @description ISysRoleDept Service层
 * @author xiaodao
 * @since jdk1.8
 */
@Service
public class SysRoleDeptServiceImpl implements ISysRoleDeptService{


     @Autowired
     private SysRoleDeptMapper sysRoleDeptMapper;

    @Override
    public int insert(SysRoleDept sysRoleDept) {
        return sysRoleDeptMapper.insert(sysRoleDept);
    }

    @Override
    public int insertSelective(SysRoleDept sysRoleDept) {
        return sysRoleDeptMapper.insertSelective(sysRoleDept);
    }

    @Override
    public int batchInsert(List<SysRoleDept> list) {
        return sysRoleDeptMapper.batchInsert(list);
    }

    @Override
    public int batchInsertSelective(List<SysRoleDept> list) {
        return sysRoleDeptMapper.batchInsertSelective(list);
    }

    @Override
    public int updateByPrimaryKey(SysRoleDept sysRoleDept) {
        return sysRoleDeptMapper.updateByPrimaryKey(sysRoleDept);
    }

    @Override
    public int updateSelectiveByPrimaryKey(SysRoleDept sysRoleDept) {
        return sysRoleDeptMapper.updateSelectiveByPrimaryKey(sysRoleDept);
    }

    @Override
    public int batchUpdate(List<SysRoleDept> list) {
        return sysRoleDeptMapper.batchUpdate(list);
    }

    @Override
    public int batchUpdateSelective(List<SysRoleDept> list) {
        return sysRoleDeptMapper.batchUpdateSelective(list);
    }

    @Override
    public int upsert(SysRoleDept sysRoleDept) {
        return sysRoleDeptMapper.upsert(sysRoleDept);
    }

    @Override
    public int upsertSelective(SysRoleDept sysRoleDept) {
        return sysRoleDeptMapper.upsertSelective(sysRoleDept);
    }

    @Override
    public int batchUpsert(List<SysRoleDept> list) {
        return sysRoleDeptMapper.batchUpsert(list);
    }

    @Override
    public int batchUpsertSelective(List<SysRoleDept> list) {
        return sysRoleDeptMapper.batchUpsertSelective(list);
    }

    @Override
    public int deleteByPrimaryKey(Long roleId) {
        return sysRoleDeptMapper.deleteByPrimaryKey(roleId);
    }

    @Override
    public int deleteBatchByPrimaryKeys(List<Long> list) {
        return sysRoleDeptMapper.deleteBatchByPrimaryKeys(list);
    }

    @Override
    public int delete(SysRoleDept sysRoleDept) {
        return sysRoleDeptMapper.delete(sysRoleDept);
    }

    @Override
    public SysRoleDept queryByPrimaryKey(Long roleId) {
        return sysRoleDeptMapper.queryByPrimaryKey(roleId);
    }

    @Override
    public List<SysRoleDept> queryBatchPrimaryKeys(List<Long> list) {
        return sysRoleDeptMapper.queryBatchPrimaryKeys(list);
    }

    @Override
    public SysRoleDept queryOne(SysRoleDept sysRoleDept) {
        return sysRoleDeptMapper.queryOne(sysRoleDept);
    }

    @Override
    public List<SysRoleDept> queryByCondition(SysRoleDept sysRoleDept) {
        return sysRoleDeptMapper.queryByCondition(sysRoleDept);
    }

    @Override
    public List<SysRoleDept> queryFuzzy(SysRoleDept sysRoleDept) {
        return sysRoleDeptMapper.queryFuzzy(sysRoleDept);
    }

    @Override
    public List<SysRoleDept> queryByLikeCondition(SysRoleDept sysRoleDept) {
        return sysRoleDeptMapper.queryByLikeCondition(sysRoleDept);
    }

    @Override
    public int queryCount(SysRoleDept sysRoleDept) {
        return sysRoleDeptMapper.queryCount(sysRoleDept);
    }

    @Override
    public List<Map<String, Object>> statisticsGroup(SysRoleDept sysRoleDept) {
        return sysRoleDeptMapper.statisticsGroup(sysRoleDept);
    }

    @Override
    public List<Map<String, Object>> statisticsGroupByDay(SysRoleDept sysRoleDept) {
        return sysRoleDeptMapper.statisticsGroupByDay(sysRoleDept);
    }

    @Override
    public List<Map<String, Object>> statisticsGroupByMonth(SysRoleDept sysRoleDept) {
        return sysRoleDeptMapper.statisticsGroupByMonth(sysRoleDept);
    }

    @Override
    public List<Map<String, Object>> statisticsGroupByYear(SysRoleDept sysRoleDept) {
        return sysRoleDeptMapper.statisticsGroupByYear(sysRoleDept);
    }
}