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
import com.xiaodao.system.service.ISysRoleMenuService;
import com.xiaodao.system.entity.SysRoleMenu;
import java.util.List;


/**
 * 角色和菜单关联表
 *
 * @author 高磊
 * @email 513684652@qq.com
 * @since jdk 1.8
 */
@RestController
@RequestMapping("/sysRoleMenu")
@Api(value = "角色和菜单关联表管理", tags = "角色和菜单关联表管理")
@Validated
@Slf4j
public class SysRoleMenuController {
    @Autowired
    private ISysRoleMenuService sysRoleMenuService;

    @ApiOperation(value = "分页查询角色和菜单关联表", notes = "分页查询角色和菜单关联表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageIndex", value = "当前页", dataType = "int", required = true, example = "1", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "每页大小", dataType = "int", defaultValue = "10", example = "10", paramType = "query"),
    })
    @GetMapping("/")
    public RespVO<IPage<SysRoleMenu>> queryPage(@RequestParam(value = "pageIndex") int pageIndex,
                                                          @RequestParam(required = false, defaultValue = "10") int pageSize) {
        IPage<SysRoleMenu> iPage = sysRoleMenuService.queryPage(pageIndex, pageSize, new SysRoleMenu());
        return RespVOBuilder.success(iPage);
    }

    @ApiOperation(value = "通过主键roleId查询角色和菜单关联表", notes = "通过主键roleId查询角色和菜单关联表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "roleId", paramType = "path", value = "roleId", required = true, dataType = "Long")
    })
    @GetMapping("/{roleId}")
    public RespVO<SysRoleMenu> selectByPrimaryKey(@PathVariable(value = "roleId") Long roleId) {
        SysRoleMenu sysRoleMenu =
            sysRoleMenuService.selectByPrimaryKey(roleId);
        if (sysRoleMenu == null){
            return RespVOBuilder.failure("当前角色和菜单关联表不存在");
        } else{
            return RespVOBuilder.success(sysRoleMenu);
        }
    }

    @ApiOperation(value = "通过主键roleId删除角色和菜单关联表", notes = "通过主键roleId删除角色和菜单关联表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "roleId", paramType = "path", value = "roleId", required = true, dataType = "Long")
    })
    @DeleteMapping("/{roleId}")
    public RespVO deleteByPrimaryKey(@PathVariable(value = "roleId") Long roleId) {
        Integer num = sysRoleMenuService.deleteByPrimaryKey(roleId);
        if (num == 0) {
            return RespVOBuilder.failure("删除角色和菜单关联表失败");
        } else {
            return RespVOBuilder.success("删除角色和菜单关联表成功");
        }
    }

    @ApiOperation(value = "新增角色和菜单关联表", notes = "新增角色和菜单关联表")
    @ApiImplicitParams({
    })
    @PostMapping("/")
    public RespVO insert(@RequestBody SysRoleMenu sysRoleMenu) {
        if (sysRoleMenu == null){
            return RespVOBuilder.failure("参数不能为空");
        }
        Integer num = sysRoleMenuService.insert(sysRoleMenu);
        if (num == 0) {
            return RespVOBuilder.failure("添加角色和菜单关联表失败");
        } else {
            return RespVOBuilder.success("添加角色和菜单关联表成功");
        }
    }

    @ApiOperation(value = "修改角色和菜单关联表", notes = "修改角色和菜单关联表")
    @ApiImplicitParams({
    })
    @PutMapping("/")
    public RespVO updateByPrimaryKey(@RequestBody SysRoleMenu sysRoleMenu) {
        if (sysRoleMenu == null){
            return RespVOBuilder.failure("参数不能为空");
        }
        Integer num = sysRoleMenuService.updateByPrimaryKey(sysRoleMenu);
        if (num == 0) {
            return RespVOBuilder.failure("修改角色和菜单关联表失败");
        } else {
            return RespVOBuilder.success("修改角色和菜单关联表成功");
        }
    }


    @ApiOperation(value = "通过主键roleId批量删除角色和菜单关联表", notes = "通过主键roleId批量删除角色和菜单关联表")
    @ApiImplicitParams({
    })
    @DeleteMapping("/deleteBatchPrimaryKeys")
    public RespVO deleteBatchPrimaryKeys(@RequestBody List<Long> list) {
        if (CollectionUtils.isEmpty(list)) {
            return RespVOBuilder.failure("参数不能为空");
        }
        Integer num = sysRoleMenuService.deleteBatchIds(list);
        if (num == 0) {
            return RespVOBuilder.failure("批量删除角色和菜单关联表失败");
        } else {
            return RespVOBuilder.success("批量删除角色和菜单关联表成功");
        }
    }


    @ApiOperation(value = "条件查询角色和菜单关联表", notes = "条件查询角色和菜单关联表")
    @ApiImplicitParams({
    })
    @PostMapping("/list")
    public RespVO query(@RequestBody SysRoleMenu sysRoleMenu) {
        if (sysRoleMenu ==null){
            return RespVOBuilder.failure("参数不能为空");
        }
        List<SysRoleMenu> list = sysRoleMenuService.query(sysRoleMenu);
        return RespVOBuilder.success(list);
    }
}
