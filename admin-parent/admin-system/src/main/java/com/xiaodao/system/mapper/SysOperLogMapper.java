package com.xiaodao.system.mapper;

import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import com.xiaodao.system.entity.SysOperLog;


/**
 * @description SysOperLogMapper
 * @authorxiaodao
 * @since jdk1.8
 */
public interface SysOperLogMapper extends BaseMapper<SysOperLog>{

    /**
    * 批量插入
    * @param list List<SysOperLog
    * @return Integer
    */
    Integer batchInsert(List<SysOperLog> list);

    /**
     * 批量更新
     * @param list List<SysOperLog>
     * @return Integer
     */
    Integer batchUpdate(List<SysOperLog> list);

    /**
     * 存在即更新
     * @param sysOperLog SysOperLog
     * @return Integer
     */
    Integer upsert(@Param("sysOperLog") SysOperLog sysOperLog);

    /**
     * 存在即更新，可选择具体属性
     * @param sysOperLog SysOperLog
     * @return Integer
     */
    Integer upsertSelective(@Param("sysOperLog") SysOperLog sysOperLog);

    /**
     * 条件查询
     * @param sysOperLog SysOperLog
     * @return List<SysOperLog>
    */
    List<SysOperLog> query(@Param("sysOperLog") SysOperLog sysOperLog);

    /**
     * 查询总数
     * @return Integer
     */
    Long queryTotalCount();


}