package com.xiaodao.system.service;

import java.util.List;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.apache.ibatis.annotations.Param;
import javax.validation.constraints.NotNull;
import com.xiaodao.system.entity.SysTest;


/**
 * @description ISysTest Service层
 * @author 高磊
 * @since jdk1.8
 */
public interface ISysTestService {



    /**
     * 创建SysTest
     *
     * @param sysTest
     * @return
     */
    Integer insert(@NotNull(message = "添加失败，参数不能为空") SysTest sysTest);


    /**
     * 根据主键删除
     *
     * @param id
     * @return
     */
    Integer deleteByPrimaryKey(@NotNull(message = "删除失败，参数不能为空") Long id);

    /**
     * 修改SysTest
     *
     * @param sysTest
     * @return
    */
    Integer updateByPrimaryKey(@NotNull(message = "添加失败，参数不能为空") SysTest sysTest);


    /**
    * 根据主键查询
    *
    * @param id
    * @return
    */
    SysTest selectByPrimaryKey(@NotNull(message = "查询失败，参数不能为空") Long id);


    /**
     * 分页查询
     * @param pageIndex
     * @param pageSize
     * @param sysTest SysTest
     * @return IPage<SysTest>
     */
    IPage<SysTest> queryPage(int pageIndex, int pageSize, SysTest sysTest);

    /**
    * 批量插入
    * @param list List<SysTest
    * @return Integer
    */
    Integer batchInsert(List<SysTest> list);

    /**
     * 批量更新
     * @param list List<SysTest>
     * @return Integer
     */
    Integer batchUpdate(List<SysTest> list);

    /**
     * 批量删除
     * @param list List<Long >
     * @return Integer
     */
    Integer deleteBatchIds(List<Long> list);

    /**
     * 存在即更新
     * @param sysTest SysTest
     * @return Integer
     */
    Integer upsert(@Param("sysTest") SysTest sysTest);

    /**
     * 存在即更新，可选择具体属性
     * @param sysTest SysTest
     * @return Integer
     */
    Integer upsertSelective(SysTest sysTest);

    /**
     * 条件查询
     * @param sysTest SysTest
     * @return List<SysTest>
    */
    List<SysTest> query(SysTest sysTest);

    /**
     * 查询总数
     * @return Integer
     */
    Long queryTotalCount();


}