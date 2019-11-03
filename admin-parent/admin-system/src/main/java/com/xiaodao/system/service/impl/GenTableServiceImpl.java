package com.xiaodao.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import com.xiaodao.system.mapper.GenTableMapper;
import com.xiaodao.system.service.IGenTableService;
import com.xiaodao.system.entity.GenTable;

import java.util.List;


/**
 * @description IGenTable Service层
 * @author xiaodao
 * @since jdk1.8
 */
@Service
public class GenTableServiceImpl implements IGenTableService{


     @Autowired
     private GenTableMapper genTableMapper;

    /**
     * 创建GenTable
     *
     * @param genTable
     * @return
     */
    @Override
    public Integer insert(GenTable genTable){
        if(genTable ==null){
            return 0;
        }
        return genTableMapper.insert(genTable);
    }


    /**
     * 根据主键删除
     *
     * @param tableId
     * @return
     */
    @Override
    public Integer deleteByPrimaryKey(Long tableId){
        if(tableId ==null){
            return 0;
        }
        Integer result = genTableMapper.deleteById(tableId);
        return result;

    }

    /**
     * 修改GenTable
     *
     * @param genTable
     * @return
    */
    @Override
    public Integer updateByPrimaryKey(GenTable genTable){
        if(genTable ==null){
            return 0;
        }
        return genTableMapper.updateById(genTable);
    }

    /**
    * 根据主键查询
    *
    * @param tableId
    * @return
    */
    @Override
    public GenTable selectByPrimaryKey(Long tableId){
        if(tableId ==null){
            return null;
        }
        GenTable genTable  = genTableMapper.selectById(tableId);
        if (genTable == null){
            return null;
        }
        return genTable;
    }

    /**
     * 分页查询
     * @param pageIndex
     * @param pageSize
     * @param genTable GenTable
     * @return IPage<GenTable>
     */
    @Override
    public IPage<GenTable> queryPage(int pageIndex, int pageSize,GenTable genTable){
        QueryWrapper<GenTable> queryWrapper = Wrappers.query();
        IPage<GenTable> ipage = genTableMapper.selectPage(new Page(pageIndex, pageSize), queryWrapper);
        return ipage;
    }

    /**
    * 批量插入
    * @param list List<GenTable
    * @return Integer
    */
    @Override
    public Integer batchInsert(List<GenTable> list){
        if (CollectionUtils.isEmpty(list)){
            return 0;
        }
        else{
            return genTableMapper.batchInsert(list);
        }
    }

    /**
     * 批量更新
     * @param list List<GenTable>
     * @return Integer
     */
    @Override
    public Integer batchUpdate(List<GenTable> list){
        if (CollectionUtils.isEmpty(list)){
            return 0;
        }
        else{
            return genTableMapper.batchInsert(list);
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
            return genTableMapper.deleteBatchIds(list);
        }
    }
    /**
     * 存在即更新
     * @param genTable GenTable
     * @return Integer
     */
    @Override
    public Integer upsert(GenTable genTable){

        if (genTable == null){
            return 0;
        }
        else{
            return genTableMapper.upsert(genTable);
        }

    }

    /**
     * 存在即更新，可选择具体属性
     * @param genTable GenTable
     * @return Integer
     */
    @Override
    public Integer upsertSelective(GenTable genTable){
        if (genTable == null){
            return 0;
        }
        else{
            return genTableMapper.upsert(genTable);
        }
    }

    /**
     * 条件查询
     * @param genTable GenTable
     * @return List<GenTable>
    */
    @Override
    public List<GenTable> query(GenTable genTable){
        if (genTable == null){
            return null;
        }
        else{
            return genTableMapper.query(genTable);
        }
    }

    /**
     * 查询总数
     * @return Integer
     */
    @Override
    public Long queryTotalCount(){
        return genTableMapper.queryTotalCount();
    }
}