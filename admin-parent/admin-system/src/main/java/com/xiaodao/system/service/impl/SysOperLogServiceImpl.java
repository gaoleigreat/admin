package com.xiaodao.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import com.xiaodao.system.mapper.SysOperLogMapper;
import com.xiaodao.system.service.ISysOperLogService;
import com.xiaodao.system.entity.SysOperLog;

import java.util.List;


/**
 * @description ISysOperLog Service层
 * @author ¸ßÀÚ
 * @since jdk1.8
 */
@Service
public class SysOperLogServiceImpl implements ISysOperLogService{


     @Autowired
     private SysOperLogMapper sysOperLogMapper;

    /**
     * 创建SysOperLog
     *
     * @param sysOperLog
     * @return
     */
    @Override
    public Integer insert(SysOperLog sysOperLog){
        if(sysOperLog ==null){
            return 0;
        }
        return sysOperLogMapper.insert(sysOperLog);
    }


    /**
     * 根据主键删除
     *
     * @param operId
     * @return
     */
    @Override
    public Integer deleteByPrimaryKey(Long operId){
        if(operId ==null){
            return 0;
        }
        Integer result = sysOperLogMapper.deleteById(operId);
        return result;

    }

    /**
     * 修改SysOperLog
     *
     * @param sysOperLog
     * @return
    */
    @Override
    public Integer updateByPrimaryKey(SysOperLog sysOperLog){
        if(sysOperLog ==null){
            return 0;
        }
        return sysOperLogMapper.updateById(sysOperLog);
    }

    /**
    * 根据主键查询
    *
    * @param operId
    * @return
    */
    @Override
    public SysOperLog selectByPrimaryKey(Long operId){
        if(operId ==null){
            return null;
        }
        SysOperLog sysOperLog  = sysOperLogMapper.selectById(operId);
        if (sysOperLog == null){
            return null;
        }
        return sysOperLog;
    }

    /**
     * 分页查询
     * @param pageIndex
     * @param pageSize
     * @param sysOperLog SysOperLog
     * @return IPage<SysOperLog>
     */
    @Override
    public IPage<SysOperLog> queryPage(int pageIndex, int pageSize,SysOperLog sysOperLog){
        QueryWrapper<SysOperLog> queryWrapper = Wrappers.query();
        IPage<SysOperLog> ipage = sysOperLogMapper.selectPage(new Page(pageIndex, pageSize), queryWrapper);
        return ipage;
    }

    /**
    * 批量插入
    * @param list List<SysOperLog
    * @return Integer
    */
    @Override
    public Integer batchInsert(List<SysOperLog> list){
        if (CollectionUtils.isEmpty(list)){
            return 0;
        }
        else{
            return sysOperLogMapper.batchInsert(list);
        }
    }

    /**
     * 批量更新
     * @param list List<SysOperLog>
     * @return Integer
     */
    @Override
    public Integer batchUpdate(List<SysOperLog> list){
        if (CollectionUtils.isEmpty(list)){
            return 0;
        }
        else{
            return sysOperLogMapper.batchUpdate(list);
        }
    }

    /**
     * 批量删除
     * @param list List<Long >
     * @return Integer
    */
    public Integer deleteBatchIds(List<Long> list){
        if (CollectionUtils.isEmpty(list)){
            return 0;
        } else{
            return sysOperLogMapper.deleteBatchIds(list);
        }
    }
    /**
     * 存在即更新
     * @param sysOperLog SysOperLog
     * @return Integer
     */
    @Override
    public Integer upsert(SysOperLog sysOperLog){

        if (sysOperLog == null){
            return 0;
        }
        else{
            return sysOperLogMapper.upsert(sysOperLog);
        }

    }

    /**
     * 存在即更新，可选择具体属性
     * @param sysOperLog SysOperLog
     * @return Integer
     */
    @Override
    public Integer upsertSelective(SysOperLog sysOperLog){
        if (sysOperLog == null){
            return 0;
        }
        else{
            return sysOperLogMapper.upsert(sysOperLog);
        }
    }

    /**
     * 条件查询
     * @param sysOperLog SysOperLog
     * @return List<SysOperLog>
    */
    @Override
    public List<SysOperLog> query(SysOperLog sysOperLog){
        if (sysOperLog == null){
            return null;
        }
        else{
            return sysOperLogMapper.query(sysOperLog);
        }
    }

    /**
     * 查询总数
     * @return Integer
     */
    @Override
    public Long queryTotalCount(){
        return sysOperLogMapper.queryTotalCount();
    }
}