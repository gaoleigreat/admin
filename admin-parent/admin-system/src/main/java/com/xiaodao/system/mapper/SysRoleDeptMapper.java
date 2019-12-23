package com.xiaodao.system.mapper;


import org.apache.ibatis.annotations.Param;
import com.xiaodao.feign.system.entity.SysRoleDept;

import java.util.List;
import java.util.Map;
/**
 * @description SysRoleDeptMapper
 * @authorxiaodao
 * @since jdk1.8
 */
public interface SysRoleDeptMapper{

    /**
     * 新增
     * @param sysRoleDept
     * @return int
     */
    int insert(@Param("sysRoleDept") SysRoleDept sysRoleDept);

    /**
     * 带有空值判断的新增
     * @param sysRoleDept
     * @return int
     */
    int insertSelective(@Param("sysRoleDept") SysRoleDept sysRoleDept);

    /**
     * 批量插入
     * @param list
     * @return int
     */
    int batchInsert(@Param("list") List<SysRoleDept> list);

    /**
     * 带有空值判断的批量插入
     * @param list
     * @return int
     */
    int batchInsertSelective(@Param("list") List<SysRoleDept> list);

    /**
     * 根据主键更新
     * @param sysRoleDept
     * @return int
     */
    int updateByPrimaryKey(@Param("sysRoleDept") SysRoleDept sysRoleDept);

    /**
     * 带有空值判断的主键更新
     * @param sysRoleDept
     * @return int
     */
    int updateSelectiveByPrimaryKey(@Param("sysRoleDept") SysRoleDept sysRoleDept);

    /**
     * 批量更新
     * @param list
     * @return int
     */
    int batchUpdate(@Param("list") List<SysRoleDept> list);

    /**
     * 带有空值判断的批量更新
     * @param list
     * @return int
     */
    int batchUpdateSelective(@Param("list") List<SysRoleDept> list);

    /**
     * 更新插入
     * @param sysRoleDept
     * @return int
     */
    int upsert(@Param("sysRoleDept") SysRoleDept sysRoleDept);

    /**
     * 带有空值判断的更新插入
     * @param sysRoleDept
     * @return int
     */
    int upsertSelective(@Param("sysRoleDept") SysRoleDept sysRoleDept);

    /**
     * 批量更新插入
     * @param list
     * @return int
     */
    int batchUpsert(@Param("list") List<SysRoleDept> list);

    /**
     * 带有空值判断的批量更新插入
     * @param list
     * @return int
     */
    int batchUpsertSelective(@Param("list") List<SysRoleDept> list);

    /**
     * 通过主键删除
     * @param roleId
     * @return int
     */
    int deleteByPrimaryKey(@Param("sysRoleDept") Long roleId);

    /**
     * 通过主键批量删除
     * @param list
     * @return int
     */
    int deleteBatchByPrimaryKeys(@Param("list") List<Long> list);

    /**
     * 条件删除
     * @param sysRoleDept
     * @return int
     */
    int delete(@Param("sysRoleDept") SysRoleDept sysRoleDept);

    /**
     * 通过主键查询
     * @param roleId
     * @return SysRoleDept sysRoleDept
     */
     SysRoleDept queryByPrimaryKey(@Param("sysRoleDept") Long roleId);

    /**
     * 通过主键批量查询
     * @param list
     * @return List<SysRoleDept>
     */
    List<SysRoleDept> queryBatchPrimaryKeys(@Param("list") List<Long> list);

    /**
     * 条件查询一个
     * @param sysRoleDept
     * @return List<SysRoleDept>
     */
    SysRoleDept queryOne(@Param("sysRoleDept") SysRoleDept sysRoleDept);

    /**
     * 条件查询
     * @param sysRoleDept
     * @return List<SysRoleDept>
     */
    List<SysRoleDept> queryByCondition(@Param("sysRoleDept") SysRoleDept sysRoleDept);

    /**
     * 模糊查询
     * @param sysRoleDept
     * @return List<SysRoleDept>
     */
    List<SysRoleDept> queryFuzzy(@Param("sysRoleDept") SysRoleDept sysRoleDept);

    /**
     * 模糊条件查询
     * @param sysRoleDept
     * @return List<SysRoleDept>
     */
    List<SysRoleDept> queryByLikeCondition(@Param("sysRoleDept") SysRoleDept sysRoleDept);

    /**
     * 条件查询数量
     * @param sysRoleDept
     * @return int
     */
    int queryCount(@Param("sysRoleDept") SysRoleDept sysRoleDept);

    /**
     * 分组统计
     * @param sysRoleDept
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroup(@Param("sysRoleDept") SysRoleDept sysRoleDept);

    /**
     * 日统计
     * @param sysRoleDept
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByDay(@Param("sysRoleDept") SysRoleDept sysRoleDept);

    /**
     * 月统计
     * @param sysRoleDept
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByMonth(@Param("sysRoleDept") SysRoleDept sysRoleDept);

    /**
     * 年统计
     * @param sysRoleDept
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByYear(@Param("sysRoleDept") SysRoleDept sysRoleDept);



}