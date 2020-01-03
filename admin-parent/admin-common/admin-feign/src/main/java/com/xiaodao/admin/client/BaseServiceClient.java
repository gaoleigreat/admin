package com.xiaodao.admin.client;

import com.github.pagehelper.PageInfo;
import com.xiaodao.feign.config.MultipartSupportConfig;
import com.xiaodao.core.result.RespDataVO;
import com.xiaodao.core.result.RespVO;
import com.xiaodao.core.result.RespVOBuilder;
import com.xiaodao.admin.entity.BaseService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@FeignClient(value = "system-service", path = "/baseService", fallbackFactory = BaseServiceClientFallback.class, configuration = MultipartSupportConfig.class)
public interface BaseServiceClient {


    /**
     * 新增
     *
     * @param baseService
     * @return
     */
    @PostMapping("/insert")
    RespVO insert(@RequestBody BaseService baseService);

    /**
     * 带有空值判断的新增
     *
     * @param baseService
     * @return
     */
    @PostMapping("/insertSelective")
    RespVO insertSelective(@RequestBody BaseService baseService);

    /**
     * 批量新增
     *
     * @param list
     * @return
     */
    @PostMapping("/batchInsert")
    RespVO batchInsert(@RequestBody List<BaseService> list);

    /**
     * 带有空值判断的新增
     *
     * @param list
     * @return
     */
    @PostMapping("/batchInsertSelective")
    RespVO batchInsertSelective(@RequestBody List<BaseService> list);

    /**
     * 根据主键更新
     *
     * @param baseService
     * @return
     */
    @PutMapping("/updateByPrimaryKey")
    RespVO updateByPrimaryKey(@RequestBody BaseService baseService);

    /**
     * 根据空值判断的主键更新
     *
     * @param baseService
     * @return
     */
    @PutMapping("/updateSelectiveByPrimaryKey")
    RespVO updateSelectiveByPrimaryKey(@RequestBody BaseService baseService);

    /**
     * 批量更新
     *
     * @param list
     * @return
     */
    @PutMapping("/batchUpdate")
    RespVO batchUpdate(@RequestBody List<BaseService> list);

    /**
     * 带有空值判断的批量更新
     *
     * @param list
     * @return
     */
    @PutMapping("/batchUpdateSelective")
    RespVO batchUpdateSelective(@RequestBody List<BaseService> list);


    /**
     * 更新插入
     *
     * @param baseService
     * @return
     */
    @PostMapping("/upsert")
    RespVO upsert(@RequestBody BaseService baseService);

    /**
     * 带有空值判断的更新插入
     *
     * @param baseService
     * @return
     */
    @PostMapping("/upsertSelective")
    RespVO upsertSelective(@RequestBody BaseService baseService);


    /**
     * 批量更新插入
     *
     * @param list
     * @return
     */
    @PostMapping("/batchUpsert")
    RespVO batchUpsert(@RequestBody List<BaseService> list);


    /**
     * 带有空值判断的批量更新插入
     *
     * @param list
     * @return
     */
    @PostMapping("/batchUpsertSelective")
    RespVO batchUpsertSelective(@RequestBody List<BaseService> list);


    /**
     * 通过主键删除
     *
     * @param serviceId
     * @return
     */
    @DeleteMapping("/{serviceId}")
    RespVO deleteByPrimaryKey(@PathVariable(value = "serviceId") Long serviceId);

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
     * @param baseService
     * @return
     */
    @DeleteMapping("/delete")
    RespVO delete(@RequestBody BaseService baseService);

    /**
     * 通过主键查询
     *
     * @param serviceId
     * @return
     */
    @GetMapping("/{serviceId}")
    RespVO<BaseService> queryByPrimaryKey(@PathVariable(value = "serviceId") Long serviceId);


    /**
     * 通过主键批量查询
     *
     * @param list
     * @return
     */
    @PostMapping("/queryBatchPrimaryKeys")
    RespVO<RespDataVO<BaseService>> queryBatchPrimaryKeys(@RequestBody List<Long> list);


    /**
     * 条件查询一个
     *
     * @param baseService
     * @return
     */
    @PostMapping("/queryOne")
    RespVO<BaseService> queryOne(@RequestBody BaseService baseService);

    /**
     * 条件查询
     *
     * @param baseService
     * @return
     */
    @PostMapping("/queryByCondition")
    RespVO<RespDataVO<BaseService>> queryByCondition(@RequestBody BaseService baseService);

    /**
     * 条件分页查询
     *
     * @param baseService
     * @return
     */
    @PostMapping("/queryPageByCondition")
    RespVO<PageInfo<BaseService>> queryPageByCondition(@RequestBody BaseService baseService);

    /**
     * 模糊查询
     *
     * @param baseService
     * @return
     */
    @PostMapping("/queryFuzzy")
    RespVO<RespDataVO<BaseService>> queryFuzzy(@RequestBody BaseService baseService);

    /**
     * 模糊分页查询
     *
     * @param baseService
     * @return
     */
    @PostMapping("/queryPageFuzzy")
    RespVO<PageInfo<BaseService>> queryPageFuzzy(@RequestBody BaseService baseService);

    /**
     * 模糊条件查询
     *
     * @param baseService
     * @return
     */
    @PostMapping("/queryByLikeCondition")
    RespVO<RespDataVO<BaseService>> queryByLikeCondition(@RequestBody BaseService baseService);

    /**
     * 模糊分页条件查询
     *
     * @param baseService
     * @return
     */
    @PostMapping("/queryPageByLikeCondition")
    RespVO<PageInfo<BaseService>> queryPageByLikeCondition(@RequestBody BaseService baseService);

    /**
     * 条件查询数量
     *
     * @param baseService
     * @return
     */
    @PostMapping("/queryCount")
    RespVO<Long> queryCount(@RequestBody BaseService baseService);

    /**
     * 分组统计
     *
     * @param baseService
     * @return
     */
    @PostMapping("/statisticsGroup")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroup(@RequestBody BaseService baseService);

    /**
     * 日统计
     *
     * @param baseService
     * @return
     */
    @PostMapping("/statisticsGroupByDay")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByDay(@RequestBody BaseService baseService);

    /**
     * 月统计
     *
     * @param baseService
     * @return
     */
    @PostMapping("/statisticsGroupByMonth")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByMonth(@RequestBody BaseService baseService);

    /**
     * 年统计
     *
     * @param baseService
     * @return
     */
    @PostMapping("/statisticsGroupByYear")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByYear(@RequestBody BaseService baseService);

}

class BaseServiceClientFallback implements BaseServiceClient {
    @Override
    public RespVO insert(BaseService baseService) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO insertSelective(BaseService baseService) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchInsert(List<BaseService> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchInsertSelective(List<BaseService> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO updateByPrimaryKey(BaseService baseService) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO updateSelectiveByPrimaryKey(BaseService baseService) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpdate(List<BaseService> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpdateSelective(List<BaseService> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO upsert(BaseService baseService) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO upsertSelective(BaseService baseService) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpsert(List<BaseService> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpsertSelective(List<BaseService> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO deleteByPrimaryKey(Long serviceId) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO deleteBatchByPrimaryKeys(List<Long> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO delete(BaseService baseService) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<BaseService> queryByPrimaryKey(Long serviceId) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<BaseService>> queryBatchPrimaryKeys(List<Long> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<BaseService> queryOne(BaseService baseService) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<BaseService>> queryByCondition(BaseService baseService) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<PageInfo<BaseService>> queryPageByCondition(BaseService baseService) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<BaseService>> queryFuzzy(BaseService baseService) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<PageInfo<BaseService>> queryPageFuzzy(BaseService baseService) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<BaseService>> queryByLikeCondition(BaseService baseService) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<PageInfo<BaseService>> queryPageByLikeCondition(BaseService baseService) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<Long> queryCount(BaseService baseService) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroup(BaseService baseService) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByDay(BaseService baseService) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByMonth(BaseService baseService) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByYear(BaseService baseService) {
        return RespVOBuilder.failure("system-service服务不可用");
    }
}