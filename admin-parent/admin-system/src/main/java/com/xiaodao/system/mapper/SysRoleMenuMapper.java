package com.xiaodao.system.mapper;


import org.apache.ibatis.annotations.Param;
import com.xiaodao.feign.system.entity.SysRoleMenu;

import java.util.List;
import java.util.Map;
/**
 * @description SysRoleMenuMapper
 * @authorxiaodao
 * @since jdk1.8
 */
public interface SysRoleMenuMapper{

    /**
     * 新增
     * @param sysRoleMenu
     * @return int
     */
    int insert(@Param("sysRoleMenu") SysRoleMenu sysRoleMenu);

    /**
     * 带有空值判断的新增
     * @param sysRoleMenu
     * @return int
     */
    int insertSelective(@Param("sysRoleMenu") SysRoleMenu sysRoleMenu);

    /**
     * 批量插入
     * @param list
     * @return int
     */
    int batchInsert(@Param("list") List<SysRoleMenu> list);

    /**
     * 带有空值判断的批量插入
     * @param list
     * @return int
     */
    int batchInsertSelective(@Param("list") List<SysRoleMenu> list);

    /**
     * 根据主键更新
     * @param sysRoleMenu
     * @return int
     */
    int updateByPrimaryKey(@Param("sysRoleMenu") SysRoleMenu sysRoleMenu);

    /**
     * 带有空值判断的主键更新
     * @param sysRoleMenu
     * @return int
     */
    int updateSelectiveByPrimaryKey(@Param("sysRoleMenu") SysRoleMenu sysRoleMenu);

    /**
     * 批量更新
     * @param list
     * @return int
     */
    int batchUpdate(@Param("list") List<SysRoleMenu> list);

    /**
     * 带有空值判断的批量更新
     * @param list
     * @return int
     */
    int batchUpdateSelective(@Param("list") List<SysRoleMenu> list);

    /**
     * 更新插入
     * @param sysRoleMenu
     * @return int
     */
    int upsert(@Param("sysRoleMenu") SysRoleMenu sysRoleMenu);

    /**
     * 带有空值判断的更新插入
     * @param sysRoleMenu
     * @return int
     */
    int upsertSelective(@Param("sysRoleMenu") SysRoleMenu sysRoleMenu);

    /**
     * 批量更新插入
     * @param list
     * @return int
     */
    int batchUpsert(@Param("list") List<SysRoleMenu> list);

    /**
     * 带有空值判断的批量更新插入
     * @param list
     * @return int
     */
    int batchUpsertSelective(@Param("list") List<SysRoleMenu> list);

    /**
     * 通过主键删除
     * @param roleId
     * @return int
     */
    int deleteByPrimaryKey(@Param("sysRoleMenu") Long roleId);

    /**
     * 通过主键批量删除
     * @param list
     * @return int
     */
    int deleteBatchByPrimaryKeys(@Param("list") List<Long> list);

    /**
     * 条件删除
     * @param sysRoleMenu
     * @return int
     */
    int delete(@Param("sysRoleMenu") SysRoleMenu sysRoleMenu);

    /**
     * 通过主键查询
     * @param roleId
     * @return SysRoleMenu sysRoleMenu
     */
     SysRoleMenu queryByPrimaryKey(@Param("sysRoleMenu") Long roleId);

    /**
     * 通过主键批量查询
     * @param list
     * @return List<SysRoleMenu>
     */
    List<SysRoleMenu> queryBatchPrimaryKeys(@Param("list") List<Long> list);

    /**
     * 条件查询一个
     * @param sysRoleMenu
     * @return List<SysRoleMenu>
     */
    SysRoleMenu queryOne(@Param("sysRoleMenu") SysRoleMenu sysRoleMenu);

    /**
     * 条件查询
     * @param sysRoleMenu
     * @return List<SysRoleMenu>
     */
    List<SysRoleMenu> queryByCondition(@Param("sysRoleMenu") SysRoleMenu sysRoleMenu);

    /**
     * 模糊查询
     * @param sysRoleMenu
     * @return List<SysRoleMenu>
     */
    List<SysRoleMenu> queryFuzzy(@Param("sysRoleMenu") SysRoleMenu sysRoleMenu);

    /**
     * 模糊条件查询
     * @param sysRoleMenu
     * @return List<SysRoleMenu>
     */
    List<SysRoleMenu> queryByLikeCondition(@Param("sysRoleMenu") SysRoleMenu sysRoleMenu);

    /**
     * 条件查询数量
     * @param sysRoleMenu
     * @return int
     */
    int queryCount(@Param("sysRoleMenu") SysRoleMenu sysRoleMenu);

    /**
     * 分组统计
     * @param sysRoleMenu
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroup(@Param("sysRoleMenu") SysRoleMenu sysRoleMenu);

    /**
     * 日统计
     * @param sysRoleMenu
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByDay(@Param("sysRoleMenu") SysRoleMenu sysRoleMenu);

    /**
     * 月统计
     * @param sysRoleMenu
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByMonth(@Param("sysRoleMenu") SysRoleMenu sysRoleMenu);

    /**
     * 年统计
     * @param sysRoleMenu
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByYear(@Param("sysRoleMenu") SysRoleMenu sysRoleMenu);



}