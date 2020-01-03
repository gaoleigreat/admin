package com.xiaodao.system.service;

import com.xiaodao.admin.entity.SysUser;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;
import java.util.Map;


/**
 * @author xiaodao
 * @description ISysUser Service层
 * @since jdk1.8
 */
@Validated
public interface ISysUserService {

    /**
     * 新增
     *
     * @param sysUser
     * @return int
     */
    int insert(@NotNull(message = "参数不能为空") SysUser sysUser);

    /**
     * 带有空值判断的新增
     *
     * @param sysUser
     * @return int
     */
    int insertSelective(@NotNull(message = "参数不能为空") SysUser sysUser);


    /**
     * 批量插入
     *
     * @param list
     * @return int
     */
    int batchInsert(@Size(min = 1, message = "参数不能为空") List<SysUser> list);

    /**
     * 带有空值判断的批量插入
     *
     * @param list
     * @return int
     */
    int batchInsertSelective(@Size(min = 1, message = "参数不能为空") List<SysUser> list);

    /**
     * 根据主键更新
     *
     * @param sysUser
     * @return int
     */
    int updateByPrimaryKey(@NotNull(message = "参数不能为空") SysUser sysUser);

    /**
     * 带有空值判断的主键更新
     *
     * @param sysUser
     * @return int
     */
    int updateSelectiveByPrimaryKey(@NotNull(message = "参数不能为空") SysUser sysUser);

    /**
     * 批量更新
     *
     * @param list
     * @return int
     */
    int batchUpdate(@Size(min = 1, message = "参数不能为空") List<SysUser> list);

    /**
     * 带有空值判断的批量更新
     *
     * @param list
     * @return int
     */
    int batchUpdateSelective(@Size(min = 1, message = "参数不能为空") List<SysUser> list);


    /**
     * 更新插入
     *
     * @param sysUser
     * @return int
     */
    int upsert(@NotNull(message = "参数不能为空") SysUser sysUser);

    /**
     * 带有空值判断的更新插入
     *
     * @param sysUser
     * @return int
     */
    int upsertSelective(@NotNull(message = "参数不能为空") SysUser sysUser);

    /**
     * 批量更新插入
     *
     * @param list
     * @return int
     */
    int batchUpsert(@Size(min = 1, message = "参数不能为空") List<SysUser> list);

    /**
     * 带有空值判断的批量更新插入
     *
     * @param list
     * @return int
     */
    int batchUpsertSelective(@Size(min = 1, message = "参数不能为空") List<SysUser> list);


    /**
     * 通过主键删除
     *
     * @param userId
     * @return int
     */

    int deleteByPrimaryKey(@NotNull(message = "参数不能为空") Long userId);

    /**
     * 通过主键批量删除
     *
     * @param list
     * @return int
     */
    int deleteBatchByPrimaryKeys(@Size(min = 1, message = "参数不能为空") List<Long> list);

    /**
     * 条件删除
     *
     * @param sysUser
     * @return int
     */
    int delete(@NotNull(message = "参数不能为空") SysUser sysUser);

    /**
     * 通过主键查询
     *
     * @param userId
     * @return SysUser sysUser
     */
    SysUser queryByPrimaryKey(@NotNull(message = "参数不能为空") Long userId);

    /**
     * 通过主键批量查询
     *
     * @param list
     * @return List<SysUser>
     */
    List<SysUser> queryBatchPrimaryKeys(@Size(min = 1, message = "参数不能为空") List<Long> list);

    /**
     * 条件查询一个
     *
     * @param sysUser
     * @return List<SysUser>
     */
    SysUser queryOne(@NotNull(message = "参数不能为空") SysUser sysUser);

    /**
     * 条件查询
     *
     * @param sysUser
     * @return List<SysUser>
     */
    List<SysUser> queryByCondition(@NotNull(message = "参数不能为空") SysUser sysUser);

    /**
     * 模糊查询
     *
     * @param sysUser
     * @return List<SysUser>
     */
    List<SysUser> queryFuzzy(@NotNull(message = "参数不能为空") SysUser sysUser);

    /**
     * 模糊条件查询
     *
     * @param sysUser
     * @return List<SysUser>
     */
    List<SysUser> queryByLikeCondition(@NotNull(message = "参数不能为空") SysUser sysUser);

    /**
     * 条件查询数量
     *
     * @param sysUser
     * @return int
     */
    int queryCount(@NotNull(message = "参数不能为空") SysUser sysUser);

    /**
     * 分组统计
     *
     * @param sysUser
     * @return List<Map < String, Object>>
     */
    List<Map<String, Object>> statisticsGroup(@NotNull(message = "参数不能为空") SysUser sysUser);

    /**
     * 日统计
     *
     * @param sysUser
     * @return List<Map < String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByDay(@NotNull(message = "参数不能为空") SysUser sysUser);

    /**
     * 月统计
     *
     * @param sysUser
     * @return List<Map < String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByMonth(@NotNull(message = "参数不能为空") SysUser sysUser);

    /**
     * 年统计
     *
     * @param sysUser
     * @return List<Map < String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByYear(@NotNull(message = "参数不能为空") SysUser sysUser);


    /**
     * 通过用户名查询用户
     *
     * @param userName 用户名
     * @return 用户对象信息
     */
    SysUser selectUserByLoginName(@NotBlank(message = "参数不能为空") String userName);

    /**
     * 通过手机号码查询用户
     *
     * @param phoneNumber 手机号码
     * @return 用户对象信息
     */
    SysUser selectUserByPhoneNumber(@NotBlank(message = "参数不能为空") String phoneNumber);

    /**
     * 通过邮箱查询用户
     *
     * @param email 邮箱
     * @return 用户对象信息
     */
    SysUser selectUserByEmail(@NotBlank(message = "参数不能为空") String email);
}