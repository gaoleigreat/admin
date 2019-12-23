package com.xiaodao.system.service;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.xiaodao.feign.system.entity.SysDept;
import org.springframework.validation.annotation.Validated;

import java.util.List;
import java.util.Map;




/**
 * @description ISysDept Service层
 * @author ¸ßÀÚ
 * @since jdk1.8
 */
@Validated
public interface ISysDeptService {

    /**
     * 新增
     * @param sysDept
     * @return int
     */
    int insert(@NotNull(message = "参数不能为空") SysDept sysDept);

    /**
     * 带有空值判断的新增
     * @param sysDept
     * @return int
     */
    int insertSelective(@NotNull(message = "参数不能为空") SysDept sysDept);


    /**
     * 批量插入
     * @param list
     * @return int
     */
    int batchInsert(@Size(min = 1, message = "参数不能为空") List<SysDept> list);

    /**
     * 带有空值判断的批量插入
     * @param list
     * @return int
     */
    int batchInsertSelective(@Size(min = 1, message = "参数不能为空") List<SysDept> list);

    /**
     * 根据主键更新
     * @param sysDept
     * @return int
     */
    int updateByPrimaryKey(@NotNull(message = "参数不能为空") SysDept sysDept);

    /**
     * 带有空值判断的主键更新
     * @param sysDept
     * @return int
     */
    int updateSelectiveByPrimaryKey(@NotNull(message = "参数不能为空") SysDept sysDept);

    /**
     * 批量更新
     * @param list
     * @return int
     */
    int batchUpdate(@Size(min = 1, message = "参数不能为空") List<SysDept> list);

    /**
     * 带有空值判断的批量更新
     * @param list
     * @return int
     */
    int batchUpdateSelective(@Size(min = 1, message = "参数不能为空") List<SysDept> list);


    /**
     * 更新插入
     * @param sysDept
     * @return int
     */
    int upsert(@NotNull(message = "参数不能为空") SysDept sysDept);

    /**
     * 带有空值判断的更新插入
     * @param sysDept
     * @return int
     */
    int upsertSelective(@NotNull(message = "参数不能为空") SysDept sysDept);

    /**
     * 批量更新插入
     * @param list
     * @return int
     */
    int batchUpsert(@Size(min = 1, message = "参数不能为空") List<SysDept> list);

    /**
     * 带有空值判断的批量更新插入
     * @param list
     * @return int
     */
    int batchUpsertSelective(@Size(min = 1, message = "参数不能为空") List<SysDept> list);


    /**
     * 通过主键删除
     * @param deptId
     * @return int
     */

    int deleteByPrimaryKey(@NotNull(message = "参数不能为空") Long deptId);

    /**
     * 通过主键批量删除
     * @param list
     * @return int
     */
    int deleteBatchByPrimaryKeys(@Size(min = 1, message = "参数不能为空") List<Long> list);

    /**
     * 条件删除
     * @param sysDept
     * @return int
     */
    int delete(@NotNull(message = "参数不能为空") SysDept sysDept);

    /**
     * 通过主键查询
     * @param  deptId
     * @return SysDept sysDept
     */
    SysDept queryByPrimaryKey(@NotNull(message = "参数不能为空") Long deptId);

    /**
     * 通过主键批量查询
     * @param list
     * @return List<SysDept>
     */
    List<SysDept> queryBatchPrimaryKeys(@Size(min = 1, message = "参数不能为空") List<Long> list);

    /**
     * 条件查询一个
     * @param sysDept
     * @return List<SysDept>
     */
    SysDept queryOne(@NotNull(message = "参数不能为空") SysDept sysDept);

    /**
     * 条件查询
     * @param sysDept
     * @return List<SysDept>
     */
    List<SysDept> queryByCondition(@NotNull(message = "参数不能为空") SysDept sysDept);

    /**
     * 模糊查询
     * @param sysDept
     * @return List<SysDept>
     */
    List<SysDept> queryFuzzy(@NotNull(message = "参数不能为空") SysDept sysDept);

    /**
     * 模糊条件查询
     * @param sysDept
     * @return List<SysDept>
     */
    List<SysDept> queryByLikeCondition(@NotNull(message = "参数不能为空") SysDept sysDept);

    /**
     * 条件查询数量
     * @param sysDept
     * @return int
     */
    int queryCount(@NotNull(message = "参数不能为空") SysDept sysDept);

    /**
     * 分组统计
     * @param sysDept
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroup(@NotNull(message = "参数不能为空") SysDept sysDept);

    /**
     * 日统计
     * @param sysDept
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByDay(@NotNull(message = "参数不能为空") SysDept sysDept);

    /**
     * 月统计
     * @param sysDept
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByMonth(@NotNull(message = "参数不能为空") SysDept sysDept);

    /**
     * 年统计
     * @param sysDept
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByYear(@NotNull(message = "参数不能为空") SysDept sysDept);


}