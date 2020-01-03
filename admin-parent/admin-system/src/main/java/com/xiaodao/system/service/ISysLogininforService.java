package com.xiaodao.system.service;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.xiaodao.admin.entity.SysLogininfor;
import org.springframework.validation.annotation.Validated;

import java.util.List;
import java.util.Map;




/**
 * @description ISysLogininfor Service层
 * @author ¸ßÀÚ
 * @since jdk1.8
 */
@Validated
public interface ISysLogininforService {

    /**
     * 新增
     * @param sysLogininfor
     * @return int
     */
    int insert(@NotNull(message = "参数不能为空") SysLogininfor sysLogininfor);

    /**
     * 带有空值判断的新增
     * @param sysLogininfor
     * @return int
     */
    int insertSelective(@NotNull(message = "参数不能为空") SysLogininfor sysLogininfor);


    /**
     * 批量插入
     * @param list
     * @return int
     */
    int batchInsert(@Size(min = 1, message = "参数不能为空") List<SysLogininfor> list);

    /**
     * 带有空值判断的批量插入
     * @param list
     * @return int
     */
    int batchInsertSelective(@Size(min = 1, message = "参数不能为空") List<SysLogininfor> list);

    /**
     * 根据主键更新
     * @param sysLogininfor
     * @return int
     */
    int updateByPrimaryKey(@NotNull(message = "参数不能为空") SysLogininfor sysLogininfor);

    /**
     * 带有空值判断的主键更新
     * @param sysLogininfor
     * @return int
     */
    int updateSelectiveByPrimaryKey(@NotNull(message = "参数不能为空") SysLogininfor sysLogininfor);

    /**
     * 批量更新
     * @param list
     * @return int
     */
    int batchUpdate(@Size(min = 1, message = "参数不能为空") List<SysLogininfor> list);

    /**
     * 带有空值判断的批量更新
     * @param list
     * @return int
     */
    int batchUpdateSelective(@Size(min = 1, message = "参数不能为空") List<SysLogininfor> list);


    /**
     * 更新插入
     * @param sysLogininfor
     * @return int
     */
    int upsert(@NotNull(message = "参数不能为空") SysLogininfor sysLogininfor);

    /**
     * 带有空值判断的更新插入
     * @param sysLogininfor
     * @return int
     */
    int upsertSelective(@NotNull(message = "参数不能为空") SysLogininfor sysLogininfor);

    /**
     * 批量更新插入
     * @param list
     * @return int
     */
    int batchUpsert(@Size(min = 1, message = "参数不能为空") List<SysLogininfor> list);

    /**
     * 带有空值判断的批量更新插入
     * @param list
     * @return int
     */
    int batchUpsertSelective(@Size(min = 1, message = "参数不能为空") List<SysLogininfor> list);


    /**
     * 通过主键删除
     * @param infoId
     * @return int
     */

    int deleteByPrimaryKey(@NotNull(message = "参数不能为空") Long infoId);

    /**
     * 通过主键批量删除
     * @param list
     * @return int
     */
    int deleteBatchByPrimaryKeys(@Size(min = 1, message = "参数不能为空") List<Long> list);

    /**
     * 条件删除
     * @param sysLogininfor
     * @return int
     */
    int delete(@NotNull(message = "参数不能为空") SysLogininfor sysLogininfor);

    /**
     * 通过主键查询
     * @param  infoId
     * @return SysLogininfor sysLogininfor
     */
    SysLogininfor queryByPrimaryKey(@NotNull(message = "参数不能为空") Long infoId);

    /**
     * 通过主键批量查询
     * @param list
     * @return List<SysLogininfor>
     */
    List<SysLogininfor> queryBatchPrimaryKeys(@Size(min = 1, message = "参数不能为空") List<Long> list);

    /**
     * 条件查询一个
     * @param sysLogininfor
     * @return List<SysLogininfor>
     */
    SysLogininfor queryOne(@NotNull(message = "参数不能为空") SysLogininfor sysLogininfor);

    /**
     * 条件查询
     * @param sysLogininfor
     * @return List<SysLogininfor>
     */
    List<SysLogininfor> queryByCondition(@NotNull(message = "参数不能为空") SysLogininfor sysLogininfor);

    /**
     * 模糊查询
     * @param sysLogininfor
     * @return List<SysLogininfor>
     */
    List<SysLogininfor> queryFuzzy(@NotNull(message = "参数不能为空") SysLogininfor sysLogininfor);

    /**
     * 模糊条件查询
     * @param sysLogininfor
     * @return List<SysLogininfor>
     */
    List<SysLogininfor> queryByLikeCondition(@NotNull(message = "参数不能为空") SysLogininfor sysLogininfor);

    /**
     * 条件查询数量
     * @param sysLogininfor
     * @return int
     */
    int queryCount(@NotNull(message = "参数不能为空") SysLogininfor sysLogininfor);

    /**
     * 分组统计
     * @param sysLogininfor
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroup(@NotNull(message = "参数不能为空") SysLogininfor sysLogininfor);

    /**
     * 日统计
     * @param sysLogininfor
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByDay(@NotNull(message = "参数不能为空") SysLogininfor sysLogininfor);

    /**
     * 月统计
     * @param sysLogininfor
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByMonth(@NotNull(message = "参数不能为空") SysLogininfor sysLogininfor);

    /**
     * 年统计
     * @param sysLogininfor
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByYear(@NotNull(message = "参数不能为空") SysLogininfor sysLogininfor);


}