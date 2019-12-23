package com.xiaodao.system.mapper;


import com.xiaodao.feign.system.entity.SysMenu;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @description SysMenuMapper
 * @author¸ßÀÚ
 * @since jdk1.8
 */
public interface SysMenuMapper {

    /**
     * 新增
     *
     * @param sysMenu
     * @return int
     */
    int insert(@Param("sysMenu") SysMenu sysMenu);

    /**
     * 带有空值判断的新增
     *
     * @param sysMenu
     * @return int
     */
    int insertSelective(@Param("sysMenu") SysMenu sysMenu);

    /**
     * 批量插入
     *
     * @param list
     * @return int
     */
    int batchInsert(@Param("list") List<SysMenu> list);

    /**
     * 带有空值判断的批量插入
     *
     * @param list
     * @return int
     */
    int batchInsertSelective(@Param("list") List<SysMenu> list);

    /**
     * 根据主键更新
     *
     * @param sysMenu
     * @return int
     */
    int updateByPrimaryKey(@Param("sysMenu") SysMenu sysMenu);

    /**
     * 带有空值判断的主键更新
     *
     * @param sysMenu
     * @return int
     */
    int updateSelectiveByPrimaryKey(@Param("sysMenu") SysMenu sysMenu);

    /**
     * 批量更新
     *
     * @param list
     * @return int
     */
    int batchUpdate(@Param("list") List<SysMenu> list);

    /**
     * 带有空值判断的批量更新
     *
     * @param list
     * @return int
     */
    int batchUpdateSelective(@Param("list") List<SysMenu> list);

    /**
     * 更新插入
     *
     * @param sysMenu
     * @return int
     */
    int upsert(@Param("sysMenu") SysMenu sysMenu);

    /**
     * 带有空值判断的更新插入
     *
     * @param sysMenu
     * @return int
     */
    int upsertSelective(@Param("sysMenu") SysMenu sysMenu);

    /**
     * 批量更新插入
     *
     * @param list
     * @return int
     */
    int batchUpsert(@Param("list") List<SysMenu> list);

    /**
     * 带有空值判断的批量更新插入
     *
     * @param list
     * @return int
     */
    int batchUpsertSelective(@Param("list") List<SysMenu> list);

    /**
     * 通过主键删除
     *
     * @param menuId
     * @return int
     */
    int deleteByPrimaryKey(@Param("sysMenu") Long menuId);

    /**
     * 通过主键批量删除
     *
     * @param list
     * @return int
     */
    int deleteBatchByPrimaryKeys(@Param("list") List<Long> list);

    /**
     * 条件删除
     *
     * @param sysMenu
     * @return int
     */
    int delete(@Param("sysMenu") SysMenu sysMenu);

    /**
     * 通过主键查询
     *
     * @param menuId
     * @return SysMenu sysMenu
     */
    SysMenu queryByPrimaryKey(@Param("sysMenu") Long menuId);

    /**
     * 通过主键批量查询
     *
     * @param list
     * @return List<SysMenu>
     */
    List<SysMenu> queryBatchPrimaryKeys(@Param("list") List<Long> list);

    /**
     * 条件查询一个
     *
     * @param sysMenu
     * @return List<SysMenu>
     */
    SysMenu queryOne(@Param("sysMenu") SysMenu sysMenu);

    /**
     * 条件查询
     *
     * @param sysMenu
     * @return List<SysMenu>
     */
    List<SysMenu> queryByCondition(@Param("sysMenu") SysMenu sysMenu);

    /**
     * 模糊查询
     *
     * @param sysMenu
     * @return List<SysMenu>
     */
    List<SysMenu> queryFuzzy(@Param("sysMenu") SysMenu sysMenu);

    /**
     * 模糊条件查询
     *
     * @param sysMenu
     * @return List<SysMenu>
     */
    List<SysMenu> queryByLikeCondition(@Param("sysMenu") SysMenu sysMenu);

    /**
     * 条件查询数量
     *
     * @param sysMenu
     * @return int
     */
    int queryCount(@Param("sysMenu") SysMenu sysMenu);

    /**
     * 分组统计
     *
     * @param sysMenu
     * @return List<Map < String, Object>>
     */
    List<Map<String, Object>> statisticsGroup(@Param("sysMenu") SysMenu sysMenu);

    /**
     * 日统计
     *
     * @param sysMenu
     * @return List<Map < String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByDay(@Param("sysMenu") SysMenu sysMenu);

    /**
     * 月统计
     *
     * @param sysMenu
     * @return List<Map < String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByMonth(@Param("sysMenu") SysMenu sysMenu);

    /**
     * 年统计
     *
     * @param sysMenu
     * @return List<Map < String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByYear(@Param("sysMenu") SysMenu sysMenu);

    /**
     * 校验菜单名称是否已存在
     *
     * @param menuName
     * @param parentId
     * @return
     */
    SysMenu checkMenuNameUnique(@Param("menuName") String menuName, @Param("parentId") Long parentId);


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
    List<SysMenu> selectMenusByUserId(Long userId);

    /**
     * 根据用户ID查询权限
     *
     * @param userId 用户ID
     * @return 权限列表
     */
    List<String> selectPermsByUserId(Long userId);

    /**
     * 根据角色ID查询菜单ID
     *
     * @param roleId 角色ID
     * @return 权限列表
     */
    List<Long> selectMenuIdsByRoleId(Long roleId);

    /**
     * 根据角色ID查询菜单
     *
     * @param roleId 角色ID
     * @return 菜单列表
     */
    List<String> selectMenuTree(Long roleId);

}