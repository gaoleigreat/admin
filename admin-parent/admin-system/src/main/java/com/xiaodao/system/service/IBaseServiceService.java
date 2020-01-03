package com.xiaodao.system.service;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.xiaodao.admin.entity.BaseService;
import org.springframework.validation.annotation.Validated;

import java.util.List;
import java.util.Map;




/**
 * @description IBaseService Service层
 * @author xiaodao
 * @since jdk1.8
 */
@Validated
public interface IBaseServiceService {

    /**
     * 新增
     * @param baseService
     * @return int
     */
    int insert(@NotNull(message = "参数不能为空") BaseService baseService);

    /**
     * 带有空值判断的新增
     * @param baseService
     * @return int
     */
    int insertSelective(@NotNull(message = "参数不能为空") BaseService baseService);


    /**
     * 批量插入
     * @param list
     * @return int
     */
    int batchInsert(@Size(min = 1, message = "参数不能为空") List<BaseService> list);

    /**
     * 带有空值判断的批量插入
     * @param list
     * @return int
     */
    int batchInsertSelective(@Size(min = 1, message = "参数不能为空") List<BaseService> list);

    /**
     * 根据主键更新
     * @param baseService
     * @return int
     */
    int updateByPrimaryKey(@NotNull(message = "参数不能为空") BaseService baseService);

    /**
     * 带有空值判断的主键更新
     * @param baseService
     * @return int
     */
    int updateSelectiveByPrimaryKey(@NotNull(message = "参数不能为空") BaseService baseService);

    /**
     * 批量更新
     * @param list
     * @return int
     */
    int batchUpdate(@Size(min = 1, message = "参数不能为空") List<BaseService> list);

    /**
     * 带有空值判断的批量更新
     * @param list
     * @return int
     */
    int batchUpdateSelective(@Size(min = 1, message = "参数不能为空") List<BaseService> list);


    /**
     * 更新插入
     * @param baseService
     * @return int
     */
    int upsert(@NotNull(message = "参数不能为空") BaseService baseService);

    /**
     * 带有空值判断的更新插入
     * @param baseService
     * @return int
     */
    int upsertSelective(@NotNull(message = "参数不能为空") BaseService baseService);

    /**
     * 批量更新插入
     * @param list
     * @return int
     */
    int batchUpsert(@Size(min = 1, message = "参数不能为空") List<BaseService> list);

    /**
     * 带有空值判断的批量更新插入
     * @param list
     * @return int
     */
    int batchUpsertSelective(@Size(min = 1, message = "参数不能为空") List<BaseService> list);


    /**
     * 通过主键删除
     * @param serviceId
     * @return int
     */

    int deleteByPrimaryKey(@NotNull(message = "参数不能为空") Long serviceId);

    /**
     * 通过主键批量删除
     * @param list
     * @return int
     */
    int deleteBatchByPrimaryKeys(@Size(min = 1, message = "参数不能为空") List<Long> list);

    /**
     * 条件删除
     * @param baseService
     * @return int
     */
    int delete(@NotNull(message = "参数不能为空") BaseService baseService);

    /**
     * 通过主键查询
     * @param  serviceId
     * @return BaseService baseService
     */
    BaseService queryByPrimaryKey(@NotNull(message = "参数不能为空") Long serviceId);

    /**
     * 通过主键批量查询
     * @param list
     * @return List<BaseService>
     */
    List<BaseService> queryBatchPrimaryKeys(@Size(min = 1, message = "参数不能为空") List<Long> list);

    /**
     * 条件查询一个
     * @param baseService
     * @return List<BaseService>
     */
    BaseService queryOne(@NotNull(message = "参数不能为空") BaseService baseService);

    /**
     * 条件查询
     * @param baseService
     * @return List<BaseService>
     */
    List<BaseService> queryByCondition(@NotNull(message = "参数不能为空") BaseService baseService);

    /**
     * 模糊查询
     * @param baseService
     * @return List<BaseService>
     */
    List<BaseService> queryFuzzy(@NotNull(message = "参数不能为空") BaseService baseService);

    /**
     * 模糊条件查询
     * @param baseService
     * @return List<BaseService>
     */
    List<BaseService> queryByLikeCondition(@NotNull(message = "参数不能为空") BaseService baseService);

    /**
     * 条件查询数量
     * @param baseService
     * @return int
     */
    int queryCount(@NotNull(message = "参数不能为空") BaseService baseService);

    /**
     * 分组统计
     * @param baseService
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroup(@NotNull(message = "参数不能为空") BaseService baseService);

    /**
     * 日统计
     * @param baseService
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByDay(@NotNull(message = "参数不能为空") BaseService baseService);

    /**
     * 月统计
     * @param baseService
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByMonth(@NotNull(message = "参数不能为空") BaseService baseService);

    /**
     * 年统计
     * @param baseService
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByYear(@NotNull(message = "参数不能为空") BaseService baseService);


}