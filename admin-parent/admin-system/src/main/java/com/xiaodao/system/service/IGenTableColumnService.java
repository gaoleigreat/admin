package com.xiaodao.system.service;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.xiaodao.admin.entity.GenTableColumn;
import org.springframework.validation.annotation.Validated;

import java.util.List;
import java.util.Map;




/**
 * @description IGenTableColumn Service层
 * @author ¸ßÀÚ
 * @since jdk1.8
 */
@Validated
public interface IGenTableColumnService {

    /**
     * 新增
     * @param genTableColumn
     * @return int
     */
    int insert(@NotNull(message = "参数不能为空") GenTableColumn genTableColumn);

    /**
     * 带有空值判断的新增
     * @param genTableColumn
     * @return int
     */
    int insertSelective(@NotNull(message = "参数不能为空") GenTableColumn genTableColumn);


    /**
     * 批量插入
     * @param list
     * @return int
     */
    int batchInsert(@Size(min = 1, message = "参数不能为空") List<GenTableColumn> list);

    /**
     * 带有空值判断的批量插入
     * @param list
     * @return int
     */
    int batchInsertSelective(@Size(min = 1, message = "参数不能为空") List<GenTableColumn> list);

    /**
     * 根据主键更新
     * @param genTableColumn
     * @return int
     */
    int updateByPrimaryKey(@NotNull(message = "参数不能为空") GenTableColumn genTableColumn);

    /**
     * 带有空值判断的主键更新
     * @param genTableColumn
     * @return int
     */
    int updateSelectiveByPrimaryKey(@NotNull(message = "参数不能为空") GenTableColumn genTableColumn);

    /**
     * 批量更新
     * @param list
     * @return int
     */
    int batchUpdate(@Size(min = 1, message = "参数不能为空") List<GenTableColumn> list);

    /**
     * 带有空值判断的批量更新
     * @param list
     * @return int
     */
    int batchUpdateSelective(@Size(min = 1, message = "参数不能为空") List<GenTableColumn> list);


    /**
     * 更新插入
     * @param genTableColumn
     * @return int
     */
    int upsert(@NotNull(message = "参数不能为空") GenTableColumn genTableColumn);

    /**
     * 带有空值判断的更新插入
     * @param genTableColumn
     * @return int
     */
    int upsertSelective(@NotNull(message = "参数不能为空") GenTableColumn genTableColumn);

    /**
     * 批量更新插入
     * @param list
     * @return int
     */
    int batchUpsert(@Size(min = 1, message = "参数不能为空") List<GenTableColumn> list);

    /**
     * 带有空值判断的批量更新插入
     * @param list
     * @return int
     */
    int batchUpsertSelective(@Size(min = 1, message = "参数不能为空") List<GenTableColumn> list);


    /**
     * 通过主键删除
     * @param columnId
     * @return int
     */

    int deleteByPrimaryKey(@NotNull(message = "参数不能为空") Long columnId);

    /**
     * 通过主键批量删除
     * @param list
     * @return int
     */
    int deleteBatchByPrimaryKeys(@Size(min = 1, message = "参数不能为空") List<Long> list);

    /**
     * 条件删除
     * @param genTableColumn
     * @return int
     */
    int delete(@NotNull(message = "参数不能为空") GenTableColumn genTableColumn);

    /**
     * 通过主键查询
     * @param  columnId
     * @return GenTableColumn genTableColumn
     */
    GenTableColumn queryByPrimaryKey(@NotNull(message = "参数不能为空") Long columnId);

    /**
     * 通过主键批量查询
     * @param list
     * @return List<GenTableColumn>
     */
    List<GenTableColumn> queryBatchPrimaryKeys(@Size(min = 1, message = "参数不能为空") List<Long> list);

    /**
     * 条件查询一个
     * @param genTableColumn
     * @return List<GenTableColumn>
     */
    GenTableColumn queryOne(@NotNull(message = "参数不能为空") GenTableColumn genTableColumn);

    /**
     * 条件查询
     * @param genTableColumn
     * @return List<GenTableColumn>
     */
    List<GenTableColumn> queryByCondition(@NotNull(message = "参数不能为空") GenTableColumn genTableColumn);

    /**
     * 模糊查询
     * @param genTableColumn
     * @return List<GenTableColumn>
     */
    List<GenTableColumn> queryFuzzy(@NotNull(message = "参数不能为空") GenTableColumn genTableColumn);

    /**
     * 模糊条件查询
     * @param genTableColumn
     * @return List<GenTableColumn>
     */
    List<GenTableColumn> queryByLikeCondition(@NotNull(message = "参数不能为空") GenTableColumn genTableColumn);

    /**
     * 条件查询数量
     * @param genTableColumn
     * @return int
     */
    int queryCount(@NotNull(message = "参数不能为空") GenTableColumn genTableColumn);

    /**
     * 分组统计
     * @param genTableColumn
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroup(@NotNull(message = "参数不能为空") GenTableColumn genTableColumn);

    /**
     * 日统计
     * @param genTableColumn
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByDay(@NotNull(message = "参数不能为空") GenTableColumn genTableColumn);

    /**
     * 月统计
     * @param genTableColumn
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByMonth(@NotNull(message = "参数不能为空") GenTableColumn genTableColumn);

    /**
     * 年统计
     * @param genTableColumn
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByYear(@NotNull(message = "参数不能为空") GenTableColumn genTableColumn);


}