package com.xiaodao.system.mapper;


import org.apache.ibatis.annotations.Param;
import com.xiaodao.admin.entity.SysConfig;

import java.util.List;
import java.util.Map;
/**
 * @description SysConfigMapper
 * @author¸ßÀÚ
 * @since jdk1.8
 */
public interface SysConfigMapper{

    /**
     * 新增
     * @param sysConfig
     * @return int
     */
    int insert(@Param("sysConfig") SysConfig sysConfig);

    /**
     * 带有空值判断的新增
     * @param sysConfig
     * @return int
     */
    int insertSelective(@Param("sysConfig") SysConfig sysConfig);

    /**
     * 批量插入
     * @param list
     * @return int
     */
    int batchInsert(@Param("list") List<SysConfig> list);

    /**
     * 带有空值判断的批量插入
     * @param list
     * @return int
     */
    int batchInsertSelective(@Param("list") List<SysConfig> list);

    /**
     * 根据主键更新
     * @param sysConfig
     * @return int
     */
    int updateByPrimaryKey(@Param("sysConfig") SysConfig sysConfig);

    /**
     * 带有空值判断的主键更新
     * @param sysConfig
     * @return int
     */
    int updateSelectiveByPrimaryKey(@Param("sysConfig") SysConfig sysConfig);

    /**
     * 批量更新
     * @param list
     * @return int
     */
    int batchUpdate(@Param("list") List<SysConfig> list);

    /**
     * 带有空值判断的批量更新
     * @param list
     * @return int
     */
    int batchUpdateSelective(@Param("list") List<SysConfig> list);

    /**
     * 更新插入
     * @param sysConfig
     * @return int
     */
    int upsert(@Param("sysConfig") SysConfig sysConfig);

    /**
     * 带有空值判断的更新插入
     * @param sysConfig
     * @return int
     */
    int upsertSelective(@Param("sysConfig") SysConfig sysConfig);

    /**
     * 批量更新插入
     * @param list
     * @return int
     */
    int batchUpsert(@Param("list") List<SysConfig> list);

    /**
     * 带有空值判断的批量更新插入
     * @param list
     * @return int
     */
    int batchUpsertSelective(@Param("list") List<SysConfig> list);

    /**
     * 通过主键删除
     * @param configId
     * @return int
     */
    int deleteByPrimaryKey(@Param("sysConfig") Long configId);

    /**
     * 通过主键批量删除
     * @param list
     * @return int
     */
    int deleteBatchByPrimaryKeys(@Param("list") List<Long> list);

    /**
     * 条件删除
     * @param sysConfig
     * @return int
     */
    int delete(@Param("sysConfig") SysConfig sysConfig);

    /**
     * 通过主键查询
     * @param configId
     * @return SysConfig sysConfig
     */
     SysConfig queryByPrimaryKey(@Param("sysConfig") Long configId);

    /**
     * 通过主键批量查询
     * @param list
     * @return List<SysConfig>
     */
    List<SysConfig> queryBatchPrimaryKeys(@Param("list") List<Long> list);

    /**
     * 条件查询一个
     * @param sysConfig
     * @return List<SysConfig>
     */
    SysConfig queryOne(@Param("sysConfig") SysConfig sysConfig);

    /**
     * 条件查询
     * @param sysConfig
     * @return List<SysConfig>
     */
    List<SysConfig> queryByCondition(@Param("sysConfig") SysConfig sysConfig);

    /**
     * 模糊查询
     * @param sysConfig
     * @return List<SysConfig>
     */
    List<SysConfig> queryFuzzy(@Param("sysConfig") SysConfig sysConfig);

    /**
     * 模糊条件查询
     * @param sysConfig
     * @return List<SysConfig>
     */
    List<SysConfig> queryByLikeCondition(@Param("sysConfig") SysConfig sysConfig);

    /**
     * 条件查询数量
     * @param sysConfig
     * @return int
     */
    int queryCount(@Param("sysConfig") SysConfig sysConfig);

    /**
     * 分组统计
     * @param sysConfig
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroup(@Param("sysConfig") SysConfig sysConfig);

    /**
     * 日统计
     * @param sysConfig
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByDay(@Param("sysConfig") SysConfig sysConfig);

    /**
     * 月统计
     * @param sysConfig
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByMonth(@Param("sysConfig") SysConfig sysConfig);

    /**
     * 年统计
     * @param sysConfig
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByYear(@Param("sysConfig") SysConfig sysConfig);



}