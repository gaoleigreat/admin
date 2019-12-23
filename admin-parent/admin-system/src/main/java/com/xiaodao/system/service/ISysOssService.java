package com.xiaodao.system.service;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.xiaodao.feign.system.entity.SysOss;
import org.springframework.validation.annotation.Validated;

import java.util.List;
import java.util.Map;




/**
 * @description ISysOss Service层
 * @author xiaodao
 * @since jdk1.8
 */
@Validated
public interface ISysOssService {

    /**
     * 新增
     * @param sysOss
     * @return int
     */
    int insert(@NotNull(message = "参数不能为空") SysOss sysOss);

    /**
     * 带有空值判断的新增
     * @param sysOss
     * @return int
     */
    int insertSelective(@NotNull(message = "参数不能为空") SysOss sysOss);


    /**
     * 批量插入
     * @param list
     * @return int
     */
    int batchInsert(@Size(min = 1, message = "参数不能为空") List<SysOss> list);

    /**
     * 带有空值判断的批量插入
     * @param list
     * @return int
     */
    int batchInsertSelective(@Size(min = 1, message = "参数不能为空") List<SysOss> list);

    /**
     * 根据主键更新
     * @param sysOss
     * @return int
     */
    int updateByPrimaryKey(@NotNull(message = "参数不能为空") SysOss sysOss);

    /**
     * 带有空值判断的主键更新
     * @param sysOss
     * @return int
     */
    int updateSelectiveByPrimaryKey(@NotNull(message = "参数不能为空") SysOss sysOss);

    /**
     * 批量更新
     * @param list
     * @return int
     */
    int batchUpdate(@Size(min = 1, message = "参数不能为空") List<SysOss> list);

    /**
     * 带有空值判断的批量更新
     * @param list
     * @return int
     */
    int batchUpdateSelective(@Size(min = 1, message = "参数不能为空") List<SysOss> list);


    /**
     * 更新插入
     * @param sysOss
     * @return int
     */
    int upsert(@NotNull(message = "参数不能为空") SysOss sysOss);

    /**
     * 带有空值判断的更新插入
     * @param sysOss
     * @return int
     */
    int upsertSelective(@NotNull(message = "参数不能为空") SysOss sysOss);

    /**
     * 批量更新插入
     * @param list
     * @return int
     */
    int batchUpsert(@Size(min = 1, message = "参数不能为空") List<SysOss> list);

    /**
     * 带有空值判断的批量更新插入
     * @param list
     * @return int
     */
    int batchUpsertSelective(@Size(min = 1, message = "参数不能为空") List<SysOss> list);


    /**
     * 通过主键删除
     * @param id
     * @return int
     */

    int deleteByPrimaryKey(@NotNull(message = "参数不能为空") Long id);

    /**
     * 通过主键批量删除
     * @param list
     * @return int
     */
    int deleteBatchByPrimaryKeys(@Size(min = 1, message = "参数不能为空") List<Long> list);

    /**
     * 条件删除
     * @param sysOss
     * @return int
     */
    int delete(@NotNull(message = "参数不能为空") SysOss sysOss);

    /**
     * 通过主键查询
     * @param  id
     * @return SysOss sysOss
     */
    SysOss queryByPrimaryKey(@NotNull(message = "参数不能为空") Long id);

    /**
     * 通过主键批量查询
     * @param list
     * @return List<SysOss>
     */
    List<SysOss> queryBatchPrimaryKeys(@Size(min = 1, message = "参数不能为空") List<Long> list);

    /**
     * 条件查询一个
     * @param sysOss
     * @return List<SysOss>
     */
    SysOss queryOne(@NotNull(message = "参数不能为空") SysOss sysOss);

    /**
     * 条件查询
     * @param sysOss
     * @return List<SysOss>
     */
    List<SysOss> queryByCondition(@NotNull(message = "参数不能为空") SysOss sysOss);

    /**
     * 模糊查询
     * @param sysOss
     * @return List<SysOss>
     */
    List<SysOss> queryFuzzy(@NotNull(message = "参数不能为空") SysOss sysOss);

    /**
     * 模糊条件查询
     * @param sysOss
     * @return List<SysOss>
     */
    List<SysOss> queryByLikeCondition(@NotNull(message = "参数不能为空") SysOss sysOss);

    /**
     * 条件查询数量
     * @param sysOss
     * @return int
     */
    int queryCount(@NotNull(message = "参数不能为空") SysOss sysOss);

    /**
     * 分组统计
     * @param sysOss
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroup(@NotNull(message = "参数不能为空") SysOss sysOss);

    /**
     * 日统计
     * @param sysOss
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByDay(@NotNull(message = "参数不能为空") SysOss sysOss);

    /**
     * 月统计
     * @param sysOss
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByMonth(@NotNull(message = "参数不能为空") SysOss sysOss);

    /**
     * 年统计
     * @param sysOss
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByYear(@NotNull(message = "参数不能为空") SysOss sysOss);


}