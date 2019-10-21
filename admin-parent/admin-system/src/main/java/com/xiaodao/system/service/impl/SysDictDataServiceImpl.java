package com.xiaodao.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import com.xiaodao.system.mapper.SysDictDataMapper;
import com.xiaodao.system.service.ISysDictDataService;
import com.xiaodao.system.entity.SysDictData;

import java.util.List;


/**
 * @description ISysDictData Service层
 * @author 高磊
 * @since jdk1.8
 */
@Service
public class SysDictDataServiceImpl implements ISysDictDataService{


     @Autowired
     private SysDictDataMapper sysDictDataMapper;

    /**
     * 创建SysDictData
     *
     * @param sysDictData
     * @return
     */
    @Override
    public Integer insert(SysDictData sysDictData){
        if(sysDictData ==null){
            return 0;
        }
        return sysDictDataMapper.insert(sysDictData);
    }


    /**
     * 根据主键删除
     *
     * @param dictCode
     * @return
     */
    @Override
    public Integer deleteByPrimaryKey(Integer dictCode){
        if(dictCode ==null){
            return 0;
        }
        Integer result = sysDictDataMapper.deleteById(dictCode);
        return result;

    }

    /**
     * 修改SysDictData
     *
     * @param sysDictData
     * @return
    */
    @Override
    public Integer updateByPrimaryKey(SysDictData sysDictData){
        if(sysDictData ==null){
            return 0;
        }
        return sysDictDataMapper.updateById(sysDictData);
    }

    /**
    * 根据主键查询
    *
    * @param dictCode
    * @return
    */
    @Override
    public SysDictData selectByPrimaryKey(Integer dictCode){
        if(dictCode ==null){
            return null;
        }
        SysDictData sysDictData  = sysDictDataMapper.selectById(dictCode);
        if (sysDictData == null){
            return null;
        }
        return sysDictData;
    }

    /**
     * 分页查询
     * @param pageIndex
     * @param pageSize
     * @param sysDictData SysDictData
     * @return IPage<SysDictData>
     */
    @Override
    public IPage<SysDictData> queryPage(int pageIndex, int pageSize,SysDictData sysDictData){
        QueryWrapper<SysDictData> queryWrapper = Wrappers.query();
        IPage<SysDictData> ipage = sysDictDataMapper.selectPage(new Page(pageIndex, pageSize), queryWrapper);
        return ipage;
    };

    /**
    * 批量插入
    * @param list List<SysDictData
    * @return Integer
    */
    @Override
    public Integer batchInsert(List<SysDictData> list){
        if (CollectionUtils.isEmpty(list)){
            return 0;
        }
        else{
            return sysDictDataMapper.batchInsert(list);
        }
    }

    /**
     * 批量更新
     * @param list List<SysDictData>
     * @return Integer
     */
    @Override
    public Integer batchUpdate(List<SysDictData> list){
        if (CollectionUtils.isEmpty(list)){
            return 0;
        }
        else{
            return sysDictDataMapper.batchInsert(list);
        }
    }

    /**
     * 批量删除
     * @param list List<Integer >
     * @return Integer
    */
    public Integer deleteBatchIds(List<Integer> list){
        if (CollectionUtils.isEmpty(list)){
            return 0;
        } else{
            return sysDictDataMapper.deleteBatchIds(list);
        }
    }
    /**
     * 存在即更新
     * @param sysDictData SysDictData
     * @return Integer
     */
    @Override
    public Integer upsert(SysDictData sysDictData){

        if (sysDictData == null){
            return 0;
        }
        else{
            return sysDictDataMapper.upsert(sysDictData);
        }

    }

    /**
     * 存在即更新，可选择具体属性
     * @param sysDictData SysDictData
     * @return Integer
     */
    @Override
    public Integer upsertSelective(SysDictData sysDictData){
        if (sysDictData == null){
            return 0;
        }
        else{
            return sysDictDataMapper.upsert(sysDictData);
        }
    }

    /**
     * 条件查询
     * @param sysDictData SysDictData
     * @return List<SysDictData>
    */
    @Override
    public List<SysDictData> query(SysDictData sysDictData){
        if (sysDictData == null){
            return null;
        }
        else{
            return sysDictDataMapper.query(sysDictData);
        }
    }

    /**
     * 查询总数
     * @return Integer
     */
    @Override
    public Long queryTotalCount(){
        return sysDictDataMapper.queryTotalCount();
    }
}