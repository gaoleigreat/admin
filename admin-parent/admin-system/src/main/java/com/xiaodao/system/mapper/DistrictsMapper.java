package com.xiaodao.system.mapper;


import org.apache.ibatis.annotations.Param;
import com.xiaodao.feign.system.entity.Districts;

import java.util.List;
import java.util.Map;
/**
 * @description DistrictsMapper
 * @authorxiaodao
 * @since jdk1.8
 */
public interface DistrictsMapper{

    /**
     * 新增
     * @param districts
     * @return int
     */
    int insert(@Param("districts") Districts districts);

    /**
     * 带有空值判断的新增
     * @param districts
     * @return int
     */
    int insertSelective(@Param("districts") Districts districts);

    /**
     * 批量插入
     * @param list
     * @return int
     */
    int batchInsert(@Param("list") List<Districts> list);

    /**
     * 带有空值判断的批量插入
     * @param list
     * @return int
     */
    int batchInsertSelective(@Param("list") List<Districts> list);

    /**
     * 根据主键更新
     * @param districts
     * @return int
     */
    int updateByPrimaryKey(@Param("districts") Districts districts);

    /**
     * 带有空值判断的主键更新
     * @param districts
     * @return int
     */
    int updateSelectiveByPrimaryKey(@Param("districts") Districts districts);

    /**
     * 批量更新
     * @param list
     * @return int
     */
    int batchUpdate(@Param("list") List<Districts> list);

    /**
     * 带有空值判断的批量更新
     * @param list
     * @return int
     */
    int batchUpdateSelective(@Param("list") List<Districts> list);

    /**
     * 更新插入
     * @param districts
     * @return int
     */
    int upsert(@Param("districts") Districts districts);

    /**
     * 带有空值判断的更新插入
     * @param districts
     * @return int
     */
    int upsertSelective(@Param("districts") Districts districts);

    /**
     * 批量更新插入
     * @param list
     * @return int
     */
    int batchUpsert(@Param("list") List<Districts> list);

    /**
     * 带有空值判断的批量更新插入
     * @param list
     * @return int
     */
    int batchUpsertSelective(@Param("list") List<Districts> list);

    /**
     * 通过主键删除
     * @param id
     * @return int
     */
    int deleteByPrimaryKey(@Param("districts") Integer id);

    /**
     * 通过主键批量删除
     * @param list
     * @return int
     */
    int deleteBatchByPrimaryKeys(@Param("list") List<Integer> list);

    /**
     * 条件删除
     * @param districts
     * @return int
     */
    int delete(@Param("districts") Districts districts);

    /**
     * 通过主键查询
     * @param id
     * @return Districts districts
     */
     Districts queryByPrimaryKey(@Param("districts") Integer id);

    /**
     * 通过主键批量查询
     * @param list
     * @return List<Districts>
     */
    List<Districts> queryBatchPrimaryKeys(@Param("list") List<Integer> list);

    /**
     * 条件查询一个
     * @param districts
     * @return List<Districts>
     */
    Districts queryOne(@Param("districts") Districts districts);

    /**
     * 条件查询
     * @param districts
     * @return List<Districts>
     */
    List<Districts> queryByCondition(@Param("districts") Districts districts);

    /**
     * 模糊查询
     * @param districts
     * @return List<Districts>
     */
    List<Districts> queryFuzzy(@Param("districts") Districts districts);

    /**
     * 模糊条件查询
     * @param districts
     * @return List<Districts>
     */
    List<Districts> queryByLikeCondition(@Param("districts") Districts districts);

    /**
     * 条件查询数量
     * @param districts
     * @return int
     */
    int queryCount(@Param("districts") Districts districts);

    /**
     * 分组统计
     * @param districts
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroup(@Param("districts") Districts districts);

    /**
     * 日统计
     * @param districts
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByDay(@Param("districts") Districts districts);

    /**
     * 月统计
     * @param districts
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByMonth(@Param("districts") Districts districts);

    /**
     * 年统计
     * @param districts
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByYear(@Param("districts") Districts districts);



}