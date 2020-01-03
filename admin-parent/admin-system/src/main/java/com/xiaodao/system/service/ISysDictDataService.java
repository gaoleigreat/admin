package com.xiaodao.system.service;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.xiaodao.admin.entity.SysDictData;
import org.springframework.validation.annotation.Validated;

import java.util.List;
import java.util.Map;




/**
 * @description ISysDictData Service层
 * @author ¸ßÀÚ
 * @since jdk1.8
 */
@Validated
public interface ISysDictDataService {

    /**
     * 新增
     * @param sysDictData
     * @return int
     */
    int insert(@NotNull(message = "参数不能为空") SysDictData sysDictData);

    /**
     * 带有空值判断的新增
     * @param sysDictData
     * @return int
     */
    int insertSelective(@NotNull(message = "参数不能为空") SysDictData sysDictData);


    /**
     * 批量插入
     * @param list
     * @return int
     */
    int batchInsert(@Size(min = 1, message = "参数不能为空") List<SysDictData> list);

    /**
     * 带有空值判断的批量插入
     * @param list
     * @return int
     */
    int batchInsertSelective(@Size(min = 1, message = "参数不能为空") List<SysDictData> list);

    /**
     * 根据主键更新
     * @param sysDictData
     * @return int
     */
    int updateByPrimaryKey(@NotNull(message = "参数不能为空") SysDictData sysDictData);

    /**
     * 带有空值判断的主键更新
     * @param sysDictData
     * @return int
     */
    int updateSelectiveByPrimaryKey(@NotNull(message = "参数不能为空") SysDictData sysDictData);

    /**
     * 批量更新
     * @param list
     * @return int
     */
    int batchUpdate(@Size(min = 1, message = "参数不能为空") List<SysDictData> list);

    /**
     * 带有空值判断的批量更新
     * @param list
     * @return int
     */
    int batchUpdateSelective(@Size(min = 1, message = "参数不能为空") List<SysDictData> list);


    /**
     * 更新插入
     * @param sysDictData
     * @return int
     */
    int upsert(@NotNull(message = "参数不能为空") SysDictData sysDictData);

    /**
     * 带有空值判断的更新插入
     * @param sysDictData
     * @return int
     */
    int upsertSelective(@NotNull(message = "参数不能为空") SysDictData sysDictData);

    /**
     * 批量更新插入
     * @param list
     * @return int
     */
    int batchUpsert(@Size(min = 1, message = "参数不能为空") List<SysDictData> list);

    /**
     * 带有空值判断的批量更新插入
     * @param list
     * @return int
     */
    int batchUpsertSelective(@Size(min = 1, message = "参数不能为空") List<SysDictData> list);


    /**
     * 通过主键删除
     * @param dictCode
     * @return int
     */

    int deleteByPrimaryKey(@NotNull(message = "参数不能为空") Integer dictCode);

    /**
     * 通过主键批量删除
     * @param list
     * @return int
     */
    int deleteBatchByPrimaryKeys(@Size(min = 1, message = "参数不能为空") List<Integer> list);

    /**
     * 条件删除
     * @param sysDictData
     * @return int
     */
    int delete(@NotNull(message = "参数不能为空") SysDictData sysDictData);

    /**
     * 通过主键查询
     * @param  dictCode
     * @return SysDictData sysDictData
     */
    SysDictData queryByPrimaryKey(@NotNull(message = "参数不能为空") Integer dictCode);

    /**
     * 通过主键批量查询
     * @param list
     * @return List<SysDictData>
     */
    List<SysDictData> queryBatchPrimaryKeys(@Size(min = 1, message = "参数不能为空") List<Integer> list);

    /**
     * 条件查询一个
     * @param sysDictData
     * @return List<SysDictData>
     */
    SysDictData queryOne(@NotNull(message = "参数不能为空") SysDictData sysDictData);

    /**
     * 条件查询
     * @param sysDictData
     * @return List<SysDictData>
     */
    List<SysDictData> queryByCondition(@NotNull(message = "参数不能为空") SysDictData sysDictData);

    /**
     * 模糊查询
     * @param sysDictData
     * @return List<SysDictData>
     */
    List<SysDictData> queryFuzzy(@NotNull(message = "参数不能为空") SysDictData sysDictData);

    /**
     * 模糊条件查询
     * @param sysDictData
     * @return List<SysDictData>
     */
    List<SysDictData> queryByLikeCondition(@NotNull(message = "参数不能为空") SysDictData sysDictData);

    /**
     * 条件查询数量
     * @param sysDictData
     * @return int
     */
    int queryCount(@NotNull(message = "参数不能为空") SysDictData sysDictData);

    /**
     * 分组统计
     * @param sysDictData
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroup(@NotNull(message = "参数不能为空") SysDictData sysDictData);

    /**
     * 日统计
     * @param sysDictData
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByDay(@NotNull(message = "参数不能为空") SysDictData sysDictData);

    /**
     * 月统计
     * @param sysDictData
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByMonth(@NotNull(message = "参数不能为空") SysDictData sysDictData);

    /**
     * 年统计
     * @param sysDictData
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByYear(@NotNull(message = "参数不能为空") SysDictData sysDictData);


}