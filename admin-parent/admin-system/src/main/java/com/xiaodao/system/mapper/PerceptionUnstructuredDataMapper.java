package com.xiaodao.system.mapper;

import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import com.xiaodao.system.entity.PerceptionUnstructuredData;


/**
 * @description PerceptionUnstructuredDataMapper
 * @author高磊
 * @since jdk1.8
 */
public interface PerceptionUnstructuredDataMapper extends BaseMapper<PerceptionUnstructuredData>{

    /**
    * 批量插入
    * @param list List<PerceptionUnstructuredData
    * @return Integer
    */
    Integer batchInsert(List<PerceptionUnstructuredData> list);

    /**
     * 批量更新
     * @param list List<PerceptionUnstructuredData>
     * @return Integer
     */
    Integer batchUpdate(List<PerceptionUnstructuredData> list);

    /**
     * 存在即更新
     * @param perceptionUnstructuredData PerceptionUnstructuredData
     * @return Integer
     */
    Integer upsert(@Param("perceptionUnstructuredData") PerceptionUnstructuredData perceptionUnstructuredData);

    /**
     * 存在即更新，可选择具体属性
     * @param perceptionUnstructuredData PerceptionUnstructuredData
     * @return Integer
     */
    Integer upsertSelective(@Param("perceptionUnstructuredData") PerceptionUnstructuredData perceptionUnstructuredData);

    /**
     * 条件查询
     * @param perceptionUnstructuredData PerceptionUnstructuredData
     * @return List<PerceptionUnstructuredData>
    */
    List<PerceptionUnstructuredData> query(@Param("perceptionUnstructuredData") PerceptionUnstructuredData perceptionUnstructuredData);

    /**
     * 查询总数
     * @return Integer
     */
    Long queryTotalCount();


}