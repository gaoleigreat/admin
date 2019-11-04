package com.xiaodao.system.service;

import java.util.List;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.apache.ibatis.annotations.Param;
import javax.validation.constraints.NotNull;
import com.xiaodao.system.entity.GenTable;


/**
 * @description IGenTable Service层
 * @author ¸ßÀÚ
 * @since jdk1.8
 */
public interface IGenTableService {



    /**
     * 创建GenTable
     *
     * @param genTable
     * @return
     */
    Integer insert(@NotNull(message = "添加失败，参数不能为空") GenTable genTable);


    /**
     * 根据主键删除
     *
     * @param tableId
     * @return
     */
    Integer deleteByPrimaryKey(@NotNull(message = "删除失败，参数不能为空") Long tableId);

    /**
     * 修改GenTable
     *
     * @param genTable
     * @return
    */
    Integer updateByPrimaryKey(@NotNull(message = "添加失败，参数不能为空") GenTable genTable);


    /**
    * 根据主键查询
    *
    * @param tableId
    * @return
    */
    GenTable selectByPrimaryKey(@NotNull(message = "查询失败，参数不能为空") Long tableId);


    /**
     * 分页查询
     * @param pageIndex
     * @param pageSize
     * @param genTable GenTable
     * @return IPage<GenTable>
     */
    IPage<GenTable> queryPage(int pageIndex, int pageSize, GenTable genTable);

    /**
    * 批量插入
    * @param list List<GenTable
    * @return Integer
    */
    Integer batchInsert(List<GenTable> list);

    /**
     * 批量更新
     * @param list List<GenTable>
     * @return Integer
     */
    Integer batchUpdate(List<GenTable> list);

    /**
     * 批量删除
     * @param list List<Long >
     * @return Integer
     */
    Integer deleteBatchIds(List<Long> list);

    /**
     * 存在即更新
     * @param genTable GenTable
     * @return Integer
     */
    Integer upsert(@Param("genTable") GenTable genTable);

    /**
     * 存在即更新，可选择具体属性
     * @param genTable GenTable
     * @return Integer
     */
    Integer upsertSelective(GenTable genTable);

    /**
     * 条件查询
     * @param genTable GenTable
     * @return List<GenTable>
    */
    List<GenTable> query(GenTable genTable);

    /**
     * 查询总数
     * @return Integer
     */
    Long queryTotalCount();


}