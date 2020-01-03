package com.xiaodao.system.mapper;


import com.xiaodao.admin.entity.SysUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @description SysUserMapper
 * @author¸ßÀÚ
 * @since jdk1.8
 */
public interface SysUserMapper {

    /**
     * 新增
     *
     * @param sysUser
     * @return int
     */
    int insert(@Param("sysUser") SysUser sysUser);

    /**
     * 带有空值判断的新增
     *
     * @param sysUser
     * @return int
     */
    int insertSelective(@Param("sysUser") SysUser sysUser);

    /**
     * 批量插入
     *
     * @param list
     * @return int
     */
    int batchInsert(@Param("list") List<SysUser> list);

    /**
     * 带有空值判断的批量插入
     *
     * @param list
     * @return int
     */
    int batchInsertSelective(@Param("list") List<SysUser> list);

    /**
     * 根据主键更新
     *
     * @param sysUser
     * @return int
     */
    int updateByPrimaryKey(@Param("sysUser") SysUser sysUser);

    /**
     * 带有空值判断的主键更新
     *
     * @param sysUser
     * @return int
     */
    int updateSelectiveByPrimaryKey(@Param("sysUser") SysUser sysUser);

    /**
     * 批量更新
     *
     * @param list
     * @return int
     */
    int batchUpdate(@Param("list") List<SysUser> list);

    /**
     * 带有空值判断的批量更新
     *
     * @param list
     * @return int
     */
    int batchUpdateSelective(@Param("list") List<SysUser> list);

    /**
     * 更新插入
     *
     * @param sysUser
     * @return int
     */
    int upsert(@Param("sysUser") SysUser sysUser);

    /**
     * 带有空值判断的更新插入
     *
     * @param sysUser
     * @return int
     */
    int upsertSelective(@Param("sysUser") SysUser sysUser);

    /**
     * 批量更新插入
     *
     * @param list
     * @return int
     */
    int batchUpsert(@Param("list") List<SysUser> list);

    /**
     * 带有空值判断的批量更新插入
     *
     * @param list
     * @return int
     */
    int batchUpsertSelective(@Param("list") List<SysUser> list);

    /**
     * 通过主键删除
     *
     * @param userId
     * @return int
     */
    int deleteByPrimaryKey(@Param("sysUser") Long userId);

    /**
     * 通过主键批量删除
     *
     * @param list
     * @return int
     */
    int deleteBatchByPrimaryKeys(@Param("list") List<Long> list);

    /**
     * 条件删除
     *
     * @param sysUser
     * @return int
     */
    int delete(@Param("sysUser") SysUser sysUser);

    /**
     * 通过主键查询
     *
     * @param userId
     * @return SysUser sysUser
     */
    SysUser queryByPrimaryKey(@Param("sysUser") Long userId);

    /**
     * 通过主键批量查询
     *
     * @param list
     * @return List<SysUser>
     */
    List<SysUser> queryBatchPrimaryKeys(@Param("list") List<Long> list);

    /**
     * 条件查询一个
     *
     * @param sysUser
     * @return List<SysUser>
     */
    SysUser queryOne(@Param("sysUser") SysUser sysUser);

    /**
     * 条件查询
     *
     * @param sysUser
     * @return List<SysUser>
     */
    List<SysUser> queryByCondition(@Param("sysUser") SysUser sysUser);

    /**
     * 模糊查询
     *
     * @param sysUser
     * @return List<SysUser>
     */
    List<SysUser> queryFuzzy(@Param("sysUser") SysUser sysUser);

    /**
     * 模糊条件查询
     *
     * @param sysUser
     * @return List<SysUser>
     */
    List<SysUser> queryByLikeCondition(@Param("sysUser") SysUser sysUser);

    /**
     * 条件查询数量
     *
     * @param sysUser
     * @return int
     */
    int queryCount(@Param("sysUser") SysUser sysUser);

    /**
     * 分组统计
     *
     * @param sysUser
     * @return List<Map < String, Object>>
     */
    List<Map<String, Object>> statisticsGroup(@Param("sysUser") SysUser sysUser);

    /**
     * 日统计
     *
     * @param sysUser
     * @return List<Map < String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByDay(@Param("sysUser") SysUser sysUser);

    /**
     * 月统计
     *
     * @param sysUser
     * @return List<Map < String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByMonth(@Param("sysUser") SysUser sysUser);

    /**
     * 年统计
     *
     * @param sysUser
     * @return List<Map < String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByYear(@Param("sysUser") SysUser sysUser);

    /**
     * 通过用户名查询用户
     *
     * @param userName 用户名
     * @return 用户对象信息
     */
    SysUser selectUserByLoginName(String userName);

    /**
     * 通过手机号码查询用户
     *
     * @param phoneNumber 手机号码
     * @return 用户对象信息
     */
    SysUser selectUserByPhoneNumber(String phoneNumber);

    /**
     * 通过邮箱查询用户
     *
     * @param email 邮箱
     * @return 用户对象信息
     */
    SysUser selectUserByEmail(String email);

}