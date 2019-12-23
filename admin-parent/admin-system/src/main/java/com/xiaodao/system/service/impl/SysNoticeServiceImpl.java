package com.xiaodao.system.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import com.xiaodao.system.mapper.SysNoticeMapper;
import com.xiaodao.system.service.ISysNoticeService;
import com.xiaodao.feign.system.entity.SysNotice;

import java.util.List;
import java.util.Map;


/**
 * @description ISysNotice Service层
 * @author xiaodao
 * @since jdk1.8
 */
@Service
public class SysNoticeServiceImpl implements ISysNoticeService{


     @Autowired
     private SysNoticeMapper sysNoticeMapper;

    @Override
    public int insert(SysNotice sysNotice) {
        return sysNoticeMapper.insert(sysNotice);
    }

    @Override
    public int insertSelective(SysNotice sysNotice) {
        return sysNoticeMapper.insertSelective(sysNotice);
    }

    @Override
    public int batchInsert(List<SysNotice> list) {
        return sysNoticeMapper.batchInsert(list);
    }

    @Override
    public int batchInsertSelective(List<SysNotice> list) {
        return sysNoticeMapper.batchInsertSelective(list);
    }

    @Override
    public int updateByPrimaryKey(SysNotice sysNotice) {
        return sysNoticeMapper.updateByPrimaryKey(sysNotice);
    }

    @Override
    public int updateSelectiveByPrimaryKey(SysNotice sysNotice) {
        return sysNoticeMapper.updateSelectiveByPrimaryKey(sysNotice);
    }

    @Override
    public int batchUpdate(List<SysNotice> list) {
        return sysNoticeMapper.batchUpdate(list);
    }

    @Override
    public int batchUpdateSelective(List<SysNotice> list) {
        return sysNoticeMapper.batchUpdateSelective(list);
    }

    @Override
    public int upsert(SysNotice sysNotice) {
        return sysNoticeMapper.upsert(sysNotice);
    }

    @Override
    public int upsertSelective(SysNotice sysNotice) {
        return sysNoticeMapper.upsertSelective(sysNotice);
    }

    @Override
    public int batchUpsert(List<SysNotice> list) {
        return sysNoticeMapper.batchUpsert(list);
    }

    @Override
    public int batchUpsertSelective(List<SysNotice> list) {
        return sysNoticeMapper.batchUpsertSelective(list);
    }

    @Override
    public int deleteByPrimaryKey(Integer noticeId) {
        return sysNoticeMapper.deleteByPrimaryKey(noticeId);
    }

    @Override
    public int deleteBatchByPrimaryKeys(List<Integer> list) {
        return sysNoticeMapper.deleteBatchByPrimaryKeys(list);
    }

    @Override
    public int delete(SysNotice sysNotice) {
        return sysNoticeMapper.delete(sysNotice);
    }

    @Override
    public SysNotice queryByPrimaryKey(Integer noticeId) {
        return sysNoticeMapper.queryByPrimaryKey(noticeId);
    }

    @Override
    public List<SysNotice> queryBatchPrimaryKeys(List<Integer> list) {
        return sysNoticeMapper.queryBatchPrimaryKeys(list);
    }

    @Override
    public SysNotice queryOne(SysNotice sysNotice) {
        return sysNoticeMapper.queryOne(sysNotice);
    }

    @Override
    public List<SysNotice> queryByCondition(SysNotice sysNotice) {
        return sysNoticeMapper.queryByCondition(sysNotice);
    }

    @Override
    public List<SysNotice> queryFuzzy(SysNotice sysNotice) {
        return sysNoticeMapper.queryFuzzy(sysNotice);
    }

    @Override
    public List<SysNotice> queryByLikeCondition(SysNotice sysNotice) {
        return sysNoticeMapper.queryByLikeCondition(sysNotice);
    }

    @Override
    public int queryCount(SysNotice sysNotice) {
        return sysNoticeMapper.queryCount(sysNotice);
    }

    @Override
    public List<Map<String, Object>> statisticsGroup(SysNotice sysNotice) {
        return sysNoticeMapper.statisticsGroup(sysNotice);
    }

    @Override
    public List<Map<String, Object>> statisticsGroupByDay(SysNotice sysNotice) {
        return sysNoticeMapper.statisticsGroupByDay(sysNotice);
    }

    @Override
    public List<Map<String, Object>> statisticsGroupByMonth(SysNotice sysNotice) {
        return sysNoticeMapper.statisticsGroupByMonth(sysNotice);
    }

    @Override
    public List<Map<String, Object>> statisticsGroupByYear(SysNotice sysNotice) {
        return sysNoticeMapper.statisticsGroupByYear(sysNotice);
    }
}