package com.xiaodao.system.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import com.xiaodao.system.mapper.SysLogininforMapper;
import com.xiaodao.system.service.ISysLogininforService;
import com.xiaodao.feign.system.entity.SysLogininfor;

import java.util.List;
import java.util.Map;


/**
 * @description ISysLogininfor Service层
 * @author xiaodao
 * @since jdk1.8
 */
@Service
public class SysLogininforServiceImpl implements ISysLogininforService{


     @Autowired
     private SysLogininforMapper sysLogininforMapper;

    @Override
    public int insert(SysLogininfor sysLogininfor) {
        return sysLogininforMapper.insert(sysLogininfor);
    }

    @Override
    public int insertSelective(SysLogininfor sysLogininfor) {
        return sysLogininforMapper.insertSelective(sysLogininfor);
    }

    @Override
    public int batchInsert(List<SysLogininfor> list) {
        return sysLogininforMapper.batchInsert(list);
    }

    @Override
    public int batchInsertSelective(List<SysLogininfor> list) {
        return sysLogininforMapper.batchInsertSelective(list);
    }

    @Override
    public int updateByPrimaryKey(SysLogininfor sysLogininfor) {
        return sysLogininforMapper.updateByPrimaryKey(sysLogininfor);
    }

    @Override
    public int updateSelectiveByPrimaryKey(SysLogininfor sysLogininfor) {
        return sysLogininforMapper.updateSelectiveByPrimaryKey(sysLogininfor);
    }

    @Override
    public int batchUpdate(List<SysLogininfor> list) {
        return sysLogininforMapper.batchUpdate(list);
    }

    @Override
    public int batchUpdateSelective(List<SysLogininfor> list) {
        return sysLogininforMapper.batchUpdateSelective(list);
    }

    @Override
    public int upsert(SysLogininfor sysLogininfor) {
        return sysLogininforMapper.upsert(sysLogininfor);
    }

    @Override
    public int upsertSelective(SysLogininfor sysLogininfor) {
        return sysLogininforMapper.upsertSelective(sysLogininfor);
    }

    @Override
    public int batchUpsert(List<SysLogininfor> list) {
        return sysLogininforMapper.batchUpsert(list);
    }

    @Override
    public int batchUpsertSelective(List<SysLogininfor> list) {
        return sysLogininforMapper.batchUpsertSelective(list);
    }

    @Override
    public int deleteByPrimaryKey(Long infoId) {
        return sysLogininforMapper.deleteByPrimaryKey(infoId);
    }

    @Override
    public int deleteBatchByPrimaryKeys(List<Long> list) {
        return sysLogininforMapper.deleteBatchByPrimaryKeys(list);
    }

    @Override
    public int delete(SysLogininfor sysLogininfor) {
        return sysLogininforMapper.delete(sysLogininfor);
    }

    @Override
    public SysLogininfor queryByPrimaryKey(Long infoId) {
        return sysLogininforMapper.queryByPrimaryKey(infoId);
    }

    @Override
    public List<SysLogininfor> queryBatchPrimaryKeys(List<Long> list) {
        return sysLogininforMapper.queryBatchPrimaryKeys(list);
    }

    @Override
    public SysLogininfor queryOne(SysLogininfor sysLogininfor) {
        return sysLogininforMapper.queryOne(sysLogininfor);
    }

    @Override
    public List<SysLogininfor> queryByCondition(SysLogininfor sysLogininfor) {
        return sysLogininforMapper.queryByCondition(sysLogininfor);
    }

    @Override
    public List<SysLogininfor> queryFuzzy(SysLogininfor sysLogininfor) {
        return sysLogininforMapper.queryFuzzy(sysLogininfor);
    }

    @Override
    public List<SysLogininfor> queryByLikeCondition(SysLogininfor sysLogininfor) {
        return sysLogininforMapper.queryByLikeCondition(sysLogininfor);
    }

    @Override
    public int queryCount(SysLogininfor sysLogininfor) {
        return sysLogininforMapper.queryCount(sysLogininfor);
    }

    @Override
    public List<Map<String, Object>> statisticsGroup(SysLogininfor sysLogininfor) {
        return sysLogininforMapper.statisticsGroup(sysLogininfor);
    }

    @Override
    public List<Map<String, Object>> statisticsGroupByDay(SysLogininfor sysLogininfor) {
        return sysLogininforMapper.statisticsGroupByDay(sysLogininfor);
    }

    @Override
    public List<Map<String, Object>> statisticsGroupByMonth(SysLogininfor sysLogininfor) {
        return sysLogininforMapper.statisticsGroupByMonth(sysLogininfor);
    }

    @Override
    public List<Map<String, Object>> statisticsGroupByYear(SysLogininfor sysLogininfor) {
        return sysLogininforMapper.statisticsGroupByYear(sysLogininfor);
    }
}