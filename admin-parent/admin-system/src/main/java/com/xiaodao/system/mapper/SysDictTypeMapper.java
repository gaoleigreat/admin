package com.xiaodao.system.mapper;


import org.apache.ibatis.annotations.Param;
import com.xiaodao.feign.system.entity.SysDictType;

import java.util.List;
import java.util.Map;
/**
 * @description SysDictTypeMapper
 * @authorxiaodao
 * @since jdk1.8
 */
public interface SysDictTypeMapper{

    /**
     * 新增
     * @param sysDictType
     * @return int
     */
    int insert(@Param("sysDictType") SysDictType sysDictType);

    /**
     * 带有空值判断的新增
     * @param sysDictType
     * @return int
     */
    int insertSelective(@Param("sysDictType") SysDictType sysDictType);

    /**
     * 批量插入
     * @param list
     * @return int
     */
    int batchInsert(@Param("list") List<SysDictType> list);

    /**
     * 带有空值判断的批量插入
     * @param list
     * @return int
     */
    int batchInsertSelective(@Param("list") List<SysDictType> list);

    /**
     * 根据主键更新
     * @param sysDictType
     * @return int
     */
    int updateByPrimaryKey(@Param("sysDictType") SysDictType sysDictType);

    /**
     * 带有空值判断的主键更新
     * @param sysDictType
     * @return int
     */
    int updateSelectiveByPrimaryKey(@Param("sysDictType") SysDictType sysDictType);

    /**
     * 批量更新
     * @param list
     * @return int
     */
    int batchUpdate(@Param("list") List<SysDictType> list);

    /**
     * 带有空值判断的批量更新
     * @param list
     * @return int
     */
    int batchUpdateSelective(@Param("list") List<SysDictType> list);

    /**
     * 更新插入
     * @param sysDictType
     * @return int
     */
    int upsert(@Param("sysDictType") SysDictType sysDictType);

    /**
     * 带有空值判断的更新插入
     * @param sysDictType
     * @return int
     */
    int upsertSelective(@Param("sysDictType") SysDictType sysDictType);

    /**
     * 批量更新插入
     * @param list
     * @return int
     */
    int batchUpsert(@Param("list") List<SysDictType> list);

    /**
     * 带有空值判断的批量更新插入
     * @param list
     * @return int
     */
    int batchUpsertSelective(@Param("list") List<SysDictType> list);

    /**
     * 通过主键删除
     * @param dictId
     * @return int
     */
    int deleteByPrimaryKey(@Param("sysDictType") Long dictId);

    /**
     * 通过主键批量删除
     * @param list
     * @return int
     */
    int deleteBatchByPrimaryKeys(@Param("list") List<Long> list);

    /**
     * 条件删除
     * @param sysDictType
     * @return int
     */
    int delete(@Param("sysDictType") SysDictType sysDictType);

    /**
     * 通过主键查询
     * @param dictId
     * @return SysDictType sysDictType
     */
     SysDictType queryByPrimaryKey(@Param("sysDictType") Long dictId);

    /**
     * 通过主键批量查询
     * @param list
     * @return List<SysDictType>
     */
    List<SysDictType> queryBatchPrimaryKeys(@Param("list") List<Long> list);

    /**
     * 条件查询一个
     * @param sysDictType
     * @return List<SysDictType>
     */
    SysDictType queryOne(@Param("sysDictType") SysDictType sysDictType);

    /**
     * 条件查询
     * @param sysDictType
     * @return List<SysDictType>
     */
    List<SysDictType> queryByCondition(@Param("sysDictType") SysDictType sysDictType);

    /**
     * 模糊查询
     * @param sysDictType
     * @return List<SysDictType>
     */
    List<SysDictType> queryFuzzy(@Param("sysDictType") SysDictType sysDictType);

    /**
     * 模糊条件查询
     * @param sysDictType
     * @return List<SysDictType>
     */
    List<SysDictType> queryByLikeCondition(@Param("sysDictType") SysDictType sysDictType);

    /**
     * 条件查询数量
     * @param sysDictType
     * @return int
     */
    int queryCount(@Param("sysDictType") SysDictType sysDictType);

    /**
     * 分组统计
     * @param sysDictType
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroup(@Param("sysDictType") SysDictType sysDictType);

    /**
     * 日统计
     * @param sysDictType
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByDay(@Param("sysDictType") SysDictType sysDictType);

    /**
     * 月统计
     * @param sysDictType
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByMonth(@Param("sysDictType") SysDictType sysDictType);

    /**
     * 年统计
     * @param sysDictType
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByYear(@Param("sysDictType") SysDictType sysDictType);



}