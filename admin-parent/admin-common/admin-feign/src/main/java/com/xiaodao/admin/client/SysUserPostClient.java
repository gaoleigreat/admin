package com.xiaodao.admin.client;

import com.github.pagehelper.PageInfo;
import com.xiaodao.feign.config.MultipartSupportConfig;
import com.xiaodao.core.result.RespDataVO;
import com.xiaodao.core.result.RespVO;
import com.xiaodao.core.result.RespVOBuilder;
import com.xiaodao.admin.entity.SysUserPost;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@FeignClient(value = "system-service", path = "/sysUserPost", fallbackFactory = SysUserPostClientFallback.class, configuration = MultipartSupportConfig.class)
public interface SysUserPostClient {


    /**
     * 新增
     *
     * @param sysUserPost
     * @return
     */
    @PostMapping("/insert")
    RespVO insert(@RequestBody SysUserPost sysUserPost);

    /**
     * 带有空值判断的新增
     *
     * @param sysUserPost
     * @return
     */
    @PostMapping("/insertSelective")
    RespVO insertSelective(@RequestBody SysUserPost sysUserPost);

    /**
     * 批量新增
     *
     * @param list
     * @return
     */
    @PostMapping("/batchInsert")
    RespVO batchInsert(@RequestBody List<SysUserPost> list);

    /**
     * 带有空值判断的新增
     *
     * @param list
     * @return
     */
    @PostMapping("/batchInsertSelective")
    RespVO batchInsertSelective(@RequestBody List<SysUserPost> list);

    /**
     * 根据主键更新
     *
     * @param sysUserPost
     * @return
     */
    @PutMapping("/updateByPrimaryKey")
    RespVO updateByPrimaryKey(@RequestBody SysUserPost sysUserPost);

    /**
     * 根据空值判断的主键更新
     *
     * @param sysUserPost
     * @return
     */
    @PutMapping("/updateSelectiveByPrimaryKey")
    RespVO updateSelectiveByPrimaryKey(@RequestBody SysUserPost sysUserPost);

    /**
     * 批量更新
     *
     * @param list
     * @return
     */
    @PutMapping("/batchUpdate")
    RespVO batchUpdate(@RequestBody List<SysUserPost> list);

    /**
     * 带有空值判断的批量更新
     *
     * @param list
     * @return
     */
    @PutMapping("/batchUpdateSelective")
    RespVO batchUpdateSelective(@RequestBody List<SysUserPost> list);


    /**
     * 更新插入
     *
     * @param sysUserPost
     * @return
     */
    @PostMapping("/upsert")
    RespVO upsert(@RequestBody SysUserPost sysUserPost);

    /**
     * 带有空值判断的更新插入
     *
     * @param sysUserPost
     * @return
     */
    @PostMapping("/upsertSelective")
    RespVO upsertSelective(@RequestBody SysUserPost sysUserPost);


    /**
     * 批量更新插入
     *
     * @param list
     * @return
     */
    @PostMapping("/batchUpsert")
    RespVO batchUpsert(@RequestBody List<SysUserPost> list);


    /**
     * 带有空值判断的批量更新插入
     *
     * @param list
     * @return
     */
    @PostMapping("/batchUpsertSelective")
    RespVO batchUpsertSelective(@RequestBody List<SysUserPost> list);


    /**
     * 通过主键删除
     *
     * @param userId
     * @return
     */
    @DeleteMapping("/{userId}")
    RespVO deleteByPrimaryKey(@PathVariable(value = "userId") Integer userId);

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
     * @param sysUserPost
     * @return
     */
    @DeleteMapping("/delete")
    RespVO delete(@RequestBody SysUserPost sysUserPost);

    /**
     * 通过主键查询
     *
     * @param userId
     * @return
     */
    @GetMapping("/{userId}")
    RespVO<SysUserPost> queryByPrimaryKey(@PathVariable(value = "userId") Integer userId);


    /**
     * 通过主键批量查询
     *
     * @param list
     * @return
     */
    @PostMapping("/queryBatchPrimaryKeys")
    RespVO<RespDataVO<SysUserPost>> queryBatchPrimaryKeys(@RequestBody List<Long> list);


    /**
     * 条件查询一个
     *
     * @param sysUserPost
     * @return
     */
    @PostMapping("/queryOne")
    RespVO<SysUserPost> queryOne(@RequestBody SysUserPost sysUserPost);

    /**
     * 条件查询
     *
     * @param sysUserPost
     * @return
     */
    @PostMapping("/queryByCondition")
    RespVO<RespDataVO<SysUserPost>> queryByCondition(@RequestBody SysUserPost sysUserPost);

    /**
     * 条件分页查询
     *
     * @param sysUserPost
     * @return
     */
    @PostMapping("/queryPageByCondition")
    RespVO<PageInfo<SysUserPost>> queryPageByCondition(@RequestBody SysUserPost sysUserPost);

    /**
     * 模糊查询
     *
     * @param sysUserPost
     * @return
     */
    @PostMapping("/queryFuzzy")
    RespVO<RespDataVO<SysUserPost>> queryFuzzy(@RequestBody SysUserPost sysUserPost);

    /**
     * 模糊分页查询
     *
     * @param sysUserPost
     * @return
     */
    @PostMapping("/queryPageFuzzy")
    RespVO<PageInfo<SysUserPost>> queryPageFuzzy(@RequestBody SysUserPost sysUserPost);

    /**
     * 模糊条件查询
     *
     * @param sysUserPost
     * @return
     */
    @PostMapping("/queryByLikeCondition")
    RespVO<RespDataVO<SysUserPost>> queryByLikeCondition(@RequestBody SysUserPost sysUserPost);

    /**
     * 模糊分页条件查询
     *
     * @param sysUserPost
     * @return
     */
    @PostMapping("/queryPageByLikeCondition")
    RespVO<PageInfo<SysUserPost>> queryPageByLikeCondition(@RequestBody SysUserPost sysUserPost);

    /**
     * 条件查询数量
     *
     * @param sysUserPost
     * @return
     */
    @PostMapping("/queryCount")
    RespVO<Long> queryCount(@RequestBody SysUserPost sysUserPost);

    /**
     * 分组统计
     *
     * @param sysUserPost
     * @return
     */
    @PostMapping("/statisticsGroup")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroup(@RequestBody SysUserPost sysUserPost);

    /**
     * 日统计
     *
     * @param sysUserPost
     * @return
     */
    @PostMapping("/statisticsGroupByDay")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByDay(@RequestBody SysUserPost sysUserPost);

    /**
     * 月统计
     *
     * @param sysUserPost
     * @return
     */
    @PostMapping("/statisticsGroupByMonth")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByMonth(@RequestBody SysUserPost sysUserPost);

    /**
     * 年统计
     *
     * @param sysUserPost
     * @return
     */
    @PostMapping("/statisticsGroupByYear")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByYear(@RequestBody SysUserPost sysUserPost);

}

class SysUserPostClientFallback implements SysUserPostClient {
    @Override
    public RespVO insert(SysUserPost sysUserPost) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO insertSelective(SysUserPost sysUserPost) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchInsert(List<SysUserPost> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchInsertSelective(List<SysUserPost> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO updateByPrimaryKey(SysUserPost sysUserPost) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO updateSelectiveByPrimaryKey(SysUserPost sysUserPost) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpdate(List<SysUserPost> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpdateSelective(List<SysUserPost> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO upsert(SysUserPost sysUserPost) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO upsertSelective(SysUserPost sysUserPost) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpsert(List<SysUserPost> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpsertSelective(List<SysUserPost> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO deleteByPrimaryKey(Integer userId) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO deleteBatchByPrimaryKeys(List<Long> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO delete(SysUserPost sysUserPost) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<SysUserPost> queryByPrimaryKey(Integer userId) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<SysUserPost>> queryBatchPrimaryKeys(List<Long> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<SysUserPost> queryOne(SysUserPost sysUserPost) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<SysUserPost>> queryByCondition(SysUserPost sysUserPost) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<PageInfo<SysUserPost>> queryPageByCondition(SysUserPost sysUserPost) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<SysUserPost>> queryFuzzy(SysUserPost sysUserPost) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<PageInfo<SysUserPost>> queryPageFuzzy(SysUserPost sysUserPost) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<SysUserPost>> queryByLikeCondition(SysUserPost sysUserPost) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<PageInfo<SysUserPost>> queryPageByLikeCondition(SysUserPost sysUserPost) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<Long> queryCount(SysUserPost sysUserPost) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroup(SysUserPost sysUserPost) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByDay(SysUserPost sysUserPost) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByMonth(SysUserPost sysUserPost) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByYear(SysUserPost sysUserPost) {
        return RespVOBuilder.failure("system-service服务不可用");
    }
}