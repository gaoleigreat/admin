package com.xiaodao.system.mapper;

import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import com.xiaodao.system.entity.SysRoleDept;


/**
 * @description SysRoleDeptMapper
 * @author高磊
 * @since jdk1.8
 */
public interface SysRoleDeptMapper extends BaseMapper<SysRoleDept>{

    /**
    * 批量插入
    * @param list List<SysRoleDept
    * @return Integer
    */
    Integer batchInsert(List<SysRoleDept> list);

    /**
     * 批量更新
     * @param list List<SysRoleDept>
     * @return Integer
     */
    Integer batchUpdate(List<SysRoleDept> list);

    /**
     * 存在即更新
     * @param sysRoleDept SysRoleDept
     * @return Integer
     */
    Integer upsert(@Param("sysRoleDept") SysRoleDept sysRoleDept);

    /**
     * 存在即更新，可选择具体属性
     * @param sysRoleDept SysRoleDept
     * @return Integer
     */
    Integer upsertSelective(@Param("sysRoleDept") SysRoleDept sysRoleDept);

    /**
     * 条件查询
     * @param sysRoleDept SysRoleDept
     * @return List<SysRoleDept>
    */
    List<SysRoleDept> query(@Param("sysRoleDept") SysRoleDept sysRoleDept);

    /**
     * 查询总数
     * @return Integer
     */
    Long queryTotalCount();


}