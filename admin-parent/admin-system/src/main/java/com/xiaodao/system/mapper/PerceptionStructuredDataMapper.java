package com.xiaodao.system.mapper;

import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import com.xiaodao.system.entity.PerceptionStructuredData;


/**
 * @description PerceptionStructuredDataMapper
 * @author高磊
 * @since jdk1.8
 */
public interface PerceptionStructuredDataMapper extends BaseMapper<PerceptionStructuredData>{

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
    Integer upsertSelective(@Param("perceptionStructuredData") PerceptionStructuredData perceptionStructuredData);

    /**
     * 条件查询
     * @param perceptionStructuredData PerceptionStructuredData
     * @return List<PerceptionStructuredData>
    */
    List<PerceptionStructuredData> query(@Param("perceptionStructuredData") PerceptionStructuredData perceptionStructuredData);

    /**
     * 查询总数
     * @return Integer
     */
    Long queryTotalCount();


}