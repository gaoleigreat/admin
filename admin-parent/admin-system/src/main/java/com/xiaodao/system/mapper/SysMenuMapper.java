package com.xiaodao.system.mapper;

import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import com.xiaodao.system.entity.SysMenu;


/**
 * @description SysMenuMapper
 * @author¸ßÀÚ
 * @since jdk1.8
 */
public interface SysMenuMapper extends BaseMapper<SysMenu>{

    /**
    * 批量插入
    * @param list List<SysMenu
    * @return Integer
    */
    Integer batchInsert(List<SysMenu> list);

    /**
     * 批量更新
     * @param list List<SysMenu>
     * @return Integer
     */
    Integer batchUpdate(List<SysMenu> list);

    /**
     * 存在即更新
     * @param sysMenu SysMenu
     * @return Integer
     */
    Integer upsert(@Param("sysMenu") SysMenu sysMenu);

    /**
     * 存在即更新，可选择具体属性
     * @param sysMenu SysMenu
     * @return Integer
     */
    Integer upsertSelective(@Param("sysMenu") SysMenu sysMenu);

    /**
     * 条件查询
     * @param sysMenu SysMenu
     * @return List<SysMenu>
    */
    List<SysMenu> query(@Param("sysMenu") SysMenu sysMenu);

    /**
     * 查询总数
     * @return Integer
     */
    Long queryTotalCount();


}