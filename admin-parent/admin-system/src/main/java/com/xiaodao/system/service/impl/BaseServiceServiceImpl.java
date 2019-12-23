package com.xiaodao.system.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import com.xiaodao.system.mapper.BaseServiceMapper;
import com.xiaodao.system.service.IBaseServiceService;
import com.xiaodao.feign.system.entity.BaseService;

import java.util.List;
import java.util.Map;


/**
 * @description IBaseService Service层
 * @author xiaodao
 * @since jdk1.8
 */
@Service
public class BaseServiceServiceImpl implements IBaseServiceService{


     @Autowired
     private BaseServiceMapper baseServiceMapper;

    @Override
    public int insert(BaseService baseService) {
        return baseServiceMapper.insert(baseService);
    }

    @Override
    public int insertSelective(BaseService baseService) {
        return baseServiceMapper.insertSelective(baseService);
    }

    @Override
    public int batchInsert(List<BaseService> list) {
        return baseServiceMapper.batchInsert(list);
    }

    @Override
    public int batchInsertSelective(List<BaseService> list) {
        return baseServiceMapper.batchInsertSelective(list);
    }

    @Override
    public int updateByPrimaryKey(BaseService baseService) {
        return baseServiceMapper.updateByPrimaryKey(baseService);
    }

    @Override
    public int updateSelectiveByPrimaryKey(BaseService baseService) {
        return baseServiceMapper.updateSelectiveByPrimaryKey(baseService);
    }

    @Override
    public int batchUpdate(List<BaseService> list) {
        return baseServiceMapper.batchUpdate(list);
    }

    @Override
    public int batchUpdateSelective(List<BaseService> list) {
        return baseServiceMapper.batchUpdateSelective(list);
    }

    @Override
    public int upsert(BaseService baseService) {
        return baseServiceMapper.upsert(baseService);
    }

    @Override
    public int upsertSelective(BaseService baseService) {
        return baseServiceMapper.upsertSelective(baseService);
    }

    @Override
    public int batchUpsert(List<BaseService> list) {
        return baseServiceMapper.batchUpsert(list);
    }

    @Override
    public int batchUpsertSelective(List<BaseService> list) {
        return baseServiceMapper.batchUpsertSelective(list);
    }

    @Override
    public int deleteByPrimaryKey(Long serviceId) {
        return baseServiceMapper.deleteByPrimaryKey(serviceId);
    }

    @Override
    public int deleteBatchByPrimaryKeys(List<Long> list) {
        return baseServiceMapper.deleteBatchByPrimaryKeys(list);
    }

    @Override
    public int delete(BaseService baseService) {
        return baseServiceMapper.delete(baseService);
    }

    @Override
    public BaseService queryByPrimaryKey(Long serviceId) {
        return baseServiceMapper.queryByPrimaryKey(serviceId);
    }

    @Override
    public List<BaseService> queryBatchPrimaryKeys(List<Long> list) {
        return baseServiceMapper.queryBatchPrimaryKeys(list);
    }

    @Override
    public BaseService queryOne(BaseService baseService) {
        return baseServiceMapper.queryOne(baseService);
    }

    @Override
    public List<BaseService> queryByCondition(BaseService baseService) {
        return baseServiceMapper.queryByCondition(baseService);
    }

    @Override
    public List<BaseService> queryFuzzy(BaseService baseService) {
        return baseServiceMapper.queryFuzzy(baseService);
    }

    @Override
    public List<BaseService> queryByLikeCondition(BaseService baseService) {
        return baseServiceMapper.queryByLikeCondition(baseService);
    }

    @Override
    public int queryCount(BaseService baseService) {
        return baseServiceMapper.queryCount(baseService);
    }

    @Override
    public List<Map<String, Object>> statisticsGroup(BaseService baseService) {
        return baseServiceMapper.statisticsGroup(baseService);
    }

    @Override
    public List<Map<String, Object>> statisticsGroupByDay(BaseService baseService) {
        return baseServiceMapper.statisticsGroupByDay(baseService);
    }

    @Override
    public List<Map<String, Object>> statisticsGroupByMonth(BaseService baseService) {
        return baseServiceMapper.statisticsGroupByMonth(baseService);
    }

    @Override
    public List<Map<String, Object>> statisticsGroupByYear(BaseService baseService) {
        return baseServiceMapper.statisticsGroupByYear(baseService);
    }
}