package com.xiaodao.system.service;

import java.util.List;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.apache.ibatis.annotations.Param;
import javax.validation.constraints.NotNull;
import com.xiaodao.system.entity.SysUserPost;


/**
 * @description ISysUserPost Service层
 * @author 高磊
 * @since jdk1.8
 */
public interface ISysUserPostService {



    /**
     * 创建SysUserPost
     *
     * @param sysUserPost
     * @return
     */
    Integer insert(@NotNull(message = "添加失败，参数不能为空") SysUserPost sysUserPost);


    /**
     * 根据主键删除
     *
     * @param userId
     * @return
     */
    Integer deleteByPrimaryKey(@NotNull(message = "删除失败，参数不能为空") Long userId);

    /**
     * 修改SysUserPost
     *
     * @param sysUserPost
     * @return
    */
    Integer updateByPrimaryKey(@NotNull(message = "添加失败，参数不能为空") SysUserPost sysUserPost);


    /**
    * 根据主键查询
    *
    * @param userId
    * @return
    */
    SysUserPost selectByPrimaryKey(@NotNull(message = "查询失败，参数不能为空") Long userId);


    /**
     * 分页查询
     * @param pageIndex
     * @param pageSize
     * @param sysUserPost SysUserPost
     * @return IPage<SysUserPost>
     */
    IPage<SysUserPost> queryPage(int pageIndex, int pageSize, SysUserPost sysUserPost);

    /**
    * 批量插入
    * @param list List<SysUserPost
    * @return Integer
    */
    Integer batchInsert(List<SysUserPost> list);

    /**
     * 批量更新
     * @param list List<SysUserPost>
     * @return Integer
     */
    Integer batchUpdate(List<SysUserPost> list);

    /**
     * 批量删除
     * @param list List<Long >
     * @return Integer
     */
    Integer deleteBatchIds(List<Long> list);

    /**
     * 存在即更新
     * @param sysUserPost SysUserPost
     * @return Integer
     */
    Integer upsert(@Param("sysUserPost") SysUserPost sysUserPost);

    /**
     * 存在即更新，可选择具体属性
     * @param sysUserPost SysUserPost
     * @return Integer
     */
    Integer upsertSelective(SysUserPost sysUserPost);

    /**
     * 条件查询
     * @param sysUserPost SysUserPost
     * @return List<SysUserPost>
    */
    List<SysUserPost> query(SysUserPost sysUserPost);

    /**
     * 查询总数
     * @return Integer
     */
    Long queryTotalCount();


}