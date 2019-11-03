package com.xiaodao.system.service;

import java.util.List;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.apache.ibatis.annotations.Param;
import javax.validation.constraints.NotNull;
import com.xiaodao.system.entity.GenTableColumn;


/**
 * @description IGenTableColumn Service层
 * @author xiaodao
 * @since jdk1.8
 */
public interface IGenTableColumnService {



    /**
     * 创建GenTableColumn
     *
     * @param genTableColumn
     * @return
     */
    Integer insert(@NotNull(message = "添加失败，参数不能为空") GenTableColumn genTableColumn);


    /**
     * 根据主键删除
     *
     * @param columnId
     * @return
     */
    Integer deleteByPrimaryKey(@NotNull(message = "删除失败，参数不能为空") Long columnId);

    /**
     * 修改GenTableColumn
     *
     * @param genTableColumn
     * @return
    */
    Integer updateByPrimaryKey(@NotNull(message = "添加失败，参数不能为空") GenTableColumn genTableColumn);


    /**
    * 根据主键查询
    *
    * @param columnId
    * @return
    */
    GenTableColumn selectByPrimaryKey(@NotNull(message = "查询失败，参数不能为空") Long columnId);


    /**
     * 分页查询
     * @param pageIndex
     * @param pageSize
     * @param genTableColumn GenTableColumn
     * @return IPage<GenTableColumn>
     */
    IPage<GenTableColumn> queryPage(int pageIndex, int pageSize, GenTableColumn genTableColumn);

    /**
    * 批量插入
    * @param list List<GenTableColumn
    * @return Integer
    */
    Integer batchInsert(List<GenTableColumn> list);

    /**
     * 批量更新
     * @param list List<GenTableColumn>
     * @return Integer
     */
    Integer batchUpdate(List<GenTableColumn> list);

    /**
     * 批量删除
     * @param list List<Long >
     * @return Integer
     */
    Integer deleteBatchIds(List<Long> list);

    /**
     * 存在即更新
     * @param genTableColumn GenTableColumn
     * @return Integer
     */
    Integer upsert(@Param("genTableColumn") GenTableColumn genTableColumn);

    /**
     * 存在即更新，可选择具体属性
     * @param genTableColumn GenTableColumn
     * @return Integer
     */
    Integer upsertSelective(GenTableColumn genTableColumn);

    /**
     * 条件查询
     * @param genTableColumn GenTableColumn
     * @return List<GenTableColumn>
    */
    List<GenTableColumn> query(GenTableColumn genTableColumn);

    /**
     * 查询总数
     * @return Integer
     */
    Long queryTotalCount();


}