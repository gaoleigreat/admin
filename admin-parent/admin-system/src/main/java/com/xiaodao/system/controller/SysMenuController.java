package com.xiaodao.system.controller;
import com.baomidou.mybatisplus.core.metadata.IPage;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.xiaodao.core.vo.RespVO;
import com.xiaodao.core.vo.RespVOBuilder;
import com.xiaodao.system.service.ISysMenuService;
import com.xiaodao.system.entity.SysMenu;
import java.util.List;


/**
 * SysMenu
 *
 * @author 高磊
 * @email 513684652@qq.com
 * @since jdk 1.8
 */
@RestController
@RequestMapping("/sysMenu")
@Api(value = "SysMenu管理", tags = "SysMenu管理")
@Validated
@Slf4j
public class SysMenuController {
    @Autowired
    private ISysMenuService sysMenuService;

    @ApiOperation(value = "分页查询SysMenu", notes = "分页查询SysMenu")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageIndex", value = "当前页", dataType = "int", required = true, example = "1", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "每页大小", dataType = "int", defaultValue = "10", example = "10", paramType = "query"),
    })
    @GetMapping("/")
    public RespVO<IPage<SysMenu>> queryPage(@RequestParam(value = "pageIndex") int pageIndex,
                                                          @RequestParam(required = false, defaultValue = "10") int pageSize) {
        IPage<SysMenu> iPage = sysMenuService.queryPage(pageIndex, pageSize, new SysMenu());
        return RespVOBuilder.success(iPage);
    }

    @ApiOperation(value = "通过主键menuId查询SysMenu", notes = "通过主键menuId查询SysMenu")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "menuId", paramType = "path", value = "menuId", required = true, dataType = "Long")
    })
    @GetMapping("/{menuId}")
    public RespVO<SysMenu> selectByPrimaryKey(@PathVariable(value = "menuId") Long menuId) {
        SysMenu sysMenu =
            sysMenuService.selectByPrimaryKey(menuId);
        if (sysMenu == null){
            return RespVOBuilder.failure("当前SysMenu不存在");
        } else{
            return RespVOBuilder.success(sysMenu);
        }
    }

    @ApiOperation(value = "通过主键menuId删除SysMenu", notes = "通过主键menuId删除SysMenu")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "menuId", paramType = "path", value = "menuId", required = true, dataType = "Long")
    })
    @DeleteMapping("/{menuId}")
    public RespVO deleteByPrimaryKey(@PathVariable(value = "menuId") Long menuId) {
        Integer num = sysMenuService.deleteByPrimaryKey(menuId);
        if (num == 0) {
            return RespVOBuilder.failure("删除SysMenu失败");
        } else {
            return RespVOBuilder.success("删除SysMenu成功");
        }
    }

    @ApiOperation(value = "新增SysMenu", notes = "新增SysMenu")
    @ApiImplicitParams({
    })
    @PostMapping("/")
    public RespVO insert(@RequestBody SysMenu sysMenu) {
        if (sysMenu == null){
            return RespVOBuilder.failure("参数不能为空");
        }
        Integer num = sysMenuService.insert(sysMenu);
        if (num == 0) {
            return RespVOBuilder.failure("添加SysMenu失败");
        } else {
            return RespVOBuilder.success("添加SysMenu成功");
        }
    }

    @ApiOperation(value = "修改SysMenu", notes = "修改SysMenu")
    @ApiImplicitParams({
    })
    @PutMapping("/")
    public RespVO updateByPrimaryKey(@RequestBody SysMenu sysMenu) {
        if (sysMenu == null){
            return RespVOBuilder.failure("参数不能为空");
        }
        Integer num = sysMenuService.updateByPrimaryKey(sysMenu);
        if (num == 0) {
            return RespVOBuilder.failure("修改SysMenu失败");
        } else {
            return RespVOBuilder.success("修改SysMenu成功");
        }
    }


    @ApiOperation(value = "通过主键menuId批量删除SysMenu", notes = "通过主键menuId批量删除SysMenu")
    @ApiImplicitParams({
    })
    @DeleteMapping("/deleteBatchPrimaryKeys")
    public RespVO deleteBatchPrimaryKeys(@RequestBody List<Long> list) {
        if (CollectionUtils.isEmpty(list)) {
            return RespVOBuilder.failure("参数不能为空");
        }
        Integer num = sysMenuService.deleteBatchIds(list);
        if (num == 0) {
            return RespVOBuilder.failure("批量删除SysMenu失败");
        } else {
            return RespVOBuilder.success("批量删除SysMenu成功");
        }
    }


    @ApiOperation(value = "条件查询SysMenu", notes = "条件查询SysMenu")
    @ApiImplicitParams({
    })
    @PostMapping("/list")
    public RespVO query(@RequestBody SysMenu sysMenu) {
        if (sysMenu ==null){
            return RespVOBuilder.failure("参数不能为空");
        }
        List<SysMenu> list = sysMenuService.query(sysMenu);
        return RespVOBuilder.success(list);
    }
}
