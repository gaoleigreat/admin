package com.xiaodao.system.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import com.xiaodao.system.mapper.SysConfigMapper;
import com.xiaodao.system.service.ISysConfigService;
import com.xiaodao.feign.system.entity.SysConfig;

import java.util.List;
import java.util.Map;


/**
 * @description ISysConfig Service层
 * @author xiaodao
 * @since jdk1.8
 */
@Service
public class SysConfigServiceImpl implements ISysConfigService{


     @Autowired
     private SysConfigMapper sysConfigMapper;

    @Override
    public int insert(SysConfig sysConfig) {
        return sysConfigMapper.insert(sysConfig);
    }

    @Override
    public int insertSelective(SysConfig sysConfig) {
        return sysConfigMapper.insertSelective(sysConfig);
    }

    @Override
    public int batchInsert(List<SysConfig> list) {
        return sysConfigMapper.batchInsert(list);
    }

    @Override
    public int batchInsertSelective(List<SysConfig> list) {
        return sysConfigMapper.batchInsertSelective(list);
    }

    @Override
    public int updateByPrimaryKey(SysConfig sysConfig) {
        return sysConfigMapper.updateByPrimaryKey(sysConfig);
    }

    @Override
    public int updateSelectiveByPrimaryKey(SysConfig sysConfig) {
        return sysConfigMapper.updateSelectiveByPrimaryKey(sysConfig);
    }

    @Override
    public int batchUpdate(List<SysConfig> list) {
        return sysConfigMapper.batchUpdate(list);
    }

    @Override
    public int batchUpdateSelective(List<SysConfig> list) {
        return sysConfigMapper.batchUpdateSelective(list);
    }

    @Override
    public int upsert(SysConfig sysConfig) {
        return sysConfigMapper.upsert(sysConfig);
    }

    @Override
    public int upsertSelective(SysConfig sysConfig) {
        return sysConfigMapper.upsertSelective(sysConfig);
    }

    @Override
    public int batchUpsert(List<SysConfig> list) {
        return sysConfigMapper.batchUpsert(list);
    }

    @Override
    public int batchUpsertSelective(List<SysConfig> list) {
        return sysConfigMapper.batchUpsertSelective(list);
    }

    @Override
    public int deleteByPrimaryKey(Long configId) {
        return sysConfigMapper.deleteByPrimaryKey(configId);
    }

    @Override
    public int deleteBatchByPrimaryKeys(List<Long> list) {
        return sysConfigMapper.deleteBatchByPrimaryKeys(list);
    }

    @Override
    public int delete(SysConfig sysConfig) {
        return sysConfigMapper.delete(sysConfig);
    }

    @Override
    public SysConfig queryByPrimaryKey(Long configId) {
        return sysConfigMapper.queryByPrimaryKey(configId);
    }

    @Override
    public List<SysConfig> queryBatchPrimaryKeys(List<Long> list) {
        return sysConfigMapper.queryBatchPrimaryKeys(list);
    }

    @Override
    public SysConfig queryOne(SysConfig sysConfig) {
        return sysConfigMapper.queryOne(sysConfig);
    }

    @Override
    public List<SysConfig> queryByCondition(SysConfig sysConfig) {
        return sysConfigMapper.queryByCondition(sysConfig);
    }

    @Override
    public List<SysConfig> queryFuzzy(SysConfig sysConfig) {
        return sysConfigMapper.queryFuzzy(sysConfig);
    }

    @Override
    public List<SysConfig> queryByLikeCondition(SysConfig sysConfig) {
        return sysConfigMapper.queryByLikeCondition(sysConfig);
    }

    @Override
    public int queryCount(SysConfig sysConfig) {
        return sysConfigMapper.queryCount(sysConfig);
    }

    @Override
    public List<Map<String, Object>> statisticsGroup(SysConfig sysConfig) {
        return sysConfigMapper.statisticsGroup(sysConfig);
    }

    @Override
    public List<Map<String, Object>> statisticsGroupByDay(SysConfig sysConfig) {
        return sysConfigMapper.statisticsGroupByDay(sysConfig);
    }

    @Override
    public List<Map<String, Object>> statisticsGroupByMonth(SysConfig sysConfig) {
        return sysConfigMapper.statisticsGroupByMonth(sysConfig);
    }

    @Override
    public List<Map<String, Object>> statisticsGroupByYear(SysConfig sysConfig) {
        return sysConfigMapper.statisticsGroupByYear(sysConfig);
    }
}