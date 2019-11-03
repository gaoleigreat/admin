package com.xiaodao.system.mapper;

import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import com.xiaodao.system.entity.SysRole;


/**
 * @description SysRoleMapper
 * @authorxiaodao
 * @since jdk1.8
 */
public interface SysRoleMapper extends BaseMapper<SysRole>{

    /**
    * 批量插入
    * @param list List<SysRole
    * @return Integer
    */
    Integer batchInsert(List<SysRole> list);

    /**
     * 批量更新
     * @param list List<SysRole>
     * @return Integer
     */
    Integer batchUpdate(List<SysRole> list);

    /**
     * 存在即更新
     * @param sysRole SysRole
     * @return Integer
     */
    Integer upsert(@Param("sysRole") SysRole sysRole);

    /**
     * 存在即更新，可选择具体属性
     * @param sysRole SysRole
     * @return Integer
     */
    Integer upsertSelective(@Param("sysRole") SysRole sysRole);

    /**
     * 条件查询
     * @param sysRole SysRole
     * @return List<SysRole>
    */
    List<SysRole> query(@Param("sysRole") SysRole sysRole);

    /**
     * 查询总数
     * @return Integer
     */
    Long queryTotalCount();


}