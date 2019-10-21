package com.xiaodao.system.service;

import java.util.List;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.apache.ibatis.annotations.Param;
import javax.validation.constraints.NotNull;
import com.xiaodao.system.entity.SysPost;


/**
 * @description ISysPost Service层
 * @author 高磊
 * @since jdk1.8
 */
public interface ISysPostService {



    /**
     * 创建SysPost
     *
     * @param sysPost
     * @return
     */
    Integer insert(@NotNull(message = "添加失败，参数不能为空") SysPost sysPost);


    /**
     * 根据主键删除
     *
     * @param postId
     * @return
     */
    Integer deleteByPrimaryKey(@NotNull(message = "删除失败，参数不能为空") Long postId);

    /**
     * 修改SysPost
     *
     * @param sysPost
     * @return
    */
    Integer updateByPrimaryKey(@NotNull(message = "添加失败，参数不能为空") SysPost sysPost);


    /**
    * 根据主键查询
    *
    * @param postId
    * @return
    */
    SysPost selectByPrimaryKey(@NotNull(message = "查询失败，参数不能为空") Long postId);


    /**
     * 分页查询
     * @param pageIndex
     * @param pageSize
     * @param sysPost SysPost
     * @return IPage<SysPost>
     */
    IPage<SysPost> queryPage(int pageIndex, int pageSize, SysPost sysPost);

    /**
    * 批量插入
    * @param list List<SysPost
    * @return Integer
    */
    Integer batchInsert(List<SysPost> list);

    /**
     * 批量更新
     * @param list List<SysPost>
     * @return Integer
     */
    Integer batchUpdate(List<SysPost> list);

    /**
     * 批量删除
     * @param list List<Long >
     * @return Integer
     */
    Integer deleteBatchIds(List<Long> list);

    /**
     * 存在即更新
     * @param sysPost SysPost
     * @return Integer
     */
    Integer upsert(@Param("sysPost") SysPost sysPost);

    /**
     * 存在即更新，可选择具体属性
     * @param sysPost SysPost
     * @return Integer
     */
    Integer upsertSelective(SysPost sysPost);

    /**
     * 条件查询
     * @param sysPost SysPost
     * @return List<SysPost>
    */
    List<SysPost> query(SysPost sysPost);

    /**
     * 查询总数
     * @return Integer
     */
    Long queryTotalCount();


}