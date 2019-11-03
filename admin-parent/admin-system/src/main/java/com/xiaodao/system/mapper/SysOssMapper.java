package com.xiaodao.system.mapper;

import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import com.xiaodao.system.entity.SysOss;


/**
 * @description SysOssMapper
 * @authorxiaodao
 * @since jdk1.8
 */
public interface SysOssMapper extends BaseMapper<SysOss>{

    /**
    * 批量插入
    * @param list List<SysOss
    * @return Integer
    */
    Integer batchInsert(List<SysOss> list);

    /**
     * 批量更新
     * @param list List<SysOss>
     * @return Integer
     */
    Integer batchUpdate(List<SysOss> list);

    /**
     * 存在即更新
     * @param sysOss SysOss
     * @return Integer
     */
    Integer upsert(@Param("sysOss") SysOss sysOss);

    /**
     * 存在即更新，可选择具体属性
     * @param sysOss SysOss
     * @return Integer
     */
    Integer upsertSelective(@Param("sysOss") SysOss sysOss);

    /**
     * 条件查询
     * @param sysOss SysOss
     * @return List<SysOss>
    */
    List<SysOss> query(@Param("sysOss") SysOss sysOss);

    /**
     * 查询总数
     * @return Integer
     */
    Long queryTotalCount();


}