package com.xiaodao.system.service;

import java.util.List;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.apache.ibatis.annotations.Param;
import javax.validation.constraints.NotNull;
import com.xiaodao.system.entity.SysDictType;


/**
 * @description ISysDictType Service层
 * @author ¸ßÀÚ
 * @since jdk1.8
 */
public interface ISysDictTypeService {



    /**
     * 创建SysDictType
     *
     * @param sysDictType
     * @return
     */
    Integer insert(@NotNull(message = "添加失败，参数不能为空") SysDictType sysDictType);


    /**
     * 根据主键删除
     *
     * @param dictId
     * @return
     */
    Integer deleteByPrimaryKey(@NotNull(message = "删除失败，参数不能为空") Long dictId);

    /**
     * 修改SysDictType
     *
     * @param sysDictType
     * @return
    */
    Integer updateByPrimaryKey(@NotNull(message = "添加失败，参数不能为空") SysDictType sysDictType);


    /**
    * 根据主键查询
    *
    * @param dictId
    * @return
    */
    SysDictType selectByPrimaryKey(@NotNull(message = "查询失败，参数不能为空") Long dictId);


    /**
     * 分页查询
     * @param pageIndex
     * @param pageSize
     * @param sysDictType SysDictType
     * @return IPage<SysDictType>
     */
    IPage<SysDictType> queryPage(int pageIndex, int pageSize, SysDictType sysDictType);

    /**
    * 批量插入
    * @param list List<SysDictType
    * @return Integer
    */
    Integer batchInsert(List<SysDictType> list);

    /**
     * 批量更新
     * @param list List<SysDictType>
     * @return Integer
     */
    Integer batchUpdate(List<SysDictType> list);

    /**
     * 批量删除
     * @param list List<Long >
     * @return Integer
     */
    Integer deleteBatchIds(List<Long> list);

    /**
     * 存在即更新
     * @param sysDictType SysDictType
     * @return Integer
     */
    Integer upsert(@Param("sysDictType") SysDictType sysDictType);

    /**
     * 存在即更新，可选择具体属性
     * @param sysDictType SysDictType
     * @return Integer
     */
    Integer upsertSelective(SysDictType sysDictType);

    /**
     * 条件查询
     * @param sysDictType SysDictType
     * @return List<SysDictType>
    */
    List<SysDictType> query(SysDictType sysDictType);

    /**
     * 查询总数
     * @return Integer
     */
    Long queryTotalCount();


}