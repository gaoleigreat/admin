package com.xiaodao.system.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import com.xiaodao.system.mapper.SysOperLogMapper;
import com.xiaodao.system.service.ISysOperLogService;
import com.xiaodao.admin.entity.SysOperLog;

import java.util.List;
import java.util.Map;


/**
 * @description ISysOperLog Service层
 * @author xiaodao
 * @since jdk1.8
 */
@Service
public class SysOperLogServiceImpl implements ISysOperLogService{


     @Autowired
     private SysOperLogMapper sysOperLogMapper;

    @Override
    public int insert(SysOperLog sysOperLog) {
        return sysOperLogMapper.insert(sysOperLog);
    }

    @Override
    public int insertSelective(SysOperLog sysOperLog) {
        return sysOperLogMapper.insertSelective(sysOperLog);
    }

    @Override
    public int batchInsert(List<SysOperLog> list) {
        return sysOperLogMapper.batchInsert(list);
    }

    @Override
    public int batchInsertSelective(List<SysOperLog> list) {
        return sysOperLogMapper.batchInsertSelective(list);
    }

    @Override
    public int updateByPrimaryKey(SysOperLog sysOperLog) {
        return sysOperLogMapper.updateByPrimaryKey(sysOperLog);
    }

    @Override
    public int updateSelectiveByPrimaryKey(SysOperLog sysOperLog) {
        return sysOperLogMapper.updateSelectiveByPrimaryKey(sysOperLog);
    }

    @Override
    public int batchUpdate(List<SysOperLog> list) {
        return sysOperLogMapper.batchUpdate(list);
    }

    @Override
    public int batchUpdateSelective(List<SysOperLog> list) {
        return sysOperLogMapper.batchUpdateSelective(list);
    }

    @Override
    public int upsert(SysOperLog sysOperLog) {
        return sysOperLogMapper.upsert(sysOperLog);
    }

    @Override
    public int upsertSelective(SysOperLog sysOperLog) {
        return sysOperLogMapper.upsertSelective(sysOperLog);
    }

    @Override
    public int batchUpsert(List<SysOperLog> list) {
        return sysOperLogMapper.batchUpsert(list);
    }

    @Override
    public int batchUpsertSelective(List<SysOperLog> list) {
        return sysOperLogMapper.batchUpsertSelective(list);
    }

    @Override
    public int deleteByPrimaryKey(Long operId) {
        return sysOperLogMapper.deleteByPrimaryKey(operId);
    }

    @Override
    public int deleteBatchByPrimaryKeys(List<Long> list) {
        return sysOperLogMapper.deleteBatchByPrimaryKeys(list);
    }

    @Override
    public int delete(SysOperLog sysOperLog) {
        return sysOperLogMapper.delete(sysOperLog);
    }

    @Override
    public SysOperLog queryByPrimaryKey(Long operId) {
        return sysOperLogMapper.queryByPrimaryKey(operId);
    }

    @Override
    public List<SysOperLog> queryBatchPrimaryKeys(List<Long> list) {
        return sysOperLogMapper.queryBatchPrimaryKeys(list);
    }

    @Override
    public SysOperLog queryOne(SysOperLog sysOperLog) {
        return sysOperLogMapper.queryOne(sysOperLog);
    }

    @Override
    public List<SysOperLog> queryByCondition(SysOperLog sysOperLog) {
        return sysOperLogMapper.queryByCondition(sysOperLog);
    }

    @Override
    public List<SysOperLog> queryFuzzy(SysOperLog sysOperLog) {
        return sysOperLogMapper.queryFuzzy(sysOperLog);
    }

    @Override
    public List<SysOperLog> queryByLikeCondition(SysOperLog sysOperLog) {
        return sysOperLogMapper.queryByLikeCondition(sysOperLog);
    }

    @Override
    public int queryCount(SysOperLog sysOperLog) {
        return sysOperLogMapper.queryCount(sysOperLog);
    }

    @Override
    public List<Map<String, Object>> statisticsGroup(SysOperLog sysOperLog) {
        return sysOperLogMapper.statisticsGroup(sysOperLog);
    }

    @Override
    public List<Map<String, Object>> statisticsGroupByDay(SysOperLog sysOperLog) {
        return sysOperLogMapper.statisticsGroupByDay(sysOperLog);
    }

    @Override
    public List<Map<String, Object>> statisticsGroupByMonth(SysOperLog sysOperLog) {
        return sysOperLogMapper.statisticsGroupByMonth(sysOperLog);
    }

    @Override
    public List<Map<String, Object>> statisticsGroupByYear(SysOperLog sysOperLog) {
        return sysOperLogMapper.statisticsGroupByYear(sysOperLog);
    }
}