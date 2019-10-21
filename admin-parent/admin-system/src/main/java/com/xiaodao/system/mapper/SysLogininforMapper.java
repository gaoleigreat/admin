package com.xiaodao.system.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import com.xiaodao.system.entity.SysLogininfor;


/**
 * @description SysLogininforMapper
 * @author高磊
 * @since jdk1.8
 */
public interface SysLogininforMapper extends BaseMapper<SysLogininfor> {

    /**
     * 批量插入
     *
     * @param list List<SysLogininfor
     * @return Integer
     */
    Integer batchInsert(List<SysLogininfor> list);

    /**
     * 批量更新
     *
     * @param list List<SysLogininfor>
     * @return Integer
     */
    Integer batchUpdate(List<SysLogininfor> list);

    /**
     * 存在即更新
     *
     * @param sysLogininfor SysLogininfor
     * @return Integer
     */
    Integer upsert(@Param("sysLogininfor") SysLogininfor sysLogininfor);

    /**
     * 存在即更新，可选择具体属性
     *
     * @param sysLogininfor SysLogininfor
     * @return Integer
     */
    Integer upsertSelective(@Param("sysLogininfor") SysLogininfor sysLogininfor);

    /**
     * 条件查询
     *
     * @param sysLogininfor SysLogininfor
     * @return List<SysLogininfor>
     */
    List<SysLogininfor> query(@Param("sysLogininfor") SysLogininfor sysLogininfor);

    /**
     * 查询总数
     *
     * @return Integer
     */
    Long queryTotalCount();


}