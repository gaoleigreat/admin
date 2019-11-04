package com.xiaodao.system.service;

import java.util.List;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.apache.ibatis.annotations.Param;
import javax.validation.constraints.NotNull;
import com.xiaodao.system.entity.SysUser;


/**
 * @description ISysUser Service层
 * @author ¸ßÀÚ
 * @since jdk1.8
 */
public interface ISysUserService {



    /**
     * 创建SysUser
     *
     * @param sysUser
     * @return
     */
    Integer insert(@NotNull(message = "添加失败，参数不能为空") SysUser sysUser);


    /**
     * 根据主键删除
     *
     * @param userId
     * @return
     */
    Integer deleteByPrimaryKey(@NotNull(message = "删除失败，参数不能为空") Long userId);

    /**
     * 修改SysUser
     *
     * @param sysUser
     * @return
    */
    Integer updateByPrimaryKey(@NotNull(message = "添加失败，参数不能为空") SysUser sysUser);


    /**
    * 根据主键查询
    *
    * @param userId
    * @return
    */
    SysUser selectByPrimaryKey(@NotNull(message = "查询失败，参数不能为空") Long userId);


    /**
     * 分页查询
     * @param pageIndex
     * @param pageSize
     * @param sysUser SysUser
     * @return IPage<SysUser>
     */
    IPage<SysUser> queryPage(int pageIndex, int pageSize, SysUser sysUser);

    /**
    * 批量插入
    * @param list List<SysUser
    * @return Integer
    */
    Integer batchInsert(List<SysUser> list);

    /**
     * 批量更新
     * @param list List<SysUser>
     * @return Integer
     */
    Integer batchUpdate(List<SysUser> list);

    /**
     * 批量删除
     * @param list List<Long >
     * @return Integer
     */
    Integer deleteBatchIds(List<Long> list);

    /**
     * 存在即更新
     * @param sysUser SysUser
     * @return Integer
     */
    Integer upsert(@Param("sysUser") SysUser sysUser);

    /**
     * 存在即更新，可选择具体属性
     * @param sysUser SysUser
     * @return Integer
     */
    Integer upsertSelective(SysUser sysUser);

    /**
     * 条件查询
     * @param sysUser SysUser
     * @return List<SysUser>
    */
    List<SysUser> query(SysUser sysUser);

    /**
     * 查询总数
     * @return Integer
     */
    Long queryTotalCount();


}