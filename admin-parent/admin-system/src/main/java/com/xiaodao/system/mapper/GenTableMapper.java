package com.xiaodao.system.mapper;


import org.apache.ibatis.annotations.Param;
import com.xiaodao.admin.entity.GenTable;

import java.util.List;
import java.util.Map;
/**
 * @description GenTableMapper
 * @author¸ßÀÚ
 * @since jdk1.8
 */
public interface GenTableMapper{

    /**
     * 新增
     * @param genTable
     * @return int
     */
    int insert(@Param("genTable") GenTable genTable);

    /**
     * 带有空值判断的新增
     * @param genTable
     * @return int
     */
    int insertSelective(@Param("genTable") GenTable genTable);

    /**
     * 批量插入
     * @param list
     * @return int
     */
    int batchInsert(@Param("list") List<GenTable> list);

    /**
     * 带有空值判断的批量插入
     * @param list
     * @return int
     */
    int batchInsertSelective(@Param("list") List<GenTable> list);

    /**
     * 根据主键更新
     * @param genTable
     * @return int
     */
    int updateByPrimaryKey(@Param("genTable") GenTable genTable);

    /**
     * 带有空值判断的主键更新
     * @param genTable
     * @return int
     */
    int updateSelectiveByPrimaryKey(@Param("genTable") GenTable genTable);

    /**
     * 批量更新
     * @param list
     * @return int
     */
    int batchUpdate(@Param("list") List<GenTable> list);

    /**
     * 带有空值判断的批量更新
     * @param list
     * @return int
     */
    int batchUpdateSelective(@Param("list") List<GenTable> list);

    /**
     * 更新插入
     * @param genTable
     * @return int
     */
    int upsert(@Param("genTable") GenTable genTable);

    /**
     * 带有空值判断的更新插入
     * @param genTable
     * @return int
     */
    int upsertSelective(@Param("genTable") GenTable genTable);

    /**
     * 批量更新插入
     * @param list
     * @return int
     */
    int batchUpsert(@Param("list") List<GenTable> list);

    /**
     * 带有空值判断的批量更新插入
     * @param list
     * @return int
     */
    int batchUpsertSelective(@Param("list") List<GenTable> list);

    /**
     * 通过主键删除
     * @param tableId
     * @return int
     */
    int deleteByPrimaryKey(@Param("genTable") Long tableId);

    /**
     * 通过主键批量删除
     * @param list
     * @return int
     */
    int deleteBatchByPrimaryKeys(@Param("list") List<Long> list);

    /**
     * 条件删除
     * @param genTable
     * @return int
     */
    int delete(@Param("genTable") GenTable genTable);

    /**
     * 通过主键查询
     * @param tableId
     * @return GenTable genTable
     */
     GenTable queryByPrimaryKey(@Param("genTable") Long tableId);

    /**
     * 通过主键批量查询
     * @param list
     * @return List<GenTable>
     */
    List<GenTable> queryBatchPrimaryKeys(@Param("list") List<Long> list);

    /**
     * 条件查询一个
     * @param genTable
     * @return List<GenTable>
     */
    GenTable queryOne(@Param("genTable") GenTable genTable);

    /**
     * 条件查询
     * @param genTable
     * @return List<GenTable>
     */
    List<GenTable> queryByCondition(@Param("genTable") GenTable genTable);

    /**
     * 模糊查询
     * @param genTable
     * @return List<GenTable>
     */
    List<GenTable> queryFuzzy(@Param("genTable") GenTable genTable);

    /**
     * 模糊条件查询
     * @param genTable
     * @return List<GenTable>
     */
    List<GenTable> queryByLikeCondition(@Param("genTable") GenTable genTable);

    /**
     * 条件查询数量
     * @param genTable
     * @return int
     */
    int queryCount(@Param("genTable") GenTable genTable);

    /**
     * 分组统计
     * @param genTable
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroup(@Param("genTable") GenTable genTable);

    /**
     * 日统计
     * @param genTable
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByDay(@Param("genTable") GenTable genTable);

    /**
     * 月统计
     * @param genTable
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByMonth(@Param("genTable") GenTable genTable);

    /**
     * 年统计
     * @param genTable
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByYear(@Param("genTable") GenTable genTable);



}