package com.xiaodao.feign.system.client;

import com.github.pagehelper.PageInfo;
import com.xiaodao.config.MultipartSupportConfig;
import com.xiaodao.core.result.RespDataVO;
import com.xiaodao.core.result.RespVO;
import com.xiaodao.core.result.RespVOBuilder;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import com.xiaodao.feign.system.entity.SysDictData;

import java.util.List;
import java.util.Map;

@FeignClient(value = "system-service", path = "/sysDictData", fallbackFactory = SysDictDataClientFallback.class, configuration = MultipartSupportConfig.class)
public interface SysDictDataClient {


    /**
     * 新增
     *
     * @param sysDictData
     * @return
     */
    @PostMapping("/insert")
    RespVO insert(@RequestBody SysDictData sysDictData);

    /**
     * 带有空值判断的新增
     *
     * @param sysDictData
     * @return
     */
    @PostMapping("/insertSelective")
    RespVO insertSelective(@RequestBody SysDictData sysDictData);

    /**
     * 批量新增
     *
     * @param list
     * @return
     */
    @PostMapping("/batchInsert")
    RespVO batchInsert(@RequestBody List<SysDictData> list);

    /**
     * 带有空值判断的新增
     *
     * @param list
     * @return
     */
    @PostMapping("/batchInsertSelective")
    RespVO batchInsertSelective(@RequestBody List<SysDictData> list);

    /**
     * 根据主键更新
     *
     * @param sysDictData
     * @return
     */
    @PutMapping("/updateByPrimaryKey")
    RespVO updateByPrimaryKey(@RequestBody SysDictData sysDictData);

    /**
     * 根据空值判断的主键更新
     *
     * @param sysDictData
     * @return
     */
    @PutMapping("/updateSelectiveByPrimaryKey")
    RespVO updateSelectiveByPrimaryKey(@RequestBody SysDictData sysDictData);

    /**
     * 批量更新
     *
     * @param list
     * @return
     */
    @PutMapping("/batchUpdate")
    RespVO batchUpdate(@RequestBody List<SysDictData> list);

    /**
     * 带有空值判断的批量更新
     *
     * @param list
     * @return
     */
    @PutMapping("/batchUpdateSelective")
    RespVO batchUpdateSelective(@RequestBody List<SysDictData> list);


    /**
     * 更新插入
     *
     * @param sysDictData
     * @return
     */
    @PostMapping("/upsert")
    RespVO upsert(@RequestBody SysDictData sysDictData);

    /**
     * 带有空值判断的更新插入
     *
     * @param sysDictData
     * @return
     */
    @PostMapping("/upsertSelective")
    RespVO upsertSelective(@RequestBody SysDictData sysDictData);


    /**
     * 批量更新插入
     *
     * @param list
     * @return
     */
    @PostMapping("/batchUpsert")
    RespVO batchUpsert(@RequestBody List<SysDictData> list);


    /**
     * 带有空值判断的批量更新插入
     *
     * @param list
     * @return
     */
    @PostMapping("/batchUpsertSelective")
    RespVO batchUpsertSelective(@RequestBody List<SysDictData> list);


    /**
     * 通过主键删除
     *
     * @param dictCode
     * @return
     */
    @DeleteMapping("/{dictCode}")
    RespVO deleteByPrimaryKey(@PathVariable(value = "dictCode") Integer dictCode);

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
     * @param sysDictData
     * @return
     */
    @DeleteMapping("/delete")
    RespVO delete(@RequestBody SysDictData sysDictData);

    /**
     * 通过主键查询
     *
     * @param dictCode
     * @return
     */
    @GetMapping("/{dictCode}")
    RespVO<SysDictData> queryByPrimaryKey(@PathVariable(value = "dictCode") Integer dictCode);


    /**
     * 通过主键批量查询
     *
     * @param list
     * @return
     */
    @PostMapping("/queryBatchPrimaryKeys")
    RespVO<RespDataVO<SysDictData>> queryBatchPrimaryKeys(@RequestBody List<Long> list);


    /**
     * 条件查询一个
     *
     * @param sysDictData
     * @return
     */
    @PostMapping("/queryOne")
    RespVO<SysDictData> queryOne(@RequestBody SysDictData sysDictData);

    /**
     * 条件查询
     *
     * @param sysDictData
     * @return
     */
    @PostMapping("/queryByCondition")
    RespVO<RespDataVO<SysDictData>> queryByCondition(@RequestBody SysDictData sysDictData);

    /**
     * 条件分页查询
     *
     * @param sysDictData
     * @return
     */
    @PostMapping("/queryPageByCondition")
    RespVO<PageInfo<SysDictData>> queryPageByCondition(@RequestBody SysDictData sysDictData);

    /**
     * 模糊查询
     *
     * @param sysDictData
     * @return
     */
    @PostMapping("/queryFuzzy")
    RespVO<RespDataVO<SysDictData>> queryFuzzy(@RequestBody SysDictData sysDictData);

    /**
     * 模糊分页查询
     *
     * @param sysDictData
     * @return
     */
    @PostMapping("/queryPageFuzzy")
    RespVO<PageInfo<SysDictData>> queryPageFuzzy(@RequestBody SysDictData sysDictData);

    /**
     * 模糊条件查询
     *
     * @param sysDictData
     * @return
     */
    @PostMapping("/queryByLikeCondition")
    RespVO<RespDataVO<SysDictData>> queryByLikeCondition(@RequestBody SysDictData sysDictData);

    /**
     * 模糊分页条件查询
     *
     * @param sysDictData
     * @return
     */
    @PostMapping("/queryPageByLikeCondition")
    RespVO<PageInfo<SysDictData>> queryPageByLikeCondition(@RequestBody SysDictData sysDictData);

    /**
     * 条件查询数量
     *
     * @param sysDictData
     * @return
     */
    @PostMapping("/queryCount")
    RespVO<Long> queryCount(@RequestBody SysDictData sysDictData);

    /**
     * 分组统计
     *
     * @param sysDictData
     * @return
     */
    @PostMapping("/statisticsGroup")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroup(@RequestBody SysDictData sysDictData);

    /**
     * 日统计
     *
     * @param sysDictData
     * @return
     */
    @PostMapping("/statisticsGroupByDay")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByDay(@RequestBody SysDictData sysDictData);

    /**
     * 月统计
     *
     * @param sysDictData
     * @return
     */
    @PostMapping("/statisticsGroupByMonth")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByMonth(@RequestBody SysDictData sysDictData);

    /**
     * 年统计
     *
     * @param sysDictData
     * @return
     */
    @PostMapping("/statisticsGroupByYear")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByYear(@RequestBody SysDictData sysDictData);

}

class SysDictDataClientFallback implements SysDictDataClient {
    @Override
    public RespVO insert(SysDictData sysDictData) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO insertSelective(SysDictData sysDictData) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchInsert(List<SysDictData> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchInsertSelective(List<SysDictData> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO updateByPrimaryKey(SysDictData sysDictData) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO updateSelectiveByPrimaryKey(SysDictData sysDictData) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpdate(List<SysDictData> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpdateSelective(List<SysDictData> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO upsert(SysDictData sysDictData) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO upsertSelective(SysDictData sysDictData) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpsert(List<SysDictData> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpsertSelective(List<SysDictData> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO deleteByPrimaryKey(Integer dictCode) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO deleteBatchByPrimaryKeys(List<Long> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO delete(SysDictData sysDictData) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<SysDictData> queryByPrimaryKey(Integer dictCode) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<SysDictData>> queryBatchPrimaryKeys(List<Long> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<SysDictData> queryOne(SysDictData sysDictData) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<SysDictData>> queryByCondition(SysDictData sysDictData) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<PageInfo<SysDictData>> queryPageByCondition(SysDictData sysDictData) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<SysDictData>> queryFuzzy(SysDictData sysDictData) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<PageInfo<SysDictData>> queryPageFuzzy(SysDictData sysDictData) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<SysDictData>> queryByLikeCondition(SysDictData sysDictData) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<PageInfo<SysDictData>> queryPageByLikeCondition(SysDictData sysDictData) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<Long> queryCount(SysDictData sysDictData) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroup(SysDictData sysDictData) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByDay(SysDictData sysDictData) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByMonth(SysDictData sysDictData) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByYear(SysDictData sysDictData) {
        return RespVOBuilder.failure("system-service服务不可用");
    }
}