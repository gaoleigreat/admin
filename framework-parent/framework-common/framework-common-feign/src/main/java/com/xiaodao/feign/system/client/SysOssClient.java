package com.xiaodao.feign.system.client;

import com.github.pagehelper.PageInfo;
import com.xiaodao.config.MultipartSupportConfig;
import com.xiaodao.core.result.RespDataVO;
import com.xiaodao.core.result.RespVO;
import com.xiaodao.core.result.RespVOBuilder;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import com.xiaodao.feign.system.entity.SysOss;

import java.util.List;
import java.util.Map;

@FeignClient(value = "system-service", path = "/sysOss", fallbackFactory = SysOssClientFallback.class, configuration = MultipartSupportConfig.class)
public interface SysOssClient {


    /**
     * 新增
     *
     * @param sysOss
     * @return
     */
    @PostMapping("/insert")
    RespVO insert(@RequestBody SysOss sysOss);

    /**
     * 带有空值判断的新增
     *
     * @param sysOss
     * @return
     */
    @PostMapping("/insertSelective")
    RespVO insertSelective(@RequestBody SysOss sysOss);

    /**
     * 批量新增
     *
     * @param list
     * @return
     */
    @PostMapping("/batchInsert")
    RespVO batchInsert(@RequestBody List<SysOss> list);

    /**
     * 带有空值判断的新增
     *
     * @param list
     * @return
     */
    @PostMapping("/batchInsertSelective")
    RespVO batchInsertSelective(@RequestBody List<SysOss> list);

    /**
     * 根据主键更新
     *
     * @param sysOss
     * @return
     */
    @PutMapping("/updateByPrimaryKey")
    RespVO updateByPrimaryKey(@RequestBody SysOss sysOss);

    /**
     * 根据空值判断的主键更新
     *
     * @param sysOss
     * @return
     */
    @PutMapping("/updateSelectiveByPrimaryKey")
    RespVO updateSelectiveByPrimaryKey(@RequestBody SysOss sysOss);

    /**
     * 批量更新
     *
     * @param list
     * @return
     */
    @PutMapping("/batchUpdate")
    RespVO batchUpdate(@RequestBody List<SysOss> list);

    /**
     * 带有空值判断的批量更新
     *
     * @param list
     * @return
     */
    @PutMapping("/batchUpdateSelective")
    RespVO batchUpdateSelective(@RequestBody List<SysOss> list);


    /**
     * 更新插入
     *
     * @param sysOss
     * @return
     */
    @PostMapping("/upsert")
    RespVO upsert(@RequestBody SysOss sysOss);

    /**
     * 带有空值判断的更新插入
     *
     * @param sysOss
     * @return
     */
    @PostMapping("/upsertSelective")
    RespVO upsertSelective(@RequestBody SysOss sysOss);


    /**
     * 批量更新插入
     *
     * @param list
     * @return
     */
    @PostMapping("/batchUpsert")
    RespVO batchUpsert(@RequestBody List<SysOss> list);


    /**
     * 带有空值判断的批量更新插入
     *
     * @param list
     * @return
     */
    @PostMapping("/batchUpsertSelective")
    RespVO batchUpsertSelective(@RequestBody List<SysOss> list);


    /**
     * 通过主键删除
     *
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    RespVO deleteByPrimaryKey(@PathVariable(value = "id") Long id);

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
     * @param sysOss
     * @return
     */
    @DeleteMapping("/delete")
    RespVO delete(@RequestBody SysOss sysOss);

    /**
     * 通过主键查询
     *
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    RespVO<SysOss> queryByPrimaryKey(@PathVariable(value = "id") Long id);


    /**
     * 通过主键批量查询
     *
     * @param list
     * @return
     */
    @PostMapping("/queryBatchPrimaryKeys")
    RespVO<RespDataVO<SysOss>> queryBatchPrimaryKeys(@RequestBody List<Long> list);


    /**
     * 条件查询一个
     *
     * @param sysOss
     * @return
     */
    @PostMapping("/queryOne")
    RespVO<SysOss> queryOne(@RequestBody SysOss sysOss);

    /**
     * 条件查询
     *
     * @param sysOss
     * @return
     */
    @PostMapping("/queryByCondition")
    RespVO<RespDataVO<SysOss>> queryByCondition(@RequestBody SysOss sysOss);

    /**
     * 条件分页查询
     *
     * @param sysOss
     * @return
     */
    @PostMapping("/queryPageByCondition")
    RespVO<PageInfo<SysOss>> queryPageByCondition(@RequestBody SysOss sysOss);

    /**
     * 模糊查询
     *
     * @param sysOss
     * @return
     */
    @PostMapping("/queryFuzzy")
    RespVO<RespDataVO<SysOss>> queryFuzzy(@RequestBody SysOss sysOss);

    /**
     * 模糊分页查询
     *
     * @param sysOss
     * @return
     */
    @PostMapping("/queryPageFuzzy")
    RespVO<PageInfo<SysOss>> queryPageFuzzy(@RequestBody SysOss sysOss);

    /**
     * 模糊条件查询
     *
     * @param sysOss
     * @return
     */
    @PostMapping("/queryByLikeCondition")
    RespVO<RespDataVO<SysOss>> queryByLikeCondition(@RequestBody SysOss sysOss);

    /**
     * 模糊分页条件查询
     *
     * @param sysOss
     * @return
     */
    @PostMapping("/queryPageByLikeCondition")
    RespVO<PageInfo<SysOss>> queryPageByLikeCondition(@RequestBody SysOss sysOss);

    /**
     * 条件查询数量
     *
     * @param sysOss
     * @return
     */
    @PostMapping("/queryCount")
    RespVO<Long> queryCount(@RequestBody SysOss sysOss);

    /**
     * 分组统计
     *
     * @param sysOss
     * @return
     */
    @PostMapping("/statisticsGroup")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroup(@RequestBody SysOss sysOss);

    /**
     * 日统计
     *
     * @param sysOss
     * @return
     */
    @PostMapping("/statisticsGroupByDay")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByDay(@RequestBody SysOss sysOss);

    /**
     * 月统计
     *
     * @param sysOss
     * @return
     */
    @PostMapping("/statisticsGroupByMonth")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByMonth(@RequestBody SysOss sysOss);

    /**
     * 年统计
     *
     * @param sysOss
     * @return
     */
    @PostMapping("/statisticsGroupByYear")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByYear(@RequestBody SysOss sysOss);

}

class SysOssClientFallback implements SysOssClient {
    @Override
    public RespVO insert(SysOss sysOss) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO insertSelective(SysOss sysOss) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchInsert(List<SysOss> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchInsertSelective(List<SysOss> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO updateByPrimaryKey(SysOss sysOss) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO updateSelectiveByPrimaryKey(SysOss sysOss) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpdate(List<SysOss> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpdateSelective(List<SysOss> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO upsert(SysOss sysOss) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO upsertSelective(SysOss sysOss) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpsert(List<SysOss> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpsertSelective(List<SysOss> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO deleteByPrimaryKey(Long id) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO deleteBatchByPrimaryKeys(List<Long> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO delete(SysOss sysOss) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<SysOss> queryByPrimaryKey(Long id) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<SysOss>> queryBatchPrimaryKeys(List<Long> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<SysOss> queryOne(SysOss sysOss) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<SysOss>> queryByCondition(SysOss sysOss) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<PageInfo<SysOss>> queryPageByCondition(SysOss sysOss) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<SysOss>> queryFuzzy(SysOss sysOss) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<PageInfo<SysOss>> queryPageFuzzy(SysOss sysOss) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<SysOss>> queryByLikeCondition(SysOss sysOss) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<PageInfo<SysOss>> queryPageByLikeCondition(SysOss sysOss) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<Long> queryCount(SysOss sysOss) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroup(SysOss sysOss) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByDay(SysOss sysOss) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByMonth(SysOss sysOss) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByYear(SysOss sysOss) {
        return RespVOBuilder.failure("system-service服务不可用");
    }
}