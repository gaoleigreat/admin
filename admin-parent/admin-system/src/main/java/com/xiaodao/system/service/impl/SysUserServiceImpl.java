package com.xiaodao.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import com.xiaodao.system.mapper.SysUserMapper;
import com.xiaodao.system.service.ISysUserService;
import com.xiaodao.system.entity.SysUser;

import java.util.List;


/**
 * @description ISysUser Service层
 * @author ¸ßÀÚ
 * @since jdk1.8
 */
@Service
public class SysUserServiceImpl implements ISysUserService{


     @Autowired
     private SysUserMapper sysUserMapper;

    /**
     * 创建SysUser
     *
     * @param sysUser
     * @return
     */
    @Override
    public Integer insert(SysUser sysUser){
        if(sysUser ==null){
            return 0;
        }
        return sysUserMapper.insert(sysUser);
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
        Integer result = sysUserMapper.deleteById(userId);
        return result;

    }

    /**
     * 修改SysUser
     *
     * @param sysUser
     * @return
    */
    @Override
    public Integer updateByPrimaryKey(SysUser sysUser){
        if(sysUser ==null){
            return 0;
        }
        return sysUserMapper.updateById(sysUser);
    }

    /**
    * 根据主键查询
    *
    * @param userId
    * @return
    */
    @Override
    public SysUser selectByPrimaryKey(Long userId){
        if(userId ==null){
            return null;
        }
        SysUser sysUser  = sysUserMapper.selectById(userId);
        if (sysUser == null){
            return null;
        }
        return sysUser;
    }

    /**
     * 分页查询
     * @param pageIndex
     * @param pageSize
     * @param sysUser SysUser
     * @return IPage<SysUser>
     */
    @Override
    public IPage<SysUser> queryPage(int pageIndex, int pageSize,SysUser sysUser){
        QueryWrapper<SysUser> queryWrapper = Wrappers.query();
        IPage<SysUser> ipage = sysUserMapper.selectPage(new Page(pageIndex, pageSize), queryWrapper);
        return ipage;
    }

    /**
    * 批量插入
    * @param list List<SysUser
    * @return Integer
    */
    @Override
    public Integer batchInsert(List<SysUser> list){
        if (CollectionUtils.isEmpty(list)){
            return 0;
        }
        else{
            return sysUserMapper.batchInsert(list);
        }
    }

    /**
     * 批量更新
     * @param list List<SysUser>
     * @return Integer
     */
    @Override
    public Integer batchUpdate(List<SysUser> list){
        if (CollectionUtils.isEmpty(list)){
            return 0;
        }
        else{
            return sysUserMapper.batchUpdate(list);
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
            return sysUserMapper.deleteBatchIds(list);
        }
    }
    /**
     * 存在即更新
     * @param sysUser SysUser
     * @return Integer
     */
    @Override
    public Integer upsert(SysUser sysUser){

        if (sysUser == null){
            return 0;
        }
        else{
            return sysUserMapper.upsert(sysUser);
        }

    }

    /**
     * 存在即更新，可选择具体属性
     * @param sysUser SysUser
     * @return Integer
     */
    @Override
    public Integer upsertSelective(SysUser sysUser){
        if (sysUser == null){
            return 0;
        }
        else{
            return sysUserMapper.upsert(sysUser);
        }
    }

    /**
     * 条件查询
     * @param sysUser SysUser
     * @return List<SysUser>
    */
    @Override
    public List<SysUser> query(SysUser sysUser){
        if (sysUser == null){
            return null;
        }
        else{
            return sysUserMapper.query(sysUser);
        }
    }

    /**
     * 查询总数
     * @return Integer
     */
    @Override
    public Long queryTotalCount(){
        return sysUserMapper.queryTotalCount();
    }
}