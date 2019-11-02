package com.xiaodao.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import com.xiaodao.system.mapper.SysDeptMapper;
import com.xiaodao.system.service.ISysDeptService;
import com.xiaodao.system.entity.SysDept;

import java.util.List;


/**
 * @description ISysDept Service层
 * @author 高磊
 * @since jdk1.8
 */
@Service
public class SysDeptServiceImpl implements ISysDeptService{


     @Autowired
     private SysDeptMapper sysDeptMapper;

    /**
     * 创建SysDept
     *
     * @param sysDept
     * @return
     */
    @Override
    public Integer insert(SysDept sysDept){
        if(sysDept ==null){
            return 0;
        }
        return sysDeptMapper.insert(sysDept);
    }


    /**
     * 根据主键删除
     *
     * @param deptId
     * @return
     */
    @Override
    public Integer deleteByPrimaryKey(Long deptId){
        if(deptId ==null){
            return 0;
        }
        Integer result = sysDeptMapper.deleteById(deptId);
        return result;

    }

    /**
     * 修改SysDept
     *
     * @param sysDept
     * @return
    */
    @Override
    public Integer updateByPrimaryKey(SysDept sysDept){
        if(sysDept ==null){
            return 0;
        }
        return sysDeptMapper.updateById(sysDept);
    }

    /**
    * 根据主键查询
    *
    * @param deptId
    * @return
    */
    @Override
    public SysDept selectByPrimaryKey(Long deptId){
        if(deptId ==null){
            return null;
        }
        SysDept sysDept  = sysDeptMapper.selectById(deptId);
        if (sysDept == null){
            return null;
        }
        return sysDept;
    }

    /**
     * 分页查询
     * @param pageIndex
     * @param pageSize
     * @param sysDept SysDept
     * @return IPage<SysDept>
     */
    @Override
    public IPage<SysDept> queryPage(int pageIndex, int pageSize,SysDept sysDept){
        QueryWrapper<SysDept> queryWrapper = Wrappers.query();
        IPage<SysDept> ipage = sysDeptMapper.selectPage(new Page(pageIndex, pageSize), queryWrapper);
        return ipage;
    }

    /**
    * 批量插入
    * @param list List<SysDept
    * @return Integer
    */
    @Override
    public Integer batchInsert(List<SysDept> list){
        if (CollectionUtils.isEmpty(list)){
            return 0;
        }
        else{
            return sysDeptMapper.batchInsert(list);
        }
    }

    /**
     * 批量更新
     * @param list List<SysDept>
     * @return Integer
     */
    @Override
    public Integer batchUpdate(List<SysDept> list){
        if (CollectionUtils.isEmpty(list)){
            return 0;
        }
        else{
            return sysDeptMapper.batchInsert(list);
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
            return sysDeptMapper.deleteBatchIds(list);
        }
    }
    /**
     * 存在即更新
     * @param sysDept SysDept
     * @return Integer
     */
    @Override
    public Integer upsert(SysDept sysDept){

        if (sysDept == null){
            return 0;
        }
        else{
            return sysDeptMapper.upsert(sysDept);
        }

    }

    /**
     * 存在即更新，可选择具体属性
     * @param sysDept SysDept
     * @return Integer
     */
    @Override
    public Integer upsertSelective(SysDept sysDept){
        if (sysDept == null){
            return 0;
        }
        else{
            return sysDeptMapper.upsert(sysDept);
        }
    }

    /**
     * 条件查询
     * @param sysDept SysDept
     * @return List<SysDept>
    */
    @Override
    public List<SysDept> query(SysDept sysDept){
        if (sysDept == null){
            return null;
        }
        else{
            return sysDeptMapper.query(sysDept);
        }
    }

    /**
     * 查询总数
     * @return Integer
     */
    @Override
    public Long queryTotalCount(){
        return sysDeptMapper.queryTotalCount();
    }
}