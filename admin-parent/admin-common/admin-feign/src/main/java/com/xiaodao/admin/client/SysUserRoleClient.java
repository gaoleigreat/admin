package com.xiaodao.admin.client;

import com.github.pagehelper.PageInfo;
import com.xiaodao.feign.config.MultipartSupportConfig;
import com.xiaodao.core.result.RespDataVO;
import com.xiaodao.core.result.RespVO;
import com.xiaodao.core.result.RespVOBuilder;
import com.xiaodao.admin.entity.SysUserRole;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@FeignClient(value = "system-service", path = "/sysUserRole", fallbackFactory = SysUserRoleClientFallback.class, configuration = MultipartSupportConfig.class)
public interface SysUserRoleClient {


    /**
     * 新增
     *
     * @param sysUserRole
     * @return
     */
    @PostMapping("/insert")
    RespVO insert(@RequestBody SysUserRole sysUserRole);

    /**
     * 带有空值判断的新增
     *
     * @param sysUserRole
     * @return
     */
    @PostMapping("/insertSelective")
    RespVO insertSelective(@RequestBody SysUserRole sysUserRole);

    /**
     * 批量新增
     *
     * @param list
     * @return
     */
    @PostMapping("/batchInsert")
    RespVO batchInsert(@RequestBody List<SysUserRole> list);

    /**
     * 带有空值判断的新增
     *
     * @param list
     * @return
     */
    @PostMapping("/batchInsertSelective")
    RespVO batchInsertSelective(@RequestBody List<SysUserRole> list);

    /**
     * 根据主键更新
     *
     * @param sysUserRole
     * @return
     */
    @PutMapping("/updateByPrimaryKey")
    RespVO updateByPrimaryKey(@RequestBody SysUserRole sysUserRole);

    /**
     * 根据空值判断的主键更新
     *
     * @param sysUserRole
     * @return
     */
    @PutMapping("/updateSelectiveByPrimaryKey")
    RespVO updateSelectiveByPrimaryKey(@RequestBody SysUserRole sysUserRole);

    /**
     * 批量更新
     *
     * @param list
     * @return
     */
    @PutMapping("/batchUpdate")
    RespVO batchUpdate(@RequestBody List<SysUserRole> list);

    /**
     * 带有空值判断的批量更新
     *
     * @param list
     * @return
     */
    @PutMapping("/batchUpdateSelective")
    RespVO batchUpdateSelective(@RequestBody List<SysUserRole> list);


    /**
     * 更新插入
     *
     * @param sysUserRole
     * @return
     */
    @PostMapping("/upsert")
    RespVO upsert(@RequestBody SysUserRole sysUserRole);

    /**
     * 带有空值判断的更新插入
     *
     * @param sysUserRole
     * @return
     */
    @PostMapping("/upsertSelective")
    RespVO upsertSelective(@RequestBody SysUserRole sysUserRole);


    /**
     * 批量更新插入
     *
     * @param list
     * @return
     */
    @PostMapping("/batchUpsert")
    RespVO batchUpsert(@RequestBody List<SysUserRole> list);


    /**
     * 带有空值判断的批量更新插入
     *
     * @param list
     * @return
     */
    @PostMapping("/batchUpsertSelective")
    RespVO batchUpsertSelective(@RequestBody List<SysUserRole> list);


    /**
     * 通过主键删除
     *
     * @param userId
     * @return
     */
    @DeleteMapping("/{userId}")
    RespVO deleteByPrimaryKey(@PathVariable(value = "userId") Integer userId);

    /**
     * 通过主键批量删除
     *
     * @param list
     * @return
     */
    @DeleteMapping("/deleteBatchByPrimaryKeys")
    RespVO deleteBatchByPrimaryKeys(@RequestBody List<Long> list);

    /**
     * 条件删除
     *
     * @param sysUserRole
     * @return
     */
    @DeleteMapping("/delete")
    RespVO delete(@RequestBody SysUserRole sysUserRole);

    /**
     * 通过主键查询
     *
     * @param userId
     * @return
     */
    @GetMapping("/{userId}")
    RespVO<SysUserRole> queryByPrimaryKey(@PathVariable(value = "userId") Integer userId);


    /**
     * 通过主键批量查询
     *
     * @param list
     * @return
     */
    @PostMapping("/queryBatchPrimaryKeys")
    RespVO<RespDataVO<SysUserRole>> queryBatchPrimaryKeys(@RequestBody List<Long> list);


    /**
     * 条件查询一个
     *
     * @param sysUserRole
     * @return
     */
    @PostMapping("/queryOne")
    RespVO<SysUserRole> queryOne(@RequestBody SysUserRole sysUserRole);

    /**
     * 条件查询
     *
     * @param sysUserRole
     * @return
     */
    @PostMapping("/queryByCondition")
    RespVO<RespDataVO<SysUserRole>> queryByCondition(@RequestBody SysUserRole sysUserRole);

    /**
     * 条件分页查询
     *
     * @param sysUserRole
     * @return
     */
    @PostMapping("/queryPageByCondition")
    RespVO<PageInfo<SysUserRole>> queryPageByCondition(@RequestBody SysUserRole sysUserRole);

    /**
     * 模糊查询
     *
     * @param sysUserRole
     * @return
     */
    @PostMapping("/queryFuzzy")
    RespVO<RespDataVO<SysUserRole>> queryFuzzy(@RequestBody SysUserRole sysUserRole);

    /**
     * 模糊分页查询
     *
     * @param sysUserRole
     * @return
     */
    @PostMapping("/queryPageFuzzy")
    RespVO<PageInfo<SysUserRole>> queryPageFuzzy(@RequestBody SysUserRole sysUserRole);

    /**
     * 模糊条件查询
     *
     * @param sysUserRole
     * @return
     */
    @PostMapping("/queryByLikeCondition")
    RespVO<RespDataVO<SysUserRole>> queryByLikeCondition(@RequestBody SysUserRole sysUserRole);

    /**
     * 模糊分页条件查询
     *
     * @param sysUserRole
     * @return
     */
    @PostMapping("/queryPageByLikeCondition")
    RespVO<PageInfo<SysUserRole>> queryPageByLikeCondition(@RequestBody SysUserRole sysUserRole);

    /**
     * 条件查询数量
     *
     * @param sysUserRole
     * @return
     */
    @PostMapping("/queryCount")
    RespVO<Long> queryCount(@RequestBody SysUserRole sysUserRole);

    /**
     * 分组统计
     *
     * @param sysUserRole
     * @return
     */
    @PostMapping("/statisticsGroup")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroup(@RequestBody SysUserRole sysUserRole);

    /**
     * 日统计
     *
     * @param sysUserRole
     * @return
     */
    @PostMapping("/statisticsGroupByDay")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByDay(@RequestBody SysUserRole sysUserRole);

    /**
     * 月统计
     *
     * @param sysUserRole
     * @return
     */
    @PostMapping("/statisticsGroupByMonth")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByMonth(@RequestBody SysUserRole sysUserRole);

    /**
     * 年统计
     *
     * @param sysUserRole
     * @return
     */
    @PostMapping("/statisticsGroupByYear")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByYear(@RequestBody SysUserRole sysUserRole);

}

class SysUserRoleClientFallback implements SysUserRoleClient {
    @Override
    public RespVO insert(SysUserRole sysUserRole) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO insertSelective(SysUserRole sysUserRole) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchInsert(List<SysUserRole> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchInsertSelective(List<SysUserRole> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO updateByPrimaryKey(SysUserRole sysUserRole) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO updateSelectiveByPrimaryKey(SysUserRole sysUserRole) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpdate(List<SysUserRole> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpdateSelective(List<SysUserRole> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO upsert(SysUserRole sysUserRole) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO upsertSelective(SysUserRole sysUserRole) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpsert(List<SysUserRole> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpsertSelective(List<SysUserRole> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO deleteByPrimaryKey(Integer userId) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO deleteBatchByPrimaryKeys(List<Long> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO delete(SysUserRole sysUserRole) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<SysUserRole> queryByPrimaryKey(Integer userId) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<SysUserRole>> queryBatchPrimaryKeys(List<Long> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<SysUserRole> queryOne(SysUserRole sysUserRole) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<SysUserRole>> queryByCondition(SysUserRole sysUserRole) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<PageInfo<SysUserRole>> queryPageByCondition(SysUserRole sysUserRole) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<SysUserRole>> queryFuzzy(SysUserRole sysUserRole) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<PageInfo<SysUserRole>> queryPageFuzzy(SysUserRole sysUserRole) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<SysUserRole>> queryByLikeCondition(SysUserRole sysUserRole) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<PageInfo<SysUserRole>> queryPageByLikeCondition(SysUserRole sysUserRole) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<Long> queryCount(SysUserRole sysUserRole) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroup(SysUserRole sysUserRole) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByDay(SysUserRole sysUserRole) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByMonth(SysUserRole sysUserRole) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByYear(SysUserRole sysUserRole) {
        return RespVOBuilder.failure("system-service服务不可用");
    }
}