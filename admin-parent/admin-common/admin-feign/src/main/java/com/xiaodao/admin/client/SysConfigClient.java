package com.xiaodao.admin.client;

import com.github.pagehelper.PageInfo;
import com.xiaodao.feign.config.MultipartSupportConfig;
import com.xiaodao.core.result.RespDataVO;
import com.xiaodao.core.result.RespVO;
import com.xiaodao.core.result.RespVOBuilder;
import com.xiaodao.admin.entity.SysConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@FeignClient(value = "system-service", path = "/sysConfig", fallbackFactory = SysConfigClientFallback.class, configuration = MultipartSupportConfig.class)
public interface SysConfigClient {


    /**
     * 新增
     *
     * @param sysConfig
     * @return
     */
    @PostMapping("/insert")
    RespVO insert(@RequestBody SysConfig sysConfig);

    /**
     * 带有空值判断的新增
     *
     * @param sysConfig
     * @return
     */
    @PostMapping("/insertSelective")
    RespVO insertSelective(@RequestBody SysConfig sysConfig);

    /**
     * 批量新增
     *
     * @param list
     * @return
     */
    @PostMapping("/batchInsert")
    RespVO batchInsert(@RequestBody List<SysConfig> list);

    /**
     * 带有空值判断的新增
     *
     * @param list
     * @return
     */
    @PostMapping("/batchInsertSelective")
    RespVO batchInsertSelective(@RequestBody List<SysConfig> list);

    /**
     * 根据主键更新
     *
     * @param sysConfig
     * @return
     */
    @PutMapping("/updateByPrimaryKey")
    RespVO updateByPrimaryKey(@RequestBody SysConfig sysConfig);

    /**
     * 根据空值判断的主键更新
     *
     * @param sysConfig
     * @return
     */
    @PutMapping("/updateSelectiveByPrimaryKey")
    RespVO updateSelectiveByPrimaryKey(@RequestBody SysConfig sysConfig);

    /**
     * 批量更新
     *
     * @param list
     * @return
     */
    @PutMapping("/batchUpdate")
    RespVO batchUpdate(@RequestBody List<SysConfig> list);

    /**
     * 带有空值判断的批量更新
     *
     * @param list
     * @return
     */
    @PutMapping("/batchUpdateSelective")
    RespVO batchUpdateSelective(@RequestBody List<SysConfig> list);


    /**
     * 更新插入
     *
     * @param sysConfig
     * @return
     */
    @PostMapping("/upsert")
    RespVO upsert(@RequestBody SysConfig sysConfig);

    /**
     * 带有空值判断的更新插入
     *
     * @param sysConfig
     * @return
     */
    @PostMapping("/upsertSelective")
    RespVO upsertSelective(@RequestBody SysConfig sysConfig);


    /**
     * 批量更新插入
     *
     * @param list
     * @return
     */
    @PostMapping("/batchUpsert")
    RespVO batchUpsert(@RequestBody List<SysConfig> list);


    /**
     * 带有空值判断的批量更新插入
     *
     * @param list
     * @return
     */
    @PostMapping("/batchUpsertSelective")
    RespVO batchUpsertSelective(@RequestBody List<SysConfig> list);


    /**
     * 通过主键删除
     *
     * @param configId
     * @return
     */
    @DeleteMapping("/{configId}")
    RespVO deleteByPrimaryKey(@PathVariable(value = "configId") Long configId);

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
     * @param sysConfig
     * @return
     */
    @DeleteMapping("/delete")
    RespVO delete(@RequestBody SysConfig sysConfig);

    /**
     * 通过主键查询
     *
     * @param configId
     * @return
     */
    @GetMapping("/{configId}")
    RespVO<SysConfig> queryByPrimaryKey(@PathVariable(value = "configId") Long configId);


    /**
     * 通过主键批量查询
     *
     * @param list
     * @return
     */
    @PostMapping("/queryBatchPrimaryKeys")
    RespVO<RespDataVO<SysConfig>> queryBatchPrimaryKeys(@RequestBody List<Long> list);


    /**
     * 条件查询一个
     *
     * @param sysConfig
     * @return
     */
    @PostMapping("/queryOne")
    RespVO<SysConfig> queryOne(@RequestBody SysConfig sysConfig);

    /**
     * 条件查询
     *
     * @param sysConfig
     * @return
     */
    @PostMapping("/queryByCondition")
    RespVO<RespDataVO<SysConfig>> queryByCondition(@RequestBody SysConfig sysConfig);

    /**
     * 条件分页查询
     *
     * @param sysConfig
     * @return
     */
    @PostMapping("/queryPageByCondition")
    RespVO<PageInfo<SysConfig>> queryPageByCondition(@RequestBody SysConfig sysConfig);

    /**
     * 模糊查询
     *
     * @param sysConfig
     * @return
     */
    @PostMapping("/queryFuzzy")
    RespVO<RespDataVO<SysConfig>> queryFuzzy(@RequestBody SysConfig sysConfig);

    /**
     * 模糊分页查询
     *
     * @param sysConfig
     * @return
     */
    @PostMapping("/queryPageFuzzy")
    RespVO<PageInfo<SysConfig>> queryPageFuzzy(@RequestBody SysConfig sysConfig);

    /**
     * 模糊条件查询
     *
     * @param sysConfig
     * @return
     */
    @PostMapping("/queryByLikeCondition")
    RespVO<RespDataVO<SysConfig>> queryByLikeCondition(@RequestBody SysConfig sysConfig);

    /**
     * 模糊分页条件查询
     *
     * @param sysConfig
     * @return
     */
    @PostMapping("/queryPageByLikeCondition")
    RespVO<PageInfo<SysConfig>> queryPageByLikeCondition(@RequestBody SysConfig sysConfig);

    /**
     * 条件查询数量
     *
     * @param sysConfig
     * @return
     */
    @PostMapping("/queryCount")
    RespVO<Long> queryCount(@RequestBody SysConfig sysConfig);

    /**
     * 分组统计
     *
     * @param sysConfig
     * @return
     */
    @PostMapping("/statisticsGroup")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroup(@RequestBody SysConfig sysConfig);

    /**
     * 日统计
     *
     * @param sysConfig
     * @return
     */
    @PostMapping("/statisticsGroupByDay")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByDay(@RequestBody SysConfig sysConfig);

    /**
     * 月统计
     *
     * @param sysConfig
     * @return
     */
    @PostMapping("/statisticsGroupByMonth")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByMonth(@RequestBody SysConfig sysConfig);

    /**
     * 年统计
     *
     * @param sysConfig
     * @return
     */
    @PostMapping("/statisticsGroupByYear")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByYear(@RequestBody SysConfig sysConfig);

}

class SysConfigClientFallback implements SysConfigClient {
    @Override
    public RespVO insert(SysConfig sysConfig) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO insertSelective(SysConfig sysConfig) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchInsert(List<SysConfig> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchInsertSelective(List<SysConfig> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO updateByPrimaryKey(SysConfig sysConfig) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO updateSelectiveByPrimaryKey(SysConfig sysConfig) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpdate(List<SysConfig> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpdateSelective(List<SysConfig> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO upsert(SysConfig sysConfig) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO upsertSelective(SysConfig sysConfig) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpsert(List<SysConfig> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpsertSelective(List<SysConfig> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO deleteByPrimaryKey(Long configId) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO deleteBatchByPrimaryKeys(List<Long> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO delete(SysConfig sysConfig) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<SysConfig> queryByPrimaryKey(Long configId) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<SysConfig>> queryBatchPrimaryKeys(List<Long> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<SysConfig> queryOne(SysConfig sysConfig) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<SysConfig>> queryByCondition(SysConfig sysConfig) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<PageInfo<SysConfig>> queryPageByCondition(SysConfig sysConfig) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<SysConfig>> queryFuzzy(SysConfig sysConfig) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<PageInfo<SysConfig>> queryPageFuzzy(SysConfig sysConfig) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<SysConfig>> queryByLikeCondition(SysConfig sysConfig) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<PageInfo<SysConfig>> queryPageByLikeCondition(SysConfig sysConfig) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<Long> queryCount(SysConfig sysConfig) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroup(SysConfig sysConfig) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByDay(SysConfig sysConfig) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByMonth(SysConfig sysConfig) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByYear(SysConfig sysConfig) {
        return RespVOBuilder.failure("system-service服务不可用");
    }
}