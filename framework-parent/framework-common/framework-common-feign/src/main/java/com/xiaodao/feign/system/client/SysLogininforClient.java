package com.xiaodao.feign.system.client;

import com.github.pagehelper.PageInfo;
import com.xiaodao.config.MultipartSupportConfig;
import com.xiaodao.core.result.RespDataVO;
import com.xiaodao.core.result.RespVO;
import com.xiaodao.core.result.RespVOBuilder;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import com.xiaodao.feign.system.entity.SysLogininfor;

import java.util.List;
import java.util.Map;

@FeignClient(value = "system-service", path = "/sysLogininfor", fallbackFactory = SysLogininforClientFallback.class, configuration = MultipartSupportConfig.class)
public interface SysLogininforClient {


    /**
     * 新增
     *
     * @param sysLogininfor
     * @return
     */
    @PostMapping("/insert")
    RespVO insert(@RequestBody SysLogininfor sysLogininfor);

    /**
     * 带有空值判断的新增
     *
     * @param sysLogininfor
     * @return
     */
    @PostMapping("/insertSelective")
    RespVO insertSelective(@RequestBody SysLogininfor sysLogininfor);

    /**
     * 批量新增
     *
     * @param list
     * @return
     */
    @PostMapping("/batchInsert")
    RespVO batchInsert(@RequestBody List<SysLogininfor> list);

    /**
     * 带有空值判断的新增
     *
     * @param list
     * @return
     */
    @PostMapping("/batchInsertSelective")
    RespVO batchInsertSelective(@RequestBody List<SysLogininfor> list);

    /**
     * 根据主键更新
     *
     * @param sysLogininfor
     * @return
     */
    @PutMapping("/updateByPrimaryKey")
    RespVO updateByPrimaryKey(@RequestBody SysLogininfor sysLogininfor);

    /**
     * 根据空值判断的主键更新
     *
     * @param sysLogininfor
     * @return
     */
    @PutMapping("/updateSelectiveByPrimaryKey")
    RespVO updateSelectiveByPrimaryKey(@RequestBody SysLogininfor sysLogininfor);

    /**
     * 批量更新
     *
     * @param list
     * @return
     */
    @PutMapping("/batchUpdate")
    RespVO batchUpdate(@RequestBody List<SysLogininfor> list);

    /**
     * 带有空值判断的批量更新
     *
     * @param list
     * @return
     */
    @PutMapping("/batchUpdateSelective")
    RespVO batchUpdateSelective(@RequestBody List<SysLogininfor> list);


    /**
     * 更新插入
     *
     * @param sysLogininfor
     * @return
     */
    @PostMapping("/upsert")
    RespVO upsert(@RequestBody SysLogininfor sysLogininfor);

    /**
     * 带有空值判断的更新插入
     *
     * @param sysLogininfor
     * @return
     */
    @PostMapping("/upsertSelective")
    RespVO upsertSelective(@RequestBody SysLogininfor sysLogininfor);


    /**
     * 批量更新插入
     *
     * @param list
     * @return
     */
    @PostMapping("/batchUpsert")
    RespVO batchUpsert(@RequestBody List<SysLogininfor> list);


    /**
     * 带有空值判断的批量更新插入
     *
     * @param list
     * @return
     */
    @PostMapping("/batchUpsertSelective")
    RespVO batchUpsertSelective(@RequestBody List<SysLogininfor> list);


    /**
     * 通过主键删除
     *
     * @param infoId
     * @return
     */
    @DeleteMapping("/{infoId}")
    RespVO deleteByPrimaryKey(@PathVariable(value = "infoId") Long infoId);

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
     * @param sysLogininfor
     * @return
     */
    @DeleteMapping("/delete")
    RespVO delete(@RequestBody SysLogininfor sysLogininfor);

    /**
     * 通过主键查询
     *
     * @param infoId
     * @return
     */
    @GetMapping("/{infoId}")
    RespVO<SysLogininfor> queryByPrimaryKey(@PathVariable(value = "infoId") Long infoId);


    /**
     * 通过主键批量查询
     *
     * @param list
     * @return
     */
    @PostMapping("/queryBatchPrimaryKeys")
    RespVO<RespDataVO<SysLogininfor>> queryBatchPrimaryKeys(@RequestBody List<Long> list);


    /**
     * 条件查询一个
     *
     * @param sysLogininfor
     * @return
     */
    @PostMapping("/queryOne")
    RespVO<SysLogininfor> queryOne(@RequestBody SysLogininfor sysLogininfor);

    /**
     * 条件查询
     *
     * @param sysLogininfor
     * @return
     */
    @PostMapping("/queryByCondition")
    RespVO<RespDataVO<SysLogininfor>> queryByCondition(@RequestBody SysLogininfor sysLogininfor);

    /**
     * 条件分页查询
     *
     * @param sysLogininfor
     * @return
     */
    @PostMapping("/queryPageByCondition")
    RespVO<PageInfo<SysLogininfor>> queryPageByCondition(@RequestBody SysLogininfor sysLogininfor);

    /**
     * 模糊查询
     *
     * @param sysLogininfor
     * @return
     */
    @PostMapping("/queryFuzzy")
    RespVO<RespDataVO<SysLogininfor>> queryFuzzy(@RequestBody SysLogininfor sysLogininfor);

    /**
     * 模糊分页查询
     *
     * @param sysLogininfor
     * @return
     */
    @PostMapping("/queryPageFuzzy")
    RespVO<PageInfo<SysLogininfor>> queryPageFuzzy(@RequestBody SysLogininfor sysLogininfor);

    /**
     * 模糊条件查询
     *
     * @param sysLogininfor
     * @return
     */
    @PostMapping("/queryByLikeCondition")
    RespVO<RespDataVO<SysLogininfor>> queryByLikeCondition(@RequestBody SysLogininfor sysLogininfor);

    /**
     * 模糊分页条件查询
     *
     * @param sysLogininfor
     * @return
     */
    @PostMapping("/queryPageByLikeCondition")
    RespVO<PageInfo<SysLogininfor>> queryPageByLikeCondition(@RequestBody SysLogininfor sysLogininfor);

    /**
     * 条件查询数量
     *
     * @param sysLogininfor
     * @return
     */
    @PostMapping("/queryCount")
    RespVO<Long> queryCount(@RequestBody SysLogininfor sysLogininfor);

    /**
     * 分组统计
     *
     * @param sysLogininfor
     * @return
     */
    @PostMapping("/statisticsGroup")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroup(@RequestBody SysLogininfor sysLogininfor);

    /**
     * 日统计
     *
     * @param sysLogininfor
     * @return
     */
    @PostMapping("/statisticsGroupByDay")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByDay(@RequestBody SysLogininfor sysLogininfor);

    /**
     * 月统计
     *
     * @param sysLogininfor
     * @return
     */
    @PostMapping("/statisticsGroupByMonth")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByMonth(@RequestBody SysLogininfor sysLogininfor);

    /**
     * 年统计
     *
     * @param sysLogininfor
     * @return
     */
    @PostMapping("/statisticsGroupByYear")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByYear(@RequestBody SysLogininfor sysLogininfor);

}

class SysLogininforClientFallback implements SysLogininforClient {
    @Override
    public RespVO insert(SysLogininfor sysLogininfor) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO insertSelective(SysLogininfor sysLogininfor) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchInsert(List<SysLogininfor> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchInsertSelective(List<SysLogininfor> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO updateByPrimaryKey(SysLogininfor sysLogininfor) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO updateSelectiveByPrimaryKey(SysLogininfor sysLogininfor) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpdate(List<SysLogininfor> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpdateSelective(List<SysLogininfor> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO upsert(SysLogininfor sysLogininfor) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO upsertSelective(SysLogininfor sysLogininfor) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpsert(List<SysLogininfor> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpsertSelective(List<SysLogininfor> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO deleteByPrimaryKey(Long infoId) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO deleteBatchByPrimaryKeys(List<Long> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO delete(SysLogininfor sysLogininfor) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<SysLogininfor> queryByPrimaryKey(Long infoId) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<SysLogininfor>> queryBatchPrimaryKeys(List<Long> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<SysLogininfor> queryOne(SysLogininfor sysLogininfor) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<SysLogininfor>> queryByCondition(SysLogininfor sysLogininfor) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<PageInfo<SysLogininfor>> queryPageByCondition(SysLogininfor sysLogininfor) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<SysLogininfor>> queryFuzzy(SysLogininfor sysLogininfor) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<PageInfo<SysLogininfor>> queryPageFuzzy(SysLogininfor sysLogininfor) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<SysLogininfor>> queryByLikeCondition(SysLogininfor sysLogininfor) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<PageInfo<SysLogininfor>> queryPageByLikeCondition(SysLogininfor sysLogininfor) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<Long> queryCount(SysLogininfor sysLogininfor) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroup(SysLogininfor sysLogininfor) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByDay(SysLogininfor sysLogininfor) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByMonth(SysLogininfor sysLogininfor) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByYear(SysLogininfor sysLogininfor) {
        return RespVOBuilder.failure("system-service服务不可用");
    }
}