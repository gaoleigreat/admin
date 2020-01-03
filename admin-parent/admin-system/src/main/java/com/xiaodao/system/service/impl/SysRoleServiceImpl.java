package com.xiaodao.system.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import com.xiaodao.system.mapper.SysRoleMapper;
import com.xiaodao.system.service.ISysRoleService;
import com.xiaodao.admin.entity.SysRole;

import java.util.List;
import java.util.Map;


/**
 * @description ISysRole Service层
 * @author xiaodao
 * @since jdk1.8
 */
@Service
public class SysRoleServiceImpl implements ISysRoleService{


     @Autowired
     private SysRoleMapper sysRoleMapper;

    @Override
    public int insert(SysRole sysRole) {
        return sysRoleMapper.insert(sysRole);
    }

    @Override
    public int insertSelective(SysRole sysRole) {
        return sysRoleMapper.insertSelective(sysRole);
    }

    @Override
    public int batchInsert(List<SysRole> list) {
        return sysRoleMapper.batchInsert(list);
    }

    @Override
    public int batchInsertSelective(List<SysRole> list) {
        return sysRoleMapper.batchInsertSelective(list);
    }

    @Override
    public int updateByPrimaryKey(SysRole sysRole) {
        return sysRoleMapper.updateByPrimaryKey(sysRole);
    }

    @Override
    public int updateSelectiveByPrimaryKey(SysRole sysRole) {
        return sysRoleMapper.updateSelectiveByPrimaryKey(sysRole);
    }

    @Override
    public int batchUpdate(List<SysRole> list) {
        return sysRoleMapper.batchUpdate(list);
    }

    @Override
    public int batchUpdateSelective(List<SysRole> list) {
        return sysRoleMapper.batchUpdateSelective(list);
    }

    @Override
    public int upsert(SysRole sysRole) {
        return sysRoleMapper.upsert(sysRole);
    }

    @Override
    public int upsertSelective(SysRole sysRole) {
        return sysRoleMapper.upsertSelective(sysRole);
    }

    @Override
    public int batchUpsert(List<SysRole> list) {
        return sysRoleMapper.batchUpsert(list);
    }

    @Override
    public int batchUpsertSelective(List<SysRole> list) {
        return sysRoleMapper.batchUpsertSelective(list);
    }

    @Override
    public int deleteByPrimaryKey(Long roleId) {
        return sysRoleMapper.deleteByPrimaryKey(roleId);
    }

    @Override
    public int deleteBatchByPrimaryKeys(List<Long> list) {
        return sysRoleMapper.deleteBatchByPrimaryKeys(list);
    }

    @Override
    public int delete(SysRole sysRole) {
        return sysRoleMapper.delete(sysRole);
    }

    @Override
    public SysRole queryByPrimaryKey(Long roleId) {
        return sysRoleMapper.queryByPrimaryKey(roleId);
    }

    @Override
    public List<SysRole> queryBatchPrimaryKeys(List<Long> list) {
        return sysRoleMapper.queryBatchPrimaryKeys(list);
    }

    @Override
    public SysRole queryOne(SysRole sysRole) {
        return sysRoleMapper.queryOne(sysRole);
    }

    @Override
    public List<SysRole> queryByCondition(SysRole sysRole) {
        return sysRoleMapper.queryByCondition(sysRole);
    }

    @Override
    public List<SysRole> queryFuzzy(SysRole sysRole) {
        return sysRoleMapper.queryFuzzy(sysRole);
    }

    @Override
    public List<SysRole> queryByLikeCondition(SysRole sysRole) {
        return sysRoleMapper.queryByLikeCondition(sysRole);
    }

    @Override
    public int queryCount(SysRole sysRole) {
        return sysRoleMapper.queryCount(sysRole);
    }

    @Override
    public List<Map<String, Object>> statisticsGroup(SysRole sysRole) {
        return sysRoleMapper.statisticsGroup(sysRole);
    }

    @Override
    public List<Map<String, Object>> statisticsGroupByDay(SysRole sysRole) {
        return sysRoleMapper.statisticsGroupByDay(sysRole);
    }

    @Override
    public List<Map<String, Object>> statisticsGroupByMonth(SysRole sysRole) {
        return sysRoleMapper.statisticsGroupByMonth(sysRole);
    }

    @Override
    public List<Map<String, Object>> statisticsGroupByYear(SysRole sysRole) {
        return sysRoleMapper.statisticsGroupByYear(sysRole);
    }
}