package com.xiaodao.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import com.xiaodao.system.mapper.SysPostMapper;
import com.xiaodao.system.service.ISysPostService;
import com.xiaodao.system.entity.SysPost;

import java.util.List;


/**
 * @description ISysPost Service层
 * @author 高磊
 * @since jdk1.8
 */
@Service
public class SysPostServiceImpl implements ISysPostService{


     @Autowired
     private SysPostMapper sysPostMapper;

    /**
     * 创建SysPost
     *
     * @param sysPost
     * @return
     */
    @Override
    public Integer insert(SysPost sysPost){
        if(sysPost ==null){
            return 0;
        }
        return sysPostMapper.insert(sysPost);
    }


    /**
     * 根据主键删除
     *
     * @param postId
     * @return
     */
    @Override
    public Integer deleteByPrimaryKey(Long postId){
        if(postId ==null){
            return 0;
        }
        Integer result = sysPostMapper.deleteById(postId);
        return result;

    }

    /**
     * 修改SysPost
     *
     * @param sysPost
     * @return
    */
    @Override
    public Integer updateByPrimaryKey(SysPost sysPost){
        if(sysPost ==null){
            return 0;
        }
        return sysPostMapper.updateById(sysPost);
    }

    /**
    * 根据主键查询
    *
    * @param postId
    * @return
    */
    @Override
    public SysPost selectByPrimaryKey(Long postId){
        if(postId ==null){
            return null;
        }
        SysPost sysPost  = sysPostMapper.selectById(postId);
        if (sysPost == null){
            return null;
        }
        return sysPost;
    }

    /**
     * 分页查询
     * @param pageIndex
     * @param pageSize
     * @param sysPost SysPost
     * @return IPage<SysPost>
     */
    @Override
    public IPage<SysPost> queryPage(int pageIndex, int pageSize,SysPost sysPost){
        QueryWrapper<SysPost> queryWrapper = Wrappers.query();
        IPage<SysPost> ipage = sysPostMapper.selectPage(new Page(pageIndex, pageSize), queryWrapper);
        return ipage;
    };

    /**
    * 批量插入
    * @param list List<SysPost
    * @return Integer
    */
    @Override
    public Integer batchInsert(List<SysPost> list){
        if (CollectionUtils.isEmpty(list)){
            return 0;
        }
        else{
            return sysPostMapper.batchInsert(list);
        }
    }

    /**
     * 批量更新
     * @param list List<SysPost>
     * @return Integer
     */
    @Override
    public Integer batchUpdate(List<SysPost> list){
        if (CollectionUtils.isEmpty(list)){
            return 0;
        }
        else{
            return sysPostMapper.batchInsert(list);
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
            return sysPostMapper.deleteBatchIds(list);
        }
    }
    /**
     * 存在即更新
     * @param sysPost SysPost
     * @return Integer
     */
    @Override
    public Integer upsert(SysPost sysPost){

        if (sysPost == null){
            return 0;
        }
        else{
            return sysPostMapper.upsert(sysPost);
        }

    }

    /**
     * 存在即更新，可选择具体属性
     * @param sysPost SysPost
     * @return Integer
     */
    @Override
    public Integer upsertSelective(SysPost sysPost){
        if (sysPost == null){
            return 0;
        }
        else{
            return sysPostMapper.upsert(sysPost);
        }
    }

    /**
     * 条件查询
     * @param sysPost SysPost
     * @return List<SysPost>
    */
    @Override
    public List<SysPost> query(SysPost sysPost){
        if (sysPost == null){
            return null;
        }
        else{
            return sysPostMapper.query(sysPost);
        }
    }

    /**
     * 查询总数
     * @return Integer
     */
    @Override
    public Long queryTotalCount(){
        return sysPostMapper.queryTotalCount();
    }
}