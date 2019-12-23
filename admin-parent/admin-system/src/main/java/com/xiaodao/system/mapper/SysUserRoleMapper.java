package com.xiaodao.system.mapper;


import org.apache.ibatis.annotations.Param;
import com.xiaodao.feign.system.entity.SysUserRole;

import java.util.List;
import java.util.Map;
/**
 * @description SysUserRoleMapper
 * @authorxiaodao
 * @since jdk1.8
 */
public interface SysUserRoleMapper{

    /**
     * 新增
     * @param sysUserRole
     * @return int
     */
    int insert(@Param("sysUserRole") SysUserRole sysUserRole);

    /**
     * 带有空值判断的新增
     * @param sysUserRole
     * @return int
     */
    int insertSelective(@Param("sysUserRole") SysUserRole sysUserRole);

    /**
     * 批量插入
     * @param list
     * @return int
     */
    int batchInsert(@Param("list") List<SysUserRole> list);

    /**
     * 带有空值判断的批量插入
     * @param list
     * @return int
     */
    int batchInsertSelective(@Param("list") List<SysUserRole> list);

    /**
     * 根据主键更新
     * @param sysUserRole
     * @return int
     */
    int updateByPrimaryKey(@Param("sysUserRole") SysUserRole sysUserRole);

    /**
     * 带有空值判断的主键更新
     * @param sysUserRole
     * @return int
     */
    int updateSelectiveByPrimaryKey(@Param("sysUserRole") SysUserRole sysUserRole);

    /**
     * 批量更新
     * @param list
     * @return int
     */
    int batchUpdate(@Param("list") List<SysUserRole> list);

    /**
     * 带有空值判断的批量更新
     * @param list
     * @return int
     */
    int batchUpdateSelective(@Param("list") List<SysUserRole> list);

    /**
     * 更新插入
     * @param sysUserRole
     * @return int
     */
    int upsert(@Param("sysUserRole") SysUserRole sysUserRole);

    /**
     * 带有空值判断的更新插入
     * @param sysUserRole
     * @return int
     */
    int upsertSelective(@Param("sysUserRole") SysUserRole sysUserRole);

    /**
     * 批量更新插入
     * @param list
     * @return int
     */
    int batchUpsert(@Param("list") List<SysUserRole> list);

    /**
     * 带有空值判断的批量更新插入
     * @param list
     * @return int
     */
    int batchUpsertSelective(@Param("list") List<SysUserRole> list);

    /**
     * 通过主键删除
     * @param userId
     * @return int
     */
    int deleteByPrimaryKey(@Param("sysUserRole") Integer userId);

    /**
     * 通过主键批量删除
     * @param list
     * @return int
     */
    int deleteBatchByPrimaryKeys(@Param("list") List<Integer> list);

    /**
     * 条件删除
     * @param sysUserRole
     * @return int
     */
    int delete(@Param("sysUserRole") SysUserRole sysUserRole);

    /**
     * 通过主键查询
     * @param userId
     * @return SysUserRole sysUserRole
     */
     SysUserRole queryByPrimaryKey(@Param("sysUserRole") Integer userId);

    /**
     * 通过主键批量查询
     * @param list
     * @return List<SysUserRole>
     */
    List<SysUserRole> queryBatchPrimaryKeys(@Param("list") List<Integer> list);

    /**
     * 条件查询一个
     * @param sysUserRole
     * @return List<SysUserRole>
     */
    SysUserRole queryOne(@Param("sysUserRole") SysUserRole sysUserRole);

    /**
     * 条件查询
     * @param sysUserRole
     * @return List<SysUserRole>
     */
    List<SysUserRole> queryByCondition(@Param("sysUserRole") SysUserRole sysUserRole);

    /**
     * 模糊查询
     * @param sysUserRole
     * @return List<SysUserRole>
     */
    List<SysUserRole> queryFuzzy(@Param("sysUserRole") SysUserRole sysUserRole);

    /**
     * 模糊条件查询
     * @param sysUserRole
     * @return List<SysUserRole>
     */
    List<SysUserRole> queryByLikeCondition(@Param("sysUserRole") SysUserRole sysUserRole);

    /**
     * 条件查询数量
     * @param sysUserRole
     * @return int
     */
    int queryCount(@Param("sysUserRole") SysUserRole sysUserRole);

    /**
     * 分组统计
     * @param sysUserRole
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroup(@Param("sysUserRole") SysUserRole sysUserRole);

    /**
     * 日统计
     * @param sysUserRole
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByDay(@Param("sysUserRole") SysUserRole sysUserRole);

    /**
     * 月统计
     * @param sysUserRole
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByMonth(@Param("sysUserRole") SysUserRole sysUserRole);

    /**
     * 年统计
     * @param sysUserRole
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByYear(@Param("sysUserRole") SysUserRole sysUserRole);



}