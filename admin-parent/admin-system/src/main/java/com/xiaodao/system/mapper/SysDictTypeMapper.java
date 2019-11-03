package com.xiaodao.system.mapper;

import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import com.xiaodao.system.entity.SysDictType;


/**
 * @description SysDictTypeMapper
 * @authorxiaodao
 * @since jdk1.8
 */
public interface SysDictTypeMapper extends BaseMapper<SysDictType>{

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
    Integer upsertSelective(@Param("sysDictType") SysDictType sysDictType);

    /**
     * 条件查询
     * @param sysDictType SysDictType
     * @return List<SysDictType>
    */
    List<SysDictType> query(@Param("sysDictType") SysDictType sysDictType);

    /**
     * 查询总数
     * @return Integer
     */
    Long queryTotalCount();


}