package com.xiaodao.admin.client;

import com.github.pagehelper.PageInfo;
import com.xiaodao.feign.config.MultipartSupportConfig;
import com.xiaodao.core.result.RespDataVO;
import com.xiaodao.core.result.RespVO;
import com.xiaodao.core.result.RespVOBuilder;
import com.xiaodao.admin.entity.SysOperLog;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@FeignClient(value = "system-service", path = "/sysOperLog", fallbackFactory = SysOperLogClientFallback.class, configuration = MultipartSupportConfig.class)
public interface SysOperLogClient {


    /**
     * 新增
     *
     * @param sysOperLog
     * @return
     */
    @PostMapping("/insert")
    RespVO insert(@RequestBody SysOperLog sysOperLog);

    /**
     * 带有空值判断的新增
     *
     * @param sysOperLog
     * @return
     */
    @PostMapping("/insertSelective")
    RespVO insertSelective(@RequestBody SysOperLog sysOperLog);

    /**
     * 批量新增
     *
     * @param list
     * @return
     */
    @PostMapping("/batchInsert")
    RespVO batchInsert(@RequestBody List<SysOperLog> list);

    /**
     * 带有空值判断的新增
     *
     * @param list
     * @return
     */
    @PostMapping("/batchInsertSelective")
    RespVO batchInsertSelective(@RequestBody List<SysOperLog> list);

    /**
     * 根据主键更新
     *
     * @param sysOperLog
     * @return
     */
    @PutMapping("/updateByPrimaryKey")
    RespVO updateByPrimaryKey(@RequestBody SysOperLog sysOperLog);

    /**
     * 根据空值判断的主键更新
     *
     * @param sysOperLog
     * @return
     */
    @PutMapping("/updateSelectiveByPrimaryKey")
    RespVO updateSelectiveByPrimaryKey(@RequestBody SysOperLog sysOperLog);

    /**
     * 批量更新
     *
     * @param list
     * @return
     */
    @PutMapping("/batchUpdate")
    RespVO batchUpdate(@RequestBody List<SysOperLog> list);

    /**
     * 带有空值判断的批量更新
     *
     * @param list
     * @return
     */
    @PutMapping("/batchUpdateSelective")
    RespVO batchUpdateSelective(@RequestBody List<SysOperLog> list);


    /**
     * 更新插入
     *
     * @param sysOperLog
     * @return
     */
    @PostMapping("/upsert")
    RespVO upsert(@RequestBody SysOperLog sysOperLog);

    /**
     * 带有空值判断的更新插入
     *
     * @param sysOperLog
     * @return
     */
    @PostMapping("/upsertSelective")
    RespVO upsertSelective(@RequestBody SysOperLog sysOperLog);


    /**
     * 批量更新插入
     *
     * @param list
     * @return
     */
    @PostMapping("/batchUpsert")
    RespVO batchUpsert(@RequestBody List<SysOperLog> list);


    /**
     * 带有空值判断的批量更新插入
     *
     * @param list
     * @return
     */
    @PostMapping("/batchUpsertSelective")
    RespVO batchUpsertSelective(@RequestBody List<SysOperLog> list);


    /**
     * 通过主键删除
     *
     * @param operId
     * @return
     */
    @DeleteMapping("/{operId}")
    RespVO deleteByPrimaryKey(@PathVariable(value = "operId") Long operId);

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
     * @param sysOperLog
     * @return
     */
    @DeleteMapping("/delete")
    RespVO delete(@RequestBody SysOperLog sysOperLog);

    /**
     * 通过主键查询
     *
     * @param operId
     * @return
     */
    @GetMapping("/{operId}")
    RespVO<SysOperLog> queryByPrimaryKey(@PathVariable(value = "operId") Long operId);


    /**
     * 通过主键批量查询
     *
     * @param list
     * @return
     */
    @PostMapping("/queryBatchPrimaryKeys")
    RespVO<RespDataVO<SysOperLog>> queryBatchPrimaryKeys(@RequestBody List<Long> list);


    /**
     * 条件查询一个
     *
     * @param sysOperLog
     * @return
     */
    @PostMapping("/queryOne")
    RespVO<SysOperLog> queryOne(@RequestBody SysOperLog sysOperLog);

    /**
     * 条件查询
     *
     * @param sysOperLog
     * @return
     */
    @PostMapping("/queryByCondition")
    RespVO<RespDataVO<SysOperLog>> queryByCondition(@RequestBody SysOperLog sysOperLog);

    /**
     * 条件分页查询
     *
     * @param sysOperLog
     * @return
     */
    @PostMapping("/queryPageByCondition")
    RespVO<PageInfo<SysOperLog>> queryPageByCondition(@RequestBody SysOperLog sysOperLog);

    /**
     * 模糊查询
     *
     * @param sysOperLog
     * @return
     */
    @PostMapping("/queryFuzzy")
    RespVO<RespDataVO<SysOperLog>> queryFuzzy(@RequestBody SysOperLog sysOperLog);

    /**
     * 模糊分页查询
     *
     * @param sysOperLog
     * @return
     */
    @PostMapping("/queryPageFuzzy")
    RespVO<PageInfo<SysOperLog>> queryPageFuzzy(@RequestBody SysOperLog sysOperLog);

    /**
     * 模糊条件查询
     *
     * @param sysOperLog
     * @return
     */
    @PostMapping("/queryByLikeCondition")
    RespVO<RespDataVO<SysOperLog>> queryByLikeCondition(@RequestBody SysOperLog sysOperLog);

    /**
     * 模糊分页条件查询
     *
     * @param sysOperLog
     * @return
     */
    @PostMapping("/queryPageByLikeCondition")
    RespVO<PageInfo<SysOperLog>> queryPageByLikeCondition(@RequestBody SysOperLog sysOperLog);

    /**
     * 条件查询数量
     *
     * @param sysOperLog
     * @return
     */
    @PostMapping("/queryCount")
    RespVO<Long> queryCount(@RequestBody SysOperLog sysOperLog);

    /**
     * 分组统计
     *
     * @param sysOperLog
     * @return
     */
    @PostMapping("/statisticsGroup")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroup(@RequestBody SysOperLog sysOperLog);

    /**
     * 日统计
     *
     * @param sysOperLog
     * @return
     */
    @PostMapping("/statisticsGroupByDay")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByDay(@RequestBody SysOperLog sysOperLog);

    /**
     * 月统计
     *
     * @param sysOperLog
     * @return
     */
    @PostMapping("/statisticsGroupByMonth")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByMonth(@RequestBody SysOperLog sysOperLog);

    /**
     * 年统计
     *
     * @param sysOperLog
     * @return
     */
    @PostMapping("/statisticsGroupByYear")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByYear(@RequestBody SysOperLog sysOperLog);

}

class SysOperLogClientFallback implements SysOperLogClient {
    @Override
    public RespVO insert(SysOperLog sysOperLog) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO insertSelective(SysOperLog sysOperLog) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchInsert(List<SysOperLog> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchInsertSelective(List<SysOperLog> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO updateByPrimaryKey(SysOperLog sysOperLog) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO updateSelectiveByPrimaryKey(SysOperLog sysOperLog) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpdate(List<SysOperLog> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpdateSelective(List<SysOperLog> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO upsert(SysOperLog sysOperLog) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO upsertSelective(SysOperLog sysOperLog) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpsert(List<SysOperLog> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpsertSelective(List<SysOperLog> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO deleteByPrimaryKey(Long operId) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO deleteBatchByPrimaryKeys(List<Long> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO delete(SysOperLog sysOperLog) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<SysOperLog> queryByPrimaryKey(Long operId) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<SysOperLog>> queryBatchPrimaryKeys(List<Long> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<SysOperLog> queryOne(SysOperLog sysOperLog) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<SysOperLog>> queryByCondition(SysOperLog sysOperLog) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<PageInfo<SysOperLog>> queryPageByCondition(SysOperLog sysOperLog) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<SysOperLog>> queryFuzzy(SysOperLog sysOperLog) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<PageInfo<SysOperLog>> queryPageFuzzy(SysOperLog sysOperLog) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<SysOperLog>> queryByLikeCondition(SysOperLog sysOperLog) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<PageInfo<SysOperLog>> queryPageByLikeCondition(SysOperLog sysOperLog) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<Long> queryCount(SysOperLog sysOperLog) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroup(SysOperLog sysOperLog) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByDay(SysOperLog sysOperLog) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByMonth(SysOperLog sysOperLog) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByYear(SysOperLog sysOperLog) {
        return RespVOBuilder.failure("system-service服务不可用");
    }
}