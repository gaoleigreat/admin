package com.xiaodao.system.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import com.xiaodao.system.mapper.SysMenuMapper;
import com.xiaodao.system.service.ISysMenuService;
import com.xiaodao.admin.entity.SysMenu;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;


/**
 * @description ISysMenu Service层
 * @author xiaodao
 * @since jdk1.8
 */
@Service
public class SysMenuServiceImpl implements ISysMenuService{


     @Autowired
     private SysMenuMapper sysMenuMapper;

    @Override
    public int insert(SysMenu sysMenu) {
        return sysMenuMapper.insert(sysMenu);
    }

    @Override
    public int insertSelective(SysMenu sysMenu) {
        return sysMenuMapper.insertSelective(sysMenu);
    }

    @Override
    public int batchInsert(List<SysMenu> list) {
        return sysMenuMapper.batchInsert(list);
    }

    @Override
    public int batchInsertSelective(List<SysMenu> list) {
        return sysMenuMapper.batchInsertSelective(list);
    }

    @Override
    public int updateByPrimaryKey(SysMenu sysMenu) {
        return sysMenuMapper.updateByPrimaryKey(sysMenu);
    }

    @Override
    public int updateSelectiveByPrimaryKey(SysMenu sysMenu) {
        return sysMenuMapper.updateSelectiveByPrimaryKey(sysMenu);
    }

    @Override
    public int batchUpdate(List<SysMenu> list) {
        return sysMenuMapper.batchUpdate(list);
    }

    @Override
    public int batchUpdateSelective(List<SysMenu> list) {
        return sysMenuMapper.batchUpdateSelective(list);
    }

    @Override
    public int upsert(SysMenu sysMenu) {
        return sysMenuMapper.upsert(sysMenu);
    }

    @Override
    public int upsertSelective(SysMenu sysMenu) {
        return sysMenuMapper.upsertSelective(sysMenu);
    }

    @Override
    public int batchUpsert(List<SysMenu> list) {
        return sysMenuMapper.batchUpsert(list);
    }

    @Override
    public int batchUpsertSelective(List<SysMenu> list) {
        return sysMenuMapper.batchUpsertSelective(list);
    }

    @Override
    public int deleteByPrimaryKey(Long menuId) {
        return sysMenuMapper.deleteByPrimaryKey(menuId);
    }

    @Override
    public int deleteBatchByPrimaryKeys(List<Long> list) {
        return sysMenuMapper.deleteBatchByPrimaryKeys(list);
    }

    @Override
    public int delete(SysMenu sysMenu) {
        return sysMenuMapper.delete(sysMenu);
    }

    @Override
    public SysMenu queryByPrimaryKey(Long menuId) {
        return sysMenuMapper.queryByPrimaryKey(menuId);
    }

    @Override
    public List<SysMenu> queryBatchPrimaryKeys(List<Long> list) {
        return sysMenuMapper.queryBatchPrimaryKeys(list);
    }

    @Override
    public SysMenu queryOne(SysMenu sysMenu) {
        return sysMenuMapper.queryOne(sysMenu);
    }

    @Override
    public List<SysMenu> queryByCondition(SysMenu sysMenu) {
        return sysMenuMapper.queryByCondition(sysMenu);
    }

    @Override
    public List<SysMenu> queryFuzzy(SysMenu sysMenu) {
        return sysMenuMapper.queryFuzzy(sysMenu);
    }

    @Override
    public List<SysMenu> queryByLikeCondition(SysMenu sysMenu) {
        return sysMenuMapper.queryByLikeCondition(sysMenu);
    }

    @Override
    public int queryCount(SysMenu sysMenu) {
        return sysMenuMapper.queryCount(sysMenu);
    }

    @Override
    public List<Map<String, Object>> statisticsGroup(SysMenu sysMenu) {
        return sysMenuMapper.statisticsGroup(sysMenu);
    }

    @Override
    public List<Map<String, Object>> statisticsGroupByDay(SysMenu sysMenu) {
        return sysMenuMapper.statisticsGroupByDay(sysMenu);
    }

    @Override
    public List<Map<String, Object>> statisticsGroupByMonth(SysMenu sysMenu) {
        return sysMenuMapper.statisticsGroupByMonth(sysMenu);
    }

    @Override
    public List<Map<String, Object>> statisticsGroupByYear(SysMenu sysMenu) {
        return sysMenuMapper.statisticsGroupByYear(sysMenu);
    }

    @Override
    public List<SysMenu> selectMenuAll() {
        return sysMenuMapper.selectMenuAll();
    }

    @Override
    public List<SysMenu> selectMenuNormalAll() {
        return sysMenuMapper.selectMenuNormalAll();
    }

    @Override
    public List<SysMenu> selectMenusByUserId(Long userId) {
        return sysMenuMapper.selectMenusByUserId(userId);
    }

    @Override
    public List<String> selectPermsByUserId(Long userId) {
        return sysMenuMapper.selectPermsByUserId(userId);
    }

    @Override
    public List<Long> selectMenuIdsByRoleId(Long roleId) {
        return sysMenuMapper.selectMenuIdsByRoleId(roleId);
    }

    @Override
    public List<String> selectMenuTree(Long roleId) {
        return sysMenuMapper.selectMenuTree(roleId);
    }
}