package com.xiaodao.system.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import com.xiaodao.system.mapper.SysPostMapper;
import com.xiaodao.system.service.ISysPostService;
import com.xiaodao.feign.system.entity.SysPost;

import java.util.List;
import java.util.Map;


/**
 * @description ISysPost Service层
 * @author xiaodao
 * @since jdk1.8
 */
@Service
public class SysPostServiceImpl implements ISysPostService{


     @Autowired
     private SysPostMapper sysPostMapper;

    @Override
    public int insert(SysPost sysPost) {
        return sysPostMapper.insert(sysPost);
    }

    @Override
    public int insertSelective(SysPost sysPost) {
        return sysPostMapper.insertSelective(sysPost);
    }

    @Override
    public int batchInsert(List<SysPost> list) {
        return sysPostMapper.batchInsert(list);
    }

    @Override
    public int batchInsertSelective(List<SysPost> list) {
        return sysPostMapper.batchInsertSelective(list);
    }

    @Override
    public int updateByPrimaryKey(SysPost sysPost) {
        return sysPostMapper.updateByPrimaryKey(sysPost);
    }

    @Override
    public int updateSelectiveByPrimaryKey(SysPost sysPost) {
        return sysPostMapper.updateSelectiveByPrimaryKey(sysPost);
    }

    @Override
    public int batchUpdate(List<SysPost> list) {
        return sysPostMapper.batchUpdate(list);
    }

    @Override
    public int batchUpdateSelective(List<SysPost> list) {
        return sysPostMapper.batchUpdateSelective(list);
    }

    @Override
    public int upsert(SysPost sysPost) {
        return sysPostMapper.upsert(sysPost);
    }

    @Override
    public int upsertSelective(SysPost sysPost) {
        return sysPostMapper.upsertSelective(sysPost);
    }

    @Override
    public int batchUpsert(List<SysPost> list) {
        return sysPostMapper.batchUpsert(list);
    }

    @Override
    public int batchUpsertSelective(List<SysPost> list) {
        return sysPostMapper.batchUpsertSelective(list);
    }

    @Override
    public int deleteByPrimaryKey(Long postId) {
        return sysPostMapper.deleteByPrimaryKey(postId);
    }

    @Override
    public int deleteBatchByPrimaryKeys(List<Long> list) {
        return sysPostMapper.deleteBatchByPrimaryKeys(list);
    }

    @Override
    public int delete(SysPost sysPost) {
        return sysPostMapper.delete(sysPost);
    }

    @Override
    public SysPost queryByPrimaryKey(Long postId) {
        return sysPostMapper.queryByPrimaryKey(postId);
    }

    @Override
    public List<SysPost> queryBatchPrimaryKeys(List<Long> list) {
        return sysPostMapper.queryBatchPrimaryKeys(list);
    }

    @Override
    public SysPost queryOne(SysPost sysPost) {
        return sysPostMapper.queryOne(sysPost);
    }

    @Override
    public List<SysPost> queryByCondition(SysPost sysPost) {
        return sysPostMapper.queryByCondition(sysPost);
    }

    @Override
    public List<SysPost> queryFuzzy(SysPost sysPost) {
        return sysPostMapper.queryFuzzy(sysPost);
    }

    @Override
    public List<SysPost> queryByLikeCondition(SysPost sysPost) {
        return sysPostMapper.queryByLikeCondition(sysPost);
    }

    @Override
    public int queryCount(SysPost sysPost) {
        return sysPostMapper.queryCount(sysPost);
    }

    @Override
    public List<Map<String, Object>> statisticsGroup(SysPost sysPost) {
        return sysPostMapper.statisticsGroup(sysPost);
    }

    @Override
    public List<Map<String, Object>> statisticsGroupByDay(SysPost sysPost) {
        return sysPostMapper.statisticsGroupByDay(sysPost);
    }

    @Override
    public List<Map<String, Object>> statisticsGroupByMonth(SysPost sysPost) {
        return sysPostMapper.statisticsGroupByMonth(sysPost);
    }

    @Override
    public List<Map<String, Object>> statisticsGroupByYear(SysPost sysPost) {
        return sysPostMapper.statisticsGroupByYear(sysPost);
    }
}