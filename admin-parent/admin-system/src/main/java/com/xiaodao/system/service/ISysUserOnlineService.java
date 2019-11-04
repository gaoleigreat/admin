package com.xiaodao.system.service;

import java.util.List;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.apache.ibatis.annotations.Param;
import javax.validation.constraints.NotNull;
import com.xiaodao.system.entity.SysUserOnline;


/**
 * @description ISysUserOnline Service层
 * @author ¸ßÀÚ
 * @since jdk1.8
 */
public interface ISysUserOnlineService {



    /**
     * 创建SysUserOnline
     *
     * @param sysUserOnline
     * @return
     */
    Integer insert(@NotNull(message = "添加失败，参数不能为空") SysUserOnline sysUserOnline);


    /**
     * 根据主键删除
     *
     * @param sessionid
     * @return
     */
    Integer deleteByPrimaryKey(@NotNull(message = "删除失败，参数不能为空") String sessionid);

    /**
     * 修改SysUserOnline
     *
     * @param sysUserOnline
     * @return
    */
    Integer updateByPrimaryKey(@NotNull(message = "添加失败，参数不能为空") SysUserOnline sysUserOnline);


    /**
    * 根据主键查询
    *
    * @param sessionid
    * @return
    */
    SysUserOnline selectByPrimaryKey(@NotNull(message = "查询失败，参数不能为空") String sessionid);


    /**
     * 分页查询
     * @param pageIndex
     * @param pageSize
     * @param sysUserOnline SysUserOnline
     * @return IPage<SysUserOnline>
     */
    IPage<SysUserOnline> queryPage(int pageIndex, int pageSize, SysUserOnline sysUserOnline);

    /**
    * 批量插入
    * @param list List<SysUserOnline
    * @return Integer
    */
    Integer batchInsert(List<SysUserOnline> list);

    /**
     * 批量更新
     * @param list List<SysUserOnline>
     * @return Integer
     */
    Integer batchUpdate(List<SysUserOnline> list);

    /**
     * 批量删除
     * @param list List<String >
     * @return Integer
     */
    Integer deleteBatchIds(List<String> list);

    /**
     * 存在即更新
     * @param sysUserOnline SysUserOnline
     * @return Integer
     */
    Integer upsert(@Param("sysUserOnline") SysUserOnline sysUserOnline);

    /**
     * 存在即更新，可选择具体属性
     * @param sysUserOnline SysUserOnline
     * @return Integer
     */
    Integer upsertSelective(SysUserOnline sysUserOnline);

    /**
     * 条件查询
     * @param sysUserOnline SysUserOnline
     * @return List<SysUserOnline>
    */
    List<SysUserOnline> query(SysUserOnline sysUserOnline);

    /**
     * 查询总数
     * @return Integer
     */
    Long queryTotalCount();


}