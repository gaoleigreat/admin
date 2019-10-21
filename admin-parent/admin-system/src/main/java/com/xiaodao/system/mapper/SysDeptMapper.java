package com.xiaodao.system.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import com.xiaodao.system.entity.SysDept;


/**
 * @description SysDeptMapper
 * @author高磊
 * @since jdk1.8
 */
public interface SysDeptMapper extends BaseMapper<SysDept> {

    /**
     * 批量插入
     *
     * @param list List<SysDept
     * @return Integer
     */
    Integer batchInsert(List<SysDept> list);

    /**
     * 批量更新
     *
     * @param list List<SysDept>
     * @return Integer
     */
    Integer batchUpdate(List<SysDept> list);

    /**
     * 存在即更新
     *
     * @param sysDept SysDept
     * @return Integer
     */
    Integer upsert(@Param("sysDept") SysDept sysDept);

    /**
     * 存在即更新，可选择具体属性
     *
     * @param sysDept SysDept
     * @return Integer
     */
    Integer upsertSelective(@Param("sysDept") SysDept sysDept);

    /**
     * 条件查询
     *
     * @param sysDept SysDept
     * @return List<SysDept>
     */
    List<SysDept> query(@Param("sysDept") SysDept sysDept);

    /**
     * 查询总数
     *
     * @return Integer
     */
    Long queryTotalCount();


}