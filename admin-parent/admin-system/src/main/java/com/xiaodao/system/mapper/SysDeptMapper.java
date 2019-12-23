package com.xiaodao.system.mapper;


import org.apache.ibatis.annotations.Param;
import com.xiaodao.feign.system.entity.SysDept;

import java.util.List;
import java.util.Map;
/**
 * @description SysDeptMapper
 * @author¸ßÀÚ
 * @since jdk1.8
 */
public interface SysDeptMapper{

    /**
     * 新增
     * @param sysDept
     * @return int
     */
    int insert(@Param("sysDept") SysDept sysDept);

    /**
     * 带有空值判断的新增
     * @param sysDept
     * @return int
     */
    int insertSelective(@Param("sysDept") SysDept sysDept);

    /**
     * 批量插入
     * @param list
     * @return int
     */
    int batchInsert(@Param("list") List<SysDept> list);

    /**
     * 带有空值判断的批量插入
     * @param list
     * @return int
     */
    int batchInsertSelective(@Param("list") List<SysDept> list);

    /**
     * 根据主键更新
     * @param sysDept
     * @return int
     */
    int updateByPrimaryKey(@Param("sysDept") SysDept sysDept);

    /**
     * 带有空值判断的主键更新
     * @param sysDept
     * @return int
     */
    int updateSelectiveByPrimaryKey(@Param("sysDept") SysDept sysDept);

    /**
     * 批量更新
     * @param list
     * @return int
     */
    int batchUpdate(@Param("list") List<SysDept> list);

    /**
     * 带有空值判断的批量更新
     * @param list
     * @return int
     */
    int batchUpdateSelective(@Param("list") List<SysDept> list);

    /**
     * 更新插入
     * @param sysDept
     * @return int
     */
    int upsert(@Param("sysDept") SysDept sysDept);

    /**
     * 带有空值判断的更新插入
     * @param sysDept
     * @return int
     */
    int upsertSelective(@Param("sysDept") SysDept sysDept);

    /**
     * 批量更新插入
     * @param list
     * @return int
     */
    int batchUpsert(@Param("list") List<SysDept> list);

    /**
     * 带有空值判断的批量更新插入
     * @param list
     * @return int
     */
    int batchUpsertSelective(@Param("list") List<SysDept> list);

    /**
     * 通过主键删除
     * @param deptId
     * @return int
     */
    int deleteByPrimaryKey(@Param("sysDept") Long deptId);

    /**
     * 通过主键批量删除
     * @param list
     * @return int
     */
    int deleteBatchByPrimaryKeys(@Param("list") List<Long> list);

    /**
     * 条件删除
     * @param sysDept
     * @return int
     */
    int delete(@Param("sysDept") SysDept sysDept);

    /**
     * 通过主键查询
     * @param deptId
     * @return SysDept sysDept
     */
     SysDept queryByPrimaryKey(@Param("sysDept") Long deptId);

    /**
     * 通过主键批量查询
     * @param list
     * @return List<SysDept>
     */
    List<SysDept> queryBatchPrimaryKeys(@Param("list") List<Long> list);

    /**
     * 条件查询一个
     * @param sysDept
     * @return List<SysDept>
     */
    SysDept queryOne(@Param("sysDept") SysDept sysDept);

    /**
     * 条件查询
     * @param sysDept
     * @return List<SysDept>
     */
    List<SysDept> queryByCondition(@Param("sysDept") SysDept sysDept);

    /**
     * 模糊查询
     * @param sysDept
     * @return List<SysDept>
     */
    List<SysDept> queryFuzzy(@Param("sysDept") SysDept sysDept);

    /**
     * 模糊条件查询
     * @param sysDept
     * @return List<SysDept>
     */
    List<SysDept> queryByLikeCondition(@Param("sysDept") SysDept sysDept);

    /**
     * 条件查询数量
     * @param sysDept
     * @return int
     */
    int queryCount(@Param("sysDept") SysDept sysDept);

    /**
     * 分组统计
     * @param sysDept
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroup(@Param("sysDept") SysDept sysDept);

    /**
     * 日统计
     * @param sysDept
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByDay(@Param("sysDept") SysDept sysDept);

    /**
     * 月统计
     * @param sysDept
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByMonth(@Param("sysDept") SysDept sysDept);

    /**
     * 年统计
     * @param sysDept
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByYear(@Param("sysDept") SysDept sysDept);



}