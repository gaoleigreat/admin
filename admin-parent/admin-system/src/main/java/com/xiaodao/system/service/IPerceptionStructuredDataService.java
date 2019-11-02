package com.xiaodao.system.service;

import java.util.List;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.apache.ibatis.annotations.Param;
import javax.validation.constraints.NotNull;
import com.xiaodao.system.entity.PerceptionStructuredData;


/**
 * @description IPerceptionStructuredData Service层
 * @author 高磊
 * @since jdk1.8
 */
public interface IPerceptionStructuredDataService {



    /**
     * 创建PerceptionStructuredData
     *
     * @param perceptionStructuredData
     * @return
     */
    Integer insert(@NotNull(message = "添加失败，参数不能为空") PerceptionStructuredData perceptionStructuredData);


    /**
     * 根据主键删除
     *
     * @param id
     * @return
     */
    Integer deleteByPrimaryKey(@NotNull(message = "删除失败，参数不能为空") Long id);

    /**
     * 修改PerceptionStructuredData
     *
     * @param perceptionStructuredData
     * @return
    */
    Integer updateByPrimaryKey(@NotNull(message = "添加失败，参数不能为空") PerceptionStructuredData perceptionStructuredData);


    /**
    * 根据主键查询
    *
    * @param id
    * @return
    */
    PerceptionStructuredData selectByPrimaryKey(@NotNull(message = "查询失败，参数不能为空") Long id);


    /**
     * 分页查询
     * @param pageIndex
     * @param pageSize
     * @param perceptionStructuredData PerceptionStructuredData
     * @return IPage<PerceptionStructuredData>
     */
    IPage<PerceptionStructuredData> queryPage(int pageIndex, int pageSize, PerceptionStructuredData perceptionStructuredData);

    /**
    * 批量插入
    * @param list List<PerceptionStructuredData
    * @return Integer
    */
    Integer batchInsert(List<PerceptionStructuredData> list);

    /**
     * 批量更新
     * @param list List<PerceptionStructuredData>
     * @return Integer
     */
    Integer batchUpdate(List<PerceptionStructuredData> list);

    /**
     * 批量删除
     * @param list List<Long >
     * @return Integer
     */
    Integer deleteBatchIds(List<Long> list);

    /**
     * 存在即更新
     * @param perceptionStructuredData PerceptionStructuredData
     * @return Integer
     */
    Integer upsert(@Param("perceptionStructuredData") PerceptionStructuredData perceptionStructuredData);

    /**
     * 存在即更新，可选择具体属性
     * @param perceptionStructuredData PerceptionStructuredData
     * @return Integer
     */
    Integer upsertSelective(PerceptionStructuredData perceptionStructuredData);

    /**
     * 条件查询
     * @param perceptionStructuredData PerceptionStructuredData
     * @return List<PerceptionStructuredData>
    */
    List<PerceptionStructuredData> query(PerceptionStructuredData perceptionStructuredData);

    /**
     * 查询总数
     * @return Integer
     */
    Long queryTotalCount();


}