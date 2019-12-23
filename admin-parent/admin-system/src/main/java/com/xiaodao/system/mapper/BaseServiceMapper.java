package com.xiaodao.system.mapper;


import org.apache.ibatis.annotations.Param;
import com.xiaodao.feign.system.entity.BaseService;

import java.util.List;
import java.util.Map;
/**
 * @description BaseServiceMapper
 * @authorxiaodao
 * @since jdk1.8
 */
public interface BaseServiceMapper{

    /**
     * 新增
     * @param baseService
     * @return int
     */
    int insert(@Param("baseService") BaseService baseService);

    /**
     * 带有空值判断的新增
     * @param baseService
     * @return int
     */
    int insertSelective(@Param("baseService") BaseService baseService);

    /**
     * 批量插入
     * @param list
     * @return int
     */
    int batchInsert(@Param("list") List<BaseService> list);

    /**
     * 带有空值判断的批量插入
     * @param list
     * @return int
     */
    int batchInsertSelective(@Param("list") List<BaseService> list);

    /**
     * 根据主键更新
     * @param baseService
     * @return int
     */
    int updateByPrimaryKey(@Param("baseService") BaseService baseService);

    /**
     * 带有空值判断的主键更新
     * @param baseService
     * @return int
     */
    int updateSelectiveByPrimaryKey(@Param("baseService") BaseService baseService);

    /**
     * 批量更新
     * @param list
     * @return int
     */
    int batchUpdate(@Param("list") List<BaseService> list);

    /**
     * 带有空值判断的批量更新
     * @param list
     * @return int
     */
    int batchUpdateSelective(@Param("list") List<BaseService> list);

    /**
     * 更新插入
     * @param baseService
     * @return int
     */
    int upsert(@Param("baseService") BaseService baseService);

    /**
     * 带有空值判断的更新插入
     * @param baseService
     * @return int
     */
    int upsertSelective(@Param("baseService") BaseService baseService);

    /**
     * 批量更新插入
     * @param list
     * @return int
     */
    int batchUpsert(@Param("list") List<BaseService> list);

    /**
     * 带有空值判断的批量更新插入
     * @param list
     * @return int
     */
    int batchUpsertSelective(@Param("list") List<BaseService> list);

    /**
     * 通过主键删除
     * @param serviceId
     * @return int
     */
    int deleteByPrimaryKey(@Param("baseService") Long serviceId);

    /**
     * 通过主键批量删除
     * @param list
     * @return int
     */
    int deleteBatchByPrimaryKeys(@Param("list") List<Long> list);

    /**
     * 条件删除
     * @param baseService
     * @return int
     */
    int delete(@Param("baseService") BaseService baseService);

    /**
     * 通过主键查询
     * @param serviceId
     * @return BaseService baseService
     */
     BaseService queryByPrimaryKey(@Param("baseService") Long serviceId);

    /**
     * 通过主键批量查询
     * @param list
     * @return List<BaseService>
     */
    List<BaseService> queryBatchPrimaryKeys(@Param("list") List<Long> list);

    /**
     * 条件查询一个
     * @param baseService
     * @return List<BaseService>
     */
    BaseService queryOne(@Param("baseService") BaseService baseService);

    /**
     * 条件查询
     * @param baseService
     * @return List<BaseService>
     */
    List<BaseService> queryByCondition(@Param("baseService") BaseService baseService);

    /**
     * 模糊查询
     * @param baseService
     * @return List<BaseService>
     */
    List<BaseService> queryFuzzy(@Param("baseService") BaseService baseService);

    /**
     * 模糊条件查询
     * @param baseService
     * @return List<BaseService>
     */
    List<BaseService> queryByLikeCondition(@Param("baseService") BaseService baseService);

    /**
     * 条件查询数量
     * @param baseService
     * @return int
     */
    int queryCount(@Param("baseService") BaseService baseService);

    /**
     * 分组统计
     * @param baseService
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroup(@Param("baseService") BaseService baseService);

    /**
     * 日统计
     * @param baseService
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByDay(@Param("baseService") BaseService baseService);

    /**
     * 月统计
     * @param baseService
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByMonth(@Param("baseService") BaseService baseService);

    /**
     * 年统计
     * @param baseService
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByYear(@Param("baseService") BaseService baseService);



}