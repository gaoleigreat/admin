package com.xiaodao.system.service;

import java.util.List;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.apache.ibatis.annotations.Param;
import javax.validation.constraints.NotNull;
import com.xiaodao.system.entity.SysOss;


/**
 * @description ISysOss Service层
 * @author xiaodao
 * @since jdk1.8
 */
public interface ISysOssService {



    /**
     * 创建SysOss
     *
     * @param sysOss
     * @return
     */
    Integer insert(@NotNull(message = "添加失败，参数不能为空") SysOss sysOss);


    /**
     * 根据主键删除
     *
     * @param id
     * @return
     */
    Integer deleteByPrimaryKey(@NotNull(message = "删除失败，参数不能为空") Long id);

    /**
     * 修改SysOss
     *
     * @param sysOss
     * @return
    */
    Integer updateByPrimaryKey(@NotNull(message = "添加失败，参数不能为空") SysOss sysOss);


    /**
    * 根据主键查询
    *
    * @param id
    * @return
    */
    SysOss selectByPrimaryKey(@NotNull(message = "查询失败，参数不能为空") Long id);


    /**
     * 分页查询
     * @param pageIndex
     * @param pageSize
     * @param sysOss SysOss
     * @return IPage<SysOss>
     */
    IPage<SysOss> queryPage(int pageIndex, int pageSize, SysOss sysOss);

    /**
    * 批量插入
    * @param list List<SysOss
    * @return Integer
    */
    Integer batchInsert(List<SysOss> list);

    /**
     * 批量更新
     * @param list List<SysOss>
     * @return Integer
     */
    Integer batchUpdate(List<SysOss> list);

    /**
     * 批量删除
     * @param list List<Long >
     * @return Integer
     */
    Integer deleteBatchIds(List<Long> list);

    /**
     * 存在即更新
     * @param sysOss SysOss
     * @return Integer
     */
    Integer upsert(@Param("sysOss") SysOss sysOss);

    /**
     * 存在即更新，可选择具体属性
     * @param sysOss SysOss
     * @return Integer
     */
    Integer upsertSelective(SysOss sysOss);

    /**
     * 条件查询
     * @param sysOss SysOss
     * @return List<SysOss>
    */
    List<SysOss> query(SysOss sysOss);

    /**
     * 查询总数
     * @return Integer
     */
    Long queryTotalCount();


}