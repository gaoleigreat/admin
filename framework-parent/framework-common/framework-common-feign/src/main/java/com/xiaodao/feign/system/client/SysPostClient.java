package com.xiaodao.feign.system.client;

import com.github.pagehelper.PageInfo;
import com.xiaodao.config.MultipartSupportConfig;
import com.xiaodao.core.result.RespDataVO;
import com.xiaodao.core.result.RespVO;
import com.xiaodao.core.result.RespVOBuilder;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import com.xiaodao.feign.system.entity.SysPost;

import java.util.List;
import java.util.Map;

@FeignClient(value = "system-service", path = "/sysPost", fallbackFactory = SysPostClientFallback.class, configuration = MultipartSupportConfig.class)
public interface SysPostClient {


    /**
     * 新增
     *
     * @param sysPost
     * @return
     */
    @PostMapping("/insert")
    RespVO insert(@RequestBody SysPost sysPost);

    /**
     * 带有空值判断的新增
     *
     * @param sysPost
     * @return
     */
    @PostMapping("/insertSelective")
    RespVO insertSelective(@RequestBody SysPost sysPost);

    /**
     * 批量新增
     *
     * @param list
     * @return
     */
    @PostMapping("/batchInsert")
    RespVO batchInsert(@RequestBody List<SysPost> list);

    /**
     * 带有空值判断的新增
     *
     * @param list
     * @return
     */
    @PostMapping("/batchInsertSelective")
    RespVO batchInsertSelective(@RequestBody List<SysPost> list);

    /**
     * 根据主键更新
     *
     * @param sysPost
     * @return
     */
    @PutMapping("/updateByPrimaryKey")
    RespVO updateByPrimaryKey(@RequestBody SysPost sysPost);

    /**
     * 根据空值判断的主键更新
     *
     * @param sysPost
     * @return
     */
    @PutMapping("/updateSelectiveByPrimaryKey")
    RespVO updateSelectiveByPrimaryKey(@RequestBody SysPost sysPost);

    /**
     * 批量更新
     *
     * @param list
     * @return
     */
    @PutMapping("/batchUpdate")
    RespVO batchUpdate(@RequestBody List<SysPost> list);

    /**
     * 带有空值判断的批量更新
     *
     * @param list
     * @return
     */
    @PutMapping("/batchUpdateSelective")
    RespVO batchUpdateSelective(@RequestBody List<SysPost> list);


    /**
     * 更新插入
     *
     * @param sysPost
     * @return
     */
    @PostMapping("/upsert")
    RespVO upsert(@RequestBody SysPost sysPost);

    /**
     * 带有空值判断的更新插入
     *
     * @param sysPost
     * @return
     */
    @PostMapping("/upsertSelective")
    RespVO upsertSelective(@RequestBody SysPost sysPost);


    /**
     * 批量更新插入
     *
     * @param list
     * @return
     */
    @PostMapping("/batchUpsert")
    RespVO batchUpsert(@RequestBody List<SysPost> list);


    /**
     * 带有空值判断的批量更新插入
     *
     * @param list
     * @return
     */
    @PostMapping("/batchUpsertSelective")
    RespVO batchUpsertSelective(@RequestBody List<SysPost> list);


    /**
     * 通过主键删除
     *
     * @param postId
     * @return
     */
    @DeleteMapping("/{postId}")
    RespVO deleteByPrimaryKey(@PathVariable(value = "postId") Long postId);

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
     * @param sysPost
     * @return
     */
    @DeleteMapping("/delete")
    RespVO delete(@RequestBody SysPost sysPost);

    /**
     * 通过主键查询
     *
     * @param postId
     * @return
     */
    @GetMapping("/{postId}")
    RespVO<SysPost> queryByPrimaryKey(@PathVariable(value = "postId") Long postId);


    /**
     * 通过主键批量查询
     *
     * @param list
     * @return
     */
    @PostMapping("/queryBatchPrimaryKeys")
    RespVO<RespDataVO<SysPost>> queryBatchPrimaryKeys(@RequestBody List<Long> list);


    /**
     * 条件查询一个
     *
     * @param sysPost
     * @return
     */
    @PostMapping("/queryOne")
    RespVO<SysPost> queryOne(@RequestBody SysPost sysPost);

    /**
     * 条件查询
     *
     * @param sysPost
     * @return
     */
    @PostMapping("/queryByCondition")
    RespVO<RespDataVO<SysPost>> queryByCondition(@RequestBody SysPost sysPost);

    /**
     * 条件分页查询
     *
     * @param sysPost
     * @return
     */
    @PostMapping("/queryPageByCondition")
    RespVO<PageInfo<SysPost>> queryPageByCondition(@RequestBody SysPost sysPost);

    /**
     * 模糊查询
     *
     * @param sysPost
     * @return
     */
    @PostMapping("/queryFuzzy")
    RespVO<RespDataVO<SysPost>> queryFuzzy(@RequestBody SysPost sysPost);

    /**
     * 模糊分页查询
     *
     * @param sysPost
     * @return
     */
    @PostMapping("/queryPageFuzzy")
    RespVO<PageInfo<SysPost>> queryPageFuzzy(@RequestBody SysPost sysPost);

    /**
     * 模糊条件查询
     *
     * @param sysPost
     * @return
     */
    @PostMapping("/queryByLikeCondition")
    RespVO<RespDataVO<SysPost>> queryByLikeCondition(@RequestBody SysPost sysPost);

    /**
     * 模糊分页条件查询
     *
     * @param sysPost
     * @return
     */
    @PostMapping("/queryPageByLikeCondition")
    RespVO<PageInfo<SysPost>> queryPageByLikeCondition(@RequestBody SysPost sysPost);

    /**
     * 条件查询数量
     *
     * @param sysPost
     * @return
     */
    @PostMapping("/queryCount")
    RespVO<Long> queryCount(@RequestBody SysPost sysPost);

    /**
     * 分组统计
     *
     * @param sysPost
     * @return
     */
    @PostMapping("/statisticsGroup")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroup(@RequestBody SysPost sysPost);

    /**
     * 日统计
     *
     * @param sysPost
     * @return
     */
    @PostMapping("/statisticsGroupByDay")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByDay(@RequestBody SysPost sysPost);

    /**
     * 月统计
     *
     * @param sysPost
     * @return
     */
    @PostMapping("/statisticsGroupByMonth")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByMonth(@RequestBody SysPost sysPost);

    /**
     * 年统计
     *
     * @param sysPost
     * @return
     */
    @PostMapping("/statisticsGroupByYear")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByYear(@RequestBody SysPost sysPost);

}

class SysPostClientFallback implements SysPostClient {
    @Override
    public RespVO insert(SysPost sysPost) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO insertSelective(SysPost sysPost) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchInsert(List<SysPost> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchInsertSelective(List<SysPost> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO updateByPrimaryKey(SysPost sysPost) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO updateSelectiveByPrimaryKey(SysPost sysPost) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpdate(List<SysPost> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpdateSelective(List<SysPost> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO upsert(SysPost sysPost) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO upsertSelective(SysPost sysPost) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpsert(List<SysPost> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpsertSelective(List<SysPost> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO deleteByPrimaryKey(Long postId) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO deleteBatchByPrimaryKeys(List<Long> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO delete(SysPost sysPost) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<SysPost> queryByPrimaryKey(Long postId) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<SysPost>> queryBatchPrimaryKeys(List<Long> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<SysPost> queryOne(SysPost sysPost) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<SysPost>> queryByCondition(SysPost sysPost) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<PageInfo<SysPost>> queryPageByCondition(SysPost sysPost) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<SysPost>> queryFuzzy(SysPost sysPost) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<PageInfo<SysPost>> queryPageFuzzy(SysPost sysPost) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<SysPost>> queryByLikeCondition(SysPost sysPost) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<PageInfo<SysPost>> queryPageByLikeCondition(SysPost sysPost) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<Long> queryCount(SysPost sysPost) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroup(SysPost sysPost) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByDay(SysPost sysPost) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByMonth(SysPost sysPost) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByYear(SysPost sysPost) {
        return RespVOBuilder.failure("system-service服务不可用");
    }
}