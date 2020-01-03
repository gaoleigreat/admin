package com.xiaodao.admin.client;

import com.github.pagehelper.PageInfo;
import com.xiaodao.feign.config.MultipartSupportConfig;
import com.xiaodao.core.result.RespDataVO;
import com.xiaodao.core.result.RespVO;
import com.xiaodao.core.result.RespVOBuilder;
import com.xiaodao.admin.entity.SysRoleMenu;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@FeignClient(value = "system-service", path = "/sysRoleMenu", fallbackFactory = SysRoleMenuClientFallback.class, configuration = MultipartSupportConfig.class)
public interface SysRoleMenuClient {


    /**
     * 新增
     *
     * @param sysRoleMenu
     * @return
     */
    @PostMapping("/insert")
    RespVO insert(@RequestBody SysRoleMenu sysRoleMenu);

    /**
     * 带有空值判断的新增
     *
     * @param sysRoleMenu
     * @return
     */
    @PostMapping("/insertSelective")
    RespVO insertSelective(@RequestBody SysRoleMenu sysRoleMenu);

    /**
     * 批量新增
     *
     * @param list
     * @return
     */
    @PostMapping("/batchInsert")
    RespVO batchInsert(@RequestBody List<SysRoleMenu> list);

    /**
     * 带有空值判断的新增
     *
     * @param list
     * @return
     */
    @PostMapping("/batchInsertSelective")
    RespVO batchInsertSelective(@RequestBody List<SysRoleMenu> list);

    /**
     * 根据主键更新
     *
     * @param sysRoleMenu
     * @return
     */
    @PutMapping("/updateByPrimaryKey")
    RespVO updateByPrimaryKey(@RequestBody SysRoleMenu sysRoleMenu);

    /**
     * 根据空值判断的主键更新
     *
     * @param sysRoleMenu
     * @return
     */
    @PutMapping("/updateSelectiveByPrimaryKey")
    RespVO updateSelectiveByPrimaryKey(@RequestBody SysRoleMenu sysRoleMenu);

    /**
     * 批量更新
     *
     * @param list
     * @return
     */
    @PutMapping("/batchUpdate")
    RespVO batchUpdate(@RequestBody List<SysRoleMenu> list);

    /**
     * 带有空值判断的批量更新
     *
     * @param list
     * @return
     */
    @PutMapping("/batchUpdateSelective")
    RespVO batchUpdateSelective(@RequestBody List<SysRoleMenu> list);


    /**
     * 更新插入
     *
     * @param sysRoleMenu
     * @return
     */
    @PostMapping("/upsert")
    RespVO upsert(@RequestBody SysRoleMenu sysRoleMenu);

    /**
     * 带有空值判断的更新插入
     *
     * @param sysRoleMenu
     * @return
     */
    @PostMapping("/upsertSelective")
    RespVO upsertSelective(@RequestBody SysRoleMenu sysRoleMenu);


    /**
     * 批量更新插入
     *
     * @param list
     * @return
     */
    @PostMapping("/batchUpsert")
    RespVO batchUpsert(@RequestBody List<SysRoleMenu> list);


    /**
     * 带有空值判断的批量更新插入
     *
     * @param list
     * @return
     */
    @PostMapping("/batchUpsertSelective")
    RespVO batchUpsertSelective(@RequestBody List<SysRoleMenu> list);


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
     * @param sysRoleMenu
     * @return
     */
    @DeleteMapping("/delete")
    RespVO delete(@RequestBody SysRoleMenu sysRoleMenu);

    /**
     * 通过主键查询
     *
     * @param roleId
     * @return
     */
    @GetMapping("/{roleId}")
    RespVO<SysRoleMenu> queryByPrimaryKey(@PathVariable(value = "roleId") Long roleId);


    /**
     * 通过主键批量查询
     *
     * @param list
     * @return
     */
    @PostMapping("/queryBatchPrimaryKeys")
    RespVO<RespDataVO<SysRoleMenu>> queryBatchPrimaryKeys(@RequestBody List<Long> list);


    /**
     * 条件查询一个
     *
     * @param sysRoleMenu
     * @return
     */
    @PostMapping("/queryOne")
    RespVO<SysRoleMenu> queryOne(@RequestBody SysRoleMenu sysRoleMenu);

    /**
     * 条件查询
     *
     * @param sysRoleMenu
     * @return
     */
    @PostMapping("/queryByCondition")
    RespVO<RespDataVO<SysRoleMenu>> queryByCondition(@RequestBody SysRoleMenu sysRoleMenu);

    /**
     * 条件分页查询
     *
     * @param sysRoleMenu
     * @return
     */
    @PostMapping("/queryPageByCondition")
    RespVO<PageInfo<SysRoleMenu>> queryPageByCondition(@RequestBody SysRoleMenu sysRoleMenu);

    /**
     * 模糊查询
     *
     * @param sysRoleMenu
     * @return
     */
    @PostMapping("/queryFuzzy")
    RespVO<RespDataVO<SysRoleMenu>> queryFuzzy(@RequestBody SysRoleMenu sysRoleMenu);

    /**
     * 模糊分页查询
     *
     * @param sysRoleMenu
     * @return
     */
    @PostMapping("/queryPageFuzzy")
    RespVO<PageInfo<SysRoleMenu>> queryPageFuzzy(@RequestBody SysRoleMenu sysRoleMenu);

    /**
     * 模糊条件查询
     *
     * @param sysRoleMenu
     * @return
     */
    @PostMapping("/queryByLikeCondition")
    RespVO<RespDataVO<SysRoleMenu>> queryByLikeCondition(@RequestBody SysRoleMenu sysRoleMenu);

    /**
     * 模糊分页条件查询
     *
     * @param sysRoleMenu
     * @return
     */
    @PostMapping("/queryPageByLikeCondition")
    RespVO<PageInfo<SysRoleMenu>> queryPageByLikeCondition(@RequestBody SysRoleMenu sysRoleMenu);

    /**
     * 条件查询数量
     *
     * @param sysRoleMenu
     * @return
     */
    @PostMapping("/queryCount")
    RespVO<Long> queryCount(@RequestBody SysRoleMenu sysRoleMenu);

    /**
     * 分组统计
     *
     * @param sysRoleMenu
     * @return
     */
    @PostMapping("/statisticsGroup")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroup(@RequestBody SysRoleMenu sysRoleMenu);

    /**
     * 日统计
     *
     * @param sysRoleMenu
     * @return
     */
    @PostMapping("/statisticsGroupByDay")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByDay(@RequestBody SysRoleMenu sysRoleMenu);

    /**
     * 月统计
     *
     * @param sysRoleMenu
     * @return
     */
    @PostMapping("/statisticsGroupByMonth")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByMonth(@RequestBody SysRoleMenu sysRoleMenu);

    /**
     * 年统计
     *
     * @param sysRoleMenu
     * @return
     */
    @PostMapping("/statisticsGroupByYear")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByYear(@RequestBody SysRoleMenu sysRoleMenu);

}

class SysRoleMenuClientFallback implements SysRoleMenuClient {
    @Override
    public RespVO insert(SysRoleMenu sysRoleMenu) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO insertSelective(SysRoleMenu sysRoleMenu) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchInsert(List<SysRoleMenu> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchInsertSelective(List<SysRoleMenu> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO updateByPrimaryKey(SysRoleMenu sysRoleMenu) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO updateSelectiveByPrimaryKey(SysRoleMenu sysRoleMenu) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpdate(List<SysRoleMenu> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpdateSelective(List<SysRoleMenu> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO upsert(SysRoleMenu sysRoleMenu) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO upsertSelective(SysRoleMenu sysRoleMenu) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpsert(List<SysRoleMenu> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpsertSelective(List<SysRoleMenu> list) {
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
    public RespVO delete(SysRoleMenu sysRoleMenu) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<SysRoleMenu> queryByPrimaryKey(Long roleId) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<SysRoleMenu>> queryBatchPrimaryKeys(List<Long> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<SysRoleMenu> queryOne(SysRoleMenu sysRoleMenu) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<SysRoleMenu>> queryByCondition(SysRoleMenu sysRoleMenu) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<PageInfo<SysRoleMenu>> queryPageByCondition(SysRoleMenu sysRoleMenu) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<SysRoleMenu>> queryFuzzy(SysRoleMenu sysRoleMenu) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<PageInfo<SysRoleMenu>> queryPageFuzzy(SysRoleMenu sysRoleMenu) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<SysRoleMenu>> queryByLikeCondition(SysRoleMenu sysRoleMenu) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<PageInfo<SysRoleMenu>> queryPageByLikeCondition(SysRoleMenu sysRoleMenu) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<Long> queryCount(SysRoleMenu sysRoleMenu) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroup(SysRoleMenu sysRoleMenu) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByDay(SysRoleMenu sysRoleMenu) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByMonth(SysRoleMenu sysRoleMenu) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByYear(SysRoleMenu sysRoleMenu) {
        return RespVOBuilder.failure("system-service服务不可用");
    }
}