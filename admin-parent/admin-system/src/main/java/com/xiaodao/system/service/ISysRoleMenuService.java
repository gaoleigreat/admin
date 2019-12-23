package com.xiaodao.system.service;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.xiaodao.feign.system.entity.SysRoleMenu;
import org.springframework.validation.annotation.Validated;

import java.util.List;
import java.util.Map;




/**
 * @description ISysRoleMenu Service层
 * @author xiaodao
 * @since jdk1.8
 */
@Validated
public interface ISysRoleMenuService {

    /**
     * 新增
     * @param sysRoleMenu
     * @return int
     */
    int insert(@NotNull(message = "参数不能为空") SysRoleMenu sysRoleMenu);

    /**
     * 带有空值判断的新增
     * @param sysRoleMenu
     * @return int
     */
    int insertSelective(@NotNull(message = "参数不能为空") SysRoleMenu sysRoleMenu);


    /**
     * 批量插入
     * @param list
     * @return int
     */
    int batchInsert(@Size(min = 1, message = "参数不能为空") List<SysRoleMenu> list);

    /**
     * 带有空值判断的批量插入
     * @param list
     * @return int
     */
    int batchInsertSelective(@Size(min = 1, message = "参数不能为空") List<SysRoleMenu> list);

    /**
     * 根据主键更新
     * @param sysRoleMenu
     * @return int
     */
    int updateByPrimaryKey(@NotNull(message = "参数不能为空") SysRoleMenu sysRoleMenu);

    /**
     * 带有空值判断的主键更新
     * @param sysRoleMenu
     * @return int
     */
    int updateSelectiveByPrimaryKey(@NotNull(message = "参数不能为空") SysRoleMenu sysRoleMenu);

    /**
     * 批量更新
     * @param list
     * @return int
     */
    int batchUpdate(@Size(min = 1, message = "参数不能为空") List<SysRoleMenu> list);

    /**
     * 带有空值判断的批量更新
     * @param list
     * @return int
     */
    int batchUpdateSelective(@Size(min = 1, message = "参数不能为空") List<SysRoleMenu> list);


    /**
     * 更新插入
     * @param sysRoleMenu
     * @return int
     */
    int upsert(@NotNull(message = "参数不能为空") SysRoleMenu sysRoleMenu);

    /**
     * 带有空值判断的更新插入
     * @param sysRoleMenu
     * @return int
     */
    int upsertSelective(@NotNull(message = "参数不能为空") SysRoleMenu sysRoleMenu);

    /**
     * 批量更新插入
     * @param list
     * @return int
     */
    int batchUpsert(@Size(min = 1, message = "参数不能为空") List<SysRoleMenu> list);

    /**
     * 带有空值判断的批量更新插入
     * @param list
     * @return int
     */
    int batchUpsertSelective(@Size(min = 1, message = "参数不能为空") List<SysRoleMenu> list);


    /**
     * 通过主键删除
     * @param roleId
     * @return int
     */

    int deleteByPrimaryKey(@NotNull(message = "参数不能为空") Long roleId);

    /**
     * 通过主键批量删除
     * @param list
     * @return int
     */
    int deleteBatchByPrimaryKeys(@Size(min = 1, message = "参数不能为空") List<Long> list);

    /**
     * 条件删除
     * @param sysRoleMenu
     * @return int
     */
    int delete(@NotNull(message = "参数不能为空") SysRoleMenu sysRoleMenu);

    /**
     * 通过主键查询
     * @param  roleId
     * @return SysRoleMenu sysRoleMenu
     */
    SysRoleMenu queryByPrimaryKey(@NotNull(message = "参数不能为空") Long roleId);

    /**
     * 通过主键批量查询
     * @param list
     * @return List<SysRoleMenu>
     */
    List<SysRoleMenu> queryBatchPrimaryKeys(@Size(min = 1, message = "参数不能为空") List<Long> list);

    /**
     * 条件查询一个
     * @param sysRoleMenu
     * @return List<SysRoleMenu>
     */
    SysRoleMenu queryOne(@NotNull(message = "参数不能为空") SysRoleMenu sysRoleMenu);

    /**
     * 条件查询
     * @param sysRoleMenu
     * @return List<SysRoleMenu>
     */
    List<SysRoleMenu> queryByCondition(@NotNull(message = "参数不能为空") SysRoleMenu sysRoleMenu);

    /**
     * 模糊查询
     * @param sysRoleMenu
     * @return List<SysRoleMenu>
     */
    List<SysRoleMenu> queryFuzzy(@NotNull(message = "参数不能为空") SysRoleMenu sysRoleMenu);

    /**
     * 模糊条件查询
     * @param sysRoleMenu
     * @return List<SysRoleMenu>
     */
    List<SysRoleMenu> queryByLikeCondition(@NotNull(message = "参数不能为空") SysRoleMenu sysRoleMenu);

    /**
     * 条件查询数量
     * @param sysRoleMenu
     * @return int
     */
    int queryCount(@NotNull(message = "参数不能为空") SysRoleMenu sysRoleMenu);

    /**
     * 分组统计
     * @param sysRoleMenu
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroup(@NotNull(message = "参数不能为空") SysRoleMenu sysRoleMenu);

    /**
     * 日统计
     * @param sysRoleMenu
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByDay(@NotNull(message = "参数不能为空") SysRoleMenu sysRoleMenu);

    /**
     * 月统计
     * @param sysRoleMenu
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByMonth(@NotNull(message = "参数不能为空") SysRoleMenu sysRoleMenu);

    /**
     * 年统计
     * @param sysRoleMenu
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByYear(@NotNull(message = "参数不能为空") SysRoleMenu sysRoleMenu);


}