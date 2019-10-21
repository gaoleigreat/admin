package com.xiaodao.system.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import com.xiaodao.system.entity.GenTable;


/**
 * @description GenTableMapper
 * @author高磊
 * @since jdk1.8
 */
public interface GenTableMapper extends BaseMapper<GenTable> {

    /**
     * 批量插入
     *
     * @param list List<GenTable
     * @return Integer
     */
    Integer batchInsert(List<GenTable> list);

    /**
     * 批量更新
     *
     * @param list List<GenTable>
     * @return Integer
     */
    Integer batchUpdate(List<GenTable> list);

    /**
     * 存在即更新
     *
     * @param genTable GenTable
     * @return Integer
     */
    Integer upsert(@Param("genTable") GenTable genTable);

    /**
     * 存在即更新，可选择具体属性
     *
     * @param genTable GenTable
     * @return Integer
     */
    Integer upsertSelective(@Param("genTable") GenTable genTable);

    /**
     * 条件查询
     *
     * @param genTable GenTable
     * @return List<GenTable>
     */
    List<GenTable> query(@Param("genTable") GenTable genTable);

    /**
     * 查询总数
     *
     * @return Integer
     */
    Long queryTotalCount();


}