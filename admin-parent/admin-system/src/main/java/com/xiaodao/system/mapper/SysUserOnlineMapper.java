package com.xiaodao.system.mapper;

import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import com.xiaodao.system.entity.SysUserOnline;


/**
 * @description SysUserOnlineMapper
 * @author高磊
 * @since jdk1.8
 */
public interface SysUserOnlineMapper extends BaseMapper<SysUserOnline>{

    /**
    * 批量插入
    * @param list List<SysUserOnline
    * @return Integer
    */
    Integer batchInsert(List<SysUserOnline> list);

    /**
     * 批量更新
     * @param list List<SysUserOnline>
     * @return Integer
     */
    Integer batchUpdate(List<SysUserOnline> list);

    /**
     * 存在即更新
     * @param sysUserOnline SysUserOnline
     * @return Integer
     */
    Integer upsert(@Param("sysUserOnline") SysUserOnline sysUserOnline);

    /**
     * 存在即更新，可选择具体属性
     * @param sysUserOnline SysUserOnline
     * @return Integer
     */
    Integer upsertSelective(@Param("sysUserOnline") SysUserOnline sysUserOnline);

    /**
     * 条件查询
     * @param sysUserOnline SysUserOnline
     * @return List<SysUserOnline>
    */
    List<SysUserOnline> query(@Param("sysUserOnline") SysUserOnline sysUserOnline);

    /**
     * 查询总数
     * @return Integer
     */
    Long queryTotalCount();


}