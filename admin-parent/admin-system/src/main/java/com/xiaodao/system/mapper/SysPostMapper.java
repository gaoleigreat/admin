package com.xiaodao.system.mapper;

import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import com.xiaodao.system.entity.SysPost;


/**
 * @description SysPostMapper
 * @author高磊
 * @since jdk1.8
 */
public interface SysPostMapper extends BaseMapper<SysPost>{

    /**
    * 批量插入
    * @param list List<SysPost
    * @return Integer
    */
    Integer batchInsert(List<SysPost> list);

    /**
     * 批量更新
     * @param list List<SysPost>
     * @return Integer
     */
    Integer batchUpdate(List<SysPost> list);

    /**
     * 存在即更新
     * @param sysPost SysPost
     * @return Integer
     */
    Integer upsert(@Param("sysPost") SysPost sysPost);

    /**
     * 存在即更新，可选择具体属性
     * @param sysPost SysPost
     * @return Integer
     */
    Integer upsertSelective(@Param("sysPost") SysPost sysPost);

    /**
     * 条件查询
     * @param sysPost SysPost
     * @return List<SysPost>
    */
    List<SysPost> query(@Param("sysPost") SysPost sysPost);

    /**
     * 查询总数
     * @return Integer
     */
    Long queryTotalCount();


}