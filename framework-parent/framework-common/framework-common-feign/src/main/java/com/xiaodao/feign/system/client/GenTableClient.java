package com.xiaodao.feign.system.client;

import com.github.pagehelper.PageInfo;
import com.xiaodao.config.MultipartSupportConfig;
import com.xiaodao.core.result.RespDataVO;
import com.xiaodao.core.result.RespVO;
import com.xiaodao.core.result.RespVOBuilder;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import com.xiaodao.feign.system.entity.GenTable;

import java.util.List;
import java.util.Map;

@FeignClient(value = "system-service", path = "/genTable", fallbackFactory = GenTableClientFallback.class, configuration = MultipartSupportConfig.class)
public interface GenTableClient {


    /**
     * 新增
     *
     * @param genTable
     * @return
     */
    @PostMapping("/insert")
    RespVO insert(@RequestBody GenTable genTable);

    /**
     * 带有空值判断的新增
     *
     * @param genTable
     * @return
     */
    @PostMapping("/insertSelective")
    RespVO insertSelective(@RequestBody GenTable genTable);

    /**
     * 批量新增
     *
     * @param list
     * @return
     */
    @PostMapping("/batchInsert")
    RespVO batchInsert(@RequestBody List<GenTable> list);

    /**
     * 带有空值判断的新增
     *
     * @param list
     * @return
     */
    @PostMapping("/batchInsertSelective")
    RespVO batchInsertSelective(@RequestBody List<GenTable> list);

    /**
     * 根据主键更新
     *
     * @param genTable
     * @return
     */
    @PutMapping("/updateByPrimaryKey")
    RespVO updateByPrimaryKey(@RequestBody GenTable genTable);

    /**
     * 根据空值判断的主键更新
     *
     * @param genTable
     * @return
     */
    @PutMapping("/updateSelectiveByPrimaryKey")
    RespVO updateSelectiveByPrimaryKey(@RequestBody GenTable genTable);

    /**
     * 批量更新
     *
     * @param list
     * @return
     */
    @PutMapping("/batchUpdate")
    RespVO batchUpdate(@RequestBody List<GenTable> list);

    /**
     * 带有空值判断的批量更新
     *
     * @param list
     * @return
     */
    @PutMapping("/batchUpdateSelective")
    RespVO batchUpdateSelective(@RequestBody List<GenTable> list);


    /**
     * 更新插入
     *
     * @param genTable
     * @return
     */
    @PostMapping("/upsert")
    RespVO upsert(@RequestBody GenTable genTable);

    /**
     * 带有空值判断的更新插入
     *
     * @param genTable
     * @return
     */
    @PostMapping("/upsertSelective")
    RespVO upsertSelective(@RequestBody GenTable genTable);


    /**
     * 批量更新插入
     *
     * @param list
     * @return
     */
    @PostMapping("/batchUpsert")
    RespVO batchUpsert(@RequestBody List<GenTable> list);


    /**
     * 带有空值判断的批量更新插入
     *
     * @param list
     * @return
     */
    @PostMapping("/batchUpsertSelective")
    RespVO batchUpsertSelective(@RequestBody List<GenTable> list);


    /**
     * 通过主键删除
     *
     * @param tableId
     * @return
     */
    @DeleteMapping("/{tableId}")
    RespVO deleteByPrimaryKey(@PathVariable(value = "tableId") Long tableId);

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
     * @param genTable
     * @return
     */
    @DeleteMapping("/delete")
    RespVO delete(@RequestBody GenTable genTable);

    /**
     * 通过主键查询
     *
     * @param tableId
     * @return
     */
    @GetMapping("/{tableId}")
    RespVO<GenTable> queryByPrimaryKey(@PathVariable(value = "tableId") Long tableId);


    /**
     * 通过主键批量查询
     *
     * @param list
     * @return
     */
    @PostMapping("/queryBatchPrimaryKeys")
    RespVO<RespDataVO<GenTable>> queryBatchPrimaryKeys(@RequestBody List<Long> list);


    /**
     * 条件查询一个
     *
     * @param genTable
     * @return
     */
    @PostMapping("/queryOne")
    RespVO<GenTable> queryOne(@RequestBody GenTable genTable);

    /**
     * 条件查询
     *
     * @param genTable
     * @return
     */
    @PostMapping("/queryByCondition")
    RespVO<RespDataVO<GenTable>> queryByCondition(@RequestBody GenTable genTable);

    /**
     * 条件分页查询
     *
     * @param genTable
     * @return
     */
    @PostMapping("/queryPageByCondition")
    RespVO<PageInfo<GenTable>> queryPageByCondition(@RequestBody GenTable genTable);

    /**
     * 模糊查询
     *
     * @param genTable
     * @return
     */
    @PostMapping("/queryFuzzy")
    RespVO<RespDataVO<GenTable>> queryFuzzy(@RequestBody GenTable genTable);

    /**
     * 模糊分页查询
     *
     * @param genTable
     * @return
     */
    @PostMapping("/queryPageFuzzy")
    RespVO<PageInfo<GenTable>> queryPageFuzzy(@RequestBody GenTable genTable);

    /**
     * 模糊条件查询
     *
     * @param genTable
     * @return
     */
    @PostMapping("/queryByLikeCondition")
    RespVO<RespDataVO<GenTable>> queryByLikeCondition(@RequestBody GenTable genTable);

    /**
     * 模糊分页条件查询
     *
     * @param genTable
     * @return
     */
    @PostMapping("/queryPageByLikeCondition")
    RespVO<PageInfo<GenTable>> queryPageByLikeCondition(@RequestBody GenTable genTable);

    /**
     * 条件查询数量
     *
     * @param genTable
     * @return
     */
    @PostMapping("/queryCount")
    RespVO<Long> queryCount(@RequestBody GenTable genTable);

    /**
     * 分组统计
     *
     * @param genTable
     * @return
     */
    @PostMapping("/statisticsGroup")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroup(@RequestBody GenTable genTable);

    /**
     * 日统计
     *
     * @param genTable
     * @return
     */
    @PostMapping("/statisticsGroupByDay")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByDay(@RequestBody GenTable genTable);

    /**
     * 月统计
     *
     * @param genTable
     * @return
     */
    @PostMapping("/statisticsGroupByMonth")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByMonth(@RequestBody GenTable genTable);

    /**
     * 年统计
     *
     * @param genTable
     * @return
     */
    @PostMapping("/statisticsGroupByYear")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByYear(@RequestBody GenTable genTable);

}

class GenTableClientFallback implements GenTableClient {
    @Override
    public RespVO insert(GenTable genTable) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO insertSelective(GenTable genTable) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchInsert(List<GenTable> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchInsertSelective(List<GenTable> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO updateByPrimaryKey(GenTable genTable) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO updateSelectiveByPrimaryKey(GenTable genTable) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpdate(List<GenTable> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpdateSelective(List<GenTable> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO upsert(GenTable genTable) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO upsertSelective(GenTable genTable) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpsert(List<GenTable> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpsertSelective(List<GenTable> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO deleteByPrimaryKey(Long tableId) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO deleteBatchByPrimaryKeys(List<Long> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO delete(GenTable genTable) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<GenTable> queryByPrimaryKey(Long tableId) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<GenTable>> queryBatchPrimaryKeys(List<Long> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<GenTable> queryOne(GenTable genTable) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<GenTable>> queryByCondition(GenTable genTable) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<PageInfo<GenTable>> queryPageByCondition(GenTable genTable) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<GenTable>> queryFuzzy(GenTable genTable) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<PageInfo<GenTable>> queryPageFuzzy(GenTable genTable) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<GenTable>> queryByLikeCondition(GenTable genTable) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<PageInfo<GenTable>> queryPageByLikeCondition(GenTable genTable) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<Long> queryCount(GenTable genTable) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroup(GenTable genTable) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByDay(GenTable genTable) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByMonth(GenTable genTable) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByYear(GenTable genTable) {
        return RespVOBuilder.failure("system-service服务不可用");
    }
}