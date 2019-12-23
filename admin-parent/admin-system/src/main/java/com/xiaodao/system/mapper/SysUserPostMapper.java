package com.xiaodao.system.mapper;


import org.apache.ibatis.annotations.Param;
import com.xiaodao.feign.system.entity.SysUserPost;

import java.util.List;
import java.util.Map;
/**
 * @description SysUserPostMapper
 * @authorxiaodao
 * @since jdk1.8
 */
public interface SysUserPostMapper{

    /**
     * 新增
     * @param sysUserPost
     * @return int
     */
    int insert(@Param("sysUserPost") SysUserPost sysUserPost);

    /**
     * 带有空值判断的新增
     * @param sysUserPost
     * @return int
     */
    int insertSelective(@Param("sysUserPost") SysUserPost sysUserPost);

    /**
     * 批量插入
     * @param list
     * @return int
     */
    int batchInsert(@Param("list") List<SysUserPost> list);

    /**
     * 带有空值判断的批量插入
     * @param list
     * @return int
     */
    int batchInsertSelective(@Param("list") List<SysUserPost> list);

    /**
     * 根据主键更新
     * @param sysUserPost
     * @return int
     */
    int updateByPrimaryKey(@Param("sysUserPost") SysUserPost sysUserPost);

    /**
     * 带有空值判断的主键更新
     * @param sysUserPost
     * @return int
     */
    int updateSelectiveByPrimaryKey(@Param("sysUserPost") SysUserPost sysUserPost);

    /**
     * 批量更新
     * @param list
     * @return int
     */
    int batchUpdate(@Param("list") List<SysUserPost> list);

    /**
     * 带有空值判断的批量更新
     * @param list
     * @return int
     */
    int batchUpdateSelective(@Param("list") List<SysUserPost> list);

    /**
     * 更新插入
     * @param sysUserPost
     * @return int
     */
    int upsert(@Param("sysUserPost") SysUserPost sysUserPost);

    /**
     * 带有空值判断的更新插入
     * @param sysUserPost
     * @return int
     */
    int upsertSelective(@Param("sysUserPost") SysUserPost sysUserPost);

    /**
     * 批量更新插入
     * @param list
     * @return int
     */
    int batchUpsert(@Param("list") List<SysUserPost> list);

    /**
     * 带有空值判断的批量更新插入
     * @param list
     * @return int
     */
    int batchUpsertSelective(@Param("list") List<SysUserPost> list);

    /**
     * 通过主键删除
     * @param userId
     * @return int
     */
    int deleteByPrimaryKey(@Param("sysUserPost") Integer userId);

    /**
     * 通过主键批量删除
     * @param list
     * @return int
     */
    int deleteBatchByPrimaryKeys(@Param("list") List<Integer> list);

    /**
     * 条件删除
     * @param sysUserPost
     * @return int
     */
    int delete(@Param("sysUserPost") SysUserPost sysUserPost);

    /**
     * 通过主键查询
     * @param userId
     * @return SysUserPost sysUserPost
     */
     SysUserPost queryByPrimaryKey(@Param("sysUserPost") Integer userId);

    /**
     * 通过主键批量查询
     * @param list
     * @return List<SysUserPost>
     */
    List<SysUserPost> queryBatchPrimaryKeys(@Param("list") List<Integer> list);

    /**
     * 条件查询一个
     * @param sysUserPost
     * @return List<SysUserPost>
     */
    SysUserPost queryOne(@Param("sysUserPost") SysUserPost sysUserPost);

    /**
     * 条件查询
     * @param sysUserPost
     * @return List<SysUserPost>
     */
    List<SysUserPost> queryByCondition(@Param("sysUserPost") SysUserPost sysUserPost);

    /**
     * 模糊查询
     * @param sysUserPost
     * @return List<SysUserPost>
     */
    List<SysUserPost> queryFuzzy(@Param("sysUserPost") SysUserPost sysUserPost);

    /**
     * 模糊条件查询
     * @param sysUserPost
     * @return List<SysUserPost>
     */
    List<SysUserPost> queryByLikeCondition(@Param("sysUserPost") SysUserPost sysUserPost);

    /**
     * 条件查询数量
     * @param sysUserPost
     * @return int
     */
    int queryCount(@Param("sysUserPost") SysUserPost sysUserPost);

    /**
     * 分组统计
     * @param sysUserPost
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroup(@Param("sysUserPost") SysUserPost sysUserPost);

    /**
     * 日统计
     * @param sysUserPost
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByDay(@Param("sysUserPost") SysUserPost sysUserPost);

    /**
     * 月统计
     * @param sysUserPost
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByMonth(@Param("sysUserPost") SysUserPost sysUserPost);

    /**
     * 年统计
     * @param sysUserPost
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByYear(@Param("sysUserPost") SysUserPost sysUserPost);



}