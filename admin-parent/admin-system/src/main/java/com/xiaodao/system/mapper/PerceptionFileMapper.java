package com.xiaodao.system.mapper;

import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import com.xiaodao.system.entity.PerceptionFile;


/**
 * @description PerceptionFileMapper
 * @authorxiaodao
 * @since jdk1.8
 */
public interface PerceptionFileMapper extends BaseMapper<PerceptionFile>{

    /**
    * 批量插入
    * @param list List<PerceptionFile
    * @return Integer
    */
    Integer batchInsert(List<PerceptionFile> list);

    /**
     * 批量更新
     * @param list List<PerceptionFile>
     * @return Integer
     */
    Integer batchUpdate(List<PerceptionFile> list);

    /**
     * 存在即更新
     * @param perceptionFile PerceptionFile
     * @return Integer
     */
    Integer upsert(@Param("perceptionFile") PerceptionFile perceptionFile);

    /**
     * 存在即更新，可选择具体属性
     * @param perceptionFile PerceptionFile
     * @return Integer
     */
    Integer upsertSelective(@Param("perceptionFile") PerceptionFile perceptionFile);

    /**
     * 条件查询
     * @param perceptionFile PerceptionFile
     * @return List<PerceptionFile>
    */
    List<PerceptionFile> query(@Param("perceptionFile") PerceptionFile perceptionFile);

    /**
     * 查询总数
     * @return Integer
     */
    Long queryTotalCount();


}