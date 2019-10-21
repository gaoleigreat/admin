package com.xiaodao.system.service;

import java.util.List;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.apache.ibatis.annotations.Param;
import javax.validation.constraints.NotNull;
import com.xiaodao.system.entity.SysRoleDept;


/**
 * @description ISysRoleDept Service层
 * @author 高磊
 * @since jdk1.8
 */
public interface ISysRoleDeptService {



    /**
     * 创建SysRoleDept
     *
     * @param sysRoleDept
     * @return
     */
    Integer insert(@NotNull(message = "添加失败，参数不能为空") SysRoleDept sysRoleDept);


    /**
     * 根据主键删除
     *
     * @param roleId
     * @return
     */
    Integer deleteByPrimaryKey(@NotNull(message = "删除失败，参数不能为空") Long roleId);

    /**
     * 修改SysRoleDept
     *
     * @param sysRoleDept
     * @return
    */
    Integer updateByPrimaryKey(@NotNull(message = "添加失败，参数不能为空") SysRoleDept sysRoleDept);


    /**
    * 根据主键查询
    *
    * @param roleId
    * @return
    */
    SysRoleDept selectByPrimaryKey(@NotNull(message = "查询失败，参数不能为空") Long roleId);


    /**
     * 分页查询
     * @param pageIndex
     * @param pageSize
     * @param sysRoleDept SysRoleDept
     * @return IPage<SysRoleDept>
     */
    IPage<SysRoleDept> queryPage(int pageIndex, int pageSize, SysRoleDept sysRoleDept);

    /**
    * 批量插入
    * @param list List<SysRoleDept
    * @return Integer
    */
    Integer batchInsert(List<SysRoleDept> list);

    /**
     * 批量更新
     * @param list List<SysRoleDept>
     * @return Integer
     */
    Integer batchUpdate(List<SysRoleDept> list);

    /**
     * 批量删除
     * @param list List<Long >
     * @return Integer
     */
    Integer deleteBatchIds(List<Long> list);

    /**
     * 存在即更新
     * @param sysRoleDept SysRoleDept
     * @return Integer
     */
    Integer upsert(@Param("sysRoleDept") SysRoleDept sysRoleDept);

    /**
     * 存在即更新，可选择具体属性
     * @param sysRoleDept SysRoleDept
     * @return Integer
     */
    Integer upsertSelective(SysRoleDept sysRoleDept);

    /**
     * 条件查询
     * @param sysRoleDept SysRoleDept
     * @return List<SysRoleDept>
    */
    List<SysRoleDept> query(SysRoleDept sysRoleDept);

    /**
     * 查询总数
     * @return Integer
     */
    Long queryTotalCount();


}