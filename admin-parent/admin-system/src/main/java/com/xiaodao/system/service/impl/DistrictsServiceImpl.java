package com.xiaodao.system.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import com.xiaodao.system.mapper.DistrictsMapper;
import com.xiaodao.system.service.IDistrictsService;
import com.xiaodao.admin.entity.Districts;

import java.util.List;
import java.util.Map;


/**
 * @description IDistricts Service层
 * @author xiaodao
 * @since jdk1.8
 */
@Service
public class DistrictsServiceImpl implements IDistrictsService{


     @Autowired
     private DistrictsMapper districtsMapper;

    @Override
    public int insert(Districts districts) {
        return districtsMapper.insert(districts);
    }

    @Override
    public int insertSelective(Districts districts) {
        return districtsMapper.insertSelective(districts);
    }

    @Override
    public int batchInsert(List<Districts> list) {
        return districtsMapper.batchInsert(list);
    }

    @Override
    public int batchInsertSelective(List<Districts> list) {
        return districtsMapper.batchInsertSelective(list);
    }

    @Override
    public int updateByPrimaryKey(Districts districts) {
        return districtsMapper.updateByPrimaryKey(districts);
    }

    @Override
    public int updateSelectiveByPrimaryKey(Districts districts) {
        return districtsMapper.updateSelectiveByPrimaryKey(districts);
    }

    @Override
    public int batchUpdate(List<Districts> list) {
        return districtsMapper.batchUpdate(list);
    }

    @Override
    public int batchUpdateSelective(List<Districts> list) {
        return districtsMapper.batchUpdateSelective(list);
    }

    @Override
    public int upsert(Districts districts) {
        return districtsMapper.upsert(districts);
    }

    @Override
    public int upsertSelective(Districts districts) {
        return districtsMapper.upsertSelective(districts);
    }

    @Override
    public int batchUpsert(List<Districts> list) {
        return districtsMapper.batchUpsert(list);
    }

    @Override
    public int batchUpsertSelective(List<Districts> list) {
        return districtsMapper.batchUpsertSelective(list);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return districtsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int deleteBatchByPrimaryKeys(List<Integer> list) {
        return districtsMapper.deleteBatchByPrimaryKeys(list);
    }

    @Override
    public int delete(Districts districts) {
        return districtsMapper.delete(districts);
    }

    @Override
    public Districts queryByPrimaryKey(Integer id) {
        return districtsMapper.queryByPrimaryKey(id);
    }

    @Override
    public List<Districts> queryBatchPrimaryKeys(List<Integer> list) {
        return districtsMapper.queryBatchPrimaryKeys(list);
    }

    @Override
    public Districts queryOne(Districts districts) {
        return districtsMapper.queryOne(districts);
    }

    @Override
    public List<Districts> queryByCondition(Districts districts) {
        return districtsMapper.queryByCondition(districts);
    }

    @Override
    public List<Districts> queryFuzzy(Districts districts) {
        return districtsMapper.queryFuzzy(districts);
    }

    @Override
    public List<Districts> queryByLikeCondition(Districts districts) {
        return districtsMapper.queryByLikeCondition(districts);
    }

    @Override
    public int queryCount(Districts districts) {
        return districtsMapper.queryCount(districts);
    }

    @Override
    public List<Map<String, Object>> statisticsGroup(Districts districts) {
        return districtsMapper.statisticsGroup(districts);
    }

    @Override
    public List<Map<String, Object>> statisticsGroupByDay(Districts districts) {
        return districtsMapper.statisticsGroupByDay(districts);
    }

    @Override
    public List<Map<String, Object>> statisticsGroupByMonth(Districts districts) {
        return districtsMapper.statisticsGroupByMonth(districts);
    }

    @Override
    public List<Map<String, Object>> statisticsGroupByYear(Districts districts) {
        return districtsMapper.statisticsGroupByYear(districts);
    }
}