package com.xiaodao.system.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import com.xiaodao.system.mapper.SysUserPostMapper;
import com.xiaodao.system.service.ISysUserPostService;
import com.xiaodao.admin.entity.SysUserPost;

import java.util.List;
import java.util.Map;


/**
 * @description ISysUserPost Service层
 * @author xiaodao
 * @since jdk1.8
 */
@Service
public class SysUserPostServiceImpl implements ISysUserPostService{


     @Autowired
     private SysUserPostMapper sysUserPostMapper;

    @Override
    public int insert(SysUserPost sysUserPost) {
        return sysUserPostMapper.insert(sysUserPost);
    }

    @Override
    public int insertSelective(SysUserPost sysUserPost) {
        return sysUserPostMapper.insertSelective(sysUserPost);
    }

    @Override
    public int batchInsert(List<SysUserPost> list) {
        return sysUserPostMapper.batchInsert(list);
    }

    @Override
    public int batchInsertSelective(List<SysUserPost> list) {
        return sysUserPostMapper.batchInsertSelective(list);
    }

    @Override
    public int updateByPrimaryKey(SysUserPost sysUserPost) {
        return sysUserPostMapper.updateByPrimaryKey(sysUserPost);
    }

    @Override
    public int updateSelectiveByPrimaryKey(SysUserPost sysUserPost) {
        return sysUserPostMapper.updateSelectiveByPrimaryKey(sysUserPost);
    }

    @Override
    public int batchUpdate(List<SysUserPost> list) {
        return sysUserPostMapper.batchUpdate(list);
    }

    @Override
    public int batchUpdateSelective(List<SysUserPost> list) {
        return sysUserPostMapper.batchUpdateSelective(list);
    }

    @Override
    public int upsert(SysUserPost sysUserPost) {
        return sysUserPostMapper.upsert(sysUserPost);
    }

    @Override
    public int upsertSelective(SysUserPost sysUserPost) {
        return sysUserPostMapper.upsertSelective(sysUserPost);
    }

    @Override
    public int batchUpsert(List<SysUserPost> list) {
        return sysUserPostMapper.batchUpsert(list);
    }

    @Override
    public int batchUpsertSelective(List<SysUserPost> list) {
        return sysUserPostMapper.batchUpsertSelective(list);
    }

    @Override
    public int deleteByPrimaryKey(Integer userId) {
        return sysUserPostMapper.deleteByPrimaryKey(userId);
    }

    @Override
    public int deleteBatchByPrimaryKeys(List<Integer> list) {
        return sysUserPostMapper.deleteBatchByPrimaryKeys(list);
    }

    @Override
    public int delete(SysUserPost sysUserPost) {
        return sysUserPostMapper.delete(sysUserPost);
    }

    @Override
    public SysUserPost queryByPrimaryKey(Integer userId) {
        return sysUserPostMapper.queryByPrimaryKey(userId);
    }

    @Override
    public List<SysUserPost> queryBatchPrimaryKeys(List<Integer> list) {
        return sysUserPostMapper.queryBatchPrimaryKeys(list);
    }

    @Override
    public SysUserPost queryOne(SysUserPost sysUserPost) {
        return sysUserPostMapper.queryOne(sysUserPost);
    }

    @Override
    public List<SysUserPost> queryByCondition(SysUserPost sysUserPost) {
        return sysUserPostMapper.queryByCondition(sysUserPost);
    }

    @Override
    public List<SysUserPost> queryFuzzy(SysUserPost sysUserPost) {
        return sysUserPostMapper.queryFuzzy(sysUserPost);
    }

    @Override
    public List<SysUserPost> queryByLikeCondition(SysUserPost sysUserPost) {
        return sysUserPostMapper.queryByLikeCondition(sysUserPost);
    }

    @Override
    public int queryCount(SysUserPost sysUserPost) {
        return sysUserPostMapper.queryCount(sysUserPost);
    }

    @Override
    public List<Map<String, Object>> statisticsGroup(SysUserPost sysUserPost) {
        return sysUserPostMapper.statisticsGroup(sysUserPost);
    }

    @Override
    public List<Map<String, Object>> statisticsGroupByDay(SysUserPost sysUserPost) {
        return sysUserPostMapper.statisticsGroupByDay(sysUserPost);
    }

    @Override
    public List<Map<String, Object>> statisticsGroupByMonth(SysUserPost sysUserPost) {
        return sysUserPostMapper.statisticsGroupByMonth(sysUserPost);
    }

    @Override
    public List<Map<String, Object>> statisticsGroupByYear(SysUserPost sysUserPost) {
        return sysUserPostMapper.statisticsGroupByYear(sysUserPost);
    }
}