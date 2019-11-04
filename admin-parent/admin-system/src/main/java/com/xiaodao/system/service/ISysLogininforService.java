package com.xiaodao.system.service;

import java.util.List;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.apache.ibatis.annotations.Param;
import javax.validation.constraints.NotNull;
import com.xiaodao.system.entity.SysLogininfor;


/**
 * @description ISysLogininfor Service层
 * @author ¸ßÀÚ
 * @since jdk1.8
 */
public interface ISysLogininforService {



    /**
     * 创建SysLogininfor
     *
     * @param sysLogininfor
     * @return
     */
    Integer insert(@NotNull(message = "添加失败，参数不能为空") SysLogininfor sysLogininfor);


    /**
     * 根据主键删除
     *
     * @param infoId
     * @return
     */
    Integer deleteByPrimaryKey(@NotNull(message = "删除失败，参数不能为空") Long infoId);

    /**
     * 修改SysLogininfor
     *
     * @param sysLogininfor
     * @return
    */
    Integer updateByPrimaryKey(@NotNull(message = "添加失败，参数不能为空") SysLogininfor sysLogininfor);


    /**
    * 根据主键查询
    *
    * @param infoId
    * @return
    */
    SysLogininfor selectByPrimaryKey(@NotNull(message = "查询失败，参数不能为空") Long infoId);


    /**
     * 分页查询
     * @param pageIndex
     * @param pageSize
     * @param sysLogininfor SysLogininfor
     * @return IPage<SysLogininfor>
     */
    IPage<SysLogininfor> queryPage(int pageIndex, int pageSize, SysLogininfor sysLogininfor);

    /**
    * 批量插入
    * @param list List<SysLogininfor
    * @return Integer
    */
    Integer batchInsert(List<SysLogininfor> list);

    /**
     * 批量更新
     * @param list List<SysLogininfor>
     * @return Integer
     */
    Integer batchUpdate(List<SysLogininfor> list);

    /**
     * 批量删除
     * @param list List<Long >
     * @return Integer
     */
    Integer deleteBatchIds(List<Long> list);

    /**
     * 存在即更新
     * @param sysLogininfor SysLogininfor
     * @return Integer
     */
    Integer upsert(@Param("sysLogininfor") SysLogininfor sysLogininfor);

    /**
     * 存在即更新，可选择具体属性
     * @param sysLogininfor SysLogininfor
     * @return Integer
     */
    Integer upsertSelective(SysLogininfor sysLogininfor);

    /**
     * 条件查询
     * @param sysLogininfor SysLogininfor
     * @return List<SysLogininfor>
    */
    List<SysLogininfor> query(SysLogininfor sysLogininfor);

    /**
     * 查询总数
     * @return Integer
     */
    Long queryTotalCount();


}