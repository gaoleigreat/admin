package com.xiaodao.system.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import com.xiaodao.system.mapper.SysOssMapper;
import com.xiaodao.system.service.ISysOssService;
import com.xiaodao.admin.entity.SysOss;

import java.util.List;
import java.util.Map;


/**
 * @description ISysOss Service层
 * @author xiaodao
 * @since jdk1.8
 */
@Service
public class SysOssServiceImpl implements ISysOssService{


     @Autowired
     private SysOssMapper sysOssMapper;

    @Override
    public int insert(SysOss sysOss) {
        return sysOssMapper.insert(sysOss);
    }

    @Override
    public int insertSelective(SysOss sysOss) {
        return sysOssMapper.insertSelective(sysOss);
    }

    @Override
    public int batchInsert(List<SysOss> list) {
        return sysOssMapper.batchInsert(list);
    }

    @Override
    public int batchInsertSelective(List<SysOss> list) {
        return sysOssMapper.batchInsertSelective(list);
    }

    @Override
    public int updateByPrimaryKey(SysOss sysOss) {
        return sysOssMapper.updateByPrimaryKey(sysOss);
    }

    @Override
    public int updateSelectiveByPrimaryKey(SysOss sysOss) {
        return sysOssMapper.updateSelectiveByPrimaryKey(sysOss);
    }

    @Override
    public int batchUpdate(List<SysOss> list) {
        return sysOssMapper.batchUpdate(list);
    }

    @Override
    public int batchUpdateSelective(List<SysOss> list) {
        return sysOssMapper.batchUpdateSelective(list);
    }

    @Override
    public int upsert(SysOss sysOss) {
        return sysOssMapper.upsert(sysOss);
    }

    @Override
    public int upsertSelective(SysOss sysOss) {
        return sysOssMapper.upsertSelective(sysOss);
    }

    @Override
    public int batchUpsert(List<SysOss> list) {
        return sysOssMapper.batchUpsert(list);
    }

    @Override
    public int batchUpsertSelective(List<SysOss> list) {
        return sysOssMapper.batchUpsertSelective(list);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return sysOssMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int deleteBatchByPrimaryKeys(List<Long> list) {
        return sysOssMapper.deleteBatchByPrimaryKeys(list);
    }

    @Override
    public int delete(SysOss sysOss) {
        return sysOssMapper.delete(sysOss);
    }

    @Override
    public SysOss queryByPrimaryKey(Long id) {
        return sysOssMapper.queryByPrimaryKey(id);
    }

    @Override
    public List<SysOss> queryBatchPrimaryKeys(List<Long> list) {
        return sysOssMapper.queryBatchPrimaryKeys(list);
    }

    @Override
    public SysOss queryOne(SysOss sysOss) {
        return sysOssMapper.queryOne(sysOss);
    }

    @Override
    public List<SysOss> queryByCondition(SysOss sysOss) {
        return sysOssMapper.queryByCondition(sysOss);
    }

    @Override
    public List<SysOss> queryFuzzy(SysOss sysOss) {
        return sysOssMapper.queryFuzzy(sysOss);
    }

    @Override
    public List<SysOss> queryByLikeCondition(SysOss sysOss) {
        return sysOssMapper.queryByLikeCondition(sysOss);
    }

    @Override
    public int queryCount(SysOss sysOss) {
        return sysOssMapper.queryCount(sysOss);
    }

    @Override
    public List<Map<String, Object>> statisticsGroup(SysOss sysOss) {
        return sysOssMapper.statisticsGroup(sysOss);
    }

    @Override
    public List<Map<String, Object>> statisticsGroupByDay(SysOss sysOss) {
        return sysOssMapper.statisticsGroupByDay(sysOss);
    }

    @Override
    public List<Map<String, Object>> statisticsGroupByMonth(SysOss sysOss) {
        return sysOssMapper.statisticsGroupByMonth(sysOss);
    }

    @Override
    public List<Map<String, Object>> statisticsGroupByYear(SysOss sysOss) {
        return sysOssMapper.statisticsGroupByYear(sysOss);
    }
}