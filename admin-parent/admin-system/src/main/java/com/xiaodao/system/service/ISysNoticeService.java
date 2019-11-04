package com.xiaodao.system.service;

import java.util.List;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.apache.ibatis.annotations.Param;
import javax.validation.constraints.NotNull;
import com.xiaodao.system.entity.SysNotice;


/**
 * @description ISysNotice Service层
 * @author ¸ßÀÚ
 * @since jdk1.8
 */
public interface ISysNoticeService {



    /**
     * 创建SysNotice
     *
     * @param sysNotice
     * @return
     */
    Integer insert(@NotNull(message = "添加失败，参数不能为空") SysNotice sysNotice);


    /**
     * 根据主键删除
     *
     * @param noticeId
     * @return
     */
    Integer deleteByPrimaryKey(@NotNull(message = "删除失败，参数不能为空") Long noticeId);

    /**
     * 修改SysNotice
     *
     * @param sysNotice
     * @return
    */
    Integer updateByPrimaryKey(@NotNull(message = "添加失败，参数不能为空") SysNotice sysNotice);


    /**
    * 根据主键查询
    *
    * @param noticeId
    * @return
    */
    SysNotice selectByPrimaryKey(@NotNull(message = "查询失败，参数不能为空") Long noticeId);


    /**
     * 分页查询
     * @param pageIndex
     * @param pageSize
     * @param sysNotice SysNotice
     * @return IPage<SysNotice>
     */
    IPage<SysNotice> queryPage(int pageIndex, int pageSize, SysNotice sysNotice);

    /**
    * 批量插入
    * @param list List<SysNotice
    * @return Integer
    */
    Integer batchInsert(List<SysNotice> list);

    /**
     * 批量更新
     * @param list List<SysNotice>
     * @return Integer
     */
    Integer batchUpdate(List<SysNotice> list);

    /**
     * 批量删除
     * @param list List<Long >
     * @return Integer
     */
    Integer deleteBatchIds(List<Long> list);

    /**
     * 存在即更新
     * @param sysNotice SysNotice
     * @return Integer
     */
    Integer upsert(@Param("sysNotice") SysNotice sysNotice);

    /**
     * 存在即更新，可选择具体属性
     * @param sysNotice SysNotice
     * @return Integer
     */
    Integer upsertSelective(SysNotice sysNotice);

    /**
     * 条件查询
     * @param sysNotice SysNotice
     * @return List<SysNotice>
    */
    List<SysNotice> query(SysNotice sysNotice);

    /**
     * 查询总数
     * @return Integer
     */
    Long queryTotalCount();


}