package com.xiaodao.system.mapper;


import org.apache.ibatis.annotations.Param;
import com.xiaodao.admin.entity.SysNotice;

import java.util.List;
import java.util.Map;
/**
 * @description SysNoticeMapper
 * @author¸ßÀÚ
 * @since jdk1.8
 */
public interface SysNoticeMapper{

    /**
     * 新增
     * @param sysNotice
     * @return int
     */
    int insert(@Param("sysNotice") SysNotice sysNotice);

    /**
     * 带有空值判断的新增
     * @param sysNotice
     * @return int
     */
    int insertSelective(@Param("sysNotice") SysNotice sysNotice);

    /**
     * 批量插入
     * @param list
     * @return int
     */
    int batchInsert(@Param("list") List<SysNotice> list);

    /**
     * 带有空值判断的批量插入
     * @param list
     * @return int
     */
    int batchInsertSelective(@Param("list") List<SysNotice> list);

    /**
     * 根据主键更新
     * @param sysNotice
     * @return int
     */
    int updateByPrimaryKey(@Param("sysNotice") SysNotice sysNotice);

    /**
     * 带有空值判断的主键更新
     * @param sysNotice
     * @return int
     */
    int updateSelectiveByPrimaryKey(@Param("sysNotice") SysNotice sysNotice);

    /**
     * 批量更新
     * @param list
     * @return int
     */
    int batchUpdate(@Param("list") List<SysNotice> list);

    /**
     * 带有空值判断的批量更新
     * @param list
     * @return int
     */
    int batchUpdateSelective(@Param("list") List<SysNotice> list);

    /**
     * 更新插入
     * @param sysNotice
     * @return int
     */
    int upsert(@Param("sysNotice") SysNotice sysNotice);

    /**
     * 带有空值判断的更新插入
     * @param sysNotice
     * @return int
     */
    int upsertSelective(@Param("sysNotice") SysNotice sysNotice);

    /**
     * 批量更新插入
     * @param list
     * @return int
     */
    int batchUpsert(@Param("list") List<SysNotice> list);

    /**
     * 带有空值判断的批量更新插入
     * @param list
     * @return int
     */
    int batchUpsertSelective(@Param("list") List<SysNotice> list);

    /**
     * 通过主键删除
     * @param noticeId
     * @return int
     */
    int deleteByPrimaryKey(@Param("sysNotice") Integer noticeId);

    /**
     * 通过主键批量删除
     * @param list
     * @return int
     */
    int deleteBatchByPrimaryKeys(@Param("list") List<Integer> list);

    /**
     * 条件删除
     * @param sysNotice
     * @return int
     */
    int delete(@Param("sysNotice") SysNotice sysNotice);

    /**
     * 通过主键查询
     * @param noticeId
     * @return SysNotice sysNotice
     */
     SysNotice queryByPrimaryKey(@Param("sysNotice") Integer noticeId);

    /**
     * 通过主键批量查询
     * @param list
     * @return List<SysNotice>
     */
    List<SysNotice> queryBatchPrimaryKeys(@Param("list") List<Integer> list);

    /**
     * 条件查询一个
     * @param sysNotice
     * @return List<SysNotice>
     */
    SysNotice queryOne(@Param("sysNotice") SysNotice sysNotice);

    /**
     * 条件查询
     * @param sysNotice
     * @return List<SysNotice>
     */
    List<SysNotice> queryByCondition(@Param("sysNotice") SysNotice sysNotice);

    /**
     * 模糊查询
     * @param sysNotice
     * @return List<SysNotice>
     */
    List<SysNotice> queryFuzzy(@Param("sysNotice") SysNotice sysNotice);

    /**
     * 模糊条件查询
     * @param sysNotice
     * @return List<SysNotice>
     */
    List<SysNotice> queryByLikeCondition(@Param("sysNotice") SysNotice sysNotice);

    /**
     * 条件查询数量
     * @param sysNotice
     * @return int
     */
    int queryCount(@Param("sysNotice") SysNotice sysNotice);

    /**
     * 分组统计
     * @param sysNotice
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroup(@Param("sysNotice") SysNotice sysNotice);

    /**
     * 日统计
     * @param sysNotice
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByDay(@Param("sysNotice") SysNotice sysNotice);

    /**
     * 月统计
     * @param sysNotice
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByMonth(@Param("sysNotice") SysNotice sysNotice);

    /**
     * 年统计
     * @param sysNotice
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByYear(@Param("sysNotice") SysNotice sysNotice);



}