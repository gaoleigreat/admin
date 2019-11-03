package com.xiaodao.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import com.xiaodao.system.mapper.PerceptionStructuredDataMapper;
import com.xiaodao.system.service.IPerceptionStructuredDataService;
import com.xiaodao.system.entity.PerceptionStructuredData;

import java.util.List;


/**
 * @description IPerceptionStructuredData Service层
 * @author xiaodao
 * @since jdk1.8
 */
@Service
public class PerceptionStructuredDataServiceImpl implements IPerceptionStructuredDataService{


     @Autowired
     private PerceptionStructuredDataMapper perceptionStructuredDataMapper;

    /**
     * 创建PerceptionStructuredData
     *
     * @param perceptionStructuredData
     * @return
     */
    @Override
    public Integer insert(PerceptionStructuredData perceptionStructuredData){
        if(perceptionStructuredData ==null){
            return 0;
        }
        return perceptionStructuredDataMapper.insert(perceptionStructuredData);
    }


    /**
     * 根据主键删除
     *
     * @param id
     * @return
     */
    @Override
    public Integer deleteByPrimaryKey(Long id){
        if(id ==null){
            return 0;
        }
        Integer result = perceptionStructuredDataMapper.deleteById(id);
        return result;

    }

    /**
     * 修改PerceptionStructuredData
     *
     * @param perceptionStructuredData
     * @return
    */
    @Override
    public Integer updateByPrimaryKey(PerceptionStructuredData perceptionStructuredData){
        if(perceptionStructuredData ==null){
            return 0;
        }
        return perceptionStructuredDataMapper.updateById(perceptionStructuredData);
    }

    /**
    * 根据主键查询
    *
    * @param id
    * @return
    */
    @Override
    public PerceptionStructuredData selectByPrimaryKey(Long id){
        if(id ==null){
            return null;
        }
        PerceptionStructuredData perceptionStructuredData  = perceptionStructuredDataMapper.selectById(id);
        if (perceptionStructuredData == null){
            return null;
        }
        return perceptionStructuredData;
    }

    /**
     * 分页查询
     * @param pageIndex
     * @param pageSize
     * @param perceptionStructuredData PerceptionStructuredData
     * @return IPage<PerceptionStructuredData>
     */
    @Override
    public IPage<PerceptionStructuredData> queryPage(int pageIndex, int pageSize,PerceptionStructuredData perceptionStructuredData){
        QueryWrapper<PerceptionStructuredData> queryWrapper = Wrappers.query();
        IPage<PerceptionStructuredData> ipage = perceptionStructuredDataMapper.selectPage(new Page(pageIndex, pageSize), queryWrapper);
        return ipage;
    }

    /**
    * 批量插入
    * @param list List<PerceptionStructuredData
    * @return Integer
    */
    @Override
    public Integer batchInsert(List<PerceptionStructuredData> list){
        if (CollectionUtils.isEmpty(list)){
            return 0;
        }
        else{
            return perceptionStructuredDataMapper.batchInsert(list);
        }
    }

    /**
     * 批量更新
     * @param list List<PerceptionStructuredData>
     * @return Integer
     */
    @Override
    public Integer batchUpdate(List<PerceptionStructuredData> list){
        if (CollectionUtils.isEmpty(list)){
            return 0;
        }
        else{
            return perceptionStructuredDataMapper.batchInsert(list);
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
            return perceptionStructuredDataMapper.deleteBatchIds(list);
        }
    }
    /**
     * 存在即更新
     * @param perceptionStructuredData PerceptionStructuredData
     * @return Integer
     */
    @Override
    public Integer upsert(PerceptionStructuredData perceptionStructuredData){

        if (perceptionStructuredData == null){
            return 0;
        }
        else{
            return perceptionStructuredDataMapper.upsert(perceptionStructuredData);
        }

    }

    /**
     * 存在即更新，可选择具体属性
     * @param perceptionStructuredData PerceptionStructuredData
     * @return Integer
     */
    @Override
    public Integer upsertSelective(PerceptionStructuredData perceptionStructuredData){
        if (perceptionStructuredData == null){
            return 0;
        }
        else{
            return perceptionStructuredDataMapper.upsert(perceptionStructuredData);
        }
    }

    /**
     * 条件查询
     * @param perceptionStructuredData PerceptionStructuredData
     * @return List<PerceptionStructuredData>
    */
    @Override
    public List<PerceptionStructuredData> query(PerceptionStructuredData perceptionStructuredData){
        if (perceptionStructuredData == null){
            return null;
        }
        else{
            return perceptionStructuredDataMapper.query(perceptionStructuredData);
        }
    }

    /**
     * 查询总数
     * @return Integer
     */
    @Override
    public Long queryTotalCount(){
        return perceptionStructuredDataMapper.queryTotalCount();
    }
}