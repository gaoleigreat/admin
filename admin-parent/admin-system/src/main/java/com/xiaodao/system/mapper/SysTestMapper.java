package com.xiaodao.system.mapper;

import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import com.xiaodao.system.entity.SysTest;


/**
 * @description SysTestMapper
 * @authorxiaodao
 * @since jdk1.8
 */
public interface SysTestMapper extends BaseMapper<SysTest>{

    /**
    * 批量插入
    * @param list List<SysTest
    * @return Integer
    */
    Integer batchInsert(List<SysTest> list);

    /**
     * 批量更新
     * @param list List<SysTest>
     * @return Integer
     */
    Integer batchUpdate(List<SysTest> list);

    /**
     * 存在即更新
     * @param sysTest SysTest
     * @return Integer
     */
    Integer upsert(@Param("sysTest") SysTest sysTest);

    /**
     * 存在即更新，可选择具体属性
     * @param sysTest SysTest
     * @return Integer
     */
    Integer upsertSelective(@Param("sysTest") SysTest sysTest);

    /**
     * 条件查询
     * @param sysTest SysTest
     * @return List<SysTest>
    */
    List<SysTest> query(@Param("sysTest") SysTest sysTest);

    /**
     * 查询总数
     * @return Integer
     */
    Long queryTotalCount();


}