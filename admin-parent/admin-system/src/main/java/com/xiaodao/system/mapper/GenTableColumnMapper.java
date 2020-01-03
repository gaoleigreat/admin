package com.xiaodao.system.mapper;


import org.apache.ibatis.annotations.Param;
import com.xiaodao.admin.entity.GenTableColumn;

import java.util.List;
import java.util.Map;
/**
 * @description GenTableColumnMapper
 * @author¸ßÀÚ
 * @since jdk1.8
 */
public interface GenTableColumnMapper{

    /**
     * 新增
     * @param genTableColumn
     * @return int
     */
    int insert(@Param("genTableColumn") GenTableColumn genTableColumn);

    /**
     * 带有空值判断的新增
     * @param genTableColumn
     * @return int
     */
    int insertSelective(@Param("genTableColumn") GenTableColumn genTableColumn);

    /**
     * 批量插入
     * @param list
     * @return int
     */
    int batchInsert(@Param("list") List<GenTableColumn> list);

    /**
     * 带有空值判断的批量插入
     * @param list
     * @return int
     */
    int batchInsertSelective(@Param("list") List<GenTableColumn> list);

    /**
     * 根据主键更新
     * @param genTableColumn
     * @return int
     */
    int updateByPrimaryKey(@Param("genTableColumn") GenTableColumn genTableColumn);

    /**
     * 带有空值判断的主键更新
     * @param genTableColumn
     * @return int
     */
    int updateSelectiveByPrimaryKey(@Param("genTableColumn") GenTableColumn genTableColumn);

    /**
     * 批量更新
     * @param list
     * @return int
     */
    int batchUpdate(@Param("list") List<GenTableColumn> list);

    /**
     * 带有空值判断的批量更新
     * @param list
     * @return int
     */
    int batchUpdateSelective(@Param("list") List<GenTableColumn> list);

    /**
     * 更新插入
     * @param genTableColumn
     * @return int
     */
    int upsert(@Param("genTableColumn") GenTableColumn genTableColumn);

    /**
     * 带有空值判断的更新插入
     * @param genTableColumn
     * @return int
     */
    int upsertSelective(@Param("genTableColumn") GenTableColumn genTableColumn);

    /**
     * 批量更新插入
     * @param list
     * @return int
     */
    int batchUpsert(@Param("list") List<GenTableColumn> list);

    /**
     * 带有空值判断的批量更新插入
     * @param list
     * @return int
     */
    int batchUpsertSelective(@Param("list") List<GenTableColumn> list);

    /**
     * 通过主键删除
     * @param columnId
     * @return int
     */
    int deleteByPrimaryKey(@Param("genTableColumn") Long columnId);

    /**
     * 通过主键批量删除
     * @param list
     * @return int
     */
    int deleteBatchByPrimaryKeys(@Param("list") List<Long> list);

    /**
     * 条件删除
     * @param genTableColumn
     * @return int
     */
    int delete(@Param("genTableColumn") GenTableColumn genTableColumn);

    /**
     * 通过主键查询
     * @param columnId
     * @return GenTableColumn genTableColumn
     */
     GenTableColumn queryByPrimaryKey(@Param("genTableColumn") Long columnId);

    /**
     * 通过主键批量查询
     * @param list
     * @return List<GenTableColumn>
     */
    List<GenTableColumn> queryBatchPrimaryKeys(@Param("list") List<Long> list);

    /**
     * 条件查询一个
     * @param genTableColumn
     * @return List<GenTableColumn>
     */
    GenTableColumn queryOne(@Param("genTableColumn") GenTableColumn genTableColumn);

    /**
     * 条件查询
     * @param genTableColumn
     * @return List<GenTableColumn>
     */
    List<GenTableColumn> queryByCondition(@Param("genTableColumn") GenTableColumn genTableColumn);

    /**
     * 模糊查询
     * @param genTableColumn
     * @return List<GenTableColumn>
     */
    List<GenTableColumn> queryFuzzy(@Param("genTableColumn") GenTableColumn genTableColumn);

    /**
     * 模糊条件查询
     * @param genTableColumn
     * @return List<GenTableColumn>
     */
    List<GenTableColumn> queryByLikeCondition(@Param("genTableColumn") GenTableColumn genTableColumn);

    /**
     * 条件查询数量
     * @param genTableColumn
     * @return int
     */
    int queryCount(@Param("genTableColumn") GenTableColumn genTableColumn);

    /**
     * 分组统计
     * @param genTableColumn
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroup(@Param("genTableColumn") GenTableColumn genTableColumn);

    /**
     * 日统计
     * @param genTableColumn
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByDay(@Param("genTableColumn") GenTableColumn genTableColumn);

    /**
     * 月统计
     * @param genTableColumn
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByMonth(@Param("genTableColumn") GenTableColumn genTableColumn);

    /**
     * 年统计
     * @param genTableColumn
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByYear(@Param("genTableColumn") GenTableColumn genTableColumn);



}