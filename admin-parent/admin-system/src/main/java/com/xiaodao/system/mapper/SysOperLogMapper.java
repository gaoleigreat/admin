package com.xiaodao.system.mapper;


import org.apache.ibatis.annotations.Param;
import com.xiaodao.feign.system.entity.SysOperLog;

import java.util.List;
import java.util.Map;
/**
 * @description SysOperLogMapper
 * @author¸ßÀÚ
 * @since jdk1.8
 */
public interface SysOperLogMapper{

    /**
     * 新增
     * @param sysOperLog
     * @return int
     */
    int insert(@Param("sysOperLog") SysOperLog sysOperLog);

    /**
     * 带有空值判断的新增
     * @param sysOperLog
     * @return int
     */
    int insertSelective(@Param("sysOperLog") SysOperLog sysOperLog);

    /**
     * 批量插入
     * @param list
     * @return int
     */
    int batchInsert(@Param("list") List<SysOperLog> list);

    /**
     * 带有空值判断的批量插入
     * @param list
     * @return int
     */
    int batchInsertSelective(@Param("list") List<SysOperLog> list);

    /**
     * 根据主键更新
     * @param sysOperLog
     * @return int
     */
    int updateByPrimaryKey(@Param("sysOperLog") SysOperLog sysOperLog);

    /**
     * 带有空值判断的主键更新
     * @param sysOperLog
     * @return int
     */
    int updateSelectiveByPrimaryKey(@Param("sysOperLog") SysOperLog sysOperLog);

    /**
     * 批量更新
     * @param list
     * @return int
     */
    int batchUpdate(@Param("list") List<SysOperLog> list);

    /**
     * 带有空值判断的批量更新
     * @param list
     * @return int
     */
    int batchUpdateSelective(@Param("list") List<SysOperLog> list);

    /**
     * 更新插入
     * @param sysOperLog
     * @return int
     */
    int upsert(@Param("sysOperLog") SysOperLog sysOperLog);

    /**
     * 带有空值判断的更新插入
     * @param sysOperLog
     * @return int
     */
    int upsertSelective(@Param("sysOperLog") SysOperLog sysOperLog);

    /**
     * 批量更新插入
     * @param list
     * @return int
     */
    int batchUpsert(@Param("list") List<SysOperLog> list);

    /**
     * 带有空值判断的批量更新插入
     * @param list
     * @return int
     */
    int batchUpsertSelective(@Param("list") List<SysOperLog> list);

    /**
     * 通过主键删除
     * @param operId
     * @return int
     */
    int deleteByPrimaryKey(@Param("sysOperLog") Long operId);

    /**
     * 通过主键批量删除
     * @param list
     * @return int
     */
    int deleteBatchByPrimaryKeys(@Param("list") List<Long> list);

    /**
     * 条件删除
     * @param sysOperLog
     * @return int
     */
    int delete(@Param("sysOperLog") SysOperLog sysOperLog);

    /**
     * 通过主键查询
     * @param operId
     * @return SysOperLog sysOperLog
     */
     SysOperLog queryByPrimaryKey(@Param("sysOperLog") Long operId);

    /**
     * 通过主键批量查询
     * @param list
     * @return List<SysOperLog>
     */
    List<SysOperLog> queryBatchPrimaryKeys(@Param("list") List<Long> list);

    /**
     * 条件查询一个
     * @param sysOperLog
     * @return List<SysOperLog>
     */
    SysOperLog queryOne(@Param("sysOperLog") SysOperLog sysOperLog);

    /**
     * 条件查询
     * @param sysOperLog
     * @return List<SysOperLog>
     */
    List<SysOperLog> queryByCondition(@Param("sysOperLog") SysOperLog sysOperLog);

    /**
     * 模糊查询
     * @param sysOperLog
     * @return List<SysOperLog>
     */
    List<SysOperLog> queryFuzzy(@Param("sysOperLog") SysOperLog sysOperLog);

    /**
     * 模糊条件查询
     * @param sysOperLog
     * @return List<SysOperLog>
     */
    List<SysOperLog> queryByLikeCondition(@Param("sysOperLog") SysOperLog sysOperLog);

    /**
     * 条件查询数量
     * @param sysOperLog
     * @return int
     */
    int queryCount(@Param("sysOperLog") SysOperLog sysOperLog);

    /**
     * 分组统计
     * @param sysOperLog
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroup(@Param("sysOperLog") SysOperLog sysOperLog);

    /**
     * 日统计
     * @param sysOperLog
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByDay(@Param("sysOperLog") SysOperLog sysOperLog);

    /**
     * 月统计
     * @param sysOperLog
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByMonth(@Param("sysOperLog") SysOperLog sysOperLog);

    /**
     * 年统计
     * @param sysOperLog
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByYear(@Param("sysOperLog") SysOperLog sysOperLog);



}