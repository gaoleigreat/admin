package com.xiaodao.system.service;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.xiaodao.feign.system.entity.SysConfig;
import org.springframework.validation.annotation.Validated;

import java.util.List;
import java.util.Map;




/**
 * @description ISysConfig Service层
 * @author xiaodao
 * @since jdk1.8
 */
@Validated
public interface ISysConfigService {

    /**
     * 新增
     * @param sysConfig
     * @return int
     */
    int insert(@NotNull(message = "参数不能为空") SysConfig sysConfig);

    /**
     * 带有空值判断的新增
     * @param sysConfig
     * @return int
     */
    int insertSelective(@NotNull(message = "参数不能为空") SysConfig sysConfig);


    /**
     * 批量插入
     * @param list
     * @return int
     */
    int batchInsert(@Size(min = 1, message = "参数不能为空") List<SysConfig> list);

    /**
     * 带有空值判断的批量插入
     * @param list
     * @return int
     */
    int batchInsertSelective(@Size(min = 1, message = "参数不能为空") List<SysConfig> list);

    /**
     * 根据主键更新
     * @param sysConfig
     * @return int
     */
    int updateByPrimaryKey(@NotNull(message = "参数不能为空") SysConfig sysConfig);

    /**
     * 带有空值判断的主键更新
     * @param sysConfig
     * @return int
     */
    int updateSelectiveByPrimaryKey(@NotNull(message = "参数不能为空") SysConfig sysConfig);

    /**
     * 批量更新
     * @param list
     * @return int
     */
    int batchUpdate(@Size(min = 1, message = "参数不能为空") List<SysConfig> list);

    /**
     * 带有空值判断的批量更新
     * @param list
     * @return int
     */
    int batchUpdateSelective(@Size(min = 1, message = "参数不能为空") List<SysConfig> list);


    /**
     * 更新插入
     * @param sysConfig
     * @return int
     */
    int upsert(@NotNull(message = "参数不能为空") SysConfig sysConfig);

    /**
     * 带有空值判断的更新插入
     * @param sysConfig
     * @return int
     */
    int upsertSelective(@NotNull(message = "参数不能为空") SysConfig sysConfig);

    /**
     * 批量更新插入
     * @param list
     * @return int
     */
    int batchUpsert(@Size(min = 1, message = "参数不能为空") List<SysConfig> list);

    /**
     * 带有空值判断的批量更新插入
     * @param list
     * @return int
     */
    int batchUpsertSelective(@Size(min = 1, message = "参数不能为空") List<SysConfig> list);


    /**
     * 通过主键删除
     * @param configId
     * @return int
     */

    int deleteByPrimaryKey(@NotNull(message = "参数不能为空") Long configId);

    /**
     * 通过主键批量删除
     * @param list
     * @return int
     */
    int deleteBatchByPrimaryKeys(@Size(min = 1, message = "参数不能为空") List<Long> list);

    /**
     * 条件删除
     * @param sysConfig
     * @return int
     */
    int delete(@NotNull(message = "参数不能为空") SysConfig sysConfig);

    /**
     * 通过主键查询
     * @param  configId
     * @return SysConfig sysConfig
     */
    SysConfig queryByPrimaryKey(@NotNull(message = "参数不能为空") Long configId);

    /**
     * 通过主键批量查询
     * @param list
     * @return List<SysConfig>
     */
    List<SysConfig> queryBatchPrimaryKeys(@Size(min = 1, message = "参数不能为空") List<Long> list);

    /**
     * 条件查询一个
     * @param sysConfig
     * @return List<SysConfig>
     */
    SysConfig queryOne(@NotNull(message = "参数不能为空") SysConfig sysConfig);

    /**
     * 条件查询
     * @param sysConfig
     * @return List<SysConfig>
     */
    List<SysConfig> queryByCondition(@NotNull(message = "参数不能为空") SysConfig sysConfig);

    /**
     * 模糊查询
     * @param sysConfig
     * @return List<SysConfig>
     */
    List<SysConfig> queryFuzzy(@NotNull(message = "参数不能为空") SysConfig sysConfig);

    /**
     * 模糊条件查询
     * @param sysConfig
     * @return List<SysConfig>
     */
    List<SysConfig> queryByLikeCondition(@NotNull(message = "参数不能为空") SysConfig sysConfig);

    /**
     * 条件查询数量
     * @param sysConfig
     * @return int
     */
    int queryCount(@NotNull(message = "参数不能为空") SysConfig sysConfig);

    /**
     * 分组统计
     * @param sysConfig
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroup(@NotNull(message = "参数不能为空") SysConfig sysConfig);

    /**
     * 日统计
     * @param sysConfig
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByDay(@NotNull(message = "参数不能为空") SysConfig sysConfig);

    /**
     * 月统计
     * @param sysConfig
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByMonth(@NotNull(message = "参数不能为空") SysConfig sysConfig);

    /**
     * 年统计
     * @param sysConfig
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByYear(@NotNull(message = "参数不能为空") SysConfig sysConfig);


}