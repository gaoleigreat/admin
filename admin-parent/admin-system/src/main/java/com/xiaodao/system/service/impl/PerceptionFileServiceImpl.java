package com.xiaodao.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import com.xiaodao.system.mapper.PerceptionFileMapper;
import com.xiaodao.system.service.IPerceptionFileService;
import com.xiaodao.system.entity.PerceptionFile;

import java.util.List;


/**
 * @description IPerceptionFile Service层
 * @author 高磊
 * @since jdk1.8
 */
@Service
public class PerceptionFileServiceImpl implements IPerceptionFileService{


     @Autowired
     private PerceptionFileMapper perceptionFileMapper;

    /**
     * 创建PerceptionFile
     *
     * @param perceptionFile
     * @return
     */
    @Override
    public Integer insert(PerceptionFile perceptionFile){
        if(perceptionFile ==null){
            return 0;
        }
        return perceptionFileMapper.insert(perceptionFile);
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
        Integer result = perceptionFileMapper.deleteById(id);
        return result;

    }

    /**
     * 修改PerceptionFile
     *
     * @param perceptionFile
     * @return
    */
    @Override
    public Integer updateByPrimaryKey(PerceptionFile perceptionFile){
        if(perceptionFile ==null){
            return 0;
        }
        return perceptionFileMapper.updateById(perceptionFile);
    }

    /**
    * 根据主键查询
    *
    * @param id
    * @return
    */
    @Override
    public PerceptionFile selectByPrimaryKey(Long id){
        if(id ==null){
            return null;
        }
        PerceptionFile perceptionFile  = perceptionFileMapper.selectById(id);
        if (perceptionFile == null){
            return null;
        }
        return perceptionFile;
    }

    /**
     * 分页查询
     * @param pageIndex
     * @param pageSize
     * @param perceptionFile PerceptionFile
     * @return IPage<PerceptionFile>
     */
    @Override
    public IPage<PerceptionFile> queryPage(int pageIndex, int pageSize,PerceptionFile perceptionFile){
        QueryWrapper<PerceptionFile> queryWrapper = Wrappers.query();
        IPage<PerceptionFile> ipage = perceptionFileMapper.selectPage(new Page(pageIndex, pageSize), queryWrapper);
        return ipage;
    }

    /**
    * 批量插入
    * @param list List<PerceptionFile
    * @return Integer
    */
    @Override
    public Integer batchInsert(List<PerceptionFile> list){
        if (CollectionUtils.isEmpty(list)){
            return 0;
        }
        else{
            return perceptionFileMapper.batchInsert(list);
        }
    }

    /**
     * 批量更新
     * @param list List<PerceptionFile>
     * @return Integer
     */
    @Override
    public Integer batchUpdate(List<PerceptionFile> list){
        if (CollectionUtils.isEmpty(list)){
            return 0;
        }
        else{
            return perceptionFileMapper.batchInsert(list);
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
            return perceptionFileMapper.deleteBatchIds(list);
        }
    }
    /**
     * 存在即更新
     * @param perceptionFile PerceptionFile
     * @return Integer
     */
    @Override
    public Integer upsert(PerceptionFile perceptionFile){

        if (perceptionFile == null){
            return 0;
        }
        else{
            return perceptionFileMapper.upsert(perceptionFile);
        }

    }

    /**
     * 存在即更新，可选择具体属性
     * @param perceptionFile PerceptionFile
     * @return Integer
     */
    @Override
    public Integer upsertSelective(PerceptionFile perceptionFile){
        if (perceptionFile == null){
            return 0;
        }
        else{
            return perceptionFileMapper.upsert(perceptionFile);
        }
    }

    /**
     * 条件查询
     * @param perceptionFile PerceptionFile
     * @return List<PerceptionFile>
    */
    @Override
    public List<PerceptionFile> query(PerceptionFile perceptionFile){
        if (perceptionFile == null){
            return null;
        }
        else{
            return perceptionFileMapper.query(perceptionFile);
        }
    }

    /**
     * 查询总数
     * @return Integer
     */
    @Override
    public Long queryTotalCount(){
        return perceptionFileMapper.queryTotalCount();
    }
}