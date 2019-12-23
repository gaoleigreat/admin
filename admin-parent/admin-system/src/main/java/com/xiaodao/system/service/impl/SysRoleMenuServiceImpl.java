package com.xiaodao.system.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import com.xiaodao.system.mapper.SysRoleMenuMapper;
import com.xiaodao.system.service.ISysRoleMenuService;
import com.xiaodao.feign.system.entity.SysRoleMenu;

import java.util.List;
import java.util.Map;


/**
 * @description ISysRoleMenu Service层
 * @author xiaodao
 * @since jdk1.8
 */
@Service
public class SysRoleMenuServiceImpl implements ISysRoleMenuService{


     @Autowired
     private SysRoleMenuMapper sysRoleMenuMapper;

    @Override
    public int insert(SysRoleMenu sysRoleMenu) {
        return sysRoleMenuMapper.insert(sysRoleMenu);
    }

    @Override
    public int insertSelective(SysRoleMenu sysRoleMenu) {
        return sysRoleMenuMapper.insertSelective(sysRoleMenu);
    }

    @Override
    public int batchInsert(List<SysRoleMenu> list) {
        return sysRoleMenuMapper.batchInsert(list);
    }

    @Override
    public int batchInsertSelective(List<SysRoleMenu> list) {
        return sysRoleMenuMapper.batchInsertSelective(list);
    }

    @Override
    public int updateByPrimaryKey(SysRoleMenu sysRoleMenu) {
        return sysRoleMenuMapper.updateByPrimaryKey(sysRoleMenu);
    }

    @Override
    public int updateSelectiveByPrimaryKey(SysRoleMenu sysRoleMenu) {
        return sysRoleMenuMapper.updateSelectiveByPrimaryKey(sysRoleMenu);
    }

    @Override
    public int batchUpdate(List<SysRoleMenu> list) {
        return sysRoleMenuMapper.batchUpdate(list);
    }

    @Override
    public int batchUpdateSelective(List<SysRoleMenu> list) {
        return sysRoleMenuMapper.batchUpdateSelective(list);
    }

    @Override
    public int upsert(SysRoleMenu sysRoleMenu) {
        return sysRoleMenuMapper.upsert(sysRoleMenu);
    }

    @Override
    public int upsertSelective(SysRoleMenu sysRoleMenu) {
        return sysRoleMenuMapper.upsertSelective(sysRoleMenu);
    }

    @Override
    public int batchUpsert(List<SysRoleMenu> list) {
        return sysRoleMenuMapper.batchUpsert(list);
    }

    @Override
    public int batchUpsertSelective(List<SysRoleMenu> list) {
        return sysRoleMenuMapper.batchUpsertSelective(list);
    }

    @Override
    public int deleteByPrimaryKey(Long roleId) {
        return sysRoleMenuMapper.deleteByPrimaryKey(roleId);
    }

    @Override
    public int deleteBatchByPrimaryKeys(List<Long> list) {
        return sysRoleMenuMapper.deleteBatchByPrimaryKeys(list);
    }

    @Override
    public int delete(SysRoleMenu sysRoleMenu) {
        return sysRoleMenuMapper.delete(sysRoleMenu);
    }

    @Override
    public SysRoleMenu queryByPrimaryKey(Long roleId) {
        return sysRoleMenuMapper.queryByPrimaryKey(roleId);
    }

    @Override
    public List<SysRoleMenu> queryBatchPrimaryKeys(List<Long> list) {
        return sysRoleMenuMapper.queryBatchPrimaryKeys(list);
    }

    @Override
    public SysRoleMenu queryOne(SysRoleMenu sysRoleMenu) {
        return sysRoleMenuMapper.queryOne(sysRoleMenu);
    }

    @Override
    public List<SysRoleMenu> queryByCondition(SysRoleMenu sysRoleMenu) {
        return sysRoleMenuMapper.queryByCondition(sysRoleMenu);
    }

    @Override
    public List<SysRoleMenu> queryFuzzy(SysRoleMenu sysRoleMenu) {
        return sysRoleMenuMapper.queryFuzzy(sysRoleMenu);
    }

    @Override
    public List<SysRoleMenu> queryByLikeCondition(SysRoleMenu sysRoleMenu) {
        return sysRoleMenuMapper.queryByLikeCondition(sysRoleMenu);
    }

    @Override
    public int queryCount(SysRoleMenu sysRoleMenu) {
        return sysRoleMenuMapper.queryCount(sysRoleMenu);
    }

    @Override
    public List<Map<String, Object>> statisticsGroup(SysRoleMenu sysRoleMenu) {
        return sysRoleMenuMapper.statisticsGroup(sysRoleMenu);
    }

    @Override
    public List<Map<String, Object>> statisticsGroupByDay(SysRoleMenu sysRoleMenu) {
        return sysRoleMenuMapper.statisticsGroupByDay(sysRoleMenu);
    }

    @Override
    public List<Map<String, Object>> statisticsGroupByMonth(SysRoleMenu sysRoleMenu) {
        return sysRoleMenuMapper.statisticsGroupByMonth(sysRoleMenu);
    }

    @Override
    public List<Map<String, Object>> statisticsGroupByYear(SysRoleMenu sysRoleMenu) {
        return sysRoleMenuMapper.statisticsGroupByYear(sysRoleMenu);
    }
}