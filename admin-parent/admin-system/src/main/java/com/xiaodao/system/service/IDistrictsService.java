package com.xiaodao.system.service;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.xiaodao.admin.entity.Districts;
import org.springframework.validation.annotation.Validated;

import java.util.List;
import java.util.Map;




/**
 * @description IDistricts Service层
 * @author xiaodao
 * @since jdk1.8
 */
@Validated
public interface IDistrictsService {

    /**
     * 新增
     * @param districts
     * @return int
     */
    int insert(@NotNull(message = "参数不能为空") Districts districts);

    /**
     * 带有空值判断的新增
     * @param districts
     * @return int
     */
    int insertSelective(@NotNull(message = "参数不能为空") Districts districts);


    /**
     * 批量插入
     * @param list
     * @return int
     */
    int batchInsert(@Size(min = 1, message = "参数不能为空") List<Districts> list);

    /**
     * 带有空值判断的批量插入
     * @param list
     * @return int
     */
    int batchInsertSelective(@Size(min = 1, message = "参数不能为空") List<Districts> list);

    /**
     * 根据主键更新
     * @param districts
     * @return int
     */
    int updateByPrimaryKey(@NotNull(message = "参数不能为空") Districts districts);

    /**
     * 带有空值判断的主键更新
     * @param districts
     * @return int
     */
    int updateSelectiveByPrimaryKey(@NotNull(message = "参数不能为空") Districts districts);

    /**
     * 批量更新
     * @param list
     * @return int
     */
    int batchUpdate(@Size(min = 1, message = "参数不能为空") List<Districts> list);

    /**
     * 带有空值判断的批量更新
     * @param list
     * @return int
     */
    int batchUpdateSelective(@Size(min = 1, message = "参数不能为空") List<Districts> list);


    /**
     * 更新插入
     * @param districts
     * @return int
     */
    int upsert(@NotNull(message = "参数不能为空") Districts districts);

    /**
     * 带有空值判断的更新插入
     * @param districts
     * @return int
     */
    int upsertSelective(@NotNull(message = "参数不能为空") Districts districts);

    /**
     * 批量更新插入
     * @param list
     * @return int
     */
    int batchUpsert(@Size(min = 1, message = "参数不能为空") List<Districts> list);

    /**
     * 带有空值判断的批量更新插入
     * @param list
     * @return int
     */
    int batchUpsertSelective(@Size(min = 1, message = "参数不能为空") List<Districts> list);


    /**
     * 通过主键删除
     * @param id
     * @return int
     */

    int deleteByPrimaryKey(@NotNull(message = "参数不能为空") Integer id);

    /**
     * 通过主键批量删除
     * @param list
     * @return int
     */
    int deleteBatchByPrimaryKeys(@Size(min = 1, message = "参数不能为空") List<Integer> list);

    /**
     * 条件删除
     * @param districts
     * @return int
     */
    int delete(@NotNull(message = "参数不能为空") Districts districts);

    /**
     * 通过主键查询
     * @param  id
     * @return Districts districts
     */
    Districts queryByPrimaryKey(@NotNull(message = "参数不能为空") Integer id);

    /**
     * 通过主键批量查询
     * @param list
     * @return List<Districts>
     */
    List<Districts> queryBatchPrimaryKeys(@Size(min = 1, message = "参数不能为空") List<Integer> list);

    /**
     * 条件查询一个
     * @param districts
     * @return List<Districts>
     */
    Districts queryOne(@NotNull(message = "参数不能为空") Districts districts);

    /**
     * 条件查询
     * @param districts
     * @return List<Districts>
     */
    List<Districts> queryByCondition(@NotNull(message = "参数不能为空") Districts districts);

    /**
     * 模糊查询
     * @param districts
     * @return List<Districts>
     */
    List<Districts> queryFuzzy(@NotNull(message = "参数不能为空") Districts districts);

    /**
     * 模糊条件查询
     * @param districts
     * @return List<Districts>
     */
    List<Districts> queryByLikeCondition(@NotNull(message = "参数不能为空") Districts districts);

    /**
     * 条件查询数量
     * @param districts
     * @return int
     */
    int queryCount(@NotNull(message = "参数不能为空") Districts districts);

    /**
     * 分组统计
     * @param districts
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroup(@NotNull(message = "参数不能为空") Districts districts);

    /**
     * 日统计
     * @param districts
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByDay(@NotNull(message = "参数不能为空") Districts districts);

    /**
     * 月统计
     * @param districts
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByMonth(@NotNull(message = "参数不能为空") Districts districts);

    /**
     * 年统计
     * @param districts
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByYear(@NotNull(message = "参数不能为空") Districts districts);


}