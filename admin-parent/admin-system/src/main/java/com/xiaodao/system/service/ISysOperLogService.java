package com.xiaodao.system.service;

import java.util.List;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.apache.ibatis.annotations.Param;
import javax.validation.constraints.NotNull;
import com.xiaodao.system.entity.SysOperLog;


/**
 * @description ISysOperLog Service层
 * @author 高磊
 * @since jdk1.8
 */
public interface ISysOperLogService {



    /**
     * 创建SysOperLog
     *
     * @param sysOperLog
     * @return
     */
    Integer insert(@NotNull(message = "添加失败，参数不能为空") SysOperLog sysOperLog);


    /**
     * 根据主键删除
     *
     * @param operId
     * @return
     */
    Integer deleteByPrimaryKey(@NotNull(message = "删除失败，参数不能为空") Long operId);

    /**
     * 修改SysOperLog
     *
     * @param sysOperLog
     * @return
    */
    Integer updateByPrimaryKey(@NotNull(message = "添加失败，参数不能为空") SysOperLog sysOperLog);


    /**
    * 根据主键查询
    *
    * @param operId
    * @return
    */
    SysOperLog selectByPrimaryKey(@NotNull(message = "查询失败，参数不能为空") Long operId);


    /**
     * 分页查询
     * @param pageIndex
     * @param pageSize
     * @param sysOperLog SysOperLog
     * @return IPage<SysOperLog>
     */
    IPage<SysOperLog> queryPage(int pageIndex, int pageSize, SysOperLog sysOperLog);

    /**
    * 批量插入
    * @param list List<SysOperLog
    * @return Integer
    */
    Integer batchInsert(List<SysOperLog> list);

    /**
     * 批量更新
     * @param list List<SysOperLog>
     * @return Integer
     */
    Integer batchUpdate(List<SysOperLog> list);

    /**
     * 批量删除
     * @param list List<Long >
     * @return Integer
     */
    Integer deleteBatchIds(List<Long> list);

    /**
     * 存在即更新
     * @param sysOperLog SysOperLog
     * @return Integer
     */
    Integer upsert(@Param("sysOperLog") SysOperLog sysOperLog);

    /**
     * 存在即更新，可选择具体属性
     * @param sysOperLog SysOperLog
     * @return Integer
     */
    Integer upsertSelective(SysOperLog sysOperLog);

    /**
     * 条件查询
     * @param sysOperLog SysOperLog
     * @return List<SysOperLog>
    */
    List<SysOperLog> query(SysOperLog sysOperLog);

    /**
     * 查询总数
     * @return Integer
     */
    Long queryTotalCount();


}