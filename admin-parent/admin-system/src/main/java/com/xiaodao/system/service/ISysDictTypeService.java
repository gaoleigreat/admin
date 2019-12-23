package com.xiaodao.system.service;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.xiaodao.feign.system.entity.SysDictType;
import org.springframework.validation.annotation.Validated;

import java.util.List;
import java.util.Map;




/**
 * @description ISysDictType Service层
 * @author ¸ßÀÚ
 * @since jdk1.8
 */
@Validated
public interface ISysDictTypeService {

    /**
     * 新增
     * @param sysDictType
     * @return int
     */
    int insert(@NotNull(message = "参数不能为空") SysDictType sysDictType);

    /**
     * 带有空值判断的新增
     * @param sysDictType
     * @return int
     */
    int insertSelective(@NotNull(message = "参数不能为空") SysDictType sysDictType);


    /**
     * 批量插入
     * @param list
     * @return int
     */
    int batchInsert(@Size(min = 1, message = "参数不能为空") List<SysDictType> list);

    /**
     * 带有空值判断的批量插入
     * @param list
     * @return int
     */
    int batchInsertSelective(@Size(min = 1, message = "参数不能为空") List<SysDictType> list);

    /**
     * 根据主键更新
     * @param sysDictType
     * @return int
     */
    int updateByPrimaryKey(@NotNull(message = "参数不能为空") SysDictType sysDictType);

    /**
     * 带有空值判断的主键更新
     * @param sysDictType
     * @return int
     */
    int updateSelectiveByPrimaryKey(@NotNull(message = "参数不能为空") SysDictType sysDictType);

    /**
     * 批量更新
     * @param list
     * @return int
     */
    int batchUpdate(@Size(min = 1, message = "参数不能为空") List<SysDictType> list);

    /**
     * 带有空值判断的批量更新
     * @param list
     * @return int
     */
    int batchUpdateSelective(@Size(min = 1, message = "参数不能为空") List<SysDictType> list);


    /**
     * 更新插入
     * @param sysDictType
     * @return int
     */
    int upsert(@NotNull(message = "参数不能为空") SysDictType sysDictType);

    /**
     * 带有空值判断的更新插入
     * @param sysDictType
     * @return int
     */
    int upsertSelective(@NotNull(message = "参数不能为空") SysDictType sysDictType);

    /**
     * 批量更新插入
     * @param list
     * @return int
     */
    int batchUpsert(@Size(min = 1, message = "参数不能为空") List<SysDictType> list);

    /**
     * 带有空值判断的批量更新插入
     * @param list
     * @return int
     */
    int batchUpsertSelective(@Size(min = 1, message = "参数不能为空") List<SysDictType> list);


    /**
     * 通过主键删除
     * @param dictId
     * @return int
     */

    int deleteByPrimaryKey(@NotNull(message = "参数不能为空") Long dictId);

    /**
     * 通过主键批量删除
     * @param list
     * @return int
     */
    int deleteBatchByPrimaryKeys(@Size(min = 1, message = "参数不能为空") List<Long> list);

    /**
     * 条件删除
     * @param sysDictType
     * @return int
     */
    int delete(@NotNull(message = "参数不能为空") SysDictType sysDictType);

    /**
     * 通过主键查询
     * @param  dictId
     * @return SysDictType sysDictType
     */
    SysDictType queryByPrimaryKey(@NotNull(message = "参数不能为空") Long dictId);

    /**
     * 通过主键批量查询
     * @param list
     * @return List<SysDictType>
     */
    List<SysDictType> queryBatchPrimaryKeys(@Size(min = 1, message = "参数不能为空") List<Long> list);

    /**
     * 条件查询一个
     * @param sysDictType
     * @return List<SysDictType>
     */
    SysDictType queryOne(@NotNull(message = "参数不能为空") SysDictType sysDictType);

    /**
     * 条件查询
     * @param sysDictType
     * @return List<SysDictType>
     */
    List<SysDictType> queryByCondition(@NotNull(message = "参数不能为空") SysDictType sysDictType);

    /**
     * 模糊查询
     * @param sysDictType
     * @return List<SysDictType>
     */
    List<SysDictType> queryFuzzy(@NotNull(message = "参数不能为空") SysDictType sysDictType);

    /**
     * 模糊条件查询
     * @param sysDictType
     * @return List<SysDictType>
     */
    List<SysDictType> queryByLikeCondition(@NotNull(message = "参数不能为空") SysDictType sysDictType);

    /**
     * 条件查询数量
     * @param sysDictType
     * @return int
     */
    int queryCount(@NotNull(message = "参数不能为空") SysDictType sysDictType);

    /**
     * 分组统计
     * @param sysDictType
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroup(@NotNull(message = "参数不能为空") SysDictType sysDictType);

    /**
     * 日统计
     * @param sysDictType
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByDay(@NotNull(message = "参数不能为空") SysDictType sysDictType);

    /**
     * 月统计
     * @param sysDictType
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByMonth(@NotNull(message = "参数不能为空") SysDictType sysDictType);

    /**
     * 年统计
     * @param sysDictType
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByYear(@NotNull(message = "参数不能为空") SysDictType sysDictType);


}