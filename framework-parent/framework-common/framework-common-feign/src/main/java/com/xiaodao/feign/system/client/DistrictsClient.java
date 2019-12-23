package com.xiaodao.feign.system.client;

import com.github.pagehelper.PageInfo;
import com.xiaodao.config.MultipartSupportConfig;
import com.xiaodao.core.result.RespDataVO;
import com.xiaodao.core.result.RespVO;
import com.xiaodao.core.result.RespVOBuilder;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import com.xiaodao.feign.system.entity.Districts;

import java.util.List;
import java.util.Map;

@FeignClient(value = "system-service", path = "/districts", fallbackFactory = DistrictsClientFallback.class, configuration = MultipartSupportConfig.class)
public interface DistrictsClient {


    /**
     * 新增
     *
     * @param districts
     * @return
     */
    @PostMapping("/insert")
    RespVO insert(@RequestBody Districts districts);

    /**
     * 带有空值判断的新增
     *
     * @param districts
     * @return
     */
    @PostMapping("/insertSelective")
    RespVO insertSelective(@RequestBody Districts districts);

    /**
     * 批量新增
     *
     * @param list
     * @return
     */
    @PostMapping("/batchInsert")
    RespVO batchInsert(@RequestBody List<Districts> list);

    /**
     * 带有空值判断的新增
     *
     * @param list
     * @return
     */
    @PostMapping("/batchInsertSelective")
    RespVO batchInsertSelective(@RequestBody List<Districts> list);

    /**
     * 根据主键更新
     *
     * @param districts
     * @return
     */
    @PutMapping("/updateByPrimaryKey")
    RespVO updateByPrimaryKey(@RequestBody Districts districts);

    /**
     * 根据空值判断的主键更新
     *
     * @param districts
     * @return
     */
    @PutMapping("/updateSelectiveByPrimaryKey")
    RespVO updateSelectiveByPrimaryKey(@RequestBody Districts districts);

    /**
     * 批量更新
     *
     * @param list
     * @return
     */
    @PutMapping("/batchUpdate")
    RespVO batchUpdate(@RequestBody List<Districts> list);

    /**
     * 带有空值判断的批量更新
     *
     * @param list
     * @return
     */
    @PutMapping("/batchUpdateSelective")
    RespVO batchUpdateSelective(@RequestBody List<Districts> list);


    /**
     * 更新插入
     *
     * @param districts
     * @return
     */
    @PostMapping("/upsert")
    RespVO upsert(@RequestBody Districts districts);

    /**
     * 带有空值判断的更新插入
     *
     * @param districts
     * @return
     */
    @PostMapping("/upsertSelective")
    RespVO upsertSelective(@RequestBody Districts districts);


    /**
     * 批量更新插入
     *
     * @param list
     * @return
     */
    @PostMapping("/batchUpsert")
    RespVO batchUpsert(@RequestBody List<Districts> list);


    /**
     * 带有空值判断的批量更新插入
     *
     * @param list
     * @return
     */
    @PostMapping("/batchUpsertSelective")
    RespVO batchUpsertSelective(@RequestBody List<Districts> list);


    /**
     * 通过主键删除
     *
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    RespVO deleteByPrimaryKey(@PathVariable(value = "id") Integer id);

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
     * @param districts
     * @return
     */
    @DeleteMapping("/delete")
    RespVO delete(@RequestBody Districts districts);

    /**
     * 通过主键查询
     *
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    RespVO<Districts> queryByPrimaryKey(@PathVariable(value = "id") Integer id);


    /**
     * 通过主键批量查询
     *
     * @param list
     * @return
     */
    @PostMapping("/queryBatchPrimaryKeys")
    RespVO<RespDataVO<Districts>> queryBatchPrimaryKeys(@RequestBody List<Long> list);


    /**
     * 条件查询一个
     *
     * @param districts
     * @return
     */
    @PostMapping("/queryOne")
    RespVO<Districts> queryOne(@RequestBody Districts districts);

    /**
     * 条件查询
     *
     * @param districts
     * @return
     */
    @PostMapping("/queryByCondition")
    RespVO<RespDataVO<Districts>> queryByCondition(@RequestBody Districts districts);

    /**
     * 条件分页查询
     *
     * @param districts
     * @return
     */
    @PostMapping("/queryPageByCondition")
    RespVO<PageInfo<Districts>> queryPageByCondition(@RequestBody Districts districts);

    /**
     * 模糊查询
     *
     * @param districts
     * @return
     */
    @PostMapping("/queryFuzzy")
    RespVO<RespDataVO<Districts>> queryFuzzy(@RequestBody Districts districts);

    /**
     * 模糊分页查询
     *
     * @param districts
     * @return
     */
    @PostMapping("/queryPageFuzzy")
    RespVO<PageInfo<Districts>> queryPageFuzzy(@RequestBody Districts districts);

    /**
     * 模糊条件查询
     *
     * @param districts
     * @return
     */
    @PostMapping("/queryByLikeCondition")
    RespVO<RespDataVO<Districts>> queryByLikeCondition(@RequestBody Districts districts);

    /**
     * 模糊分页条件查询
     *
     * @param districts
     * @return
     */
    @PostMapping("/queryPageByLikeCondition")
    RespVO<PageInfo<Districts>> queryPageByLikeCondition(@RequestBody Districts districts);

    /**
     * 条件查询数量
     *
     * @param districts
     * @return
     */
    @PostMapping("/queryCount")
    RespVO<Long> queryCount(@RequestBody Districts districts);

    /**
     * 分组统计
     *
     * @param districts
     * @return
     */
    @PostMapping("/statisticsGroup")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroup(@RequestBody Districts districts);

    /**
     * 日统计
     *
     * @param districts
     * @return
     */
    @PostMapping("/statisticsGroupByDay")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByDay(@RequestBody Districts districts);

    /**
     * 月统计
     *
     * @param districts
     * @return
     */
    @PostMapping("/statisticsGroupByMonth")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByMonth(@RequestBody Districts districts);

    /**
     * 年统计
     *
     * @param districts
     * @return
     */
    @PostMapping("/statisticsGroupByYear")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByYear(@RequestBody Districts districts);

}

class DistrictsClientFallback implements DistrictsClient {
    @Override
    public RespVO insert(Districts districts) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO insertSelective(Districts districts) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchInsert(List<Districts> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchInsertSelective(List<Districts> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO updateByPrimaryKey(Districts districts) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO updateSelectiveByPrimaryKey(Districts districts) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpdate(List<Districts> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpdateSelective(List<Districts> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO upsert(Districts districts) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO upsertSelective(Districts districts) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpsert(List<Districts> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpsertSelective(List<Districts> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO deleteByPrimaryKey(Integer id) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO deleteBatchByPrimaryKeys(List<Long> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO delete(Districts districts) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<Districts> queryByPrimaryKey(Integer id) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Districts>> queryBatchPrimaryKeys(List<Long> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<Districts> queryOne(Districts districts) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Districts>> queryByCondition(Districts districts) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<PageInfo<Districts>> queryPageByCondition(Districts districts) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Districts>> queryFuzzy(Districts districts) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<PageInfo<Districts>> queryPageFuzzy(Districts districts) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Districts>> queryByLikeCondition(Districts districts) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<PageInfo<Districts>> queryPageByLikeCondition(Districts districts) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<Long> queryCount(Districts districts) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroup(Districts districts) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByDay(Districts districts) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByMonth(Districts districts) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByYear(Districts districts) {
        return RespVOBuilder.failure("system-service服务不可用");
    }
}