package com.xiaodao.system.service;

import java.util.List;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.apache.ibatis.annotations.Param;
import javax.validation.constraints.NotNull;
import com.xiaodao.system.entity.SysRole;


/**
 * @description ISysRole Service层
 * @author ¸ßÀÚ
 * @since jdk1.8
 */
public interface ISysRoleService {



    /**
     * 创建SysRole
     *
     * @param sysRole
     * @return
     */
    Integer insert(@NotNull(message = "添加失败，参数不能为空") SysRole sysRole);


    /**
     * 根据主键删除
     *
     * @param roleId
     * @return
     */
    Integer deleteByPrimaryKey(@NotNull(message = "删除失败，参数不能为空") Long roleId);

    /**
     * 修改SysRole
     *
     * @param sysRole
     * @return
    */
    Integer updateByPrimaryKey(@NotNull(message = "添加失败，参数不能为空") SysRole sysRole);


    /**
    * 根据主键查询
    *
    * @param roleId
    * @return
    */
    SysRole selectByPrimaryKey(@NotNull(message = "查询失败，参数不能为空") Long roleId);


    /**
     * 分页查询
     * @param pageIndex
     * @param pageSize
     * @param sysRole SysRole
     * @return IPage<SysRole>
     */
    IPage<SysRole> queryPage(int pageIndex, int pageSize, SysRole sysRole);

    /**
    * 批量插入
    * @param list List<SysRole
    * @return Integer
    */
    Integer batchInsert(List<SysRole> list);

    /**
     * 批量更新
     * @param list List<SysRole>
     * @return Integer
     */
    Integer batchUpdate(List<SysRole> list);

    /**
     * 批量删除
     * @param list List<Long >
     * @return Integer
     */
    Integer deleteBatchIds(List<Long> list);

    /**
     * 存在即更新
     * @param sysRole SysRole
     * @return Integer
     */
    Integer upsert(@Param("sysRole") SysRole sysRole);

    /**
     * 存在即更新，可选择具体属性
     * @param sysRole SysRole
     * @return Integer
     */
    Integer upsertSelective(SysRole sysRole);

    /**
     * 条件查询
     * @param sysRole SysRole
     * @return List<SysRole>
    */
    List<SysRole> query(SysRole sysRole);

    /**
     * 查询总数
     * @return Integer
     */
    Long queryTotalCount();


}