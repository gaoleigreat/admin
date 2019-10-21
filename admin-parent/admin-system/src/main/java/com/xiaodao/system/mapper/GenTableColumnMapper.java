package com.xiaodao.system.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import com.xiaodao.system.entity.GenTableColumn;


/**
 * @description GenTableColumnMapper
 * @author高磊
 * @since jdk1.8
 */
public interface GenTableColumnMapper extends BaseMapper<GenTableColumn> {

    /**
     * 批量插入
     *
     * @param list List<GenTableColumn
     * @return Integer
     */
    Integer batchInsert(List<GenTableColumn> list);

    /**
     * 批量更新
     *
     * @param list List<GenTableColumn>
     * @return Integer
     */
    Integer batchUpdate(List<GenTableColumn> list);

    /**
     * 存在即更新
     *
     * @param genTableColumn GenTableColumn
     * @return Integer
     */
    Integer upsert(@Param("genTableColumn") GenTableColumn genTableColumn);

    /**
     * 存在即更新，可选择具体属性
     *
     * @param genTableColumn GenTableColumn
     * @return Integer
     */
    Integer upsertSelective(@Param("genTableColumn") GenTableColumn genTableColumn);

    /**
     * 条件查询
     *
     * @param genTableColumn GenTableColumn
     * @return List<GenTableColumn>
     */
    List<GenTableColumn> query(@Param("genTableColumn") GenTableColumn genTableColumn);

    /**
     * 查询总数
     *
     * @return Integer
     */
    Long queryTotalCount();


}