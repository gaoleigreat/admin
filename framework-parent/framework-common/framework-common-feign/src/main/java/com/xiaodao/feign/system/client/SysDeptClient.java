package com.xiaodao.feign.system.client;

import com.github.pagehelper.PageInfo;
import com.xiaodao.config.MultipartSupportConfig;
import com.xiaodao.core.result.RespDataVO;
import com.xiaodao.core.result.RespVO;
import com.xiaodao.core.result.RespVOBuilder;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import com.xiaodao.feign.system.entity.SysDept;

import java.util.List;
import java.util.Map;

@FeignClient(value = "system-service", path = "/sysDept", fallbackFactory = SysDeptClientFallback.class, configuration = MultipartSupportConfig.class)
public interface SysDeptClient {


    /**
     * 新增
     *
     * @param sysDept
     * @return
     */
    @PostMapping("/insert")
    RespVO insert(@RequestBody SysDept sysDept);

    /**
     * 带有空值判断的新增
     *
     * @param sysDept
     * @return
     */
    @PostMapping("/insertSelective")
    RespVO insertSelective(@RequestBody SysDept sysDept);

    /**
     * 批量新增
     *
     * @param list
     * @return
     */
    @PostMapping("/batchInsert")
    RespVO batchInsert(@RequestBody List<SysDept> list);

    /**
     * 带有空值判断的新增
     *
     * @param list
     * @return
     */
    @PostMapping("/batchInsertSelective")
    RespVO batchInsertSelective(@RequestBody List<SysDept> list);

    /**
     * 根据主键更新
     *
     * @param sysDept
     * @return
     */
    @PutMapping("/updateByPrimaryKey")
    RespVO updateByPrimaryKey(@RequestBody SysDept sysDept);

    /**
     * 根据空值判断的主键更新
     *
     * @param sysDept
     * @return
     */
    @PutMapping("/updateSelectiveByPrimaryKey")
    RespVO updateSelectiveByPrimaryKey(@RequestBody SysDept sysDept);

    /**
     * 批量更新
     *
     * @param list
     * @return
     */
    @PutMapping("/batchUpdate")
    RespVO batchUpdate(@RequestBody List<SysDept> list);

    /**
     * 带有空值判断的批量更新
     *
     * @param list
     * @return
     */
    @PutMapping("/batchUpdateSelective")
    RespVO batchUpdateSelective(@RequestBody List<SysDept> list);


    /**
     * 更新插入
     *
     * @param sysDept
     * @return
     */
    @PostMapping("/upsert")
    RespVO upsert(@RequestBody SysDept sysDept);

    /**
     * 带有空值判断的更新插入
     *
     * @param sysDept
     * @return
     */
    @PostMapping("/upsertSelective")
    RespVO upsertSelective(@RequestBody SysDept sysDept);


    /**
     * 批量更新插入
     *
     * @param list
     * @return
     */
    @PostMapping("/batchUpsert")
    RespVO batchUpsert(@RequestBody List<SysDept> list);


    /**
     * 带有空值判断的批量更新插入
     *
     * @param list
     * @return
     */
    @PostMapping("/batchUpsertSelective")
    RespVO batchUpsertSelective(@RequestBody List<SysDept> list);


    /**
     * 通过主键删除
     *
     * @param deptId
     * @return
     */
    @DeleteMapping("/{deptId}")
    RespVO deleteByPrimaryKey(@PathVariable(value = "deptId") Long deptId);

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
     * @param sysDept
     * @return
     */
    @DeleteMapping("/delete")
    RespVO delete(@RequestBody SysDept sysDept);

    /**
     * 通过主键查询
     *
     * @param deptId
     * @return
     */
    @GetMapping("/{deptId}")
    RespVO<SysDept> queryByPrimaryKey(@PathVariable(value = "deptId") Long deptId);


    /**
     * 通过主键批量查询
     *
     * @param list
     * @return
     */
    @PostMapping("/queryBatchPrimaryKeys")
    RespVO<RespDataVO<SysDept>> queryBatchPrimaryKeys(@RequestBody List<Long> list);


    /**
     * 条件查询一个
     *
     * @param sysDept
     * @return
     */
    @PostMapping("/queryOne")
    RespVO<SysDept> queryOne(@RequestBody SysDept sysDept);

    /**
     * 条件查询
     *
     * @param sysDept
     * @return
     */
    @PostMapping("/queryByCondition")
    RespVO<RespDataVO<SysDept>> queryByCondition(@RequestBody SysDept sysDept);

    /**
     * 条件分页查询
     *
     * @param sysDept
     * @return
     */
    @PostMapping("/queryPageByCondition")
    RespVO<PageInfo<SysDept>> queryPageByCondition(@RequestBody SysDept sysDept);

    /**
     * 模糊查询
     *
     * @param sysDept
     * @return
     */
    @PostMapping("/queryFuzzy")
    RespVO<RespDataVO<SysDept>> queryFuzzy(@RequestBody SysDept sysDept);

    /**
     * 模糊分页查询
     *
     * @param sysDept
     * @return
     */
    @PostMapping("/queryPageFuzzy")
    RespVO<PageInfo<SysDept>> queryPageFuzzy(@RequestBody SysDept sysDept);

    /**
     * 模糊条件查询
     *
     * @param sysDept
     * @return
     */
    @PostMapping("/queryByLikeCondition")
    RespVO<RespDataVO<SysDept>> queryByLikeCondition(@RequestBody SysDept sysDept);

    /**
     * 模糊分页条件查询
     *
     * @param sysDept
     * @return
     */
    @PostMapping("/queryPageByLikeCondition")
    RespVO<PageInfo<SysDept>> queryPageByLikeCondition(@RequestBody SysDept sysDept);

    /**
     * 条件查询数量
     *
     * @param sysDept
     * @return
     */
    @PostMapping("/queryCount")
    RespVO<Long> queryCount(@RequestBody SysDept sysDept);

    /**
     * 分组统计
     *
     * @param sysDept
     * @return
     */
    @PostMapping("/statisticsGroup")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroup(@RequestBody SysDept sysDept);

    /**
     * 日统计
     *
     * @param sysDept
     * @return
     */
    @PostMapping("/statisticsGroupByDay")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByDay(@RequestBody SysDept sysDept);

    /**
     * 月统计
     *
     * @param sysDept
     * @return
     */
    @PostMapping("/statisticsGroupByMonth")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByMonth(@RequestBody SysDept sysDept);

    /**
     * 年统计
     *
     * @param sysDept
     * @return
     */
    @PostMapping("/statisticsGroupByYear")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByYear(@RequestBody SysDept sysDept);

}

class SysDeptClientFallback implements SysDeptClient {
    @Override
    public RespVO insert(SysDept sysDept) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO insertSelective(SysDept sysDept) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchInsert(List<SysDept> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchInsertSelective(List<SysDept> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO updateByPrimaryKey(SysDept sysDept) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO updateSelectiveByPrimaryKey(SysDept sysDept) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpdate(List<SysDept> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpdateSelective(List<SysDept> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO upsert(SysDept sysDept) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO upsertSelective(SysDept sysDept) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpsert(List<SysDept> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpsertSelective(List<SysDept> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO deleteByPrimaryKey(Long deptId) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO deleteBatchByPrimaryKeys(List<Long> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO delete(SysDept sysDept) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<SysDept> queryByPrimaryKey(Long deptId) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<SysDept>> queryBatchPrimaryKeys(List<Long> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<SysDept> queryOne(SysDept sysDept) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<SysDept>> queryByCondition(SysDept sysDept) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<PageInfo<SysDept>> queryPageByCondition(SysDept sysDept) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<SysDept>> queryFuzzy(SysDept sysDept) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<PageInfo<SysDept>> queryPageFuzzy(SysDept sysDept) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<SysDept>> queryByLikeCondition(SysDept sysDept) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<PageInfo<SysDept>> queryPageByLikeCondition(SysDept sysDept) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<Long> queryCount(SysDept sysDept) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroup(SysDept sysDept) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByDay(SysDept sysDept) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByMonth(SysDept sysDept) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByYear(SysDept sysDept) {
        return RespVOBuilder.failure("system-service服务不可用");
    }
}