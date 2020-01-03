package com.xiaodao.admin.client;

import com.github.pagehelper.PageInfo;
import com.xiaodao.feign.config.MultipartSupportConfig;
import com.xiaodao.core.result.RespDataVO;
import com.xiaodao.core.result.RespVO;
import com.xiaodao.core.result.RespVOBuilder;
import com.xiaodao.admin.entity.SysMenu;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@FeignClient(value = "system-service", path = "/sysMenu", fallbackFactory = SysMenuClientFallback.class, configuration = MultipartSupportConfig.class)
public interface SysMenuClient {


    /**
     * 新增
     *
     * @param sysMenu
     * @return
     */
    @PostMapping("/insert")
    RespVO insert(@RequestBody SysMenu sysMenu);

    /**
     * 带有空值判断的新增
     *
     * @param sysMenu
     * @return
     */
    @PostMapping("/insertSelective")
    RespVO insertSelective(@RequestBody SysMenu sysMenu);

    /**
     * 批量新增
     *
     * @param list
     * @return
     */
    @PostMapping("/batchInsert")
    RespVO batchInsert(@RequestBody List<SysMenu> list);

    /**
     * 带有空值判断的新增
     *
     * @param list
     * @return
     */
    @PostMapping("/batchInsertSelective")
    RespVO batchInsertSelective(@RequestBody List<SysMenu> list);

    /**
     * 根据主键更新
     *
     * @param sysMenu
     * @return
     */
    @PutMapping("/updateByPrimaryKey")
    RespVO updateByPrimaryKey(@RequestBody SysMenu sysMenu);

    /**
     * 根据空值判断的主键更新
     *
     * @param sysMenu
     * @return
     */
    @PutMapping("/updateSelectiveByPrimaryKey")
    RespVO updateSelectiveByPrimaryKey(@RequestBody SysMenu sysMenu);

    /**
     * 批量更新
     *
     * @param list
     * @return
     */
    @PutMapping("/batchUpdate")
    RespVO batchUpdate(@RequestBody List<SysMenu> list);

    /**
     * 带有空值判断的批量更新
     *
     * @param list
     * @return
     */
    @PutMapping("/batchUpdateSelective")
    RespVO batchUpdateSelective(@RequestBody List<SysMenu> list);


    /**
     * 更新插入
     *
     * @param sysMenu
     * @return
     */
    @PostMapping("/upsert")
    RespVO upsert(@RequestBody SysMenu sysMenu);

    /**
     * 带有空值判断的更新插入
     *
     * @param sysMenu
     * @return
     */
    @PostMapping("/upsertSelective")
    RespVO upsertSelective(@RequestBody SysMenu sysMenu);


    /**
     * 批量更新插入
     *
     * @param list
     * @return
     */
    @PostMapping("/batchUpsert")
    RespVO batchUpsert(@RequestBody List<SysMenu> list);


    /**
     * 带有空值判断的批量更新插入
     *
     * @param list
     * @return
     */
    @PostMapping("/batchUpsertSelective")
    RespVO batchUpsertSelective(@RequestBody List<SysMenu> list);


    /**
     * 通过主键删除
     *
     * @param menuId
     * @return
     */
    @DeleteMapping("/{menuId}")
    RespVO deleteByPrimaryKey(@PathVariable(value = "menuId") Long menuId);

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
     * @param sysMenu
     * @return
     */
    @DeleteMapping("/delete")
    RespVO delete(@RequestBody SysMenu sysMenu);

    /**
     * 通过主键查询
     *
     * @param menuId
     * @return
     */
    @GetMapping("/{menuId}")
    RespVO<SysMenu> queryByPrimaryKey(@PathVariable(value = "menuId") Long menuId);


    /**
     * 通过主键批量查询
     *
     * @param list
     * @return
     */
    @PostMapping("/queryBatchPrimaryKeys")
    RespVO<RespDataVO<SysMenu>> queryBatchPrimaryKeys(@RequestBody List<Long> list);


    /**
     * 条件查询一个
     *
     * @param sysMenu
     * @return
     */
    @PostMapping("/queryOne")
    RespVO<SysMenu> queryOne(@RequestBody SysMenu sysMenu);

    /**
     * 条件查询
     *
     * @param sysMenu
     * @return
     */
    @PostMapping("/queryByCondition")
    RespVO<RespDataVO<SysMenu>> queryByCondition(@RequestBody SysMenu sysMenu);

    /**
     * 条件分页查询
     *
     * @param sysMenu
     * @return
     */
    @PostMapping("/queryPageByCondition")
    RespVO<PageInfo<SysMenu>> queryPageByCondition(@RequestBody SysMenu sysMenu);

    /**
     * 模糊查询
     *
     * @param sysMenu
     * @return
     */
    @PostMapping("/queryFuzzy")
    RespVO<RespDataVO<SysMenu>> queryFuzzy(@RequestBody SysMenu sysMenu);

    /**
     * 模糊分页查询
     *
     * @param sysMenu
     * @return
     */
    @PostMapping("/queryPageFuzzy")
    RespVO<PageInfo<SysMenu>> queryPageFuzzy(@RequestBody SysMenu sysMenu);

    /**
     * 模糊条件查询
     *
     * @param sysMenu
     * @return
     */
    @PostMapping("/queryByLikeCondition")
    RespVO<RespDataVO<SysMenu>> queryByLikeCondition(@RequestBody SysMenu sysMenu);

    /**
     * 模糊分页条件查询
     *
     * @param sysMenu
     * @return
     */
    @PostMapping("/queryPageByLikeCondition")
    RespVO<PageInfo<SysMenu>> queryPageByLikeCondition(@RequestBody SysMenu sysMenu);

    /**
     * 条件查询数量
     *
     * @param sysMenu
     * @return
     */
    @PostMapping("/queryCount")
    RespVO<Long> queryCount(@RequestBody SysMenu sysMenu);

    /**
     * 分组统计
     *
     * @param sysMenu
     * @return
     */
    @PostMapping("/statisticsGroup")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroup(@RequestBody SysMenu sysMenu);

    /**
     * 日统计
     *
     * @param sysMenu
     * @return
     */
    @PostMapping("/statisticsGroupByDay")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByDay(@RequestBody SysMenu sysMenu);

    /**
     * 月统计
     *
     * @param sysMenu
     * @return
     */
    @PostMapping("/statisticsGroupByMonth")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByMonth(@RequestBody SysMenu sysMenu);

    /**
     * 年统计
     *
     * @param sysMenu
     * @return
     */
    @PostMapping("/statisticsGroupByYear")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByYear(@RequestBody SysMenu sysMenu);

    /**
     * 查询系统所有菜单（含按钮）
     *
     * @return 菜单列表
     */
    @GetMapping("/selectMenuAll")
    RespVO<RespDataVO<SysMenu>> selectMenuAll();


    /**
     * 查询系统正常显示菜单（不含按钮）
     *
     * @return 菜单列表
     */

    @GetMapping("/selectMenuNormalAll")
    RespVO<RespDataVO<SysMenu>> selectMenuNormalAll();


    /**
     * 根据用户ID查询菜单
     *
     * @param userId 用户ID
     * @return 菜单列表
     */
    @GetMapping("/selectMenusByUserId")
    RespVO<RespDataVO<SysMenu>> selectMenusByUserId(@RequestParam("userId") Long userId);


    /**
     * 根据用户ID查询权限
     *
     * @param userId 用户ID
     * @return 权限列表
     */
    @GetMapping("/selectPermsByUserId")
    RespVO<RespDataVO<String>> selectPermsByUserId(@RequestParam("userId") Long userId);


    /**
     * 根据角色ID查询菜单ID
     *
     * @param roleId 角色ID
     * @return 权限列表
     */
    @GetMapping("/selectMenuIdsByRoleId")
    public RespVO<RespDataVO<Long>> selectMenuIdsByRoleId(@RequestParam("roleId") Long roleId);


    /**
     * @param roleId 角色ID
     * @return 菜单列表
     */
    @GetMapping("/selectMenuTree")
    RespVO<RespDataVO<String>> selectMenuTree(@RequestParam("roleId") Long roleId);

}

class SysMenuClientFallback implements SysMenuClient {
    @Override
    public RespVO insert(SysMenu sysMenu) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO insertSelective(SysMenu sysMenu) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchInsert(List<SysMenu> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchInsertSelective(List<SysMenu> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO updateByPrimaryKey(SysMenu sysMenu) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO updateSelectiveByPrimaryKey(SysMenu sysMenu) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpdate(List<SysMenu> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpdateSelective(List<SysMenu> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO upsert(SysMenu sysMenu) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO upsertSelective(SysMenu sysMenu) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpsert(List<SysMenu> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpsertSelective(List<SysMenu> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO deleteByPrimaryKey(Long menuId) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO deleteBatchByPrimaryKeys(List<Long> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO delete(SysMenu sysMenu) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<SysMenu> queryByPrimaryKey(Long menuId) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<SysMenu>> queryBatchPrimaryKeys(List<Long> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<SysMenu> queryOne(SysMenu sysMenu) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<SysMenu>> queryByCondition(SysMenu sysMenu) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<PageInfo<SysMenu>> queryPageByCondition(SysMenu sysMenu) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<SysMenu>> queryFuzzy(SysMenu sysMenu) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<PageInfo<SysMenu>> queryPageFuzzy(SysMenu sysMenu) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<SysMenu>> queryByLikeCondition(SysMenu sysMenu) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<PageInfo<SysMenu>> queryPageByLikeCondition(SysMenu sysMenu) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<Long> queryCount(SysMenu sysMenu) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroup(SysMenu sysMenu) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByDay(SysMenu sysMenu) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByMonth(SysMenu sysMenu) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByYear(SysMenu sysMenu) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<SysMenu>> selectMenuAll() {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<SysMenu>> selectMenuNormalAll() {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<SysMenu>> selectMenusByUserId(Long userId) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<String>> selectPermsByUserId(Long userId) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Long>> selectMenuIdsByRoleId(Long roleId) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<String>> selectMenuTree(Long roleId) {
        return RespVOBuilder.failure("system-service服务不可用");
    }


}