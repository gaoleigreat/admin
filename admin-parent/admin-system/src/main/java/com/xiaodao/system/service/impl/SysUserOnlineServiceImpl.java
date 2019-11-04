package com.xiaodao.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import com.xiaodao.system.mapper.SysUserOnlineMapper;
import com.xiaodao.system.service.ISysUserOnlineService;
import com.xiaodao.system.entity.SysUserOnline;

import java.util.List;


/**
 * @description ISysUserOnline Service层
 * @author ¸ßÀÚ
 * @since jdk1.8
 */
@Service
public class SysUserOnlineServiceImpl implements ISysUserOnlineService{


     @Autowired
     private SysUserOnlineMapper sysUserOnlineMapper;

    /**
     * 创建SysUserOnline
     *
     * @param sysUserOnline
     * @return
     */
    @Override
    public Integer insert(SysUserOnline sysUserOnline){
        if(sysUserOnline ==null){
            return 0;
        }
        return sysUserOnlineMapper.insert(sysUserOnline);
    }


    /**
     * 根据主键删除
     *
     * @param sessionid
     * @return
     */
    @Override
    public Integer deleteByPrimaryKey(String sessionid){
        if(sessionid ==null){
            return 0;
        }
        Integer result = sysUserOnlineMapper.deleteById(sessionid);
        return result;

    }

    /**
     * 修改SysUserOnline
     *
     * @param sysUserOnline
     * @return
    */
    @Override
    public Integer updateByPrimaryKey(SysUserOnline sysUserOnline){
        if(sysUserOnline ==null){
            return 0;
        }
        return sysUserOnlineMapper.updateById(sysUserOnline);
    }

    /**
    * 根据主键查询
    *
    * @param sessionid
    * @return
    */
    @Override
    public SysUserOnline selectByPrimaryKey(String sessionid){
        if(sessionid ==null){
            return null;
        }
        SysUserOnline sysUserOnline  = sysUserOnlineMapper.selectById(sessionid);
        if (sysUserOnline == null){
            return null;
        }
        return sysUserOnline;
    }

    /**
     * 分页查询
     * @param pageIndex
     * @param pageSize
     * @param sysUserOnline SysUserOnline
     * @return IPage<SysUserOnline>
     */
    @Override
    public IPage<SysUserOnline> queryPage(int pageIndex, int pageSize,SysUserOnline sysUserOnline){
        QueryWrapper<SysUserOnline> queryWrapper = Wrappers.query();
        IPage<SysUserOnline> ipage = sysUserOnlineMapper.selectPage(new Page(pageIndex, pageSize), queryWrapper);
        return ipage;
    }

    /**
    * 批量插入
    * @param list List<SysUserOnline
    * @return Integer
    */
    @Override
    public Integer batchInsert(List<SysUserOnline> list){
        if (CollectionUtils.isEmpty(list)){
            return 0;
        }
        else{
            return sysUserOnlineMapper.batchInsert(list);
        }
    }

    /**
     * 批量更新
     * @param list List<SysUserOnline>
     * @return Integer
     */
    @Override
    public Integer batchUpdate(List<SysUserOnline> list){
        if (CollectionUtils.isEmpty(list)){
            return 0;
        }
        else{
            return sysUserOnlineMapper.batchUpdate(list);
        }
    }

    /**
     * 批量删除
     * @param list List<String >
     * @return Integer
    */
    public Integer deleteBatchIds(List<String> list){
        if (CollectionUtils.isEmpty(list)){
            return 0;
        } else{
            return sysUserOnlineMapper.deleteBatchIds(list);
        }
    }
    /**
     * 存在即更新
     * @param sysUserOnline SysUserOnline
     * @return Integer
     */
    @Override
    public Integer upsert(SysUserOnline sysUserOnline){

        if (sysUserOnline == null){
            return 0;
        }
        else{
            return sysUserOnlineMapper.upsert(sysUserOnline);
        }

    }

    /**
     * 存在即更新，可选择具体属性
     * @param sysUserOnline SysUserOnline
     * @return Integer
     */
    @Override
    public Integer upsertSelective(SysUserOnline sysUserOnline){
        if (sysUserOnline == null){
            return 0;
        }
        else{
            return sysUserOnlineMapper.upsert(sysUserOnline);
        }
    }

    /**
     * 条件查询
     * @param sysUserOnline SysUserOnline
     * @return List<SysUserOnline>
    */
    @Override
    public List<SysUserOnline> query(SysUserOnline sysUserOnline){
        if (sysUserOnline == null){
            return null;
        }
        else{
            return sysUserOnlineMapper.query(sysUserOnline);
        }
    }

    /**
     * 查询总数
     * @return Integer
     */
    @Override
    public Long queryTotalCount(){
        return sysUserOnlineMapper.queryTotalCount();
    }
}