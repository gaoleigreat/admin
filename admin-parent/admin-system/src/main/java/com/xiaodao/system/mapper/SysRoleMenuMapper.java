package com.xiaodao.system.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import com.xiaodao.system.entity.SysRoleMenu;


/**
 * @description SysRoleMenuMapper
 * @author高磊
 * @since jdk1.8
 */
public interface SysRoleMenuMapper extends BaseMapper<SysRoleMenu> {

    /**
     * 批量插入
     *
     * @param list List<SysRoleMenu
     * @return Integer
     */
    Integer batchInsert(List<SysRoleMenu> list);

    /**
     * 批量更新
     *
     * @param list List<SysRoleMenu>
     * @return Integer
     */
    Integer batchUpdate(List<SysRoleMenu> list);

    /**
     * 存在即更新
     *
     * @param sysRoleMenu SysRoleMenu
     * @return Integer
     */
    Integer upsert(@Param("sysRoleMenu") SysRoleMenu sysRoleMenu);

    /**
     * 存在即更新，可选择具体属性
     *
     * @param sysRoleMenu SysRoleMenu
     * @return Integer
     */
    Integer upsertSelective(@Param("sysRoleMenu") SysRoleMenu sysRoleMenu);

    /**
     * 条件查询
     *
     * @param sysRoleMenu SysRoleMenu
     * @return List<SysRoleMenu>
     */
    List<SysRoleMenu> query(@Param("sysRoleMenu") SysRoleMenu sysRoleMenu);

    /**
     * 查询总数
     *
     * @return Integer
     */
    Long queryTotalCount();


}