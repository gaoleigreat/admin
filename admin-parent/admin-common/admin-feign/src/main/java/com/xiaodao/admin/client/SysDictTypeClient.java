package com.xiaodao.admin.client;

import com.github.pagehelper.PageInfo;
import com.xiaodao.feign.config.MultipartSupportConfig;
import com.xiaodao.core.result.RespDataVO;
import com.xiaodao.core.result.RespVO;
import com.xiaodao.core.result.RespVOBuilder;
import com.xiaodao.admin.entity.SysDictType;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@FeignClient(value = "system-service", path = "/sysDictType", fallbackFactory = SysDictTypeClientFallback.class, configuration = MultipartSupportConfig.class)
public interface SysDictTypeClient {


    /**
     * 新增
     *
     * @param sysDictType
     * @return
     */
    @PostMapping("/insert")
    RespVO insert(@RequestBody SysDictType sysDictType);

    /**
     * 带有空值判断的新增
     *
     * @param sysDictType
     * @return
     */
    @PostMapping("/insertSelective")
    RespVO insertSelective(@RequestBody SysDictType sysDictType);

    /**
     * 批量新增
     *
     * @param list
     * @return
     */
    @PostMapping("/batchInsert")
    RespVO batchInsert(@RequestBody List<SysDictType> list);

    /**
     * 带有空值判断的新增
     *
     * @param list
     * @return
     */
    @PostMapping("/batchInsertSelective")
    RespVO batchInsertSelective(@RequestBody List<SysDictType> list);

    /**
     * 根据主键更新
     *
     * @param sysDictType
     * @return
     */
    @PutMapping("/updateByPrimaryKey")
    RespVO updateByPrimaryKey(@RequestBody SysDictType sysDictType);

    /**
     * 根据空值判断的主键更新
     *
     * @param sysDictType
     * @return
     */
    @PutMapping("/updateSelectiveByPrimaryKey")
    RespVO updateSelectiveByPrimaryKey(@RequestBody SysDictType sysDictType);

    /**
     * 批量更新
     *
     * @param list
     * @return
     */
    @PutMapping("/batchUpdate")
    RespVO batchUpdate(@RequestBody List<SysDictType> list);

    /**
     * 带有空值判断的批量更新
     *
     * @param list
     * @return
     */
    @PutMapping("/batchUpdateSelective")
    RespVO batchUpdateSelective(@RequestBody List<SysDictType> list);


    /**
     * 更新插入
     *
     * @param sysDictType
     * @return
     */
    @PostMapping("/upsert")
    RespVO upsert(@RequestBody SysDictType sysDictType);

    /**
     * 带有空值判断的更新插入
     *
     * @param sysDictType
     * @return
     */
    @PostMapping("/upsertSelective")
    RespVO upsertSelective(@RequestBody SysDictType sysDictType);


    /**
     * 批量更新插入
     *
     * @param list
     * @return
     */
    @PostMapping("/batchUpsert")
    RespVO batchUpsert(@RequestBody List<SysDictType> list);


    /**
     * 带有空值判断的批量更新插入
     *
     * @param list
     * @return
     */
    @PostMapping("/batchUpsertSelective")
    RespVO batchUpsertSelective(@RequestBody List<SysDictType> list);


    /**
     * 通过主键删除
     *
     * @param dictId
     * @return
     */
    @DeleteMapping("/{dictId}")
    RespVO deleteByPrimaryKey(@PathVariable(value = "dictId") Long dictId);

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
     * @param sysDictType
     * @return
     */
    @DeleteMapping("/delete")
    RespVO delete(@RequestBody SysDictType sysDictType);

    /**
     * 通过主键查询
     *
     * @param dictId
     * @return
     */
    @GetMapping("/{dictId}")
    RespVO<SysDictType> queryByPrimaryKey(@PathVariable(value = "dictId") Long dictId);


    /**
     * 通过主键批量查询
     *
     * @param list
     * @return
     */
    @PostMapping("/queryBatchPrimaryKeys")
    RespVO<RespDataVO<SysDictType>> queryBatchPrimaryKeys(@RequestBody List<Long> list);


    /**
     * 条件查询一个
     *
     * @param sysDictType
     * @return
     */
    @PostMapping("/queryOne")
    RespVO<SysDictType> queryOne(@RequestBody SysDictType sysDictType);

    /**
     * 条件查询
     *
     * @param sysDictType
     * @return
     */
    @PostMapping("/queryByCondition")
    RespVO<RespDataVO<SysDictType>> queryByCondition(@RequestBody SysDictType sysDictType);

    /**
     * 条件分页查询
     *
     * @param sysDictType
     * @return
     */
    @PostMapping("/queryPageByCondition")
    RespVO<PageInfo<SysDictType>> queryPageByCondition(@RequestBody SysDictType sysDictType);

    /**
     * 模糊查询
     *
     * @param sysDictType
     * @return
     */
    @PostMapping("/queryFuzzy")
    RespVO<RespDataVO<SysDictType>> queryFuzzy(@RequestBody SysDictType sysDictType);

    /**
     * 模糊分页查询
     *
     * @param sysDictType
     * @return
     */
    @PostMapping("/queryPageFuzzy")
    RespVO<PageInfo<SysDictType>> queryPageFuzzy(@RequestBody SysDictType sysDictType);

    /**
     * 模糊条件查询
     *
     * @param sysDictType
     * @return
     */
    @PostMapping("/queryByLikeCondition")
    RespVO<RespDataVO<SysDictType>> queryByLikeCondition(@RequestBody SysDictType sysDictType);

    /**
     * 模糊分页条件查询
     *
     * @param sysDictType
     * @return
     */
    @PostMapping("/queryPageByLikeCondition")
    RespVO<PageInfo<SysDictType>> queryPageByLikeCondition(@RequestBody SysDictType sysDictType);

    /**
     * 条件查询数量
     *
     * @param sysDictType
     * @return
     */
    @PostMapping("/queryCount")
    RespVO<Long> queryCount(@RequestBody SysDictType sysDictType);

    /**
     * 分组统计
     *
     * @param sysDictType
     * @return
     */
    @PostMapping("/statisticsGroup")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroup(@RequestBody SysDictType sysDictType);

    /**
     * 日统计
     *
     * @param sysDictType
     * @return
     */
    @PostMapping("/statisticsGroupByDay")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByDay(@RequestBody SysDictType sysDictType);

    /**
     * 月统计
     *
     * @param sysDictType
     * @return
     */
    @PostMapping("/statisticsGroupByMonth")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByMonth(@RequestBody SysDictType sysDictType);

    /**
     * 年统计
     *
     * @param sysDictType
     * @return
     */
    @PostMapping("/statisticsGroupByYear")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByYear(@RequestBody SysDictType sysDictType);

}

class SysDictTypeClientFallback implements SysDictTypeClient {
    @Override
    public RespVO insert(SysDictType sysDictType) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO insertSelective(SysDictType sysDictType) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchInsert(List<SysDictType> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchInsertSelective(List<SysDictType> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO updateByPrimaryKey(SysDictType sysDictType) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO updateSelectiveByPrimaryKey(SysDictType sysDictType) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpdate(List<SysDictType> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpdateSelective(List<SysDictType> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO upsert(SysDictType sysDictType) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO upsertSelective(SysDictType sysDictType) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpsert(List<SysDictType> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpsertSelective(List<SysDictType> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO deleteByPrimaryKey(Long dictId) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO deleteBatchByPrimaryKeys(List<Long> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO delete(SysDictType sysDictType) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<SysDictType> queryByPrimaryKey(Long dictId) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<SysDictType>> queryBatchPrimaryKeys(List<Long> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<SysDictType> queryOne(SysDictType sysDictType) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<SysDictType>> queryByCondition(SysDictType sysDictType) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<PageInfo<SysDictType>> queryPageByCondition(SysDictType sysDictType) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<SysDictType>> queryFuzzy(SysDictType sysDictType) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<PageInfo<SysDictType>> queryPageFuzzy(SysDictType sysDictType) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<SysDictType>> queryByLikeCondition(SysDictType sysDictType) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<PageInfo<SysDictType>> queryPageByLikeCondition(SysDictType sysDictType) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<Long> queryCount(SysDictType sysDictType) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroup(SysDictType sysDictType) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByDay(SysDictType sysDictType) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByMonth(SysDictType sysDictType) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByYear(SysDictType sysDictType) {
        return RespVOBuilder.failure("system-service服务不可用");
    }
}