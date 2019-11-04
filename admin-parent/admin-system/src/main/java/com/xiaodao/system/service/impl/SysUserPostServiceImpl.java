package com.xiaodao.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import com.xiaodao.system.mapper.SysUserPostMapper;
import com.xiaodao.system.service.ISysUserPostService;
import com.xiaodao.system.entity.SysUserPost;

import java.util.List;


/**
 * @description ISysUserPost Service层
 * @author ¸ßÀÚ
 * @since jdk1.8
 */
@Service
public class SysUserPostServiceImpl implements ISysUserPostService{


     @Autowired
     private SysUserPostMapper sysUserPostMapper;

    /**
     * 创建SysUserPost
     *
     * @param sysUserPost
     * @return
     */
    @Override
    public Integer insert(SysUserPost sysUserPost){
        if(sysUserPost ==null){
            return 0;
        }
        return sysUserPostMapper.insert(sysUserPost);
    }


    /**
     * 根据主键删除
     *
     * @param userId
     * @return
     */
    @Override
    public Integer deleteByPrimaryKey(Long userId){
        if(userId ==null){
            return 0;
        }
        Integer result = sysUserPostMapper.deleteById(userId);
        return result;

    }

    /**
     * 修改SysUserPost
     *
     * @param sysUserPost
     * @return
    */
    @Override
    public Integer updateByPrimaryKey(SysUserPost sysUserPost){
        if(sysUserPost ==null){
            return 0;
        }
        return sysUserPostMapper.updateById(sysUserPost);
    }

    /**
    * 根据主键查询
    *
    * @param userId
    * @return
    */
    @Override
    public SysUserPost selectByPrimaryKey(Long userId){
        if(userId ==null){
            return null;
        }
        SysUserPost sysUserPost  = sysUserPostMapper.selectById(userId);
        if (sysUserPost == null){
            return null;
        }
        return sysUserPost;
    }

    /**
     * 分页查询
     * @param pageIndex
     * @param pageSize
     * @param sysUserPost SysUserPost
     * @return IPage<SysUserPost>
     */
    @Override
    public IPage<SysUserPost> queryPage(int pageIndex, int pageSize,SysUserPost sysUserPost){
        QueryWrapper<SysUserPost> queryWrapper = Wrappers.query();
        IPage<SysUserPost> ipage = sysUserPostMapper.selectPage(new Page(pageIndex, pageSize), queryWrapper);
        return ipage;
    }

    /**
    * 批量插入
    * @param list List<SysUserPost
    * @return Integer
    */
    @Override
    public Integer batchInsert(List<SysUserPost> list){
        if (CollectionUtils.isEmpty(list)){
            return 0;
        }
        else{
            return sysUserPostMapper.batchInsert(list);
        }
    }

    /**
     * 批量更新
     * @param list List<SysUserPost>
     * @return Integer
     */
    @Override
    public Integer batchUpdate(List<SysUserPost> list){
        if (CollectionUtils.isEmpty(list)){
            return 0;
        }
        else{
            return sysUserPostMapper.batchUpdate(list);
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
            return sysUserPostMapper.deleteBatchIds(list);
        }
    }
    /**
     * 存在即更新
     * @param sysUserPost SysUserPost
     * @return Integer
     */
    @Override
    public Integer upsert(SysUserPost sysUserPost){

        if (sysUserPost == null){
            return 0;
        }
        else{
            return sysUserPostMapper.upsert(sysUserPost);
        }

    }

    /**
     * 存在即更新，可选择具体属性
     * @param sysUserPost SysUserPost
     * @return Integer
     */
    @Override
    public Integer upsertSelective(SysUserPost sysUserPost){
        if (sysUserPost == null){
            return 0;
        }
        else{
            return sysUserPostMapper.upsert(sysUserPost);
        }
    }

    /**
     * 条件查询
     * @param sysUserPost SysUserPost
     * @return List<SysUserPost>
    */
    @Override
    public List<SysUserPost> query(SysUserPost sysUserPost){
        if (sysUserPost == null){
            return null;
        }
        else{
            return sysUserPostMapper.query(sysUserPost);
        }
    }

    /**
     * 查询总数
     * @return Integer
     */
    @Override
    public Long queryTotalCount(){
        return sysUserPostMapper.queryTotalCount();
    }
}