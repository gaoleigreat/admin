package com.xiaodao.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import com.xiaodao.system.mapper.SysDictTypeMapper;
import com.xiaodao.system.service.ISysDictTypeService;
import com.xiaodao.system.entity.SysDictType;

import java.util.List;


/**
 * @description ISysDictType Service层
 * @author xiaodao
 * @since jdk1.8
 */
@Service
public class SysDictTypeServiceImpl implements ISysDictTypeService{


     @Autowired
     private SysDictTypeMapper sysDictTypeMapper;

    /**
     * 创建SysDictType
     *
     * @param sysDictType
     * @return
     */
    @Override
    public Integer insert(SysDictType sysDictType){
        if(sysDictType ==null){
            return 0;
        }
        return sysDictTypeMapper.insert(sysDictType);
    }


    /**
     * 根据主键删除
     *
     * @param dictId
     * @return
     */
    @Override
    public Integer deleteByPrimaryKey(Long dictId){
        if(dictId ==null){
            return 0;
        }
        Integer result = sysDictTypeMapper.deleteById(dictId);
        return result;

    }

    /**
     * 修改SysDictType
     *
     * @param sysDictType
     * @return
    */
    @Override
    public Integer updateByPrimaryKey(SysDictType sysDictType){
        if(sysDictType ==null){
            return 0;
        }
        return sysDictTypeMapper.updateById(sysDictType);
    }

    /**
    * 根据主键查询
    *
    * @param dictId
    * @return
    */
    @Override
    public SysDictType selectByPrimaryKey(Long dictId){
        if(dictId ==null){
            return null;
        }
        SysDictType sysDictType  = sysDictTypeMapper.selectById(dictId);
        if (sysDictType == null){
            return null;
        }
        return sysDictType;
    }

    /**
     * 分页查询
     * @param pageIndex
     * @param pageSize
     * @param sysDictType SysDictType
     * @return IPage<SysDictType>
     */
    @Override
    public IPage<SysDictType> queryPage(int pageIndex, int pageSize,SysDictType sysDictType){
        QueryWrapper<SysDictType> queryWrapper = Wrappers.query();
        IPage<SysDictType> ipage = sysDictTypeMapper.selectPage(new Page(pageIndex, pageSize), queryWrapper);
        return ipage;
    }

    /**
    * 批量插入
    * @param list List<SysDictType
    * @return Integer
    */
    @Override
    public Integer batchInsert(List<SysDictType> list){
        if (CollectionUtils.isEmpty(list)){
            return 0;
        }
        else{
            return sysDictTypeMapper.batchInsert(list);
        }
    }

    /**
     * 批量更新
     * @param list List<SysDictType>
     * @return Integer
     */
    @Override
    public Integer batchUpdate(List<SysDictType> list){
        if (CollectionUtils.isEmpty(list)){
            return 0;
        }
        else{
            return sysDictTypeMapper.batchInsert(list);
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
            return sysDictTypeMapper.deleteBatchIds(list);
        }
    }
    /**
     * 存在即更新
     * @param sysDictType SysDictType
     * @return Integer
     */
    @Override
    public Integer upsert(SysDictType sysDictType){

        if (sysDictType == null){
            return 0;
        }
        else{
            return sysDictTypeMapper.upsert(sysDictType);
        }

    }

    /**
     * 存在即更新，可选择具体属性
     * @param sysDictType SysDictType
     * @return Integer
     */
    @Override
    public Integer upsertSelective(SysDictType sysDictType){
        if (sysDictType == null){
            return 0;
        }
        else{
            return sysDictTypeMapper.upsert(sysDictType);
        }
    }

    /**
     * 条件查询
     * @param sysDictType SysDictType
     * @return List<SysDictType>
    */
    @Override
    public List<SysDictType> query(SysDictType sysDictType){
        if (sysDictType == null){
            return null;
        }
        else{
            return sysDictTypeMapper.query(sysDictType);
        }
    }

    /**
     * 查询总数
     * @return Integer
     */
    @Override
    public Long queryTotalCount(){
        return sysDictTypeMapper.queryTotalCount();
    }
}