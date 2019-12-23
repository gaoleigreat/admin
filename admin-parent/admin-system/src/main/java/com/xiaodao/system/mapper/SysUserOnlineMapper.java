package com.xiaodao.system.mapper;


import org.apache.ibatis.annotations.Param;
import com.xiaodao.feign.system.entity.SysUserOnline;

import java.util.List;
import java.util.Map;
/**
 * @description SysUserOnlineMapper
 * @authorxiaodao
 * @since jdk1.8
 */
public interface SysUserOnlineMapper{

    /**
     * 新增
     * @param sysUserOnline
     * @return int
     */
    int insert(@Param("sysUserOnline") SysUserOnline sysUserOnline);

    /**
     * 带有空值判断的新增
     * @param sysUserOnline
     * @return int
     */
    int insertSelective(@Param("sysUserOnline") SysUserOnline sysUserOnline);

    /**
     * 批量插入
     * @param list
     * @return int
     */
    int batchInsert(@Param("list") List<SysUserOnline> list);

    /**
     * 带有空值判断的批量插入
     * @param list
     * @return int
     */
    int batchInsertSelective(@Param("list") List<SysUserOnline> list);

    /**
     * 根据主键更新
     * @param sysUserOnline
     * @return int
     */
    int updateByPrimaryKey(@Param("sysUserOnline") SysUserOnline sysUserOnline);

    /**
     * 带有空值判断的主键更新
     * @param sysUserOnline
     * @return int
     */
    int updateSelectiveByPrimaryKey(@Param("sysUserOnline") SysUserOnline sysUserOnline);

    /**
     * 批量更新
     * @param list
     * @return int
     */
    int batchUpdate(@Param("list") List<SysUserOnline> list);

    /**
     * 带有空值判断的批量更新
     * @param list
     * @return int
     */
    int batchUpdateSelective(@Param("list") List<SysUserOnline> list);

    /**
     * 更新插入
     * @param sysUserOnline
     * @return int
     */
    int upsert(@Param("sysUserOnline") SysUserOnline sysUserOnline);

    /**
     * 带有空值判断的更新插入
     * @param sysUserOnline
     * @return int
     */
    int upsertSelective(@Param("sysUserOnline") SysUserOnline sysUserOnline);

    /**
     * 批量更新插入
     * @param list
     * @return int
     */
    int batchUpsert(@Param("list") List<SysUserOnline> list);

    /**
     * 带有空值判断的批量更新插入
     * @param list
     * @return int
     */
    int batchUpsertSelective(@Param("list") List<SysUserOnline> list);

    /**
     * 通过主键删除
     * @param sessionid
     * @return int
     */
    int deleteByPrimaryKey(@Param("sysUserOnline") String sessionid);

    /**
     * 通过主键批量删除
     * @param list
     * @return int
     */
    int deleteBatchByPrimaryKeys(@Param("list") List<String> list);

    /**
     * 条件删除
     * @param sysUserOnline
     * @return int
     */
    int delete(@Param("sysUserOnline") SysUserOnline sysUserOnline);

    /**
     * 通过主键查询
     * @param sessionid
     * @return SysUserOnline sysUserOnline
     */
     SysUserOnline queryByPrimaryKey(@Param("sysUserOnline") String sessionid);

    /**
     * 通过主键批量查询
     * @param list
     * @return List<SysUserOnline>
     */
    List<SysUserOnline> queryBatchPrimaryKeys(@Param("list") List<String> list);

    /**
     * 条件查询一个
     * @param sysUserOnline
     * @return List<SysUserOnline>
     */
    SysUserOnline queryOne(@Param("sysUserOnline") SysUserOnline sysUserOnline);

    /**
     * 条件查询
     * @param sysUserOnline
     * @return List<SysUserOnline>
     */
    List<SysUserOnline> queryByCondition(@Param("sysUserOnline") SysUserOnline sysUserOnline);

    /**
     * 模糊查询
     * @param sysUserOnline
     * @return List<SysUserOnline>
     */
    List<SysUserOnline> queryFuzzy(@Param("sysUserOnline") SysUserOnline sysUserOnline);

    /**
     * 模糊条件查询
     * @param sysUserOnline
     * @return List<SysUserOnline>
     */
    List<SysUserOnline> queryByLikeCondition(@Param("sysUserOnline") SysUserOnline sysUserOnline);

    /**
     * 条件查询数量
     * @param sysUserOnline
     * @return int
     */
    int queryCount(@Param("sysUserOnline") SysUserOnline sysUserOnline);

    /**
     * 分组统计
     * @param sysUserOnline
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroup(@Param("sysUserOnline") SysUserOnline sysUserOnline);

    /**
     * 日统计
     * @param sysUserOnline
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByDay(@Param("sysUserOnline") SysUserOnline sysUserOnline);

    /**
     * 月统计
     * @param sysUserOnline
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByMonth(@Param("sysUserOnline") SysUserOnline sysUserOnline);

    /**
     * 年统计
     * @param sysUserOnline
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByYear(@Param("sysUserOnline") SysUserOnline sysUserOnline);



}