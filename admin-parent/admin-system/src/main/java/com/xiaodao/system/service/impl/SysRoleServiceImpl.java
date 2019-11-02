package com.xiaodao.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import com.xiaodao.system.mapper.SysRoleMapper;
import com.xiaodao.system.service.ISysRoleService;
import com.xiaodao.system.entity.SysRole;

import java.util.List;


/**
 * @description ISysRole Service层
 * @author 高磊
 * @since jdk1.8
 */
@Service
public class SysRoleServiceImpl implements ISysRoleService{


     @Autowired
     private SysRoleMapper sysRoleMapper;

    /**
     * 创建SysRole
     *
     * @param sysRole
     * @return
     */
    @Override
    public Integer insert(SysRole sysRole){
        if(sysRole ==null){
            return 0;
        }
        return sysRoleMapper.insert(sysRole);
    }


    /**
     * 根据主键删除
     *
     * @param roleId
     * @return
     */
    @Override
    public Integer deleteByPrimaryKey(Long roleId){
        if(roleId ==null){
            return 0;
        }
        Integer result = sysRoleMapper.deleteById(roleId);
        return result;

    }

    /**
     * 修改SysRole
     *
     * @param sysRole
     * @return
    */
    @Override
    public Integer updateByPrimaryKey(SysRole sysRole){
        if(sysRole ==null){
            return 0;
        }
        return sysRoleMapper.updateById(sysRole);
    }

    /**
    * 根据主键查询
    *
    * @param roleId
    * @return
    */
    @Override
    public SysRole selectByPrimaryKey(Long roleId){
        if(roleId ==null){
            return null;
        }
        SysRole sysRole  = sysRoleMapper.selectById(roleId);
        if (sysRole == null){
            return null;
        }
        return sysRole;
    }

    /**
     * 分页查询
     * @param pageIndex
     * @param pageSize
     * @param sysRole SysRole
     * @return IPage<SysRole>
     */
    @Override
    public IPage<SysRole> queryPage(int pageIndex, int pageSize,SysRole sysRole){
        QueryWrapper<SysRole> queryWrapper = Wrappers.query();
        IPage<SysRole> ipage = sysRoleMapper.selectPage(new Page(pageIndex, pageSize), queryWrapper);
        return ipage;
    }

    /**
    * 批量插入
    * @param list List<SysRole
    * @return Integer
    */
    @Override
    public Integer batchInsert(List<SysRole> list){
        if (CollectionUtils.isEmpty(list)){
            return 0;
        }
        else{
            return sysRoleMapper.batchInsert(list);
        }
    }

    /**
     * 批量更新
     * @param list List<SysRole>
     * @return Integer
     */
    @Override
    public Integer batchUpdate(List<SysRole> list){
        if (CollectionUtils.isEmpty(list)){
            return 0;
        }
        else{
            return sysRoleMapper.batchInsert(list);
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
            return sysRoleMapper.deleteBatchIds(list);
        }
    }
    /**
     * 存在即更新
     * @param sysRole SysRole
     * @return Integer
     */
    @Override
    public Integer upsert(SysRole sysRole){

        if (sysRole == null){
            return 0;
        }
        else{
            return sysRoleMapper.upsert(sysRole);
        }

    }

    /**
     * 存在即更新，可选择具体属性
     * @param sysRole SysRole
     * @return Integer
     */
    @Override
    public Integer upsertSelective(SysRole sysRole){
        if (sysRole == null){
            return 0;
        }
        else{
            return sysRoleMapper.upsert(sysRole);
        }
    }

    /**
     * 条件查询
     * @param sysRole SysRole
     * @return List<SysRole>
    */
    @Override
    public List<SysRole> query(SysRole sysRole){
        if (sysRole == null){
            return null;
        }
        else{
            return sysRoleMapper.query(sysRole);
        }
    }

    /**
     * 查询总数
     * @return Integer
     */
    @Override
    public Long queryTotalCount(){
        return sysRoleMapper.queryTotalCount();
    }
}