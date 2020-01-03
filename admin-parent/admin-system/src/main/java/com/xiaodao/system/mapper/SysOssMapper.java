package com.xiaodao.system.mapper;


import org.apache.ibatis.annotations.Param;
import com.xiaodao.admin.entity.SysOss;

import java.util.List;
import java.util.Map;
/**
 * @description SysOssMapper
 * @author¸ßÀÚ
 * @since jdk1.8
 */
public interface SysOssMapper{

    /**
     * 新增
     * @param sysOss
     * @return int
     */
    int insert(@Param("sysOss") SysOss sysOss);

    /**
     * 带有空值判断的新增
     * @param sysOss
     * @return int
     */
    int insertSelective(@Param("sysOss") SysOss sysOss);

    /**
     * 批量插入
     * @param list
     * @return int
     */
    int batchInsert(@Param("list") List<SysOss> list);

    /**
     * 带有空值判断的批量插入
     * @param list
     * @return int
     */
    int batchInsertSelective(@Param("list") List<SysOss> list);

    /**
     * 根据主键更新
     * @param sysOss
     * @return int
     */
    int updateByPrimaryKey(@Param("sysOss") SysOss sysOss);

    /**
     * 带有空值判断的主键更新
     * @param sysOss
     * @return int
     */
    int updateSelectiveByPrimaryKey(@Param("sysOss") SysOss sysOss);

    /**
     * 批量更新
     * @param list
     * @return int
     */
    int batchUpdate(@Param("list") List<SysOss> list);

    /**
     * 带有空值判断的批量更新
     * @param list
     * @return int
     */
    int batchUpdateSelective(@Param("list") List<SysOss> list);

    /**
     * 更新插入
     * @param sysOss
     * @return int
     */
    int upsert(@Param("sysOss") SysOss sysOss);

    /**
     * 带有空值判断的更新插入
     * @param sysOss
     * @return int
     */
    int upsertSelective(@Param("sysOss") SysOss sysOss);

    /**
     * 批量更新插入
     * @param list
     * @return int
     */
    int batchUpsert(@Param("list") List<SysOss> list);

    /**
     * 带有空值判断的批量更新插入
     * @param list
     * @return int
     */
    int batchUpsertSelective(@Param("list") List<SysOss> list);

    /**
     * 通过主键删除
     * @param id
     * @return int
     */
    int deleteByPrimaryKey(@Param("sysOss") Long id);

    /**
     * 通过主键批量删除
     * @param list
     * @return int
     */
    int deleteBatchByPrimaryKeys(@Param("list") List<Long> list);

    /**
     * 条件删除
     * @param sysOss
     * @return int
     */
    int delete(@Param("sysOss") SysOss sysOss);

    /**
     * 通过主键查询
     * @param id
     * @return SysOss sysOss
     */
     SysOss queryByPrimaryKey(@Param("sysOss") Long id);

    /**
     * 通过主键批量查询
     * @param list
     * @return List<SysOss>
     */
    List<SysOss> queryBatchPrimaryKeys(@Param("list") List<Long> list);

    /**
     * 条件查询一个
     * @param sysOss
     * @return List<SysOss>
     */
    SysOss queryOne(@Param("sysOss") SysOss sysOss);

    /**
     * 条件查询
     * @param sysOss
     * @return List<SysOss>
     */
    List<SysOss> queryByCondition(@Param("sysOss") SysOss sysOss);

    /**
     * 模糊查询
     * @param sysOss
     * @return List<SysOss>
     */
    List<SysOss> queryFuzzy(@Param("sysOss") SysOss sysOss);

    /**
     * 模糊条件查询
     * @param sysOss
     * @return List<SysOss>
     */
    List<SysOss> queryByLikeCondition(@Param("sysOss") SysOss sysOss);

    /**
     * 条件查询数量
     * @param sysOss
     * @return int
     */
    int queryCount(@Param("sysOss") SysOss sysOss);

    /**
     * 分组统计
     * @param sysOss
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroup(@Param("sysOss") SysOss sysOss);

    /**
     * 日统计
     * @param sysOss
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByDay(@Param("sysOss") SysOss sysOss);

    /**
     * 月统计
     * @param sysOss
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByMonth(@Param("sysOss") SysOss sysOss);

    /**
     * 年统计
     * @param sysOss
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByYear(@Param("sysOss") SysOss sysOss);



}