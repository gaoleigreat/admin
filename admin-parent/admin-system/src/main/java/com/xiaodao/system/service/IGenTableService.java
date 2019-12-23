package com.xiaodao.system.service;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.xiaodao.feign.system.entity.GenTable;
import org.springframework.validation.annotation.Validated;

import java.util.List;
import java.util.Map;




/**
 * @description IGenTable Service层
 * @author ¸ßÀÚ
 * @since jdk1.8
 */
@Validated
public interface IGenTableService {

    /**
     * 新增
     * @param genTable
     * @return int
     */
    int insert(@NotNull(message = "参数不能为空") GenTable genTable);

    /**
     * 带有空值判断的新增
     * @param genTable
     * @return int
     */
    int insertSelective(@NotNull(message = "参数不能为空") GenTable genTable);


    /**
     * 批量插入
     * @param list
     * @return int
     */
    int batchInsert(@Size(min = 1, message = "参数不能为空") List<GenTable> list);

    /**
     * 带有空值判断的批量插入
     * @param list
     * @return int
     */
    int batchInsertSelective(@Size(min = 1, message = "参数不能为空") List<GenTable> list);

    /**
     * 根据主键更新
     * @param genTable
     * @return int
     */
    int updateByPrimaryKey(@NotNull(message = "参数不能为空") GenTable genTable);

    /**
     * 带有空值判断的主键更新
     * @param genTable
     * @return int
     */
    int updateSelectiveByPrimaryKey(@NotNull(message = "参数不能为空") GenTable genTable);

    /**
     * 批量更新
     * @param list
     * @return int
     */
    int batchUpdate(@Size(min = 1, message = "参数不能为空") List<GenTable> list);

    /**
     * 带有空值判断的批量更新
     * @param list
     * @return int
     */
    int batchUpdateSelective(@Size(min = 1, message = "参数不能为空") List<GenTable> list);


    /**
     * 更新插入
     * @param genTable
     * @return int
     */
    int upsert(@NotNull(message = "参数不能为空") GenTable genTable);

    /**
     * 带有空值判断的更新插入
     * @param genTable
     * @return int
     */
    int upsertSelective(@NotNull(message = "参数不能为空") GenTable genTable);

    /**
     * 批量更新插入
     * @param list
     * @return int
     */
    int batchUpsert(@Size(min = 1, message = "参数不能为空") List<GenTable> list);

    /**
     * 带有空值判断的批量更新插入
     * @param list
     * @return int
     */
    int batchUpsertSelective(@Size(min = 1, message = "参数不能为空") List<GenTable> list);


    /**
     * 通过主键删除
     * @param tableId
     * @return int
     */

    int deleteByPrimaryKey(@NotNull(message = "参数不能为空") Long tableId);

    /**
     * 通过主键批量删除
     * @param list
     * @return int
     */
    int deleteBatchByPrimaryKeys(@Size(min = 1, message = "参数不能为空") List<Long> list);

    /**
     * 条件删除
     * @param genTable
     * @return int
     */
    int delete(@NotNull(message = "参数不能为空") GenTable genTable);

    /**
     * 通过主键查询
     * @param  tableId
     * @return GenTable genTable
     */
    GenTable queryByPrimaryKey(@NotNull(message = "参数不能为空") Long tableId);

    /**
     * 通过主键批量查询
     * @param list
     * @return List<GenTable>
     */
    List<GenTable> queryBatchPrimaryKeys(@Size(min = 1, message = "参数不能为空") List<Long> list);

    /**
     * 条件查询一个
     * @param genTable
     * @return List<GenTable>
     */
    GenTable queryOne(@NotNull(message = "参数不能为空") GenTable genTable);

    /**
     * 条件查询
     * @param genTable
     * @return List<GenTable>
     */
    List<GenTable> queryByCondition(@NotNull(message = "参数不能为空") GenTable genTable);

    /**
     * 模糊查询
     * @param genTable
     * @return List<GenTable>
     */
    List<GenTable> queryFuzzy(@NotNull(message = "参数不能为空") GenTable genTable);

    /**
     * 模糊条件查询
     * @param genTable
     * @return List<GenTable>
     */
    List<GenTable> queryByLikeCondition(@NotNull(message = "参数不能为空") GenTable genTable);

    /**
     * 条件查询数量
     * @param genTable
     * @return int
     */
    int queryCount(@NotNull(message = "参数不能为空") GenTable genTable);

    /**
     * 分组统计
     * @param genTable
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroup(@NotNull(message = "参数不能为空") GenTable genTable);

    /**
     * 日统计
     * @param genTable
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByDay(@NotNull(message = "参数不能为空") GenTable genTable);

    /**
     * 月统计
     * @param genTable
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByMonth(@NotNull(message = "参数不能为空") GenTable genTable);

    /**
     * 年统计
     * @param genTable
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByYear(@NotNull(message = "参数不能为空") GenTable genTable);


}