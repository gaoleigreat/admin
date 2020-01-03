package com.xiaodao.admin.client;

import com.github.pagehelper.PageInfo;
import com.xiaodao.feign.config.MultipartSupportConfig;
import com.xiaodao.core.result.RespDataVO;
import com.xiaodao.core.result.RespVO;
import com.xiaodao.core.result.RespVOBuilder;
import com.xiaodao.admin.entity.SysUserOnline;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@FeignClient(value = "system-service", path = "/sysUserOnline", fallbackFactory = SysUserOnlineClientFallback.class, configuration = MultipartSupportConfig.class)
public interface SysUserOnlineClient {


    /**
     * 新增
     *
     * @param sysUserOnline
     * @return
     */
    @PostMapping("/insert")
    RespVO insert(@RequestBody SysUserOnline sysUserOnline);

    /**
     * 带有空值判断的新增
     *
     * @param sysUserOnline
     * @return
     */
    @PostMapping("/insertSelective")
    RespVO insertSelective(@RequestBody SysUserOnline sysUserOnline);

    /**
     * 批量新增
     *
     * @param list
     * @return
     */
    @PostMapping("/batchInsert")
    RespVO batchInsert(@RequestBody List<SysUserOnline> list);

    /**
     * 带有空值判断的新增
     *
     * @param list
     * @return
     */
    @PostMapping("/batchInsertSelective")
    RespVO batchInsertSelective(@RequestBody List<SysUserOnline> list);

    /**
     * 根据主键更新
     *
     * @param sysUserOnline
     * @return
     */
    @PutMapping("/updateByPrimaryKey")
    RespVO updateByPrimaryKey(@RequestBody SysUserOnline sysUserOnline);

    /**
     * 根据空值判断的主键更新
     *
     * @param sysUserOnline
     * @return
     */
    @PutMapping("/updateSelectiveByPrimaryKey")
    RespVO updateSelectiveByPrimaryKey(@RequestBody SysUserOnline sysUserOnline);

    /**
     * 批量更新
     *
     * @param list
     * @return
     */
    @PutMapping("/batchUpdate")
    RespVO batchUpdate(@RequestBody List<SysUserOnline> list);

    /**
     * 带有空值判断的批量更新
     *
     * @param list
     * @return
     */
    @PutMapping("/batchUpdateSelective")
    RespVO batchUpdateSelective(@RequestBody List<SysUserOnline> list);


    /**
     * 更新插入
     *
     * @param sysUserOnline
     * @return
     */
    @PostMapping("/upsert")
    RespVO upsert(@RequestBody SysUserOnline sysUserOnline);

    /**
     * 带有空值判断的更新插入
     *
     * @param sysUserOnline
     * @return
     */
    @PostMapping("/upsertSelective")
    RespVO upsertSelective(@RequestBody SysUserOnline sysUserOnline);


    /**
     * 批量更新插入
     *
     * @param list
     * @return
     */
    @PostMapping("/batchUpsert")
    RespVO batchUpsert(@RequestBody List<SysUserOnline> list);


    /**
     * 带有空值判断的批量更新插入
     *
     * @param list
     * @return
     */
    @PostMapping("/batchUpsertSelective")
    RespVO batchUpsertSelective(@RequestBody List<SysUserOnline> list);


    /**
     * 通过主键删除
     *
     * @param sessionid
     * @return
     */
    @DeleteMapping("/{sessionid}")
    RespVO deleteByPrimaryKey(@PathVariable(value = "sessionid") String sessionid);

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
     * @param sysUserOnline
     * @return
     */
    @DeleteMapping("/delete")
    RespVO delete(@RequestBody SysUserOnline sysUserOnline);

    /**
     * 通过主键查询
     *
     * @param sessionid
     * @return
     */
    @GetMapping("/{sessionid}")
    RespVO<SysUserOnline> queryByPrimaryKey(@PathVariable(value = "sessionid") String sessionid);


    /**
     * 通过主键批量查询
     *
     * @param list
     * @return
     */
    @PostMapping("/queryBatchPrimaryKeys")
    RespVO<RespDataVO<SysUserOnline>> queryBatchPrimaryKeys(@RequestBody List<Long> list);


    /**
     * 条件查询一个
     *
     * @param sysUserOnline
     * @return
     */
    @PostMapping("/queryOne")
    RespVO<SysUserOnline> queryOne(@RequestBody SysUserOnline sysUserOnline);

    /**
     * 条件查询
     *
     * @param sysUserOnline
     * @return
     */
    @PostMapping("/queryByCondition")
    RespVO<RespDataVO<SysUserOnline>> queryByCondition(@RequestBody SysUserOnline sysUserOnline);

    /**
     * 条件分页查询
     *
     * @param sysUserOnline
     * @return
     */
    @PostMapping("/queryPageByCondition")
    RespVO<PageInfo<SysUserOnline>> queryPageByCondition(@RequestBody SysUserOnline sysUserOnline);

    /**
     * 模糊查询
     *
     * @param sysUserOnline
     * @return
     */
    @PostMapping("/queryFuzzy")
    RespVO<RespDataVO<SysUserOnline>> queryFuzzy(@RequestBody SysUserOnline sysUserOnline);

    /**
     * 模糊分页查询
     *
     * @param sysUserOnline
     * @return
     */
    @PostMapping("/queryPageFuzzy")
    RespVO<PageInfo<SysUserOnline>> queryPageFuzzy(@RequestBody SysUserOnline sysUserOnline);

    /**
     * 模糊条件查询
     *
     * @param sysUserOnline
     * @return
     */
    @PostMapping("/queryByLikeCondition")
    RespVO<RespDataVO<SysUserOnline>> queryByLikeCondition(@RequestBody SysUserOnline sysUserOnline);

    /**
     * 模糊分页条件查询
     *
     * @param sysUserOnline
     * @return
     */
    @PostMapping("/queryPageByLikeCondition")
    RespVO<PageInfo<SysUserOnline>> queryPageByLikeCondition(@RequestBody SysUserOnline sysUserOnline);

    /**
     * 条件查询数量
     *
     * @param sysUserOnline
     * @return
     */
    @PostMapping("/queryCount")
    RespVO<Long> queryCount(@RequestBody SysUserOnline sysUserOnline);

    /**
     * 分组统计
     *
     * @param sysUserOnline
     * @return
     */
    @PostMapping("/statisticsGroup")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroup(@RequestBody SysUserOnline sysUserOnline);

    /**
     * 日统计
     *
     * @param sysUserOnline
     * @return
     */
    @PostMapping("/statisticsGroupByDay")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByDay(@RequestBody SysUserOnline sysUserOnline);

    /**
     * 月统计
     *
     * @param sysUserOnline
     * @return
     */
    @PostMapping("/statisticsGroupByMonth")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByMonth(@RequestBody SysUserOnline sysUserOnline);

    /**
     * 年统计
     *
     * @param sysUserOnline
     * @return
     */
    @PostMapping("/statisticsGroupByYear")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByYear(@RequestBody SysUserOnline sysUserOnline);

}

class SysUserOnlineClientFallback implements SysUserOnlineClient {
    @Override
    public RespVO insert(SysUserOnline sysUserOnline) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO insertSelective(SysUserOnline sysUserOnline) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchInsert(List<SysUserOnline> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchInsertSelective(List<SysUserOnline> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO updateByPrimaryKey(SysUserOnline sysUserOnline) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO updateSelectiveByPrimaryKey(SysUserOnline sysUserOnline) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpdate(List<SysUserOnline> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpdateSelective(List<SysUserOnline> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO upsert(SysUserOnline sysUserOnline) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO upsertSelective(SysUserOnline sysUserOnline) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpsert(List<SysUserOnline> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpsertSelective(List<SysUserOnline> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO deleteByPrimaryKey(String sessionid) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO deleteBatchByPrimaryKeys(List<Long> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO delete(SysUserOnline sysUserOnline) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<SysUserOnline> queryByPrimaryKey(String sessionid) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<SysUserOnline>> queryBatchPrimaryKeys(List<Long> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<SysUserOnline> queryOne(SysUserOnline sysUserOnline) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<SysUserOnline>> queryByCondition(SysUserOnline sysUserOnline) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<PageInfo<SysUserOnline>> queryPageByCondition(SysUserOnline sysUserOnline) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<SysUserOnline>> queryFuzzy(SysUserOnline sysUserOnline) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<PageInfo<SysUserOnline>> queryPageFuzzy(SysUserOnline sysUserOnline) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<SysUserOnline>> queryByLikeCondition(SysUserOnline sysUserOnline) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<PageInfo<SysUserOnline>> queryPageByLikeCondition(SysUserOnline sysUserOnline) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<Long> queryCount(SysUserOnline sysUserOnline) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroup(SysUserOnline sysUserOnline) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByDay(SysUserOnline sysUserOnline) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByMonth(SysUserOnline sysUserOnline) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByYear(SysUserOnline sysUserOnline) {
        return RespVOBuilder.failure("system-service服务不可用");
    }
}