package com.xiaodao.system.mapper;

import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import com.xiaodao.system.entity.SysConfig;


/**
 * @description SysConfigMapper
 * @author¸ßÀÚ
 * @since jdk1.8
 */
public interface SysConfigMapper extends BaseMapper<SysConfig>{

    /**
    * 批量插入
    * @param list List<SysConfig
    * @return Integer
    */
    Integer batchInsert(List<SysConfig> list);

    /**
     * 批量更新
     * @param list List<SysConfig>
     * @return Integer
     */
    Integer batchUpdate(List<SysConfig> list);

    /**
     * 存在即更新
     * @param sysConfig SysConfig
     * @return Integer
     */
    Integer upsert(@Param("sysConfig") SysConfig sysConfig);

    /**
     * 存在即更新，可选择具体属性
     * @param sysConfig SysConfig
     * @return Integer
     */
    Integer upsertSelective(@Param("sysConfig") SysConfig sysConfig);

    /**
     * 条件查询
     * @param sysConfig SysConfig
     * @return List<SysConfig>
    */
    List<SysConfig> query(@Param("sysConfig") SysConfig sysConfig);

    /**
     * 查询总数
     * @return Integer
     */
    Long queryTotalCount();


}