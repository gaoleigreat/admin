package com.xiaodao.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import com.xiaodao.system.mapper.SysRoleDeptMapper;
import com.xiaodao.system.service.ISysRoleDeptService;
import com.xiaodao.system.entity.SysRoleDept;

import java.util.List;


/**
 * @description ISysRoleDept Service层
 * @author xiaodao
 * @since jdk1.8
 */
@Service
public class SysRoleDeptServiceImpl implements ISysRoleDeptService{


     @Autowired
     private SysRoleDeptMapper sysRoleDeptMapper;

    /**
     * 创建SysRoleDept
     *
     * @param sysRoleDept
     * @return
     */
    @Override
    public Integer insert(SysRoleDept sysRoleDept){
        if(sysRoleDept ==null){
            return 0;
        }
        return sysRoleDeptMapper.insert(sysRoleDept);
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
        Integer result = sysRoleDeptMapper.deleteById(roleId);
        return result;

    }

    /**
     * 修改SysRoleDept
     *
     * @param sysRoleDept
     * @return
    */
    @Override
    public Integer updateByPrimaryKey(SysRoleDept sysRoleDept){
        if(sysRoleDept ==null){
            return 0;
        }
        return sysRoleDeptMapper.updateById(sysRoleDept);
    }

    /**
    * 根据主键查询
    *
    * @param roleId
    * @return
    */
    @Override
    public SysRoleDept selectByPrimaryKey(Long roleId){
        if(roleId ==null){
            return null;
        }
        SysRoleDept sysRoleDept  = sysRoleDeptMapper.selectById(roleId);
        if (sysRoleDept == null){
            return null;
        }
        return sysRoleDept;
    }

    /**
     * 分页查询
     * @param pageIndex
     * @param pageSize
     * @param sysRoleDept SysRoleDept
     * @return IPage<SysRoleDept>
     */
    @Override
    public IPage<SysRoleDept> queryPage(int pageIndex, int pageSize,SysRoleDept sysRoleDept){
        QueryWrapper<SysRoleDept> queryWrapper = Wrappers.query();
        IPage<SysRoleDept> ipage = sysRoleDeptMapper.selectPage(new Page(pageIndex, pageSize), queryWrapper);
        return ipage;
    }

    /**
    * 批量插入
    * @param list List<SysRoleDept
    * @return Integer
    */
    @Override
    public Integer batchInsert(List<SysRoleDept> list){
        if (CollectionUtils.isEmpty(list)){
            return 0;
        }
        else{
            return sysRoleDeptMapper.batchInsert(list);
        }
    }

    /**
     * 批量更新
     * @param list List<SysRoleDept>
     * @return Integer
     */
    @Override
    public Integer batchUpdate(List<SysRoleDept> list){
        if (CollectionUtils.isEmpty(list)){
            return 0;
        }
        else{
            return sysRoleDeptMapper.batchInsert(list);
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
            return sysRoleDeptMapper.deleteBatchIds(list);
        }
    }
    /**
     * 存在即更新
     * @param sysRoleDept SysRoleDept
     * @return Integer
     */
    @Override
    public Integer upsert(SysRoleDept sysRoleDept){

        if (sysRoleDept == null){
            return 0;
        }
        else{
            return sysRoleDeptMapper.upsert(sysRoleDept);
        }

    }

    /**
     * 存在即更新，可选择具体属性
     * @param sysRoleDept SysRoleDept
     * @return Integer
     */
    @Override
    public Integer upsertSelective(SysRoleDept sysRoleDept){
        if (sysRoleDept == null){
            return 0;
        }
        else{
            return sysRoleDeptMapper.upsert(sysRoleDept);
        }
    }

    /**
     * 条件查询
     * @param sysRoleDept SysRoleDept
     * @return List<SysRoleDept>
    */
    @Override
    public List<SysRoleDept> query(SysRoleDept sysRoleDept){
        if (sysRoleDept == null){
            return null;
        }
        else{
            return sysRoleDeptMapper.query(sysRoleDept);
        }
    }

    /**
     * 查询总数
     * @return Integer
     */
    @Override
    public Long queryTotalCount(){
        return sysRoleDeptMapper.queryTotalCount();
    }
}