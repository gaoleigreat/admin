package com.xiaodao.system.mapper;

import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import com.xiaodao.system.entity.SysUser;


/**
 * @description SysUserMapper
 * @author¸ßÀÚ
 * @since jdk1.8
 */
public interface SysUserMapper extends BaseMapper<SysUser>{

    /**
    * 批量插入
    * @param list List<SysUser
    * @return Integer
    */
    Integer batchInsert(List<SysUser> list);

    /**
     * 批量更新
     * @param list List<SysUser>
     * @return Integer
     */
    Integer batchUpdate(List<SysUser> list);

    /**
     * 存在即更新
     * @param sysUser SysUser
     * @return Integer
     */
    Integer upsert(@Param("sysUser") SysUser sysUser);

    /**
     * 存在即更新，可选择具体属性
     * @param sysUser SysUser
     * @return Integer
     */
    Integer upsertSelective(@Param("sysUser") SysUser sysUser);

    /**
     * 条件查询
     * @param sysUser SysUser
     * @return List<SysUser>
    */
    List<SysUser> query(@Param("sysUser") SysUser sysUser);

    /**
     * 查询总数
     * @return Integer
     */
    Long queryTotalCount();


}