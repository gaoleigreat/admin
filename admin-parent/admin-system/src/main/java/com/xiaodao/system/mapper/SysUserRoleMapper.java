package com.xiaodao.system.mapper;

import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import com.xiaodao.system.entity.SysUserRole;


/**
 * @description SysUserRoleMapper
 * @author¸ßÀÚ
 * @since jdk1.8
 */
public interface SysUserRoleMapper extends BaseMapper<SysUserRole>{

    /**
    * 批量插入
    * @param list List<SysUserRole
    * @return Integer
    */
    Integer batchInsert(List<SysUserRole> list);

    /**
     * 批量更新
     * @param list List<SysUserRole>
     * @return Integer
     */
    Integer batchUpdate(List<SysUserRole> list);

    /**
     * 存在即更新
     * @param sysUserRole SysUserRole
     * @return Integer
     */
    Integer upsert(@Param("sysUserRole") SysUserRole sysUserRole);

    /**
     * 存在即更新，可选择具体属性
     * @param sysUserRole SysUserRole
     * @return Integer
     */
    Integer upsertSelective(@Param("sysUserRole") SysUserRole sysUserRole);

    /**
     * 条件查询
     * @param sysUserRole SysUserRole
     * @return List<SysUserRole>
    */
    List<SysUserRole> query(@Param("sysUserRole") SysUserRole sysUserRole);

    /**
     * 查询总数
     * @return Integer
     */
    Long queryTotalCount();


}