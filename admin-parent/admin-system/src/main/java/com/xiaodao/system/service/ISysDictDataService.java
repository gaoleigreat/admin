package com.xiaodao.system.service;

import java.util.List;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.apache.ibatis.annotations.Param;
import javax.validation.constraints.NotNull;
import com.xiaodao.system.entity.SysDictData;


/**
 * @description ISysDictData Service层
 * @author 高磊
 * @since jdk1.8
 */
public interface ISysDictDataService {



    /**
     * 创建SysDictData
     *
     * @param sysDictData
     * @return
     */
    Integer insert(@NotNull(message = "添加失败，参数不能为空") SysDictData sysDictData);


    /**
     * 根据主键删除
     *
     * @param dictCode
     * @return
     */
    Integer deleteByPrimaryKey(@NotNull(message = "删除失败，参数不能为空") Integer dictCode);

    /**
     * 修改SysDictData
     *
     * @param sysDictData
     * @return
    */
    Integer updateByPrimaryKey(@NotNull(message = "添加失败，参数不能为空") SysDictData sysDictData);


    /**
    * 根据主键查询
    *
    * @param dictCode
    * @return
    */
    SysDictData selectByPrimaryKey(@NotNull(message = "查询失败，参数不能为空") Integer dictCode);


    /**
     * 分页查询
     * @param pageIndex
     * @param pageSize
     * @param sysDictData SysDictData
     * @return IPage<SysDictData>
     */
    IPage<SysDictData> queryPage(int pageIndex, int pageSize, SysDictData sysDictData);

    /**
    * 批量插入
    * @param list List<SysDictData
    * @return Integer
    */
    Integer batchInsert(List<SysDictData> list);

    /**
     * 批量更新
     * @param list List<SysDictData>
     * @return Integer
     */
    Integer batchUpdate(List<SysDictData> list);

    /**
     * 批量删除
     * @param list List<Integer >
     * @return Integer
     */
    Integer deleteBatchIds(List<Integer> list);

    /**
     * 存在即更新
     * @param sysDictData SysDictData
     * @return Integer
     */
    Integer upsert(@Param("sysDictData") SysDictData sysDictData);

    /**
     * 存在即更新，可选择具体属性
     * @param sysDictData SysDictData
     * @return Integer
     */
    Integer upsertSelective(SysDictData sysDictData);

    /**
     * 条件查询
     * @param sysDictData SysDictData
     * @return List<SysDictData>
    */
    List<SysDictData> query(SysDictData sysDictData);

    /**
     * 查询总数
     * @return Integer
     */
    Long queryTotalCount();


}