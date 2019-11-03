package com.xiaodao.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import com.xiaodao.system.mapper.SysUserRoleMapper;
import com.xiaodao.system.service.ISysUserRoleService;
import com.xiaodao.system.entity.SysUserRole;

import java.util.List;


/**
 * @description ISysUserRole Service层
 * @author xiaodao
 * @since jdk1.8
 */
@Service
public class SysUserRoleServiceImpl implements ISysUserRoleService{


     @Autowired
     private SysUserRoleMapper sysUserRoleMapper;

    /**
     * 创建SysUserRole
     *
     * @param sysUserRole
     * @return
     */
    @Override
    public Integer insert(SysUserRole sysUserRole){
        if(sysUserRole ==null){
            return 0;
        }
        return sysUserRoleMapper.insert(sysUserRole);
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
        Integer result = sysUserRoleMapper.deleteById(userId);
        return result;

    }

    /**
     * 修改SysUserRole
     *
     * @param sysUserRole
     * @return
    */
    @Override
    public Integer updateByPrimaryKey(SysUserRole sysUserRole){
        if(sysUserRole ==null){
            return 0;
        }
        return sysUserRoleMapper.updateById(sysUserRole);
    }

    /**
    * 根据主键查询
    *
    * @param userId
    * @return
    */
    @Override
    public SysUserRole selectByPrimaryKey(Long userId){
        if(userId ==null){
            return null;
        }
        SysUserRole sysUserRole  = sysUserRoleMapper.selectById(userId);
        if (sysUserRole == null){
            return null;
        }
        return sysUserRole;
    }

    /**
     * 分页查询
     * @param pageIndex
     * @param pageSize
     * @param sysUserRole SysUserRole
     * @return IPage<SysUserRole>
     */
    @Override
    public IPage<SysUserRole> queryPage(int pageIndex, int pageSize,SysUserRole sysUserRole){
        QueryWrapper<SysUserRole> queryWrapper = Wrappers.query();
        IPage<SysUserRole> ipage = sysUserRoleMapper.selectPage(new Page(pageIndex, pageSize), queryWrapper);
        return ipage;
    }

    /**
    * 批量插入
    * @param list List<SysUserRole
    * @return Integer
    */
    @Override
    public Integer batchInsert(List<SysUserRole> list){
        if (CollectionUtils.isEmpty(list)){
            return 0;
        }
        else{
            return sysUserRoleMapper.batchInsert(list);
        }
    }

    /**
     * 批量更新
     * @param list List<SysUserRole>
     * @return Integer
     */
    @Override
    public Integer batchUpdate(List<SysUserRole> list){
        if (CollectionUtils.isEmpty(list)){
            return 0;
        }
        else{
            return sysUserRoleMapper.batchInsert(list);
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
            return sysUserRoleMapper.deleteBatchIds(list);
        }
    }
    /**
     * 存在即更新
     * @param sysUserRole SysUserRole
     * @return Integer
     */
    @Override
    public Integer upsert(SysUserRole sysUserRole){

        if (sysUserRole == null){
            return 0;
        }
        else{
            return sysUserRoleMapper.upsert(sysUserRole);
        }

    }

    /**
     * 存在即更新，可选择具体属性
     * @param sysUserRole SysUserRole
     * @return Integer
     */
    @Override
    public Integer upsertSelective(SysUserRole sysUserRole){
        if (sysUserRole == null){
            return 0;
        }
        else{
            return sysUserRoleMapper.upsert(sysUserRole);
        }
    }

    /**
     * 条件查询
     * @param sysUserRole SysUserRole
     * @return List<SysUserRole>
    */
    @Override
    public List<SysUserRole> query(SysUserRole sysUserRole){
        if (sysUserRole == null){
            return null;
        }
        else{
            return sysUserRoleMapper.query(sysUserRole);
        }
    }

    /**
     * 查询总数
     * @return Integer
     */
    @Override
    public Long queryTotalCount(){
        return sysUserRoleMapper.queryTotalCount();
    }
}