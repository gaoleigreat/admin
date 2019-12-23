package com.xiaodao.system.service;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.xiaodao.feign.system.entity.SysRole;
import org.springframework.validation.annotation.Validated;

import java.util.List;
import java.util.Map;




/**
 * @description ISysRole Service层
 * @author xiaodao
 * @since jdk1.8
 */
@Validated
public interface ISysRoleService {

    /**
     * 新增
     * @param sysRole
     * @return int
     */
    int insert(@NotNull(message = "参数不能为空") SysRole sysRole);

    /**
     * 带有空值判断的新增
     * @param sysRole
     * @return int
     */
    int insertSelective(@NotNull(message = "参数不能为空") SysRole sysRole);


    /**
     * 批量插入
     * @param list
     * @return int
     */
    int batchInsert(@Size(min = 1, message = "参数不能为空") List<SysRole> list);

    /**
     * 带有空值判断的批量插入
     * @param list
     * @return int
     */
    int batchInsertSelective(@Size(min = 1, message = "参数不能为空") List<SysRole> list);

    /**
     * 根据主键更新
     * @param sysRole
     * @return int
     */
    int updateByPrimaryKey(@NotNull(message = "参数不能为空") SysRole sysRole);

    /**
     * 带有空值判断的主键更新
     * @param sysRole
     * @return int
     */
    int updateSelectiveByPrimaryKey(@NotNull(message = "参数不能为空") SysRole sysRole);

    /**
     * 批量更新
     * @param list
     * @return int
     */
    int batchUpdate(@Size(min = 1, message = "参数不能为空") List<SysRole> list);

    /**
     * 带有空值判断的批量更新
     * @param list
     * @return int
     */
    int batchUpdateSelective(@Size(min = 1, message = "参数不能为空") List<SysRole> list);


    /**
     * 更新插入
     * @param sysRole
     * @return int
     */
    int upsert(@NotNull(message = "参数不能为空") SysRole sysRole);

    /**
     * 带有空值判断的更新插入
     * @param sysRole
     * @return int
     */
    int upsertSelective(@NotNull(message = "参数不能为空") SysRole sysRole);

    /**
     * 批量更新插入
     * @param list
     * @return int
     */
    int batchUpsert(@Size(min = 1, message = "参数不能为空") List<SysRole> list);

    /**
     * 带有空值判断的批量更新插入
     * @param list
     * @return int
     */
    int batchUpsertSelective(@Size(min = 1, message = "参数不能为空") List<SysRole> list);


    /**
     * 通过主键删除
     * @param roleId
     * @return int
     */

    int deleteByPrimaryKey(@NotNull(message = "参数不能为空") Long roleId);

    /**
     * 通过主键批量删除
     * @param list
     * @return int
     */
    int deleteBatchByPrimaryKeys(@Size(min = 1, message = "参数不能为空") List<Long> list);

    /**
     * 条件删除
     * @param sysRole
     * @return int
     */
    int delete(@NotNull(message = "参数不能为空") SysRole sysRole);

    /**
     * 通过主键查询
     * @param  roleId
     * @return SysRole sysRole
     */
    SysRole queryByPrimaryKey(@NotNull(message = "参数不能为空") Long roleId);

    /**
     * 通过主键批量查询
     * @param list
     * @return List<SysRole>
     */
    List<SysRole> queryBatchPrimaryKeys(@Size(min = 1, message = "参数不能为空") List<Long> list);

    /**
     * 条件查询一个
     * @param sysRole
     * @return List<SysRole>
     */
    SysRole queryOne(@NotNull(message = "参数不能为空") SysRole sysRole);

    /**
     * 条件查询
     * @param sysRole
     * @return List<SysRole>
     */
    List<SysRole> queryByCondition(@NotNull(message = "参数不能为空") SysRole sysRole);

    /**
     * 模糊查询
     * @param sysRole
     * @return List<SysRole>
     */
    List<SysRole> queryFuzzy(@NotNull(message = "参数不能为空") SysRole sysRole);

    /**
     * 模糊条件查询
     * @param sysRole
     * @return List<SysRole>
     */
    List<SysRole> queryByLikeCondition(@NotNull(message = "参数不能为空") SysRole sysRole);

    /**
     * 条件查询数量
     * @param sysRole
     * @return int
     */
    int queryCount(@NotNull(message = "参数不能为空") SysRole sysRole);

    /**
     * 分组统计
     * @param sysRole
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroup(@NotNull(message = "参数不能为空") SysRole sysRole);

    /**
     * 日统计
     * @param sysRole
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByDay(@NotNull(message = "参数不能为空") SysRole sysRole);

    /**
     * 月统计
     * @param sysRole
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByMonth(@NotNull(message = "参数不能为空") SysRole sysRole);

    /**
     * 年统计
     * @param sysRole
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByYear(@NotNull(message = "参数不能为空") SysRole sysRole);


}