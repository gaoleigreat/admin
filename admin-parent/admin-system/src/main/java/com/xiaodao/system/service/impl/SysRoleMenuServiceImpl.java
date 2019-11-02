package com.xiaodao.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import com.xiaodao.system.mapper.SysRoleMenuMapper;
import com.xiaodao.system.service.ISysRoleMenuService;
import com.xiaodao.system.entity.SysRoleMenu;

import java.util.List;


/**
 * @description ISysRoleMenu Service层
 * @author 高磊
 * @since jdk1.8
 */
@Service
public class SysRoleMenuServiceImpl implements ISysRoleMenuService{


     @Autowired
     private SysRoleMenuMapper sysRoleMenuMapper;

    /**
     * 创建SysRoleMenu
     *
     * @param sysRoleMenu
     * @return
     */
    @Override
    public Integer insert(SysRoleMenu sysRoleMenu){
        if(sysRoleMenu ==null){
            return 0;
        }
        return sysRoleMenuMapper.insert(sysRoleMenu);
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
        Integer result = sysRoleMenuMapper.deleteById(roleId);
        return result;

    }

    /**
     * 修改SysRoleMenu
     *
     * @param sysRoleMenu
     * @return
    */
    @Override
    public Integer updateByPrimaryKey(SysRoleMenu sysRoleMenu){
        if(sysRoleMenu ==null){
            return 0;
        }
        return sysRoleMenuMapper.updateById(sysRoleMenu);
    }

    /**
    * 根据主键查询
    *
    * @param roleId
    * @return
    */
    @Override
    public SysRoleMenu selectByPrimaryKey(Long roleId){
        if(roleId ==null){
            return null;
        }
        SysRoleMenu sysRoleMenu  = sysRoleMenuMapper.selectById(roleId);
        if (sysRoleMenu == null){
            return null;
        }
        return sysRoleMenu;
    }

    /**
     * 分页查询
     * @param pageIndex
     * @param pageSize
     * @param sysRoleMenu SysRoleMenu
     * @return IPage<SysRoleMenu>
     */
    @Override
    public IPage<SysRoleMenu> queryPage(int pageIndex, int pageSize,SysRoleMenu sysRoleMenu){
        QueryWrapper<SysRoleMenu> queryWrapper = Wrappers.query();
        IPage<SysRoleMenu> ipage = sysRoleMenuMapper.selectPage(new Page(pageIndex, pageSize), queryWrapper);
        return ipage;
    }

    /**
    * 批量插入
    * @param list List<SysRoleMenu
    * @return Integer
    */
    @Override
    public Integer batchInsert(List<SysRoleMenu> list){
        if (CollectionUtils.isEmpty(list)){
            return 0;
        }
        else{
            return sysRoleMenuMapper.batchInsert(list);
        }
    }

    /**
     * 批量更新
     * @param list List<SysRoleMenu>
     * @return Integer
     */
    @Override
    public Integer batchUpdate(List<SysRoleMenu> list){
        if (CollectionUtils.isEmpty(list)){
            return 0;
        }
        else{
            return sysRoleMenuMapper.batchInsert(list);
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
            return sysRoleMenuMapper.deleteBatchIds(list);
        }
    }
    /**
     * 存在即更新
     * @param sysRoleMenu SysRoleMenu
     * @return Integer
     */
    @Override
    public Integer upsert(SysRoleMenu sysRoleMenu){

        if (sysRoleMenu == null){
            return 0;
        }
        else{
            return sysRoleMenuMapper.upsert(sysRoleMenu);
        }

    }

    /**
     * 存在即更新，可选择具体属性
     * @param sysRoleMenu SysRoleMenu
     * @return Integer
     */
    @Override
    public Integer upsertSelective(SysRoleMenu sysRoleMenu){
        if (sysRoleMenu == null){
            return 0;
        }
        else{
            return sysRoleMenuMapper.upsert(sysRoleMenu);
        }
    }

    /**
     * 条件查询
     * @param sysRoleMenu SysRoleMenu
     * @return List<SysRoleMenu>
    */
    @Override
    public List<SysRoleMenu> query(SysRoleMenu sysRoleMenu){
        if (sysRoleMenu == null){
            return null;
        }
        else{
            return sysRoleMenuMapper.query(sysRoleMenu);
        }
    }

    /**
     * 查询总数
     * @return Integer
     */
    @Override
    public Long queryTotalCount(){
        return sysRoleMenuMapper.queryTotalCount();
    }
}