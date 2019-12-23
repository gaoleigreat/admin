package com.xiaodao.system.service;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.xiaodao.feign.system.entity.SysUserRole;
import org.springframework.validation.annotation.Validated;

import java.util.List;
import java.util.Map;




/**
 * @description ISysUserRole Service层
 * @author xiaodao
 * @since jdk1.8
 */
@Validated
public interface ISysUserRoleService {

    /**
     * 新增
     * @param sysUserRole
     * @return int
     */
    int insert(@NotNull(message = "参数不能为空") SysUserRole sysUserRole);

    /**
     * 带有空值判断的新增
     * @param sysUserRole
     * @return int
     */
    int insertSelective(@NotNull(message = "参数不能为空") SysUserRole sysUserRole);


    /**
     * 批量插入
     * @param list
     * @return int
     */
    int batchInsert(@Size(min = 1, message = "参数不能为空") List<SysUserRole> list);

    /**
     * 带有空值判断的批量插入
     * @param list
     * @return int
     */
    int batchInsertSelective(@Size(min = 1, message = "参数不能为空") List<SysUserRole> list);

    /**
     * 根据主键更新
     * @param sysUserRole
     * @return int
     */
    int updateByPrimaryKey(@NotNull(message = "参数不能为空") SysUserRole sysUserRole);

    /**
     * 带有空值判断的主键更新
     * @param sysUserRole
     * @return int
     */
    int updateSelectiveByPrimaryKey(@NotNull(message = "参数不能为空") SysUserRole sysUserRole);

    /**
     * 批量更新
     * @param list
     * @return int
     */
    int batchUpdate(@Size(min = 1, message = "参数不能为空") List<SysUserRole> list);

    /**
     * 带有空值判断的批量更新
     * @param list
     * @return int
     */
    int batchUpdateSelective(@Size(min = 1, message = "参数不能为空") List<SysUserRole> list);


    /**
     * 更新插入
     * @param sysUserRole
     * @return int
     */
    int upsert(@NotNull(message = "参数不能为空") SysUserRole sysUserRole);

    /**
     * 带有空值判断的更新插入
     * @param sysUserRole
     * @return int
     */
    int upsertSelective(@NotNull(message = "参数不能为空") SysUserRole sysUserRole);

    /**
     * 批量更新插入
     * @param list
     * @return int
     */
    int batchUpsert(@Size(min = 1, message = "参数不能为空") List<SysUserRole> list);

    /**
     * 带有空值判断的批量更新插入
     * @param list
     * @return int
     */
    int batchUpsertSelective(@Size(min = 1, message = "参数不能为空") List<SysUserRole> list);


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
     * @param sysUserRole
     * @return int
     */
    int delete(@NotNull(message = "参数不能为空") SysUserRole sysUserRole);

    /**
     * 通过主键查询
     * @param  userId
     * @return SysUserRole sysUserRole
     */
    SysUserRole queryByPrimaryKey(@NotNull(message = "参数不能为空") Integer userId);

    /**
     * 通过主键批量查询
     * @param list
     * @return List<SysUserRole>
     */
    List<SysUserRole> queryBatchPrimaryKeys(@Size(min = 1, message = "参数不能为空") List<Integer> list);

    /**
     * 条件查询一个
     * @param sysUserRole
     * @return List<SysUserRole>
     */
    SysUserRole queryOne(@NotNull(message = "参数不能为空") SysUserRole sysUserRole);

    /**
     * 条件查询
     * @param sysUserRole
     * @return List<SysUserRole>
     */
    List<SysUserRole> queryByCondition(@NotNull(message = "参数不能为空") SysUserRole sysUserRole);

    /**
     * 模糊查询
     * @param sysUserRole
     * @return List<SysUserRole>
     */
    List<SysUserRole> queryFuzzy(@NotNull(message = "参数不能为空") SysUserRole sysUserRole);

    /**
     * 模糊条件查询
     * @param sysUserRole
     * @return List<SysUserRole>
     */
    List<SysUserRole> queryByLikeCondition(@NotNull(message = "参数不能为空") SysUserRole sysUserRole);

    /**
     * 条件查询数量
     * @param sysUserRole
     * @return int
     */
    int queryCount(@NotNull(message = "参数不能为空") SysUserRole sysUserRole);

    /**
     * 分组统计
     * @param sysUserRole
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroup(@NotNull(message = "参数不能为空") SysUserRole sysUserRole);

    /**
     * 日统计
     * @param sysUserRole
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByDay(@NotNull(message = "参数不能为空") SysUserRole sysUserRole);

    /**
     * 月统计
     * @param sysUserRole
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByMonth(@NotNull(message = "参数不能为空") SysUserRole sysUserRole);

    /**
     * 年统计
     * @param sysUserRole
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByYear(@NotNull(message = "参数不能为空") SysUserRole sysUserRole);


}