package com.xiaodao.system.mapper;


import org.apache.ibatis.annotations.Param;
import com.xiaodao.feign.system.entity.SysPost;

import java.util.List;
import java.util.Map;
/**
 * @description SysPostMapper
 * @authorxiaodao
 * @since jdk1.8
 */
public interface SysPostMapper{

    /**
     * 新增
     * @param sysPost
     * @return int
     */
    int insert(@Param("sysPost") SysPost sysPost);

    /**
     * 带有空值判断的新增
     * @param sysPost
     * @return int
     */
    int insertSelective(@Param("sysPost") SysPost sysPost);

    /**
     * 批量插入
     * @param list
     * @return int
     */
    int batchInsert(@Param("list") List<SysPost> list);

    /**
     * 带有空值判断的批量插入
     * @param list
     * @return int
     */
    int batchInsertSelective(@Param("list") List<SysPost> list);

    /**
     * 根据主键更新
     * @param sysPost
     * @return int
     */
    int updateByPrimaryKey(@Param("sysPost") SysPost sysPost);

    /**
     * 带有空值判断的主键更新
     * @param sysPost
     * @return int
     */
    int updateSelectiveByPrimaryKey(@Param("sysPost") SysPost sysPost);

    /**
     * 批量更新
     * @param list
     * @return int
     */
    int batchUpdate(@Param("list") List<SysPost> list);

    /**
     * 带有空值判断的批量更新
     * @param list
     * @return int
     */
    int batchUpdateSelective(@Param("list") List<SysPost> list);

    /**
     * 更新插入
     * @param sysPost
     * @return int
     */
    int upsert(@Param("sysPost") SysPost sysPost);

    /**
     * 带有空值判断的更新插入
     * @param sysPost
     * @return int
     */
    int upsertSelective(@Param("sysPost") SysPost sysPost);

    /**
     * 批量更新插入
     * @param list
     * @return int
     */
    int batchUpsert(@Param("list") List<SysPost> list);

    /**
     * 带有空值判断的批量更新插入
     * @param list
     * @return int
     */
    int batchUpsertSelective(@Param("list") List<SysPost> list);

    /**
     * 通过主键删除
     * @param postId
     * @return int
     */
    int deleteByPrimaryKey(@Param("sysPost") Long postId);

    /**
     * 通过主键批量删除
     * @param list
     * @return int
     */
    int deleteBatchByPrimaryKeys(@Param("list") List<Long> list);

    /**
     * 条件删除
     * @param sysPost
     * @return int
     */
    int delete(@Param("sysPost") SysPost sysPost);

    /**
     * 通过主键查询
     * @param postId
     * @return SysPost sysPost
     */
     SysPost queryByPrimaryKey(@Param("sysPost") Long postId);

    /**
     * 通过主键批量查询
     * @param list
     * @return List<SysPost>
     */
    List<SysPost> queryBatchPrimaryKeys(@Param("list") List<Long> list);

    /**
     * 条件查询一个
     * @param sysPost
     * @return List<SysPost>
     */
    SysPost queryOne(@Param("sysPost") SysPost sysPost);

    /**
     * 条件查询
     * @param sysPost
     * @return List<SysPost>
     */
    List<SysPost> queryByCondition(@Param("sysPost") SysPost sysPost);

    /**
     * 模糊查询
     * @param sysPost
     * @return List<SysPost>
     */
    List<SysPost> queryFuzzy(@Param("sysPost") SysPost sysPost);

    /**
     * 模糊条件查询
     * @param sysPost
     * @return List<SysPost>
     */
    List<SysPost> queryByLikeCondition(@Param("sysPost") SysPost sysPost);

    /**
     * 条件查询数量
     * @param sysPost
     * @return int
     */
    int queryCount(@Param("sysPost") SysPost sysPost);

    /**
     * 分组统计
     * @param sysPost
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroup(@Param("sysPost") SysPost sysPost);

    /**
     * 日统计
     * @param sysPost
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByDay(@Param("sysPost") SysPost sysPost);

    /**
     * 月统计
     * @param sysPost
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByMonth(@Param("sysPost") SysPost sysPost);

    /**
     * 年统计
     * @param sysPost
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByYear(@Param("sysPost") SysPost sysPost);



}