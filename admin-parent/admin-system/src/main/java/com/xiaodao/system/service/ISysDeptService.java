package com.xiaodao.system.service;

import java.util.List;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.apache.ibatis.annotations.Param;
import javax.validation.constraints.NotNull;
import com.xiaodao.system.entity.SysDept;


/**
 * @description ISysDept Service层
 * @author ¸ßÀÚ
 * @since jdk1.8
 */
public interface ISysDeptService {



    /**
     * 创建SysDept
     *
     * @param sysDept
     * @return
     */
    Integer insert(@NotNull(message = "添加失败，参数不能为空") SysDept sysDept);


    /**
     * 根据主键删除
     *
     * @param deptId
     * @return
     */
    Integer deleteByPrimaryKey(@NotNull(message = "删除失败，参数不能为空") Long deptId);

    /**
     * 修改SysDept
     *
     * @param sysDept
     * @return
    */
    Integer updateByPrimaryKey(@NotNull(message = "添加失败，参数不能为空") SysDept sysDept);


    /**
    * 根据主键查询
    *
    * @param deptId
    * @return
    */
    SysDept selectByPrimaryKey(@NotNull(message = "查询失败，参数不能为空") Long deptId);


    /**
     * 分页查询
     * @param pageIndex
     * @param pageSize
     * @param sysDept SysDept
     * @return IPage<SysDept>
     */
    IPage<SysDept> queryPage(int pageIndex, int pageSize, SysDept sysDept);

    /**
    * 批量插入
    * @param list List<SysDept
    * @return Integer
    */
    Integer batchInsert(List<SysDept> list);

    /**
     * 批量更新
     * @param list List<SysDept>
     * @return Integer
     */
    Integer batchUpdate(List<SysDept> list);

    /**
     * 批量删除
     * @param list List<Long >
     * @return Integer
     */
    Integer deleteBatchIds(List<Long> list);

    /**
     * 存在即更新
     * @param sysDept SysDept
     * @return Integer
     */
    Integer upsert(@Param("sysDept") SysDept sysDept);

    /**
     * 存在即更新，可选择具体属性
     * @param sysDept SysDept
     * @return Integer
     */
    Integer upsertSelective(SysDept sysDept);

    /**
     * 条件查询
     * @param sysDept SysDept
     * @return List<SysDept>
    */
    List<SysDept> query(SysDept sysDept);

    /**
     * 查询总数
     * @return Integer
     */
    Long queryTotalCount();


}