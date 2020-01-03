package com.xiaodao.system.service;

import com.xiaodao.admin.entity.SysMenu;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;
import java.util.Map;


/**
 * @author xiaodao
 * @description ISysMenu Service层
 * @since jdk1.8
 */
@Validated
public interface ISysMenuService {

    /**
     * 新增
     *
     * @param sysMenu
     * @return int
     */
    int insert(@NotNull(message = "参数不能为空") SysMenu sysMenu);

    /**
     * 带有空值判断的新增
     *
     * @param sysMenu
     * @return int
     */
    int insertSelective(@NotNull(message = "参数不能为空") SysMenu sysMenu);


    /**
     * 批量插入
     *
     * @param list
     * @return int
     */
    int batchInsert(@Size(min = 1, message = "参数不能为空") List<SysMenu> list);

    /**
     * 带有空值判断的批量插入
     *
     * @param list
     * @return int
     */
    int batchInsertSelective(@Size(min = 1, message = "参数不能为空") List<SysMenu> list);

    /**
     * 根据主键更新
     *
     * @param sysMenu
     * @return int
     */
    int updateByPrimaryKey(@NotNull(message = "参数不能为空") SysMenu sysMenu);

    /**
     * 带有空值判断的主键更新
     *
     * @param sysMenu
     * @return int
     */
    int updateSelectiveByPrimaryKey(@NotNull(message = "参数不能为空") SysMenu sysMenu);

    /**
     * 批量更新
     *
     * @param list
     * @return int
     */
    int batchUpdate(@Size(min = 1, message = "参数不能为空") List<SysMenu> list);

    /**
     * 带有空值判断的批量更新
     *
     * @param list
     * @return int
     */
    int batchUpdateSelective(@Size(min = 1, message = "参数不能为空") List<SysMenu> list);


    /**
     * 更新插入
     *
     * @param sysMenu
     * @return int
     */
    int upsert(@NotNull(message = "参数不能为空") SysMenu sysMenu);

    /**
     * 带有空值判断的更新插入
     *
     * @param sysMenu
     * @return int
     */
    int upsertSelective(@NotNull(message = "参数不能为空") SysMenu sysMenu);

    /**
     * 批量更新插入
     *
     * @param list
     * @return int
     */
    int batchUpsert(@Size(min = 1, message = "参数不能为空") List<SysMenu> list);

    /**
     * 带有空值判断的批量更新插入
     *
     * @param list
     * @return int
     */
    int batchUpsertSelective(@Size(min = 1, message = "参数不能为空") List<SysMenu> list);


    /**
     * 通过主键删除
     *
     * @param menuId
     * @return int
     */

    int deleteByPrimaryKey(@NotNull(message = "参数不能为空") Long menuId);

    /**
     * 通过主键批量删除
     *
     * @param list
     * @return int
     */
    int deleteBatchByPrimaryKeys(@Size(min = 1, message = "参数不能为空") List<Long> list);

    /**
     * 条件删除
     *
     * @param sysMenu
     * @return int
     */
    int delete(@NotNull(message = "参数不能为空") SysMenu sysMenu);

    /**
     * 通过主键查询
     *
     * @param menuId
     * @return SysMenu sysMenu
     */
    SysMenu queryByPrimaryKey(@NotNull(message = "参数不能为空") Long menuId);

    /**
     * 通过主键批量查询
     *
     * @param list
     * @return List<SysMenu>
     */
    List<SysMenu> queryBatchPrimaryKeys(@Size(min = 1, message = "参数不能为空") List<Long> list);

    /**
     * 条件查询一个
     *
     * @param sysMenu
     * @return List<SysMenu>
     */
    SysMenu queryOne(@NotNull(message = "参数不能为空") SysMenu sysMenu);

    /**
     * 条件查询
     *
     * @param sysMenu
     * @return List<SysMenu>
     */
    List<SysMenu> queryByCondition(@NotNull(message = "参数不能为空") SysMenu sysMenu);

    /**
     * 模糊查询
     *
     * @param sysMenu
     * @return List<SysMenu>
     */
    List<SysMenu> queryFuzzy(@NotNull(message = "参数不能为空") SysMenu sysMenu);

    /**
     * 模糊条件查询
     *
     * @param sysMenu
     * @return List<SysMenu>
     */
    List<SysMenu> queryByLikeCondition(@NotNull(message = "参数不能为空") SysMenu sysMenu);

    /**
     * 条件查询数量
     *
     * @param sysMenu
     * @return int
     */
    int queryCount(@NotNull(message = "参数不能为空") SysMenu sysMenu);

    /**
     * 分组统计
     *
     * @param sysMenu
     * @return List<Map < String, Object>>
     */
    List<Map<String, Object>> statisticsGroup(@NotNull(message = "参数不能为空") SysMenu sysMenu);

    /**
     * 日统计
     *
     * @param sysMenu
     * @return List<Map < String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByDay(@NotNull(message = "参数不能为空") SysMenu sysMenu);

    /**
     * 月统计
     *
     * @param sysMenu
     * @return List<Map < String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByMonth(@NotNull(message = "参数不能为空") SysMenu sysMenu);

    /**
     * 年统计
     *
     * @param sysMenu
     * @return List<Map < String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByYear(@NotNull(message = "参数不能为空") SysMenu sysMenu);

    /**
     * 查询系统所有菜单（含按钮）
     *
     * @return 菜单列表
     */
    List<SysMenu> selectMenuAll();

    /**
     * 查询系统正常显示菜单（不含按钮）
     *
     * @return 菜单列表
     */
    List<SysMenu> selectMenuNormalAll();

    /**
     * 根据用户ID查询菜单
     *
     * @param userId 用户ID
     * @return 菜单列表
     */
    List<SysMenu> selectMenusByUserId(@NotNull(message = "参数不能为空") Long userId);

    /**
     * 根据用户ID查询权限
     *
     * @param userId 用户ID
     * @return 权限列表
     */
    List<String> selectPermsByUserId(@NotNull(message = "参数不能为空") Long userId);

    /**
     * 根据角色ID查询菜单ID
     *
     * @param roleId 角色ID
     * @return 权限列表
     */
    List<Long> selectMenuIdsByRoleId(@NotNull(message = "参数不能为空") Long roleId);

    /**
     * 根据角色ID查询菜单
     *
     * @param roleId 角色ID
     * @return 菜单列表
     */
    List<String> selectMenuTree(@NotNull(message = "参数不能为空") Long roleId);
}