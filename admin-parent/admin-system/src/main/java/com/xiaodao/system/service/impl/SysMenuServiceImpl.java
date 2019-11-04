package com.xiaodao.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import com.xiaodao.system.mapper.SysMenuMapper;
import com.xiaodao.system.service.ISysMenuService;
import com.xiaodao.system.entity.SysMenu;

import java.util.List;


/**
 * @description ISysMenu Service层
 * @author ¸ßÀÚ
 * @since jdk1.8
 */
@Service
public class SysMenuServiceImpl implements ISysMenuService{


     @Autowired
     private SysMenuMapper sysMenuMapper;

    /**
     * 创建SysMenu
     *
     * @param sysMenu
     * @return
     */
    @Override
    public Integer insert(SysMenu sysMenu){
        if(sysMenu ==null){
            return 0;
        }
        return sysMenuMapper.insert(sysMenu);
    }


    /**
     * 根据主键删除
     *
     * @param menuId
     * @return
     */
    @Override
    public Integer deleteByPrimaryKey(Long menuId){
        if(menuId ==null){
            return 0;
        }
        Integer result = sysMenuMapper.deleteById(menuId);
        return result;

    }

    /**
     * 修改SysMenu
     *
     * @param sysMenu
     * @return
    */
    @Override
    public Integer updateByPrimaryKey(SysMenu sysMenu){
        if(sysMenu ==null){
            return 0;
        }
        return sysMenuMapper.updateById(sysMenu);
    }

    /**
    * 根据主键查询
    *
    * @param menuId
    * @return
    */
    @Override
    public SysMenu selectByPrimaryKey(Long menuId){
        if(menuId ==null){
            return null;
        }
        SysMenu sysMenu  = sysMenuMapper.selectById(menuId);
        if (sysMenu == null){
            return null;
        }
        return sysMenu;
    }

    /**
     * 分页查询
     * @param pageIndex
     * @param pageSize
     * @param sysMenu SysMenu
     * @return IPage<SysMenu>
     */
    @Override
    public IPage<SysMenu> queryPage(int pageIndex, int pageSize,SysMenu sysMenu){
        QueryWrapper<SysMenu> queryWrapper = Wrappers.query();
        IPage<SysMenu> ipage = sysMenuMapper.selectPage(new Page(pageIndex, pageSize), queryWrapper);
        return ipage;
    }

    /**
    * 批量插入
    * @param list List<SysMenu
    * @return Integer
    */
    @Override
    public Integer batchInsert(List<SysMenu> list){
        if (CollectionUtils.isEmpty(list)){
            return 0;
        }
        else{
            return sysMenuMapper.batchInsert(list);
        }
    }

    /**
     * 批量更新
     * @param list List<SysMenu>
     * @return Integer
     */
    @Override
    public Integer batchUpdate(List<SysMenu> list){
        if (CollectionUtils.isEmpty(list)){
            return 0;
        }
        else{
            return sysMenuMapper.batchUpdate(list);
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
            return sysMenuMapper.deleteBatchIds(list);
        }
    }
    /**
     * 存在即更新
     * @param sysMenu SysMenu
     * @return Integer
     */
    @Override
    public Integer upsert(SysMenu sysMenu){

        if (sysMenu == null){
            return 0;
        }
        else{
            return sysMenuMapper.upsert(sysMenu);
        }

    }

    /**
     * 存在即更新，可选择具体属性
     * @param sysMenu SysMenu
     * @return Integer
     */
    @Override
    public Integer upsertSelective(SysMenu sysMenu){
        if (sysMenu == null){
            return 0;
        }
        else{
            return sysMenuMapper.upsert(sysMenu);
        }
    }

    /**
     * 条件查询
     * @param sysMenu SysMenu
     * @return List<SysMenu>
    */
    @Override
    public List<SysMenu> query(SysMenu sysMenu){
        if (sysMenu == null){
            return null;
        }
        else{
            return sysMenuMapper.query(sysMenu);
        }
    }

    /**
     * 查询总数
     * @return Integer
     */
    @Override
    public Long queryTotalCount(){
        return sysMenuMapper.queryTotalCount();
    }
}