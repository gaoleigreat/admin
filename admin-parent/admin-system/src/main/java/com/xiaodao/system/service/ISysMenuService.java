package com.xiaodao.system.service;

import java.util.List;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.apache.ibatis.annotations.Param;
import javax.validation.constraints.NotNull;
import com.xiaodao.system.entity.SysMenu;


/**
 * @description ISysMenu Service层
 * @author xiaodao
 * @since jdk1.8
 */
public interface ISysMenuService {



    /**
     * 创建SysMenu
     *
     * @param sysMenu
     * @return
     */
    Integer insert(@NotNull(message = "添加失败，参数不能为空") SysMenu sysMenu);


    /**
     * 根据主键删除
     *
     * @param menuId
     * @return
     */
    Integer deleteByPrimaryKey(@NotNull(message = "删除失败，参数不能为空") Long menuId);

    /**
     * 修改SysMenu
     *
     * @param sysMenu
     * @return
    */
    Integer updateByPrimaryKey(@NotNull(message = "添加失败，参数不能为空") SysMenu sysMenu);


    /**
    * 根据主键查询
    *
    * @param menuId
    * @return
    */
    SysMenu selectByPrimaryKey(@NotNull(message = "查询失败，参数不能为空") Long menuId);


    /**
     * 分页查询
     * @param pageIndex
     * @param pageSize
     * @param sysMenu SysMenu
     * @return IPage<SysMenu>
     */
    IPage<SysMenu> queryPage(int pageIndex, int pageSize, SysMenu sysMenu);

    /**
    * 批量插入
    * @param list List<SysMenu
    * @return Integer
    */
    Integer batchInsert(List<SysMenu> list);

    /**
     * 批量更新
     * @param list List<SysMenu>
     * @return Integer
     */
    Integer batchUpdate(List<SysMenu> list);

    /**
     * 批量删除
     * @param list List<Long >
     * @return Integer
     */
    Integer deleteBatchIds(List<Long> list);

    /**
     * 存在即更新
     * @param sysMenu SysMenu
     * @return Integer
     */
    Integer upsert(@Param("sysMenu") SysMenu sysMenu);

    /**
     * 存在即更新，可选择具体属性
     * @param sysMenu SysMenu
     * @return Integer
     */
    Integer upsertSelective(SysMenu sysMenu);

    /**
     * 条件查询
     * @param sysMenu SysMenu
     * @return List<SysMenu>
    */
    List<SysMenu> query(SysMenu sysMenu);

    /**
     * 查询总数
     * @return Integer
     */
    Long queryTotalCount();


}