package com.xiaodao.system.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import com.xiaodao.system.mapper.SysUserRoleMapper;
import com.xiaodao.system.service.ISysUserRoleService;
import com.xiaodao.feign.system.entity.SysUserRole;

import java.util.List;
import java.util.Map;


/**
 * @description ISysUserRole Service层
 * @author xiaodao
 * @since jdk1.8
 */
@Service
public class SysUserRoleServiceImpl implements ISysUserRoleService{


     @Autowired
     private SysUserRoleMapper sysUserRoleMapper;

    @Override
    public int insert(SysUserRole sysUserRole) {
        return sysUserRoleMapper.insert(sysUserRole);
    }

    @Override
    public int insertSelective(SysUserRole sysUserRole) {
        return sysUserRoleMapper.insertSelective(sysUserRole);
    }

    @Override
    public int batchInsert(List<SysUserRole> list) {
        return sysUserRoleMapper.batchInsert(list);
    }

    @Override
    public int batchInsertSelective(List<SysUserRole> list) {
        return sysUserRoleMapper.batchInsertSelective(list);
    }

    @Override
    public int updateByPrimaryKey(SysUserRole sysUserRole) {
        return sysUserRoleMapper.updateByPrimaryKey(sysUserRole);
    }

    @Override
    public int updateSelectiveByPrimaryKey(SysUserRole sysUserRole) {
        return sysUserRoleMapper.updateSelectiveByPrimaryKey(sysUserRole);
    }

    @Override
    public int batchUpdate(List<SysUserRole> list) {
        return sysUserRoleMapper.batchUpdate(list);
    }

    @Override
    public int batchUpdateSelective(List<SysUserRole> list) {
        return sysUserRoleMapper.batchUpdateSelective(list);
    }

    @Override
    public int upsert(SysUserRole sysUserRole) {
        return sysUserRoleMapper.upsert(sysUserRole);
    }

    @Override
    public int upsertSelective(SysUserRole sysUserRole) {
        return sysUserRoleMapper.upsertSelective(sysUserRole);
    }

    @Override
    public int batchUpsert(List<SysUserRole> list) {
        return sysUserRoleMapper.batchUpsert(list);
    }

    @Override
    public int batchUpsertSelective(List<SysUserRole> list) {
        return sysUserRoleMapper.batchUpsertSelective(list);
    }

    @Override
    public int deleteByPrimaryKey(Integer userId) {
        return sysUserRoleMapper.deleteByPrimaryKey(userId);
    }

    @Override
    public int deleteBatchByPrimaryKeys(List<Integer> list) {
        return sysUserRoleMapper.deleteBatchByPrimaryKeys(list);
    }

    @Override
    public int delete(SysUserRole sysUserRole) {
        return sysUserRoleMapper.delete(sysUserRole);
    }

    @Override
    public SysUserRole queryByPrimaryKey(Integer userId) {
        return sysUserRoleMapper.queryByPrimaryKey(userId);
    }

    @Override
    public List<SysUserRole> queryBatchPrimaryKeys(List<Integer> list) {
        return sysUserRoleMapper.queryBatchPrimaryKeys(list);
    }

    @Override
    public SysUserRole queryOne(SysUserRole sysUserRole) {
        return sysUserRoleMapper.queryOne(sysUserRole);
    }

    @Override
    public List<SysUserRole> queryByCondition(SysUserRole sysUserRole) {
        return sysUserRoleMapper.queryByCondition(sysUserRole);
    }

    @Override
    public List<SysUserRole> queryFuzzy(SysUserRole sysUserRole) {
        return sysUserRoleMapper.queryFuzzy(sysUserRole);
    }

    @Override
    public List<SysUserRole> queryByLikeCondition(SysUserRole sysUserRole) {
        return sysUserRoleMapper.queryByLikeCondition(sysUserRole);
    }

    @Override
    public int queryCount(SysUserRole sysUserRole) {
        return sysUserRoleMapper.queryCount(sysUserRole);
    }

    @Override
    public List<Map<String, Object>> statisticsGroup(SysUserRole sysUserRole) {
        return sysUserRoleMapper.statisticsGroup(sysUserRole);
    }

    @Override
    public List<Map<String, Object>> statisticsGroupByDay(SysUserRole sysUserRole) {
        return sysUserRoleMapper.statisticsGroupByDay(sysUserRole);
    }

    @Override
    public List<Map<String, Object>> statisticsGroupByMonth(SysUserRole sysUserRole) {
        return sysUserRoleMapper.statisticsGroupByMonth(sysUserRole);
    }

    @Override
    public List<Map<String, Object>> statisticsGroupByYear(SysUserRole sysUserRole) {
        return sysUserRoleMapper.statisticsGroupByYear(sysUserRole);
    }
}