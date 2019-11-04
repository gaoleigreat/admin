package com.xiaodao.system.service;

import java.util.List;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.apache.ibatis.annotations.Param;
import javax.validation.constraints.NotNull;
import com.xiaodao.system.entity.SysRoleMenu;


/**
 * @description ISysRoleMenu Service层
 * @author ¸ßÀÚ
 * @since jdk1.8
 */
public interface ISysRoleMenuService {



    /**
     * 创建SysRoleMenu
     *
     * @param sysRoleMenu
     * @return
     */
    Integer insert(@NotNull(message = "添加失败，参数不能为空") SysRoleMenu sysRoleMenu);


    /**
     * 根据主键删除
     *
     * @param roleId
     * @return
     */
    Integer deleteByPrimaryKey(@NotNull(message = "删除失败，参数不能为空") Long roleId);

    /**
     * 修改SysRoleMenu
     *
     * @param sysRoleMenu
     * @return
    */
    Integer updateByPrimaryKey(@NotNull(message = "添加失败，参数不能为空") SysRoleMenu sysRoleMenu);


    /**
    * 根据主键查询
    *
    * @param roleId
    * @return
    */
    SysRoleMenu selectByPrimaryKey(@NotNull(message = "查询失败，参数不能为空") Long roleId);


    /**
     * 分页查询
     * @param pageIndex
     * @param pageSize
     * @param sysRoleMenu SysRoleMenu
     * @return IPage<SysRoleMenu>
     */
    IPage<SysRoleMenu> queryPage(int pageIndex, int pageSize, SysRoleMenu sysRoleMenu);

    /**
    * 批量插入
    * @param list List<SysRoleMenu
    * @return Integer
    */
    Integer batchInsert(List<SysRoleMenu> list);

    /**
     * 批量更新
     * @param list List<SysRoleMenu>
     * @return Integer
     */
    Integer batchUpdate(List<SysRoleMenu> list);

    /**
     * 批量删除
     * @param list List<Long >
     * @return Integer
     */
    Integer deleteBatchIds(List<Long> list);

    /**
     * 存在即更新
     * @param sysRoleMenu SysRoleMenu
     * @return Integer
     */
    Integer upsert(@Param("sysRoleMenu") SysRoleMenu sysRoleMenu);

    /**
     * 存在即更新，可选择具体属性
     * @param sysRoleMenu SysRoleMenu
     * @return Integer
     */
    Integer upsertSelective(SysRoleMenu sysRoleMenu);

    /**
     * 条件查询
     * @param sysRoleMenu SysRoleMenu
     * @return List<SysRoleMenu>
    */
    List<SysRoleMenu> query(SysRoleMenu sysRoleMenu);

    /**
     * 查询总数
     * @return Integer
     */
    Long queryTotalCount();


}