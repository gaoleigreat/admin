package com.xiaodao.admin.client;

import com.github.pagehelper.PageInfo;
import com.xiaodao.feign.config.MultipartSupportConfig;
import com.xiaodao.core.result.RespDataVO;
import com.xiaodao.core.result.RespVO;
import com.xiaodao.core.result.RespVOBuilder;
import com.xiaodao.admin.entity.GenTableColumn;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@FeignClient(value = "system-service", path = "/genTableColumn", fallbackFactory = GenTableColumnClientFallback.class, configuration = MultipartSupportConfig.class)
public interface GenTableColumnClient {


    /**
     * 新增
     *
     * @param genTableColumn
     * @return
     */
    @PostMapping("/insert")
    RespVO insert(@RequestBody GenTableColumn genTableColumn);

    /**
     * 带有空值判断的新增
     *
     * @param genTableColumn
     * @return
     */
    @PostMapping("/insertSelective")
    RespVO insertSelective(@RequestBody GenTableColumn genTableColumn);

    /**
     * 批量新增
     *
     * @param list
     * @return
     */
    @PostMapping("/batchInsert")
    RespVO batchInsert(@RequestBody List<GenTableColumn> list);

    /**
     * 带有空值判断的新增
     *
     * @param list
     * @return
     */
    @PostMapping("/batchInsertSelective")
    RespVO batchInsertSelective(@RequestBody List<GenTableColumn> list);

    /**
     * 根据主键更新
     *
     * @param genTableColumn
     * @return
     */
    @PutMapping("/updateByPrimaryKey")
    RespVO updateByPrimaryKey(@RequestBody GenTableColumn genTableColumn);

    /**
     * 根据空值判断的主键更新
     *
     * @param genTableColumn
     * @return
     */
    @PutMapping("/updateSelectiveByPrimaryKey")
    RespVO updateSelectiveByPrimaryKey(@RequestBody GenTableColumn genTableColumn);

    /**
     * 批量更新
     *
     * @param list
     * @return
     */
    @PutMapping("/batchUpdate")
    RespVO batchUpdate(@RequestBody List<GenTableColumn> list);

    /**
     * 带有空值判断的批量更新
     *
     * @param list
     * @return
     */
    @PutMapping("/batchUpdateSelective")
    RespVO batchUpdateSelective(@RequestBody List<GenTableColumn> list);


    /**
     * 更新插入
     *
     * @param genTableColumn
     * @return
     */
    @PostMapping("/upsert")
    RespVO upsert(@RequestBody GenTableColumn genTableColumn);

    /**
     * 带有空值判断的更新插入
     *
     * @param genTableColumn
     * @return
     */
    @PostMapping("/upsertSelective")
    RespVO upsertSelective(@RequestBody GenTableColumn genTableColumn);


    /**
     * 批量更新插入
     *
     * @param list
     * @return
     */
    @PostMapping("/batchUpsert")
    RespVO batchUpsert(@RequestBody List<GenTableColumn> list);


    /**
     * 带有空值判断的批量更新插入
     *
     * @param list
     * @return
     */
    @PostMapping("/batchUpsertSelective")
    RespVO batchUpsertSelective(@RequestBody List<GenTableColumn> list);


    /**
     * 通过主键删除
     *
     * @param columnId
     * @return
     */
    @DeleteMapping("/{columnId}")
    RespVO deleteByPrimaryKey(@PathVariable(value = "columnId") Long columnId);

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
     * @param genTableColumn
     * @return
     */
    @DeleteMapping("/delete")
    RespVO delete(@RequestBody GenTableColumn genTableColumn);

    /**
     * 通过主键查询
     *
     * @param columnId
     * @return
     */
    @GetMapping("/{columnId}")
    RespVO<GenTableColumn> queryByPrimaryKey(@PathVariable(value = "columnId") Long columnId);


    /**
     * 通过主键批量查询
     *
     * @param list
     * @return
     */
    @PostMapping("/queryBatchPrimaryKeys")
    RespVO<RespDataVO<GenTableColumn>> queryBatchPrimaryKeys(@RequestBody List<Long> list);


    /**
     * 条件查询一个
     *
     * @param genTableColumn
     * @return
     */
    @PostMapping("/queryOne")
    RespVO<GenTableColumn> queryOne(@RequestBody GenTableColumn genTableColumn);

    /**
     * 条件查询
     *
     * @param genTableColumn
     * @return
     */
    @PostMapping("/queryByCondition")
    RespVO<RespDataVO<GenTableColumn>> queryByCondition(@RequestBody GenTableColumn genTableColumn);

    /**
     * 条件分页查询
     *
     * @param genTableColumn
     * @return
     */
    @PostMapping("/queryPageByCondition")
    RespVO<PageInfo<GenTableColumn>> queryPageByCondition(@RequestBody GenTableColumn genTableColumn);

    /**
     * 模糊查询
     *
     * @param genTableColumn
     * @return
     */
    @PostMapping("/queryFuzzy")
    RespVO<RespDataVO<GenTableColumn>> queryFuzzy(@RequestBody GenTableColumn genTableColumn);

    /**
     * 模糊分页查询
     *
     * @param genTableColumn
     * @return
     */
    @PostMapping("/queryPageFuzzy")
    RespVO<PageInfo<GenTableColumn>> queryPageFuzzy(@RequestBody GenTableColumn genTableColumn);

    /**
     * 模糊条件查询
     *
     * @param genTableColumn
     * @return
     */
    @PostMapping("/queryByLikeCondition")
    RespVO<RespDataVO<GenTableColumn>> queryByLikeCondition(@RequestBody GenTableColumn genTableColumn);

    /**
     * 模糊分页条件查询
     *
     * @param genTableColumn
     * @return
     */
    @PostMapping("/queryPageByLikeCondition")
    RespVO<PageInfo<GenTableColumn>> queryPageByLikeCondition(@RequestBody GenTableColumn genTableColumn);

    /**
     * 条件查询数量
     *
     * @param genTableColumn
     * @return
     */
    @PostMapping("/queryCount")
    RespVO<Long> queryCount(@RequestBody GenTableColumn genTableColumn);

    /**
     * 分组统计
     *
     * @param genTableColumn
     * @return
     */
    @PostMapping("/statisticsGroup")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroup(@RequestBody GenTableColumn genTableColumn);

    /**
     * 日统计
     *
     * @param genTableColumn
     * @return
     */
    @PostMapping("/statisticsGroupByDay")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByDay(@RequestBody GenTableColumn genTableColumn);

    /**
     * 月统计
     *
     * @param genTableColumn
     * @return
     */
    @PostMapping("/statisticsGroupByMonth")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByMonth(@RequestBody GenTableColumn genTableColumn);

    /**
     * 年统计
     *
     * @param genTableColumn
     * @return
     */
    @PostMapping("/statisticsGroupByYear")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByYear(@RequestBody GenTableColumn genTableColumn);

}

class GenTableColumnClientFallback implements GenTableColumnClient {
    @Override
    public RespVO insert(GenTableColumn genTableColumn) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO insertSelective(GenTableColumn genTableColumn) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchInsert(List<GenTableColumn> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchInsertSelective(List<GenTableColumn> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO updateByPrimaryKey(GenTableColumn genTableColumn) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO updateSelectiveByPrimaryKey(GenTableColumn genTableColumn) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpdate(List<GenTableColumn> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpdateSelective(List<GenTableColumn> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO upsert(GenTableColumn genTableColumn) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO upsertSelective(GenTableColumn genTableColumn) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpsert(List<GenTableColumn> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpsertSelective(List<GenTableColumn> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO deleteByPrimaryKey(Long columnId) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO deleteBatchByPrimaryKeys(List<Long> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO delete(GenTableColumn genTableColumn) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<GenTableColumn> queryByPrimaryKey(Long columnId) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<GenTableColumn>> queryBatchPrimaryKeys(List<Long> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<GenTableColumn> queryOne(GenTableColumn genTableColumn) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<GenTableColumn>> queryByCondition(GenTableColumn genTableColumn) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<PageInfo<GenTableColumn>> queryPageByCondition(GenTableColumn genTableColumn) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<GenTableColumn>> queryFuzzy(GenTableColumn genTableColumn) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<PageInfo<GenTableColumn>> queryPageFuzzy(GenTableColumn genTableColumn) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<GenTableColumn>> queryByLikeCondition(GenTableColumn genTableColumn) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<PageInfo<GenTableColumn>> queryPageByLikeCondition(GenTableColumn genTableColumn) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<Long> queryCount(GenTableColumn genTableColumn) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroup(GenTableColumn genTableColumn) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByDay(GenTableColumn genTableColumn) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByMonth(GenTableColumn genTableColumn) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByYear(GenTableColumn genTableColumn) {
        return RespVOBuilder.failure("system-service服务不可用");
    }
}