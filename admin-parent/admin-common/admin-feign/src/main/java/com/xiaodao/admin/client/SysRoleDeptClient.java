package com.xiaodao.admin.client;

import com.github.pagehelper.PageInfo;
import com.xiaodao.feign.config.MultipartSupportConfig;
import com.xiaodao.core.result.RespDataVO;
import com.xiaodao.core.result.RespVO;
import com.xiaodao.core.result.RespVOBuilder;
import com.xiaodao.admin.entity.SysRoleDept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@FeignClient(value = "system-service", path = "/sysRoleDept", fallbackFactory = SysRoleDeptClientFallback.class, configuration = MultipartSupportConfig.class)
public interface SysRoleDeptClient {


    /**
     * 新增
     *
     * @param sysRoleDept
     * @return
     */
    @PostMapping("/insert")
    RespVO insert(@RequestBody SysRoleDept sysRoleDept);

    /**
     * 带有空值判断的新增
     *
     * @param sysRoleDept
     * @return
     */
    @PostMapping("/insertSelective")
    RespVO insertSelective(@RequestBody SysRoleDept sysRoleDept);

    /**
     * 批量新增
     *
     * @param list
     * @return
     */
    @PostMapping("/batchInsert")
    RespVO batchInsert(@RequestBody List<SysRoleDept> list);

    /**
     * 带有空值判断的新增
     *
     * @param list
     * @return
     */
    @PostMapping("/batchInsertSelective")
    RespVO batchInsertSelective(@RequestBody List<SysRoleDept> list);

    /**
     * 根据主键更新
     *
     * @param sysRoleDept
     * @return
     */
    @PutMapping("/updateByPrimaryKey")
    RespVO updateByPrimaryKey(@RequestBody SysRoleDept sysRoleDept);

    /**
     * 根据空值判断的主键更新
     *
     * @param sysRoleDept
     * @return
     */
    @PutMapping("/updateSelectiveByPrimaryKey")
    RespVO updateSelectiveByPrimaryKey(@RequestBody SysRoleDept sysRoleDept);

    /**
     * 批量更新
     *
     * @param list
     * @return
     */
    @PutMapping("/batchUpdate")
    RespVO batchUpdate(@RequestBody List<SysRoleDept> list);

    /**
     * 带有空值判断的批量更新
     *
     * @param list
     * @return
     */
    @PutMapping("/batchUpdateSelective")
    RespVO batchUpdateSelective(@RequestBody List<SysRoleDept> list);


    /**
     * 更新插入
     *
     * @param sysRoleDept
     * @return
     */
    @PostMapping("/upsert")
    RespVO upsert(@RequestBody SysRoleDept sysRoleDept);

    /**
     * 带有空值判断的更新插入
     *
     * @param sysRoleDept
     * @return
     */
    @PostMapping("/upsertSelective")
    RespVO upsertSelective(@RequestBody SysRoleDept sysRoleDept);


    /**
     * 批量更新插入
     *
     * @param list
     * @return
     */
    @PostMapping("/batchUpsert")
    RespVO batchUpsert(@RequestBody List<SysRoleDept> list);


    /**
     * 带有空值判断的批量更新插入
     *
     * @param list
     * @return
     */
    @PostMapping("/batchUpsertSelective")
    RespVO batchUpsertSelective(@RequestBody List<SysRoleDept> list);


    /**
     * 通过主键删除
     *
     * @param roleId
     * @return
     */
    @DeleteMapping("/{roleId}")
    RespVO deleteByPrimaryKey(@PathVariable(value = "roleId") Long roleId);

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
     * @param sysRoleDept
     * @return
     */
    @DeleteMapping("/delete")
    RespVO delete(@RequestBody SysRoleDept sysRoleDept);

    /**
     * 通过主键查询
     *
     * @param roleId
     * @return
     */
    @GetMapping("/{roleId}")
    RespVO<SysRoleDept> queryByPrimaryKey(@PathVariable(value = "roleId") Long roleId);


    /**
     * 通过主键批量查询
     *
     * @param list
     * @return
     */
    @PostMapping("/queryBatchPrimaryKeys")
    RespVO<RespDataVO<SysRoleDept>> queryBatchPrimaryKeys(@RequestBody List<Long> list);


    /**
     * 条件查询一个
     *
     * @param sysRoleDept
     * @return
     */
    @PostMapping("/queryOne")
    RespVO<SysRoleDept> queryOne(@RequestBody SysRoleDept sysRoleDept);

    /**
     * 条件查询
     *
     * @param sysRoleDept
     * @return
     */
    @PostMapping("/queryByCondition")
    RespVO<RespDataVO<SysRoleDept>> queryByCondition(@RequestBody SysRoleDept sysRoleDept);

    /**
     * 条件分页查询
     *
     * @param sysRoleDept
     * @return
     */
    @PostMapping("/queryPageByCondition")
    RespVO<PageInfo<SysRoleDept>> queryPageByCondition(@RequestBody SysRoleDept sysRoleDept);

    /**
     * 模糊查询
     *
     * @param sysRoleDept
     * @return
     */
    @PostMapping("/queryFuzzy")
    RespVO<RespDataVO<SysRoleDept>> queryFuzzy(@RequestBody SysRoleDept sysRoleDept);

    /**
     * 模糊分页查询
     *
     * @param sysRoleDept
     * @return
     */
    @PostMapping("/queryPageFuzzy")
    RespVO<PageInfo<SysRoleDept>> queryPageFuzzy(@RequestBody SysRoleDept sysRoleDept);

    /**
     * 模糊条件查询
     *
     * @param sysRoleDept
     * @return
     */
    @PostMapping("/queryByLikeCondition")
    RespVO<RespDataVO<SysRoleDept>> queryByLikeCondition(@RequestBody SysRoleDept sysRoleDept);

    /**
     * 模糊分页条件查询
     *
     * @param sysRoleDept
     * @return
     */
    @PostMapping("/queryPageByLikeCondition")
    RespVO<PageInfo<SysRoleDept>> queryPageByLikeCondition(@RequestBody SysRoleDept sysRoleDept);

    /**
     * 条件查询数量
     *
     * @param sysRoleDept
     * @return
     */
    @PostMapping("/queryCount")
    RespVO<Long> queryCount(@RequestBody SysRoleDept sysRoleDept);

    /**
     * 分组统计
     *
     * @param sysRoleDept
     * @return
     */
    @PostMapping("/statisticsGroup")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroup(@RequestBody SysRoleDept sysRoleDept);

    /**
     * 日统计
     *
     * @param sysRoleDept
     * @return
     */
    @PostMapping("/statisticsGroupByDay")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByDay(@RequestBody SysRoleDept sysRoleDept);

    /**
     * 月统计
     *
     * @param sysRoleDept
     * @return
     */
    @PostMapping("/statisticsGroupByMonth")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByMonth(@RequestBody SysRoleDept sysRoleDept);

    /**
     * 年统计
     *
     * @param sysRoleDept
     * @return
     */
    @PostMapping("/statisticsGroupByYear")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByYear(@RequestBody SysRoleDept sysRoleDept);

}

class SysRoleDeptClientFallback implements SysRoleDeptClient {
    @Override
    public RespVO insert(SysRoleDept sysRoleDept) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO insertSelective(SysRoleDept sysRoleDept) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchInsert(List<SysRoleDept> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchInsertSelective(List<SysRoleDept> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO updateByPrimaryKey(SysRoleDept sysRoleDept) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO updateSelectiveByPrimaryKey(SysRoleDept sysRoleDept) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpdate(List<SysRoleDept> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpdateSelective(List<SysRoleDept> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO upsert(SysRoleDept sysRoleDept) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO upsertSelective(SysRoleDept sysRoleDept) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpsert(List<SysRoleDept> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpsertSelective(List<SysRoleDept> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO deleteByPrimaryKey(Long roleId) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO deleteBatchByPrimaryKeys(List<Long> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO delete(SysRoleDept sysRoleDept) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<SysRoleDept> queryByPrimaryKey(Long roleId) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<SysRoleDept>> queryBatchPrimaryKeys(List<Long> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<SysRoleDept> queryOne(SysRoleDept sysRoleDept) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<SysRoleDept>> queryByCondition(SysRoleDept sysRoleDept) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<PageInfo<SysRoleDept>> queryPageByCondition(SysRoleDept sysRoleDept) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<SysRoleDept>> queryFuzzy(SysRoleDept sysRoleDept) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<PageInfo<SysRoleDept>> queryPageFuzzy(SysRoleDept sysRoleDept) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<SysRoleDept>> queryByLikeCondition(SysRoleDept sysRoleDept) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<PageInfo<SysRoleDept>> queryPageByLikeCondition(SysRoleDept sysRoleDept) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<Long> queryCount(SysRoleDept sysRoleDept) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroup(SysRoleDept sysRoleDept) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByDay(SysRoleDept sysRoleDept) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByMonth(SysRoleDept sysRoleDept) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByYear(SysRoleDept sysRoleDept) {
        return RespVOBuilder.failure("system-service服务不可用");
    }
}