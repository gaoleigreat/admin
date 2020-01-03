package com.xiaodao.system.service;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.xiaodao.admin.entity.SysUserPost;
import org.springframework.validation.annotation.Validated;

import java.util.List;
import java.util.Map;




/**
 * @description ISysUserPost Service层
 * @author ¸ßÀÚ
 * @since jdk1.8
 */
@Validated
public interface ISysUserPostService {

    /**
     * 新增
     * @param sysUserPost
     * @return int
     */
    int insert(@NotNull(message = "参数不能为空") SysUserPost sysUserPost);

    /**
     * 带有空值判断的新增
     * @param sysUserPost
     * @return int
     */
    int insertSelective(@NotNull(message = "参数不能为空") SysUserPost sysUserPost);


    /**
     * 批量插入
     * @param list
     * @return int
     */
    int batchInsert(@Size(min = 1, message = "参数不能为空") List<SysUserPost> list);

    /**
     * 带有空值判断的批量插入
     * @param list
     * @return int
     */
    int batchInsertSelective(@Size(min = 1, message = "参数不能为空") List<SysUserPost> list);

    /**
     * 根据主键更新
     * @param sysUserPost
     * @return int
     */
    int updateByPrimaryKey(@NotNull(message = "参数不能为空") SysUserPost sysUserPost);

    /**
     * 带有空值判断的主键更新
     * @param sysUserPost
     * @return int
     */
    int updateSelectiveByPrimaryKey(@NotNull(message = "参数不能为空") SysUserPost sysUserPost);

    /**
     * 批量更新
     * @param list
     * @return int
     */
    int batchUpdate(@Size(min = 1, message = "参数不能为空") List<SysUserPost> list);

    /**
     * 带有空值判断的批量更新
     * @param list
     * @return int
     */
    int batchUpdateSelective(@Size(min = 1, message = "参数不能为空") List<SysUserPost> list);


    /**
     * 更新插入
     * @param sysUserPost
     * @return int
     */
    int upsert(@NotNull(message = "参数不能为空") SysUserPost sysUserPost);

    /**
     * 带有空值判断的更新插入
     * @param sysUserPost
     * @return int
     */
    int upsertSelective(@NotNull(message = "参数不能为空") SysUserPost sysUserPost);

    /**
     * 批量更新插入
     * @param list
     * @return int
     */
    int batchUpsert(@Size(min = 1, message = "参数不能为空") List<SysUserPost> list);

    /**
     * 带有空值判断的批量更新插入
     * @param list
     * @return int
     */
    int batchUpsertSelective(@Size(min = 1, message = "参数不能为空") List<SysUserPost> list);


    /**
     * 通过主键删除
     * @param userId
     * @return int
     */

    int deleteByPrimaryKey(@NotNull(message = "参数不能为空") Integer userId);

    /**
     * 通过主键批量删除
     * @param list
     * @return int
     */
    int deleteBatchByPrimaryKeys(@Size(min = 1, message = "参数不能为空") List<Integer> list);

    /**
     * 条件删除
     * @param sysUserPost
     * @return int
     */
    int delete(@NotNull(message = "参数不能为空") SysUserPost sysUserPost);

    /**
     * 通过主键查询
     * @param  userId
     * @return SysUserPost sysUserPost
     */
    SysUserPost queryByPrimaryKey(@NotNull(message = "参数不能为空") Integer userId);

    /**
     * 通过主键批量查询
     * @param list
     * @return List<SysUserPost>
     */
    List<SysUserPost> queryBatchPrimaryKeys(@Size(min = 1, message = "参数不能为空") List<Integer> list);

    /**
     * 条件查询一个
     * @param sysUserPost
     * @return List<SysUserPost>
     */
    SysUserPost queryOne(@NotNull(message = "参数不能为空") SysUserPost sysUserPost);

    /**
     * 条件查询
     * @param sysUserPost
     * @return List<SysUserPost>
     */
    List<SysUserPost> queryByCondition(@NotNull(message = "参数不能为空") SysUserPost sysUserPost);

    /**
     * 模糊查询
     * @param sysUserPost
     * @return List<SysUserPost>
     */
    List<SysUserPost> queryFuzzy(@NotNull(message = "参数不能为空") SysUserPost sysUserPost);

    /**
     * 模糊条件查询
     * @param sysUserPost
     * @return List<SysUserPost>
     */
    List<SysUserPost> queryByLikeCondition(@NotNull(message = "参数不能为空") SysUserPost sysUserPost);

    /**
     * 条件查询数量
     * @param sysUserPost
     * @return int
     */
    int queryCount(@NotNull(message = "参数不能为空") SysUserPost sysUserPost);

    /**
     * 分组统计
     * @param sysUserPost
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroup(@NotNull(message = "参数不能为空") SysUserPost sysUserPost);

    /**
     * 日统计
     * @param sysUserPost
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByDay(@NotNull(message = "参数不能为空") SysUserPost sysUserPost);

    /**
     * 月统计
     * @param sysUserPost
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByMonth(@NotNull(message = "参数不能为空") SysUserPost sysUserPost);

    /**
     * 年统计
     * @param sysUserPost
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByYear(@NotNull(message = "参数不能为空") SysUserPost sysUserPost);


}