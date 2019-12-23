package com.xiaodao.system.service.impl;


import com.xiaodao.feign.system.entity.SysUser;
import com.xiaodao.system.mapper.SysUserMapper;
import com.xiaodao.system.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


/**
 * @author xiaodao
 * @description ISysUser Service层
 * @since jdk1.8
 */
@Service
public class SysUserServiceImpl implements ISysUserService {


    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public int insert(SysUser sysUser) {
        return sysUserMapper.insert(sysUser);
    }

    @Override
    public int insertSelective(SysUser sysUser) {
        return sysUserMapper.insertSelective(sysUser);
    }

    @Override
    public int batchInsert(List<SysUser> list) {
        return sysUserMapper.batchInsert(list);
    }

    @Override
    public int batchInsertSelective(List<SysUser> list) {
        return sysUserMapper.batchInsertSelective(list);
    }

    @Override
    public int updateByPrimaryKey(SysUser sysUser) {
        return sysUserMapper.updateByPrimaryKey(sysUser);
    }

    @Override
    public int updateSelectiveByPrimaryKey(SysUser sysUser) {
        return sysUserMapper.updateSelectiveByPrimaryKey(sysUser);
    }

    @Override
    public int batchUpdate(List<SysUser> list) {
        return sysUserMapper.batchUpdate(list);
    }

    @Override
    public int batchUpdateSelective(List<SysUser> list) {
        return sysUserMapper.batchUpdateSelective(list);
    }

    @Override
    public int upsert(SysUser sysUser) {
        return sysUserMapper.upsert(sysUser);
    }

    @Override
    public int upsertSelective(SysUser sysUser) {
        return sysUserMapper.upsertSelective(sysUser);
    }

    @Override
    public int batchUpsert(List<SysUser> list) {
        return sysUserMapper.batchUpsert(list);
    }

    @Override
    public int batchUpsertSelective(List<SysUser> list) {
        return sysUserMapper.batchUpsertSelective(list);
    }

    @Override
    public int deleteByPrimaryKey(Long userId) {
        return sysUserMapper.deleteByPrimaryKey(userId);
    }

    @Override
    public int deleteBatchByPrimaryKeys(List<Long> list) {
        return sysUserMapper.deleteBatchByPrimaryKeys(list);
    }

    @Override
    public int delete(SysUser sysUser) {
        return sysUserMapper.delete(sysUser);
    }

    @Override
    public SysUser queryByPrimaryKey(Long userId) {
        return sysUserMapper.queryByPrimaryKey(userId);
    }

    @Override
    public List<SysUser> queryBatchPrimaryKeys(List<Long> list) {
        return sysUserMapper.queryBatchPrimaryKeys(list);
    }

    @Override
    public SysUser queryOne(SysUser sysUser) {
        return sysUserMapper.queryOne(sysUser);
    }

    @Override
    public List<SysUser> queryByCondition(SysUser sysUser) {
        return sysUserMapper.queryByCondition(sysUser);
    }

    @Override
    public List<SysUser> queryFuzzy(SysUser sysUser) {
        return sysUserMapper.queryFuzzy(sysUser);
    }

    @Override
    public List<SysUser> queryByLikeCondition(SysUser sysUser) {
        return sysUserMapper.queryByLikeCondition(sysUser);
    }

    @Override
    public int queryCount(SysUser sysUser) {
        return sysUserMapper.queryCount(sysUser);
    }

    @Override
    public List<Map<String, Object>> statisticsGroup(SysUser sysUser) {
        return sysUserMapper.statisticsGroup(sysUser);
    }

    @Override
    public List<Map<String, Object>> statisticsGroupByDay(SysUser sysUser) {
        return sysUserMapper.statisticsGroupByDay(sysUser);
    }

    @Override
    public List<Map<String, Object>> statisticsGroupByMonth(SysUser sysUser) {
        return sysUserMapper.statisticsGroupByMonth(sysUser);
    }

    @Override
    public List<Map<String, Object>> statisticsGroupByYear(SysUser sysUser) {
        return sysUserMapper.statisticsGroupByYear(sysUser);
    }

    @Override
    public SysUser selectUserByLoginName(String userName) {
        return sysUserMapper.selectUserByLoginName(userName);
    }

    @Override
    public SysUser selectUserByPhoneNumber(String phoneNumber) {
        return sysUserMapper.selectUserByLoginName(phoneNumber);
    }

    @Override
    public SysUser selectUserByEmail(String email) {
        return sysUserMapper.selectUserByLoginName(email);
    }
}