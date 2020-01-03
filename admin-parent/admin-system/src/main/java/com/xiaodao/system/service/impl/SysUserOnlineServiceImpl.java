package com.xiaodao.system.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import com.xiaodao.system.mapper.SysUserOnlineMapper;
import com.xiaodao.system.service.ISysUserOnlineService;
import com.xiaodao.admin.entity.SysUserOnline;

import java.util.List;
import java.util.Map;


/**
 * @description ISysUserOnline Service层
 * @author xiaodao
 * @since jdk1.8
 */
@Service
public class SysUserOnlineServiceImpl implements ISysUserOnlineService{


     @Autowired
     private SysUserOnlineMapper sysUserOnlineMapper;

    @Override
    public int insert(SysUserOnline sysUserOnline) {
        return sysUserOnlineMapper.insert(sysUserOnline);
    }

    @Override
    public int insertSelective(SysUserOnline sysUserOnline) {
        return sysUserOnlineMapper.insertSelective(sysUserOnline);
    }

    @Override
    public int batchInsert(List<SysUserOnline> list) {
        return sysUserOnlineMapper.batchInsert(list);
    }

    @Override
    public int batchInsertSelective(List<SysUserOnline> list) {
        return sysUserOnlineMapper.batchInsertSelective(list);
    }

    @Override
    public int updateByPrimaryKey(SysUserOnline sysUserOnline) {
        return sysUserOnlineMapper.updateByPrimaryKey(sysUserOnline);
    }

    @Override
    public int updateSelectiveByPrimaryKey(SysUserOnline sysUserOnline) {
        return sysUserOnlineMapper.updateSelectiveByPrimaryKey(sysUserOnline);
    }

    @Override
    public int batchUpdate(List<SysUserOnline> list) {
        return sysUserOnlineMapper.batchUpdate(list);
    }

    @Override
    public int batchUpdateSelective(List<SysUserOnline> list) {
        return sysUserOnlineMapper.batchUpdateSelective(list);
    }

    @Override
    public int upsert(SysUserOnline sysUserOnline) {
        return sysUserOnlineMapper.upsert(sysUserOnline);
    }

    @Override
    public int upsertSelective(SysUserOnline sysUserOnline) {
        return sysUserOnlineMapper.upsertSelective(sysUserOnline);
    }

    @Override
    public int batchUpsert(List<SysUserOnline> list) {
        return sysUserOnlineMapper.batchUpsert(list);
    }

    @Override
    public int batchUpsertSelective(List<SysUserOnline> list) {
        return sysUserOnlineMapper.batchUpsertSelective(list);
    }

    @Override
    public int deleteByPrimaryKey(String sessionid) {
        return sysUserOnlineMapper.deleteByPrimaryKey(sessionid);
    }

    @Override
    public int deleteBatchByPrimaryKeys(List<String> list) {
        return sysUserOnlineMapper.deleteBatchByPrimaryKeys(list);
    }

    @Override
    public int delete(SysUserOnline sysUserOnline) {
        return sysUserOnlineMapper.delete(sysUserOnline);
    }

    @Override
    public SysUserOnline queryByPrimaryKey(String sessionid) {
        return sysUserOnlineMapper.queryByPrimaryKey(sessionid);
    }

    @Override
    public List<SysUserOnline> queryBatchPrimaryKeys(List<String> list) {
        return sysUserOnlineMapper.queryBatchPrimaryKeys(list);
    }

    @Override
    public SysUserOnline queryOne(SysUserOnline sysUserOnline) {
        return sysUserOnlineMapper.queryOne(sysUserOnline);
    }

    @Override
    public List<SysUserOnline> queryByCondition(SysUserOnline sysUserOnline) {
        return sysUserOnlineMapper.queryByCondition(sysUserOnline);
    }

    @Override
    public List<SysUserOnline> queryFuzzy(SysUserOnline sysUserOnline) {
        return sysUserOnlineMapper.queryFuzzy(sysUserOnline);
    }

    @Override
    public List<SysUserOnline> queryByLikeCondition(SysUserOnline sysUserOnline) {
        return sysUserOnlineMapper.queryByLikeCondition(sysUserOnline);
    }

    @Override
    public int queryCount(SysUserOnline sysUserOnline) {
        return sysUserOnlineMapper.queryCount(sysUserOnline);
    }

    @Override
    public List<Map<String, Object>> statisticsGroup(SysUserOnline sysUserOnline) {
        return sysUserOnlineMapper.statisticsGroup(sysUserOnline);
    }

    @Override
    public List<Map<String, Object>> statisticsGroupByDay(SysUserOnline sysUserOnline) {
        return sysUserOnlineMapper.statisticsGroupByDay(sysUserOnline);
    }

    @Override
    public List<Map<String, Object>> statisticsGroupByMonth(SysUserOnline sysUserOnline) {
        return sysUserOnlineMapper.statisticsGroupByMonth(sysUserOnline);
    }

    @Override
    public List<Map<String, Object>> statisticsGroupByYear(SysUserOnline sysUserOnline) {
        return sysUserOnlineMapper.statisticsGroupByYear(sysUserOnline);
    }
}