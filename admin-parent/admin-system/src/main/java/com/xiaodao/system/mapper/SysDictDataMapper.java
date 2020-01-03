package com.xiaodao.system.mapper;


import org.apache.ibatis.annotations.Param;
import com.xiaodao.admin.entity.SysDictData;

import java.util.List;
import java.util.Map;
/**
 * @description SysDictDataMapper
 * @author¸ßÀÚ
 * @since jdk1.8
 */
public interface SysDictDataMapper{

    /**
     * 新增
     * @param sysDictData
     * @return int
     */
    int insert(@Param("sysDictData") SysDictData sysDictData);

    /**
     * 带有空值判断的新增
     * @param sysDictData
     * @return int
     */
    int insertSelective(@Param("sysDictData") SysDictData sysDictData);

    /**
     * 批量插入
     * @param list
     * @return int
     */
    int batchInsert(@Param("list") List<SysDictData> list);

    /**
     * 带有空值判断的批量插入
     * @param list
     * @return int
     */
    int batchInsertSelective(@Param("list") List<SysDictData> list);

    /**
     * 根据主键更新
     * @param sysDictData
     * @return int
     */
    int updateByPrimaryKey(@Param("sysDictData") SysDictData sysDictData);

    /**
     * 带有空值判断的主键更新
     * @param sysDictData
     * @return int
     */
    int updateSelectiveByPrimaryKey(@Param("sysDictData") SysDictData sysDictData);

    /**
     * 批量更新
     * @param list
     * @return int
     */
    int batchUpdate(@Param("list") List<SysDictData> list);

    /**
     * 带有空值判断的批量更新
     * @param list
     * @return int
     */
    int batchUpdateSelective(@Param("list") List<SysDictData> list);

    /**
     * 更新插入
     * @param sysDictData
     * @return int
     */
    int upsert(@Param("sysDictData") SysDictData sysDictData);

    /**
     * 带有空值判断的更新插入
     * @param sysDictData
     * @return int
     */
    int upsertSelective(@Param("sysDictData") SysDictData sysDictData);

    /**
     * 批量更新插入
     * @param list
     * @return int
     */
    int batchUpsert(@Param("list") List<SysDictData> list);

    /**
     * 带有空值判断的批量更新插入
     * @param list
     * @return int
     */
    int batchUpsertSelective(@Param("list") List<SysDictData> list);

    /**
     * 通过主键删除
     * @param dictCode
     * @return int
     */
    int deleteByPrimaryKey(@Param("sysDictData") Integer dictCode);

    /**
     * 通过主键批量删除
     * @param list
     * @return int
     */
    int deleteBatchByPrimaryKeys(@Param("list") List<Integer> list);

    /**
     * 条件删除
     * @param sysDictData
     * @return int
     */
    int delete(@Param("sysDictData") SysDictData sysDictData);

    /**
     * 通过主键查询
     * @param dictCode
     * @return SysDictData sysDictData
     */
     SysDictData queryByPrimaryKey(@Param("sysDictData") Integer dictCode);

    /**
     * 通过主键批量查询
     * @param list
     * @return List<SysDictData>
     */
    List<SysDictData> queryBatchPrimaryKeys(@Param("list") List<Integer> list);

    /**
     * 条件查询一个
     * @param sysDictData
     * @return List<SysDictData>
     */
    SysDictData queryOne(@Param("sysDictData") SysDictData sysDictData);

    /**
     * 条件查询
     * @param sysDictData
     * @return List<SysDictData>
     */
    List<SysDictData> queryByCondition(@Param("sysDictData") SysDictData sysDictData);

    /**
     * 模糊查询
     * @param sysDictData
     * @return List<SysDictData>
     */
    List<SysDictData> queryFuzzy(@Param("sysDictData") SysDictData sysDictData);

    /**
     * 模糊条件查询
     * @param sysDictData
     * @return List<SysDictData>
     */
    List<SysDictData> queryByLikeCondition(@Param("sysDictData") SysDictData sysDictData);

    /**
     * 条件查询数量
     * @param sysDictData
     * @return int
     */
    int queryCount(@Param("sysDictData") SysDictData sysDictData);

    /**
     * 分组统计
     * @param sysDictData
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroup(@Param("sysDictData") SysDictData sysDictData);

    /**
     * 日统计
     * @param sysDictData
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByDay(@Param("sysDictData") SysDictData sysDictData);

    /**
     * 月统计
     * @param sysDictData
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByMonth(@Param("sysDictData") SysDictData sysDictData);

    /**
     * 年统计
     * @param sysDictData
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByYear(@Param("sysDictData") SysDictData sysDictData);



}