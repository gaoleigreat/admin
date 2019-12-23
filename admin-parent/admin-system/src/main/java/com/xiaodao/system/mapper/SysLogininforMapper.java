package com.xiaodao.system.mapper;


import org.apache.ibatis.annotations.Param;
import com.xiaodao.feign.system.entity.SysLogininfor;

import java.util.List;
import java.util.Map;
/**
 * @description SysLogininforMapper
 * @author¸ßÀÚ
 * @since jdk1.8
 */
public interface SysLogininforMapper{

    /**
     * 新增
     * @param sysLogininfor
     * @return int
     */
    int insert(@Param("sysLogininfor") SysLogininfor sysLogininfor);

    /**
     * 带有空值判断的新增
     * @param sysLogininfor
     * @return int
     */
    int insertSelective(@Param("sysLogininfor") SysLogininfor sysLogininfor);

    /**
     * 批量插入
     * @param list
     * @return int
     */
    int batchInsert(@Param("list") List<SysLogininfor> list);

    /**
     * 带有空值判断的批量插入
     * @param list
     * @return int
     */
    int batchInsertSelective(@Param("list") List<SysLogininfor> list);

    /**
     * 根据主键更新
     * @param sysLogininfor
     * @return int
     */
    int updateByPrimaryKey(@Param("sysLogininfor") SysLogininfor sysLogininfor);

    /**
     * 带有空值判断的主键更新
     * @param sysLogininfor
     * @return int
     */
    int updateSelectiveByPrimaryKey(@Param("sysLogininfor") SysLogininfor sysLogininfor);

    /**
     * 批量更新
     * @param list
     * @return int
     */
    int batchUpdate(@Param("list") List<SysLogininfor> list);

    /**
     * 带有空值判断的批量更新
     * @param list
     * @return int
     */
    int batchUpdateSelective(@Param("list") List<SysLogininfor> list);

    /**
     * 更新插入
     * @param sysLogininfor
     * @return int
     */
    int upsert(@Param("sysLogininfor") SysLogininfor sysLogininfor);

    /**
     * 带有空值判断的更新插入
     * @param sysLogininfor
     * @return int
     */
    int upsertSelective(@Param("sysLogininfor") SysLogininfor sysLogininfor);

    /**
     * 批量更新插入
     * @param list
     * @return int
     */
    int batchUpsert(@Param("list") List<SysLogininfor> list);

    /**
     * 带有空值判断的批量更新插入
     * @param list
     * @return int
     */
    int batchUpsertSelective(@Param("list") List<SysLogininfor> list);

    /**
     * 通过主键删除
     * @param infoId
     * @return int
     */
    int deleteByPrimaryKey(@Param("sysLogininfor") Long infoId);

    /**
     * 通过主键批量删除
     * @param list
     * @return int
     */
    int deleteBatchByPrimaryKeys(@Param("list") List<Long> list);

    /**
     * 条件删除
     * @param sysLogininfor
     * @return int
     */
    int delete(@Param("sysLogininfor") SysLogininfor sysLogininfor);

    /**
     * 通过主键查询
     * @param infoId
     * @return SysLogininfor sysLogininfor
     */
     SysLogininfor queryByPrimaryKey(@Param("sysLogininfor") Long infoId);

    /**
     * 通过主键批量查询
     * @param list
     * @return List<SysLogininfor>
     */
    List<SysLogininfor> queryBatchPrimaryKeys(@Param("list") List<Long> list);

    /**
     * 条件查询一个
     * @param sysLogininfor
     * @return List<SysLogininfor>
     */
    SysLogininfor queryOne(@Param("sysLogininfor") SysLogininfor sysLogininfor);

    /**
     * 条件查询
     * @param sysLogininfor
     * @return List<SysLogininfor>
     */
    List<SysLogininfor> queryByCondition(@Param("sysLogininfor") SysLogininfor sysLogininfor);

    /**
     * 模糊查询
     * @param sysLogininfor
     * @return List<SysLogininfor>
     */
    List<SysLogininfor> queryFuzzy(@Param("sysLogininfor") SysLogininfor sysLogininfor);

    /**
     * 模糊条件查询
     * @param sysLogininfor
     * @return List<SysLogininfor>
     */
    List<SysLogininfor> queryByLikeCondition(@Param("sysLogininfor") SysLogininfor sysLogininfor);

    /**
     * 条件查询数量
     * @param sysLogininfor
     * @return int
     */
    int queryCount(@Param("sysLogininfor") SysLogininfor sysLogininfor);

    /**
     * 分组统计
     * @param sysLogininfor
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroup(@Param("sysLogininfor") SysLogininfor sysLogininfor);

    /**
     * 日统计
     * @param sysLogininfor
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByDay(@Param("sysLogininfor") SysLogininfor sysLogininfor);

    /**
     * 月统计
     * @param sysLogininfor
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByMonth(@Param("sysLogininfor") SysLogininfor sysLogininfor);

    /**
     * 年统计
     * @param sysLogininfor
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByYear(@Param("sysLogininfor") SysLogininfor sysLogininfor);



}