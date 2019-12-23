package com.xiaodao.feign.system.client;

import com.github.pagehelper.PageInfo;
import com.xiaodao.config.MultipartSupportConfig;
import com.xiaodao.core.result.RespDataVO;
import com.xiaodao.core.result.RespVO;
import com.xiaodao.core.result.RespVOBuilder;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import com.xiaodao.feign.system.entity.SysRole;

import java.util.List;
import java.util.Map;

@FeignClient(value = "system-service", path = "/sysRole", fallbackFactory = SysRoleClientFallback.class, configuration = MultipartSupportConfig.class)
public interface SysRoleClient {


    /**
     * 新增
     *
     * @param sysRole
     * @return
     */
    @PostMapping("/insert")
    RespVO insert(@RequestBody SysRole sysRole);

    /**
     * 带有空值判断的新增
     *
     * @param sysRole
     * @return
     */
    @PostMapping("/insertSelective")
    RespVO insertSelective(@RequestBody SysRole sysRole);

    /**
     * 批量新增
     *
     * @param list
     * @return
     */
    @PostMapping("/batchInsert")
    RespVO batchInsert(@RequestBody List<SysRole> list);

    /**
     * 带有空值判断的新增
     *
     * @param list
     * @return
     */
    @PostMapping("/batchInsertSelective")
    RespVO batchInsertSelective(@RequestBody List<SysRole> list);

    /**
     * 根据主键更新
     *
     * @param sysRole
     * @return
     */
    @PutMapping("/updateByPrimaryKey")
    RespVO updateByPrimaryKey(@RequestBody SysRole sysRole);

    /**
     * 根据空值判断的主键更新
     *
     * @param sysRole
     * @return
     */
    @PutMapping("/updateSelectiveByPrimaryKey")
    RespVO updateSelectiveByPrimaryKey(@RequestBody SysRole sysRole);

    /**
     * 批量更新
     *
     * @param list
     * @return
     */
    @PutMapping("/batchUpdate")
    RespVO batchUpdate(@RequestBody List<SysRole> list);

    /**
     * 带有空值判断的批量更新
     *
     * @param list
     * @return
     */
    @PutMapping("/batchUpdateSelective")
    RespVO batchUpdateSelective(@RequestBody List<SysRole> list);


    /**
     * 更新插入
     *
     * @param sysRole
     * @return
     */
    @PostMapping("/upsert")
    RespVO upsert(@RequestBody SysRole sysRole);

    /**
     * 带有空值判断的更新插入
     *
     * @param sysRole
     * @return
     */
    @PostMapping("/upsertSelective")
    RespVO upsertSelective(@RequestBody SysRole sysRole);


    /**
     * 批量更新插入
     *
     * @param list
     * @return
     */
    @PostMapping("/batchUpsert")
    RespVO batchUpsert(@RequestBody List<SysRole> list);


    /**
     * 带有空值判断的批量更新插入
     *
     * @param list
     * @return
     */
    @PostMapping("/batchUpsertSelective")
    RespVO batchUpsertSelective(@RequestBody List<SysRole> list);


    /**
     * 通过主键删除
     *
     * @param roleId
     * @return
     */
    @DeleteMapping("/{roleId}")
    RespVO deleteByPrimaryKey(@PathVariable(value = "roleId") Long roleId);

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
     * @param sysRole
     * @return
     */
    @DeleteMapping("/delete")
    RespVO delete(@RequestBody SysRole sysRole);

    /**
     * 通过主键查询
     *
     * @param roleId
     * @return
     */
    @GetMapping("/{roleId}")
    RespVO<SysRole> queryByPrimaryKey(@PathVariable(value = "roleId") Long roleId);


    /**
     * 通过主键批量查询
     *
     * @param list
     * @return
     */
    @PostMapping("/queryBatchPrimaryKeys")
    RespVO<RespDataVO<SysRole>> queryBatchPrimaryKeys(@RequestBody List<Long> list);


    /**
     * 条件查询一个
     *
     * @param sysRole
     * @return
     */
    @PostMapping("/queryOne")
    RespVO<SysRole> queryOne(@RequestBody SysRole sysRole);

    /**
     * 条件查询
     *
     * @param sysRole
     * @return
     */
    @PostMapping("/queryByCondition")
    RespVO<RespDataVO<SysRole>> queryByCondition(@RequestBody SysRole sysRole);

    /**
     * 条件分页查询
     *
     * @param sysRole
     * @return
     */
    @PostMapping("/queryPageByCondition")
    RespVO<PageInfo<SysRole>> queryPageByCondition(@RequestBody SysRole sysRole);

    /**
     * 模糊查询
     *
     * @param sysRole
     * @return
     */
    @PostMapping("/queryFuzzy")
    RespVO<RespDataVO<SysRole>> queryFuzzy(@RequestBody SysRole sysRole);

    /**
     * 模糊分页查询
     *
     * @param sysRole
     * @return
     */
    @PostMapping("/queryPageFuzzy")
    RespVO<PageInfo<SysRole>> queryPageFuzzy(@RequestBody SysRole sysRole);

    /**
     * 模糊条件查询
     *
     * @param sysRole
     * @return
     */
    @PostMapping("/queryByLikeCondition")
    RespVO<RespDataVO<SysRole>> queryByLikeCondition(@RequestBody SysRole sysRole);

    /**
     * 模糊分页条件查询
     *
     * @param sysRole
     * @return
     */
    @PostMapping("/queryPageByLikeCondition")
    RespVO<PageInfo<SysRole>> queryPageByLikeCondition(@RequestBody SysRole sysRole);

    /**
     * 条件查询数量
     *
     * @param sysRole
     * @return
     */
    @PostMapping("/queryCount")
    RespVO<Long> queryCount(@RequestBody SysRole sysRole);

    /**
     * 分组统计
     *
     * @param sysRole
     * @return
     */
    @PostMapping("/statisticsGroup")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroup(@RequestBody SysRole sysRole);

    /**
     * 日统计
     *
     * @param sysRole
     * @return
     */
    @PostMapping("/statisticsGroupByDay")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByDay(@RequestBody SysRole sysRole);

    /**
     * 月统计
     *
     * @param sysRole
     * @return
     */
    @PostMapping("/statisticsGroupByMonth")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByMonth(@RequestBody SysRole sysRole);

    /**
     * 年统计
     *
     * @param sysRole
     * @return
     */
    @PostMapping("/statisticsGroupByYear")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByYear(@RequestBody SysRole sysRole);

}

class SysRoleClientFallback implements SysRoleClient {
    @Override
    public RespVO insert(SysRole sysRole) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO insertSelective(SysRole sysRole) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchInsert(List<SysRole> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchInsertSelective(List<SysRole> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO updateByPrimaryKey(SysRole sysRole) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO updateSelectiveByPrimaryKey(SysRole sysRole) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpdate(List<SysRole> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpdateSelective(List<SysRole> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO upsert(SysRole sysRole) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO upsertSelective(SysRole sysRole) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpsert(List<SysRole> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpsertSelective(List<SysRole> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO deleteByPrimaryKey(Long roleId) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO deleteBatchByPrimaryKeys(List<Long> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO delete(SysRole sysRole) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<SysRole> queryByPrimaryKey(Long roleId) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<SysRole>> queryBatchPrimaryKeys(List<Long> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<SysRole> queryOne(SysRole sysRole) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<SysRole>> queryByCondition(SysRole sysRole) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<PageInfo<SysRole>> queryPageByCondition(SysRole sysRole) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<SysRole>> queryFuzzy(SysRole sysRole) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<PageInfo<SysRole>> queryPageFuzzy(SysRole sysRole) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<SysRole>> queryByLikeCondition(SysRole sysRole) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<PageInfo<SysRole>> queryPageByLikeCondition(SysRole sysRole) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<Long> queryCount(SysRole sysRole) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroup(SysRole sysRole) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByDay(SysRole sysRole) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByMonth(SysRole sysRole) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByYear(SysRole sysRole) {
        return RespVOBuilder.failure("system-service服务不可用");
    }
}