package com.xiaodao.system.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import com.xiaodao.system.entity.SysDictData;


/**
 * @description SysDictDataMapper
 * @author高磊
 * @since jdk1.8
 */
public interface SysDictDataMapper extends BaseMapper<SysDictData> {

    /**
     * 批量插入
     *
     * @param list List<SysDictData
     * @return Integer
     */
    Integer batchInsert(List<SysDictData> list);

    /**
     * 批量更新
     *
     * @param list List<SysDictData>
     * @return Integer
     */
    Integer batchUpdate(List<SysDictData> list);

    /**
     * 存在即更新
     *
     * @param sysDictData SysDictData
     * @return Integer
     */
    Integer upsert(@Param("sysDictData") SysDictData sysDictData);

    /**
     * 存在即更新，可选择具体属性
     *
     * @param sysDictData SysDictData
     * @return Integer
     */
    Integer upsertSelective(@Param("sysDictData") SysDictData sysDictData);

    /**
     * 条件查询
     *
     * @param sysDictData SysDictData
     * @return List<SysDictData>
     */
    List<SysDictData> query(@Param("sysDictData") SysDictData sysDictData);

    /**
     * 查询总数
     *
     * @return Integer
     */
    Long queryTotalCount();


}