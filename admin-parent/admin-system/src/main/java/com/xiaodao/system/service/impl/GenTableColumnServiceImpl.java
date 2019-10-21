package com.xiaodao.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import com.xiaodao.system.mapper.GenTableColumnMapper;
import com.xiaodao.system.service.IGenTableColumnService;
import com.xiaodao.system.entity.GenTableColumn;

import java.util.List;


/**
 * @description IGenTableColumn Service层
 * @author 高磊
 * @since jdk1.8
 */
@Service
public class GenTableColumnServiceImpl implements IGenTableColumnService{


     @Autowired
     private GenTableColumnMapper genTableColumnMapper;

    /**
     * 创建GenTableColumn
     *
     * @param genTableColumn
     * @return
     */
    @Override
    public Integer insert(GenTableColumn genTableColumn){
        if(genTableColumn ==null){
            return 0;
        }
        return genTableColumnMapper.insert(genTableColumn);
    }


    /**
     * 根据主键删除
     *
     * @param columnId
     * @return
     */
    @Override
    public Integer deleteByPrimaryKey(Long columnId){
        if(columnId ==null){
            return 0;
        }
        Integer result = genTableColumnMapper.deleteById(columnId);
        return result;

    }

    /**
     * 修改GenTableColumn
     *
     * @param genTableColumn
     * @return
    */
    @Override
    public Integer updateByPrimaryKey(GenTableColumn genTableColumn){
        if(genTableColumn ==null){
            return 0;
        }
        return genTableColumnMapper.updateById(genTableColumn);
    }

    /**
    * 根据主键查询
    *
    * @param columnId
    * @return
    */
    @Override
    public GenTableColumn selectByPrimaryKey(Long columnId){
        if(columnId ==null){
            return null;
        }
        GenTableColumn genTableColumn  = genTableColumnMapper.selectById(columnId);
        if (genTableColumn == null){
            return null;
        }
        return genTableColumn;
    }

    /**
     * 分页查询
     * @param pageIndex
     * @param pageSize
     * @param genTableColumn GenTableColumn
     * @return IPage<GenTableColumn>
     */
    @Override
    public IPage<GenTableColumn> queryPage(int pageIndex, int pageSize,GenTableColumn genTableColumn){
        QueryWrapper<GenTableColumn> queryWrapper = Wrappers.query();
        IPage<GenTableColumn> ipage = genTableColumnMapper.selectPage(new Page(pageIndex, pageSize), queryWrapper);
        return ipage;
    };

    /**
    * 批量插入
    * @param list List<GenTableColumn
    * @return Integer
    */
    @Override
    public Integer batchInsert(List<GenTableColumn> list){
        if (CollectionUtils.isEmpty(list)){
            return 0;
        }
        else{
            return genTableColumnMapper.batchInsert(list);
        }
    }

    /**
     * 批量更新
     * @param list List<GenTableColumn>
     * @return Integer
     */
    @Override
    public Integer batchUpdate(List<GenTableColumn> list){
        if (CollectionUtils.isEmpty(list)){
            return 0;
        }
        else{
            return genTableColumnMapper.batchInsert(list);
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
            return genTableColumnMapper.deleteBatchIds(list);
        }
    }
    /**
     * 存在即更新
     * @param genTableColumn GenTableColumn
     * @return Integer
     */
    @Override
    public Integer upsert(GenTableColumn genTableColumn){

        if (genTableColumn == null){
            return 0;
        }
        else{
            return genTableColumnMapper.upsert(genTableColumn);
        }

    }

    /**
     * 存在即更新，可选择具体属性
     * @param genTableColumn GenTableColumn
     * @return Integer
     */
    @Override
    public Integer upsertSelective(GenTableColumn genTableColumn){
        if (genTableColumn == null){
            return 0;
        }
        else{
            return genTableColumnMapper.upsert(genTableColumn);
        }
    }

    /**
     * 条件查询
     * @param genTableColumn GenTableColumn
     * @return List<GenTableColumn>
    */
    @Override
    public List<GenTableColumn> query(GenTableColumn genTableColumn){
        if (genTableColumn == null){
            return null;
        }
        else{
            return genTableColumnMapper.query(genTableColumn);
        }
    }

    /**
     * 查询总数
     * @return Integer
     */
    @Override
    public Long queryTotalCount(){
        return genTableColumnMapper.queryTotalCount();
    }
}