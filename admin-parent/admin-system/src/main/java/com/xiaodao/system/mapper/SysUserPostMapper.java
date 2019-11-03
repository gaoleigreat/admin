package com.xiaodao.system.mapper;

import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import com.xiaodao.system.entity.SysUserPost;


/**
 * @description SysUserPostMapper
 * @authorxiaodao
 * @since jdk1.8
 */
public interface SysUserPostMapper extends BaseMapper<SysUserPost>{

    /**
    * 批量插入
    * @param list List<SysUserPost
    * @return Integer
    */
    Integer batchInsert(List<SysUserPost> list);

    /**
     * 批量更新
     * @param list List<SysUserPost>
     * @return Integer
     */
    Integer batchUpdate(List<SysUserPost> list);

    /**
     * 存在即更新
     * @param sysUserPost SysUserPost
     * @return Integer
     */
    Integer upsert(@Param("sysUserPost") SysUserPost sysUserPost);

    /**
     * 存在即更新，可选择具体属性
     * @param sysUserPost SysUserPost
     * @return Integer
     */
    Integer upsertSelective(@Param("sysUserPost") SysUserPost sysUserPost);

    /**
     * 条件查询
     * @param sysUserPost SysUserPost
     * @return List<SysUserPost>
    */
    List<SysUserPost> query(@Param("sysUserPost") SysUserPost sysUserPost);

    /**
     * 查询总数
     * @return Integer
     */
    Long queryTotalCount();


}