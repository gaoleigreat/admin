package com.xiaodao.admin.client;

import com.github.pagehelper.PageInfo;
import com.xiaodao.feign.config.MultipartSupportConfig;
import com.xiaodao.core.result.RespDataVO;
import com.xiaodao.core.result.RespVO;
import com.xiaodao.core.result.RespVOBuilder;
import com.xiaodao.admin.entity.SysNotice;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@FeignClient(value = "system-service", path = "/sysNotice", fallbackFactory = SysNoticeClientFallback.class, configuration = MultipartSupportConfig.class)
public interface SysNoticeClient {


    /**
     * 新增
     *
     * @param sysNotice
     * @return
     */
    @PostMapping("/insert")
    RespVO insert(@RequestBody SysNotice sysNotice);

    /**
     * 带有空值判断的新增
     *
     * @param sysNotice
     * @return
     */
    @PostMapping("/insertSelective")
    RespVO insertSelective(@RequestBody SysNotice sysNotice);

    /**
     * 批量新增
     *
     * @param list
     * @return
     */
    @PostMapping("/batchInsert")
    RespVO batchInsert(@RequestBody List<SysNotice> list);

    /**
     * 带有空值判断的新增
     *
     * @param list
     * @return
     */
    @PostMapping("/batchInsertSelective")
    RespVO batchInsertSelective(@RequestBody List<SysNotice> list);

    /**
     * 根据主键更新
     *
     * @param sysNotice
     * @return
     */
    @PutMapping("/updateByPrimaryKey")
    RespVO updateByPrimaryKey(@RequestBody SysNotice sysNotice);

    /**
     * 根据空值判断的主键更新
     *
     * @param sysNotice
     * @return
     */
    @PutMapping("/updateSelectiveByPrimaryKey")
    RespVO updateSelectiveByPrimaryKey(@RequestBody SysNotice sysNotice);

    /**
     * 批量更新
     *
     * @param list
     * @return
     */
    @PutMapping("/batchUpdate")
    RespVO batchUpdate(@RequestBody List<SysNotice> list);

    /**
     * 带有空值判断的批量更新
     *
     * @param list
     * @return
     */
    @PutMapping("/batchUpdateSelective")
    RespVO batchUpdateSelective(@RequestBody List<SysNotice> list);


    /**
     * 更新插入
     *
     * @param sysNotice
     * @return
     */
    @PostMapping("/upsert")
    RespVO upsert(@RequestBody SysNotice sysNotice);

    /**
     * 带有空值判断的更新插入
     *
     * @param sysNotice
     * @return
     */
    @PostMapping("/upsertSelective")
    RespVO upsertSelective(@RequestBody SysNotice sysNotice);


    /**
     * 批量更新插入
     *
     * @param list
     * @return
     */
    @PostMapping("/batchUpsert")
    RespVO batchUpsert(@RequestBody List<SysNotice> list);


    /**
     * 带有空值判断的批量更新插入
     *
     * @param list
     * @return
     */
    @PostMapping("/batchUpsertSelective")
    RespVO batchUpsertSelective(@RequestBody List<SysNotice> list);


    /**
     * 通过主键删除
     *
     * @param noticeId
     * @return
     */
    @DeleteMapping("/{noticeId}")
    RespVO deleteByPrimaryKey(@PathVariable(value = "noticeId") Integer noticeId);

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
     * @param sysNotice
     * @return
     */
    @DeleteMapping("/delete")
    RespVO delete(@RequestBody SysNotice sysNotice);

    /**
     * 通过主键查询
     *
     * @param noticeId
     * @return
     */
    @GetMapping("/{noticeId}")
    RespVO<SysNotice> queryByPrimaryKey(@PathVariable(value = "noticeId") Integer noticeId);


    /**
     * 通过主键批量查询
     *
     * @param list
     * @return
     */
    @PostMapping("/queryBatchPrimaryKeys")
    RespVO<RespDataVO<SysNotice>> queryBatchPrimaryKeys(@RequestBody List<Long> list);


    /**
     * 条件查询一个
     *
     * @param sysNotice
     * @return
     */
    @PostMapping("/queryOne")
    RespVO<SysNotice> queryOne(@RequestBody SysNotice sysNotice);

    /**
     * 条件查询
     *
     * @param sysNotice
     * @return
     */
    @PostMapping("/queryByCondition")
    RespVO<RespDataVO<SysNotice>> queryByCondition(@RequestBody SysNotice sysNotice);

    /**
     * 条件分页查询
     *
     * @param sysNotice
     * @return
     */
    @PostMapping("/queryPageByCondition")
    RespVO<PageInfo<SysNotice>> queryPageByCondition(@RequestBody SysNotice sysNotice);

    /**
     * 模糊查询
     *
     * @param sysNotice
     * @return
     */
    @PostMapping("/queryFuzzy")
    RespVO<RespDataVO<SysNotice>> queryFuzzy(@RequestBody SysNotice sysNotice);

    /**
     * 模糊分页查询
     *
     * @param sysNotice
     * @return
     */
    @PostMapping("/queryPageFuzzy")
    RespVO<PageInfo<SysNotice>> queryPageFuzzy(@RequestBody SysNotice sysNotice);

    /**
     * 模糊条件查询
     *
     * @param sysNotice
     * @return
     */
    @PostMapping("/queryByLikeCondition")
    RespVO<RespDataVO<SysNotice>> queryByLikeCondition(@RequestBody SysNotice sysNotice);

    /**
     * 模糊分页条件查询
     *
     * @param sysNotice
     * @return
     */
    @PostMapping("/queryPageByLikeCondition")
    RespVO<PageInfo<SysNotice>> queryPageByLikeCondition(@RequestBody SysNotice sysNotice);

    /**
     * 条件查询数量
     *
     * @param sysNotice
     * @return
     */
    @PostMapping("/queryCount")
    RespVO<Long> queryCount(@RequestBody SysNotice sysNotice);

    /**
     * 分组统计
     *
     * @param sysNotice
     * @return
     */
    @PostMapping("/statisticsGroup")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroup(@RequestBody SysNotice sysNotice);

    /**
     * 日统计
     *
     * @param sysNotice
     * @return
     */
    @PostMapping("/statisticsGroupByDay")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByDay(@RequestBody SysNotice sysNotice);

    /**
     * 月统计
     *
     * @param sysNotice
     * @return
     */
    @PostMapping("/statisticsGroupByMonth")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByMonth(@RequestBody SysNotice sysNotice);

    /**
     * 年统计
     *
     * @param sysNotice
     * @return
     */
    @PostMapping("/statisticsGroupByYear")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByYear(@RequestBody SysNotice sysNotice);

}

class SysNoticeClientFallback implements SysNoticeClient {
    @Override
    public RespVO insert(SysNotice sysNotice) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO insertSelective(SysNotice sysNotice) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchInsert(List<SysNotice> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchInsertSelective(List<SysNotice> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO updateByPrimaryKey(SysNotice sysNotice) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO updateSelectiveByPrimaryKey(SysNotice sysNotice) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpdate(List<SysNotice> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpdateSelective(List<SysNotice> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO upsert(SysNotice sysNotice) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO upsertSelective(SysNotice sysNotice) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpsert(List<SysNotice> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpsertSelective(List<SysNotice> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO deleteByPrimaryKey(Integer noticeId) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO deleteBatchByPrimaryKeys(List<Long> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO delete(SysNotice sysNotice) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<SysNotice> queryByPrimaryKey(Integer noticeId) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<SysNotice>> queryBatchPrimaryKeys(List<Long> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<SysNotice> queryOne(SysNotice sysNotice) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<SysNotice>> queryByCondition(SysNotice sysNotice) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<PageInfo<SysNotice>> queryPageByCondition(SysNotice sysNotice) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<SysNotice>> queryFuzzy(SysNotice sysNotice) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<PageInfo<SysNotice>> queryPageFuzzy(SysNotice sysNotice) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<SysNotice>> queryByLikeCondition(SysNotice sysNotice) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<PageInfo<SysNotice>> queryPageByLikeCondition(SysNotice sysNotice) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<Long> queryCount(SysNotice sysNotice) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroup(SysNotice sysNotice) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByDay(SysNotice sysNotice) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByMonth(SysNotice sysNotice) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByYear(SysNotice sysNotice) {
        return RespVOBuilder.failure("system-service服务不可用");
    }
}