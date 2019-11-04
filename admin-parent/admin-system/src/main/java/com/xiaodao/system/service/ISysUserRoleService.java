package com.xiaodao.system.service;

import java.util.List;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.apache.ibatis.annotations.Param;
import javax.validation.constraints.NotNull;
import com.xiaodao.system.entity.SysUserRole;


/**
 * @description ISysUserRole Service层
 * @author ¸ßÀÚ
 * @since jdk1.8
 */
public interface ISysUserRoleService {



    /**
     * 创建SysUserRole
     *
     * @param sysUserRole
     * @return
     */
    Integer insert(@NotNull(message = "添加失败，参数不能为空") SysUserRole sysUserRole);


    /**
     * 根据主键删除
     *
     * @param userId
     * @return
     */
    Integer deleteByPrimaryKey(@NotNull(message = "删除失败，参数不能为空") Long userId);

    /**
     * 修改SysUserRole
     *
     * @param sysUserRole
     * @return
    */
    Integer updateByPrimaryKey(@NotNull(message = "添加失败，参数不能为空") SysUserRole sysUserRole);


    /**
    * 根据主键查询
    *
    * @param userId
    * @return
    */
    SysUserRole selectByPrimaryKey(@NotNull(message = "查询失败，参数不能为空") Long userId);


    /**
     * 分页查询
     * @param pageIndex
     * @param pageSize
     * @param sysUserRole SysUserRole
     * @return IPage<SysUserRole>
     */
    IPage<SysUserRole> queryPage(int pageIndex, int pageSize, SysUserRole sysUserRole);

    /**
    * 批量插入
    * @param list List<SysUserRole
    * @return Integer
    */
    Integer batchInsert(List<SysUserRole> list);

    /**
     * 批量更新
     * @param list List<SysUserRole>
     * @return Integer
     */
    Integer batchUpdate(List<SysUserRole> list);

    /**
     * 批量删除
     * @param list List<Long >
     * @return Integer
     */
    Integer deleteBatchIds(List<Long> list);

    /**
     * 存在即更新
     * @param sysUserRole SysUserRole
     * @return Integer
     */
    Integer upsert(@Param("sysUserRole") SysUserRole sysUserRole);

    /**
     * 存在即更新，可选择具体属性
     * @param sysUserRole SysUserRole
     * @return Integer
     */
    Integer upsertSelective(SysUserRole sysUserRole);

    /**
     * 条件查询
     * @param sysUserRole SysUserRole
     * @return List<SysUserRole>
    */
    List<SysUserRole> query(SysUserRole sysUserRole);

    /**
     * 查询总数
     * @return Integer
     */
    Long queryTotalCount();


}