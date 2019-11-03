package com.xiaodao.system.service;

import java.util.List;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.apache.ibatis.annotations.Param;
import javax.validation.constraints.NotNull;
import com.xiaodao.system.entity.SysConfig;


/**
 * @description ISysConfig Service层
 * @author xiaodao
 * @since jdk1.8
 */
public interface ISysConfigService {



    /**
     * 创建SysConfig
     *
     * @param sysConfig
     * @return
     */
    Integer insert(@NotNull(message = "添加失败，参数不能为空") SysConfig sysConfig);


    /**
     * 根据主键删除
     *
     * @param configId
     * @return
     */
    Integer deleteByPrimaryKey(@NotNull(message = "删除失败，参数不能为空") Long configId);

    /**
     * 修改SysConfig
     *
     * @param sysConfig
     * @return
    */
    Integer updateByPrimaryKey(@NotNull(message = "添加失败，参数不能为空") SysConfig sysConfig);


    /**
    * 根据主键查询
    *
    * @param configId
    * @return
    */
    SysConfig selectByPrimaryKey(@NotNull(message = "查询失败，参数不能为空") Long configId);


    /**
     * 分页查询
     * @param pageIndex
     * @param pageSize
     * @param sysConfig SysConfig
     * @return IPage<SysConfig>
     */
    IPage<SysConfig> queryPage(int pageIndex, int pageSize, SysConfig sysConfig);

    /**
    * 批量插入
    * @param list List<SysConfig
    * @return Integer
    */
    Integer batchInsert(List<SysConfig> list);

    /**
     * 批量更新
     * @param list List<SysConfig>
     * @return Integer
     */
    Integer batchUpdate(List<SysConfig> list);

    /**
     * 批量删除
     * @param list List<Long >
     * @return Integer
     */
    Integer deleteBatchIds(List<Long> list);

    /**
     * 存在即更新
     * @param sysConfig SysConfig
     * @return Integer
     */
    Integer upsert(@Param("sysConfig") SysConfig sysConfig);

    /**
     * 存在即更新，可选择具体属性
     * @param sysConfig SysConfig
     * @return Integer
     */
    Integer upsertSelective(SysConfig sysConfig);

    /**
     * 条件查询
     * @param sysConfig SysConfig
     * @return List<SysConfig>
    */
    List<SysConfig> query(SysConfig sysConfig);

    /**
     * 查询总数
     * @return Integer
     */
    Long queryTotalCount();


}