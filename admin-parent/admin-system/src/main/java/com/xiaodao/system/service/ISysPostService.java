package com.xiaodao.system.service;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.xiaodao.admin.entity.SysPost;
import org.springframework.validation.annotation.Validated;

import java.util.List;
import java.util.Map;




/**
 * @description ISysPost Service层
 * @author ¸ßÀÚ
 * @since jdk1.8
 */
@Validated
public interface ISysPostService {

    /**
     * 新增
     * @param sysPost
     * @return int
     */
    int insert(@NotNull(message = "参数不能为空") SysPost sysPost);

    /**
     * 带有空值判断的新增
     * @param sysPost
     * @return int
     */
    int insertSelective(@NotNull(message = "参数不能为空") SysPost sysPost);


    /**
     * 批量插入
     * @param list
     * @return int
     */
    int batchInsert(@Size(min = 1, message = "参数不能为空") List<SysPost> list);

    /**
     * 带有空值判断的批量插入
     * @param list
     * @return int
     */
    int batchInsertSelective(@Size(min = 1, message = "参数不能为空") List<SysPost> list);

    /**
     * 根据主键更新
     * @param sysPost
     * @return int
     */
    int updateByPrimaryKey(@NotNull(message = "参数不能为空") SysPost sysPost);

    /**
     * 带有空值判断的主键更新
     * @param sysPost
     * @return int
     */
    int updateSelectiveByPrimaryKey(@NotNull(message = "参数不能为空") SysPost sysPost);

    /**
     * 批量更新
     * @param list
     * @return int
     */
    int batchUpdate(@Size(min = 1, message = "参数不能为空") List<SysPost> list);

    /**
     * 带有空值判断的批量更新
     * @param list
     * @return int
     */
    int batchUpdateSelective(@Size(min = 1, message = "参数不能为空") List<SysPost> list);


    /**
     * 更新插入
     * @param sysPost
     * @return int
     */
    int upsert(@NotNull(message = "参数不能为空") SysPost sysPost);

    /**
     * 带有空值判断的更新插入
     * @param sysPost
     * @return int
     */
    int upsertSelective(@NotNull(message = "参数不能为空") SysPost sysPost);

    /**
     * 批量更新插入
     * @param list
     * @return int
     */
    int batchUpsert(@Size(min = 1, message = "参数不能为空") List<SysPost> list);

    /**
     * 带有空值判断的批量更新插入
     * @param list
     * @return int
     */
    int batchUpsertSelective(@Size(min = 1, message = "参数不能为空") List<SysPost> list);


    /**
     * 通过主键删除
     * @param postId
     * @return int
     */

    int deleteByPrimaryKey(@NotNull(message = "参数不能为空") Long postId);

    /**
     * 通过主键批量删除
     * @param list
     * @return int
     */
    int deleteBatchByPrimaryKeys(@Size(min = 1, message = "参数不能为空") List<Long> list);

    /**
     * 条件删除
     * @param sysPost
     * @return int
     */
    int delete(@NotNull(message = "参数不能为空") SysPost sysPost);

    /**
     * 通过主键查询
     * @param  postId
     * @return SysPost sysPost
     */
    SysPost queryByPrimaryKey(@NotNull(message = "参数不能为空") Long postId);

    /**
     * 通过主键批量查询
     * @param list
     * @return List<SysPost>
     */
    List<SysPost> queryBatchPrimaryKeys(@Size(min = 1, message = "参数不能为空") List<Long> list);

    /**
     * 条件查询一个
     * @param sysPost
     * @return List<SysPost>
     */
    SysPost queryOne(@NotNull(message = "参数不能为空") SysPost sysPost);

    /**
     * 条件查询
     * @param sysPost
     * @return List<SysPost>
     */
    List<SysPost> queryByCondition(@NotNull(message = "参数不能为空") SysPost sysPost);

    /**
     * 模糊查询
     * @param sysPost
     * @return List<SysPost>
     */
    List<SysPost> queryFuzzy(@NotNull(message = "参数不能为空") SysPost sysPost);

    /**
     * 模糊条件查询
     * @param sysPost
     * @return List<SysPost>
     */
    List<SysPost> queryByLikeCondition(@NotNull(message = "参数不能为空") SysPost sysPost);

    /**
     * 条件查询数量
     * @param sysPost
     * @return int
     */
    int queryCount(@NotNull(message = "参数不能为空") SysPost sysPost);

    /**
     * 分组统计
     * @param sysPost
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroup(@NotNull(message = "参数不能为空") SysPost sysPost);

    /**
     * 日统计
     * @param sysPost
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByDay(@NotNull(message = "参数不能为空") SysPost sysPost);

    /**
     * 月统计
     * @param sysPost
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByMonth(@NotNull(message = "参数不能为空") SysPost sysPost);

    /**
     * 年统计
     * @param sysPost
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByYear(@NotNull(message = "参数不能为空") SysPost sysPost);


}