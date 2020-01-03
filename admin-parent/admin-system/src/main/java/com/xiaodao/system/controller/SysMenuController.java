package com.xiaodao.system.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import com.xiaodao.core.result.RespVO;
import com.xiaodao.core.result.RespDataVO;
import com.xiaodao.core.result.RespVOBuilder;
import  com.xiaodao.system.service.ISysMenuService;
import com.xiaodao.feign.system.entity.SysMenu;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import java.util.List;
import java.util.Map;

/**
 * SysMenu
 *
 * @author ¸ßÀÚ
 * @email tyut_gaolei@163.com
 * @since jdk 1.8
 */
@RestController
@RequestMapping("/sysMenu")
@Api(value = "菜单权限表管理", tags = "菜单权限表管理")
@Validated
@Slf4j
public class SysMenuController {
    @Autowired
    private ISysMenuService sysMenuService;


    @ApiOperation(value = "新增", notes = "新增")
    @ApiImplicitParams({
    })
    @PostMapping("/insert")
    public RespVO insert(@RequestBody SysMenu sysMenu) {

        int resultNum = sysMenuService.insert(sysMenu);
        if (resultNum == 0) {
            return RespVOBuilder.failure("插入失败");
        } else {
            return RespVOBuilder.success("插入成功");
        }
    }

    @ApiOperation(value = "带有空值判断的新增", notes = "带有空值判断的新增")
    @ApiImplicitParams({
    })
    @PostMapping("/insertSelective")
    public RespVO insertSelective(@RequestBody SysMenu sysMenu) {
        int resultNum = sysMenuService.insertSelective(sysMenu);
        if (resultNum == 0) {
            return RespVOBuilder.failure("插入失败");
        } else {
            return RespVOBuilder.success("插入成功");
        }
    }


    @ApiOperation(value = "批量插入", notes = "批量插入")
    @ApiImplicitParams({
    })
    @PostMapping("/batchInsert")
    public RespVO batchInsert(@RequestBody List<SysMenu> list) {
        int resultNum = sysMenuService.batchInsert(list);
        if (resultNum == 0) {
            return RespVOBuilder.failure("插入失败");
        } else {
            return RespVOBuilder.success("插入成功");
        }
    }

    @ApiOperation(value = "带有空值判断的批量插入", notes = "带有空值判断的批量插入")
    @ApiImplicitParams({
    })
    @PostMapping("/batchInsertSelective")
    public RespVO batchInsertSelective(@RequestBody List<SysMenu> list) {
        int resultNum = sysMenuService.batchInsertSelective(list);
        if (resultNum == 0) {
            return RespVOBuilder.failure("插入失败");
        } else {
            return RespVOBuilder.success("插入成功");
        }
    }


    @ApiOperation(value = "根据主键更新", notes = "根据主键更新")
    @ApiImplicitParams({
    })
    @PutMapping("/updateByPrimaryKey")
    public RespVO updateByPrimaryKey(@RequestBody SysMenu sysMenu) {
        int resultNum = sysMenuService.updateByPrimaryKey(sysMenu);
        if (resultNum == 0) {
            return RespVOBuilder.failure("更新失败");
        } else {
            return RespVOBuilder.success("更新成功");
        }
    }

    @ApiOperation(value = "带有空值判断的主键更新", notes = "带有空值判断的主键更新")
    @ApiImplicitParams({
    })
    @PutMapping("/updateSelectiveByPrimaryKey")
    public RespVO updateSelectiveByPrimaryKey(@RequestBody SysMenu sysMenu) {
        int resultNum = sysMenuService.updateSelectiveByPrimaryKey(sysMenu);
        if (resultNum == 0) {
            return RespVOBuilder.failure("更新失败");
        } else {
            return RespVOBuilder.success("更新成功");
        }
    }

    @ApiOperation(value = "批量更新", notes = "批量更新")
    @ApiImplicitParams({
    })
    @PutMapping("/batchUpdate")
    public RespVO batchUpdate(@RequestBody List<SysMenu> list) {
        int resultNum = sysMenuService.batchUpdate(list);
        if (resultNum == 0) {
            return RespVOBuilder.failure("更新失败");
        } else {
            return RespVOBuilder.success("更新成功");
        }
    }


    @ApiOperation(value = "带有空值判断的批量更新", notes = "带有空值判断的批量更新")
    @ApiImplicitParams({
    })
    @PutMapping("/batchUpdateSelective")
    public RespVO batchUpdateSelective(@RequestBody List<SysMenu> list) {
        int resultNum = sysMenuService.batchUpdateSelective(list);
        if (resultNum == 0) {
            return RespVOBuilder.failure("更新失败");
        } else {
            return RespVOBuilder.success("更新成功");
        }
    }

    @ApiOperation(value = "更新插入", notes = "更新插入")
    @ApiImplicitParams({
    })
    @PostMapping("/upsert")
    public RespVO upsert(@RequestBody SysMenu sysMenu) {
        int resultNum = sysMenuService.upsert(sysMenu);
        if (resultNum == 0) {
            return RespVOBuilder.failure("插入更新失败");
        } else {
            return RespVOBuilder.success("插入更新成功");
        }
    }


    @ApiOperation(value = "带有空值判断的更新插入", notes = "带有空值判断的更新插入")
    @ApiImplicitParams({
    })
    @PostMapping("/upsertSelective")
    public RespVO upsertSelective(@RequestBody SysMenu sysMenu) {
        int resultNum = sysMenuService.upsertSelective(sysMenu);
        if (resultNum == 0) {
            return RespVOBuilder.failure("插入更新失败");
        } else {
            return RespVOBuilder.success("插入更新成功");
        }
    }


    @ApiOperation(value = "批量更新插入", notes = "批量更新插入")
    @ApiImplicitParams({
    })
    @PostMapping("/batchUpsert")
    public RespVO batchUpsert(@RequestBody List<SysMenu> list) {
        int resultNum = sysMenuService.batchUpsert(list);
        if (resultNum == 0) {
            return RespVOBuilder.failure("插入更新失败");
        } else {
            return RespVOBuilder.success("插入更新成功");
        }
    }

    @ApiOperation(value = "带有空值判断的批量更新插入", notes = "带有空值判断的批量更新插入")
    @ApiImplicitParams({
    })
    @PostMapping("/batchUpsertSelective")
    public RespVO batchUpsertSelective(@RequestBody List<SysMenu> list) {
        int resultNum = sysMenuService.batchUpsertSelective(list);
        if (resultNum == 0) {
            return RespVOBuilder.failure("插入更新失败");
        } else {
            return RespVOBuilder.success("插入更新成功");
        }
    }


    @ApiOperation(value = "通过主键删除", notes = "通过主键删除")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "menuId", paramType = "path", value = "menuId", required = true, dataType = "Long")
    })
    @DeleteMapping("/{menuId}")
    public RespVO deleteByPrimaryKey(@PathVariable(value = "menuId") Long menuId) {
        Integer resultNum = sysMenuService.deleteByPrimaryKey(menuId);
        if (resultNum == 0) {
            return RespVOBuilder.failure("删除失败");
        } else {
            return RespVOBuilder.success("删除成功");
        }
    }

    @ApiOperation(value = "通过主键批量删除", notes = "通过主键批量删除")
    @ApiImplicitParams({
    })
    @DeleteMapping("/deleteBatchByPrimaryKeys")
    public RespVO deleteBatchByPrimaryKeys(@RequestBody List<Long> list) {
        int resultNum = sysMenuService.deleteBatchByPrimaryKeys(list);
        if (resultNum > 0) {
            return RespVOBuilder.success("删除成功");
        } else {
            return RespVOBuilder.failure("删除失败");
        }
    }

    @ApiOperation(value = "条件删除", notes = "条件删除")
    @ApiImplicitParams({
    })
    @DeleteMapping("/delete")
    public RespVO delete(@RequestBody SysMenu sysMenu) {

        int resultNum = sysMenuService.delete(sysMenu);
        if (resultNum > 0) {
            return RespVOBuilder.success("删除成功");
        } else {
            return RespVOBuilder.failure("删除失败");
        }

    }

    @ApiOperation(value = "通过主键查询", notes = "通过主键批量查询")
    @ApiImplicitParams({
    })
    @GetMapping("/{menuId}")
    public RespVO<SysMenu> queryByPrimaryKey(@PathVariable(value = "menuId") Long menuId) {
        SysMenu sysMenu = sysMenuService.queryByPrimaryKey(menuId);
        return RespVOBuilder.success(sysMenu);
    }

    @ApiOperation(value = "通过主键批量查询", notes = "通过主键批量查询")
    @ApiImplicitParams({
    })
    @PostMapping("/queryBatchPrimaryKeys")
    public RespVO<RespDataVO<SysMenu>> queryBatchPrimaryKeys(@RequestBody List<Long> list) {
        List< SysMenu> sysMenus = sysMenuService.queryBatchPrimaryKeys(list);
        return RespVOBuilder.success(sysMenus);
    }

    @ApiOperation(value = "条件查询一个", notes = "条件查询一个")
    @ApiImplicitParams({
    })
    @PostMapping("/queryOne")
    public RespVO<SysMenu> queryOne(@RequestBody SysMenu sysMenu) {
        sysMenu =sysMenuService.queryOne(sysMenu);
        return RespVOBuilder.success(sysMenu);
    }

    @ApiOperation(value = "条件查询", notes = "条件查询")
    @ApiImplicitParams({
    })
    @PostMapping("/queryByCondition")
    public RespVO<RespDataVO<SysMenu>> queryByCondition(@RequestBody SysMenu sysMenu) {
        List<SysMenu> list = sysMenuService.queryByCondition(sysMenu);
        return RespVOBuilder.success(list);
    }

    @ApiOperation(value = "条件分页查询", notes = "条件分页查询")
    @ApiImplicitParams({
    })
    @PostMapping("/queryPageByCondition")
    public RespVO<PageInfo<SysMenu>> queryPageByCondition(@RequestBody SysMenu sysMenu) {
        PageHelper.startPage(sysMenu.getPageIndex(),sysMenu.getPageSie());
        List<SysMenu> list = sysMenuService.queryByCondition(sysMenu);
        return RespVOBuilder.success(new PageInfo(list));
    }

    @ApiOperation(value = "模糊查询", notes = "模糊查询")
    @ApiImplicitParams({
    })
    @PostMapping("/queryFuzzy")
    public RespVO<RespDataVO<SysMenu>> queryFuzzy(@RequestBody SysMenu sysMenu) {
        List<SysMenu> list = sysMenuService.queryFuzzy(sysMenu);
        return RespVOBuilder.success(list);
    }


    @ApiOperation(value = "模糊分页查询", notes = "模糊分页查询")
    @ApiImplicitParams({
    })
    @PostMapping("/queryPageFuzzy")
    public RespVO<PageInfo<SysMenu>> queryPageFuzzy(@RequestBody SysMenu sysMenu) {
        PageHelper.startPage(sysMenu.getPageIndex(),sysMenu.getPageSie());
        List<SysMenu> list = sysMenuService.queryFuzzy(sysMenu);
        return RespVOBuilder.success(new PageInfo(list));
    }


    @ApiOperation(value = "模糊条件查询", notes = "条件模糊查询")
    @ApiImplicitParams({
    })
    @PostMapping("/queryByLikeCondition")
    public RespVO<RespDataVO<SysMenu>> queryByLikeCondition(@RequestBody SysMenu sysMenu) {
        List<SysMenu> list = sysMenuService.queryByLikeCondition(sysMenu);
        return RespVOBuilder.success(list);
    }

    @ApiOperation(value = "模糊分页条件查询", notes = "条件模糊查询")
    @ApiImplicitParams({
    })
    @PostMapping("/queryPageByLikeCondition")
    public RespVO<PageInfo<SysMenu>> queryPageByLikeCondition(@RequestBody SysMenu sysMenu) {
        PageHelper.startPage(sysMenu.getPageIndex(),sysMenu.getPageSie());
        List<SysMenu> list = sysMenuService.queryByLikeCondition(sysMenu);
        return RespVOBuilder.success(new PageInfo(list));
    }

    @ApiOperation(value = "条件查询数量", notes = "条件查询数量")
    @ApiImplicitParams({
    })
    @PostMapping("/queryCount")
    public RespVO<Long> queryCount(@RequestBody SysMenu sysMenu) {
        long count = sysMenuService.queryCount(sysMenu);
        return RespVOBuilder.success(count);
    }


    @ApiOperation(value = "分组统计", notes = "分组统计")
    @ApiImplicitParams({
    })
    @PostMapping("/statisticsGroup")
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroup(@RequestBody SysMenu sysMenu) {
        List<Map<String, Object>> maps = sysMenuService.statisticsGroup(sysMenu);
        return RespVOBuilder.success(maps);
    }


    @ApiOperation(value = "日统计", notes = "分组统计")
    @ApiImplicitParams({
    })
    @PostMapping("/statisticsGroupByDay")
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByDay(@RequestBody SysMenu sysMenu) {
        List<Map<String, Object>> maps = sysMenuService.statisticsGroupByDay(sysMenu);
        return RespVOBuilder.success(maps);
    }

    @ApiOperation(value = "月统计", notes = "分组统计")
    @ApiImplicitParams({
    })
    @PostMapping("/statisticsGroupByMonth")
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByMonth(@RequestBody SysMenu sysMenu) {
        List<Map<String, Object>> maps = sysMenuService.statisticsGroupByMonth(sysMenu);
        return RespVOBuilder.success(maps);
    }

    @ApiOperation(value = "年统计", notes = "分组统计")
    @ApiImplicitParams({
    })
    @PostMapping("/statisticsGroupByYear")
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByYear(@RequestBody SysMenu sysMenu) {
        List<Map<String, Object>> maps = sysMenuService.statisticsGroupByYear(sysMenu);
        return RespVOBuilder.success(maps);
    }

    /**
     * 查询系统所有菜单（含按钮）
     *
     * @return 菜单列表
     */
    @ApiOperation(value = "查询系统所有菜单（含按钮）", notes = "查询系统所有菜单（含按钮）")
    @GetMapping("/selectMenuAll")
    public RespVO<RespDataVO<SysMenu>> selectMenuAll() {
        List<SysMenu> sysMenus = sysMenuService.selectMenuAll();
        return RespVOBuilder.success(sysMenus);
    }


    /**
     * 查询系统正常显示菜单（不含按钮）
     *
     * @return 菜单列表
     */
    @ApiOperation(value = "查询系统正常显示菜单（不含按钮）", notes = "查询系统正常显示菜单（不含按钮)")
    @GetMapping("/selectMenuNormalAll")
    public RespVO<RespDataVO<SysMenu>> selectMenuNormalAll() {
        List<SysMenu> sysMenus = sysMenuService.selectMenuNormalAll();
        return RespVOBuilder.success(sysMenus);
    }


    /**
     * 根据用户ID查询菜单
     *
     * @param userId 用户ID
     * @return 菜单列表
     */
    @ApiOperation(value = "根据用户ID查询菜单", notes = "根据用户ID查询菜单")
    @GetMapping("/selectMenusByUserId")
    public RespVO<RespDataVO<SysMenu>> selectMenusByUserId(@RequestParam("userId") Long userId) {
        List<SysMenu> sysMenus = sysMenuService.selectMenusByUserId(userId);
        return RespVOBuilder.success(sysMenus);
    }

    /**
     * 根据用户ID查询权限
     *
     * @param userId 用户ID
     * @return 权限列表
     */
    @ApiOperation(value = "根据用户ID查询权限", notes = "根据用户ID查询权限")
    @GetMapping("/selectPermsByUserId")
    public RespVO<RespDataVO<String>> selectPermsByUserId(@RequestParam("userId") Long userId) {
        List<String> perms = sysMenuService.selectPermsByUserId(userId);
        return RespVOBuilder.success(perms);
    }


    /**
     * 根据角色ID查询菜单ID
     *
     * @param roleId 角色ID
     * @return 权限列表
     */
    @ApiOperation(value = "根据角色ID查询菜单ID", notes = "根据角色ID查询菜单ID")
    @GetMapping("/selectMenuIdsByRoleId")
    public RespVO<RespDataVO<Long>> selectMenuIdsByRoleId(@RequestParam("roleId") Long roleId) {
        List<Long> menuIds = sysMenuService.selectMenuIdsByRoleId(roleId);
        return RespVOBuilder.success(menuIds);
    }


    /**
     * @param roleId 角色ID
     * @return 菜单列表
     */
    @ApiOperation(value = "根据角色ID查询菜单", notes = "根据角色ID查询菜单")
    @GetMapping("/selectMenuTree")
    public RespVO<RespDataVO<String>> selectMenuTree(@RequestParam("roleId") Long roleId) {
        List<String> strings = sysMenuService.selectMenuTree(roleId);
        return RespVOBuilder.success(strings);
    }

}
