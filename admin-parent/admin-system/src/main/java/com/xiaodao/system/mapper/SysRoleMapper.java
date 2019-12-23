package com.xiaodao.system.mapper;


import org.apache.ibatis.annotations.Param;
import com.xiaodao.feign.system.entity.SysRole;

import java.util.List;
import java.util.Map;
/**
 * @description SysRoleMapper
 * @author¸ßÀÚ
 * @since jdk1.8
 */
public interface SysRoleMapper{

    /**
     * 新增
     * @param sysRole
     * @return int
     */
    int insert(@Param("sysRole") SysRole sysRole);

    /**
     * 带有空值判断的新增
     * @param sysRole
     * @return int
     */
    int insertSelective(@Param("sysRole") SysRole sysRole);

    /**
     * 批量插入
     * @param list
     * @return int
     */
    int batchInsert(@Param("list") List<SysRole> list);

    /**
     * 带有空值判断的批量插入
     * @param list
     * @return int
     */
    int batchInsertSelective(@Param("list") List<SysRole> list);

    /**
     * 根据主键更新
     * @param sysRole
     * @return int
     */
    int updateByPrimaryKey(@Param("sysRole") SysRole sysRole);

    /**
     * 带有空值判断的主键更新
     * @param sysRole
     * @return int
     */
    int updateSelectiveByPrimaryKey(@Param("sysRole") SysRole sysRole);

    /**
     * 批量更新
     * @param list
     * @return int
     */
    int batchUpdate(@Param("list") List<SysRole> list);

    /**
     * 带有空值判断的批量更新
     * @param list
     * @return int
     */
    int batchUpdateSelective(@Param("list") List<SysRole> list);

    /**
     * 更新插入
     * @param sysRole
     * @return int
     */
    int upsert(@Param("sysRole") SysRole sysRole);

    /**
     * 带有空值判断的更新插入
     * @param sysRole
     * @return int
     */
    int upsertSelective(@Param("sysRole") SysRole sysRole);

    /**
     * 批量更新插入
     * @param list
     * @return int
     */
    int batchUpsert(@Param("list") List<SysRole> list);

    /**
     * 带有空值判断的批量更新插入
     * @param list
     * @return int
     */
    int batchUpsertSelective(@Param("list") List<SysRole> list);

    /**
     * 通过主键删除
     * @param roleId
     * @return int
     */
    int deleteByPrimaryKey(@Param("sysRole") Long roleId);

    /**
     * 通过主键批量删除
     * @param list
     * @return int
     */
    int deleteBatchByPrimaryKeys(@Param("list") List<Long> list);

    /**
     * 条件删除
     * @param sysRole
     * @return int
     */
    int delete(@Param("sysRole") SysRole sysRole);

    /**
     * 通过主键查询
     * @param roleId
     * @return SysRole sysRole
     */
     SysRole queryByPrimaryKey(@Param("sysRole") Long roleId);

    /**
     * 通过主键批量查询
     * @param list
     * @return List<SysRole>
     */
    List<SysRole> queryBatchPrimaryKeys(@Param("list") List<Long> list);

    /**
     * 条件查询一个
     * @param sysRole
     * @return List<SysRole>
     */
    SysRole queryOne(@Param("sysRole") SysRole sysRole);

    /**
     * 条件查询
     * @param sysRole
     * @return List<SysRole>
     */
    List<SysRole> queryByCondition(@Param("sysRole") SysRole sysRole);

    /**
     * 模糊查询
     * @param sysRole
     * @return List<SysRole>
     */
    List<SysRole> queryFuzzy(@Param("sysRole") SysRole sysRole);

    /**
     * 模糊条件查询
     * @param sysRole
     * @return List<SysRole>
     */
    List<SysRole> queryByLikeCondition(@Param("sysRole") SysRole sysRole);

    /**
     * 条件查询数量
     * @param sysRole
     * @return int
     */
    int queryCount(@Param("sysRole") SysRole sysRole);

    /**
     * 分组统计
     * @param sysRole
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroup(@Param("sysRole") SysRole sysRole);

    /**
     * 日统计
     * @param sysRole
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByDay(@Param("sysRole") SysRole sysRole);

    /**
     * 月统计
     * @param sysRole
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByMonth(@Param("sysRole") SysRole sysRole);

    /**
     * 年统计
     * @param sysRole
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByYear(@Param("sysRole") SysRole sysRole);



}