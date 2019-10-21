package com.xiaodao.system.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xiaodao.feign.file.FileClient;
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
import org.springframework.web.multipart.MultipartFile;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 菜单权限表
 *
 * @author 高磊
 * @email 513684652@qq.com
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

    @Autowired
    private FileClient fileClient;

    @ApiOperation(value = "分页查询菜单权限表", notes = "分页查询菜单权限表")
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

    @ApiOperation(value = "通过主键menuId查询菜单权限表", notes = "通过主键menuId查询菜单权限表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "menuId", paramType = "path", value = "menuId", required = true, dataType = "Long")
    })
    @GetMapping("/{menuId}")
    public RespVO<SysMenu> selectByPrimaryKey(@PathVariable(value = "menuId") Long menuId) {
        SysMenu sysMenu =
                sysMenuService.selectByPrimaryKey(menuId);
        if (sysMenu == null) {
            return RespVOBuilder.failure("当前菜单权限表不存在");
        } else {
            return RespVOBuilder.success(sysMenu);
        }
    }

    @ApiOperation(value = "通过主键menuId删除菜单权限表", notes = "通过主键menuId删除菜单权限表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "menuId", paramType = "path", value = "menuId", required = true, dataType = "Long")
    })
    @DeleteMapping("/{menuId}")
    public RespVO deleteByPrimaryKey(@PathVariable(value = "menuId") Long menuId) {
        Integer num = sysMenuService.deleteByPrimaryKey(menuId);
        if (num == 0) {
            return RespVOBuilder.failure("删除菜单权限表失败");
        } else {
            return RespVOBuilder.success("删除菜单权限表成功");
        }
    }

    @ApiOperation(value = "新增菜单权限表", notes = "新增菜单权限表")
    @ApiImplicitParams({
    })
    @PostMapping("/")
    public RespVO insert(@RequestBody SysMenu sysMenu) {
        if (sysMenu == null) {
            return RespVOBuilder.failure("参数不能为空");
        }
        Integer num = sysMenuService.insert(sysMenu);
        if (num == 0) {
            return RespVOBuilder.failure("添加菜单权限表失败");
        } else {
            return RespVOBuilder.success("添加菜单权限表成功");
        }
    }

    @ApiOperation(value = "修改菜单权限表", notes = "修改菜单权限表")
    @ApiImplicitParams({
    })
    @PutMapping("/")
    public RespVO updateByPrimaryKey(@RequestBody SysMenu sysMenu) {
        if (sysMenu == null) {
            return RespVOBuilder.failure("参数不能为空");
        }
        Integer num = sysMenuService.updateByPrimaryKey(sysMenu);
        if (num == 0) {
            return RespVOBuilder.failure("修改菜单权限表失败");
        } else {
            return RespVOBuilder.success("修改菜单权限表成功");
        }
    }


    @ApiOperation(value = "通过主键menuId批量删除菜单权限表", notes = "通过主键menuId批量删除菜单权限表")
    @ApiImplicitParams({
    })
    @DeleteMapping("/deleteBatchPrimaryKeys")
    public RespVO deleteBatchPrimaryKeys(@RequestBody List<Long> list) {
        if (CollectionUtils.isEmpty(list)) {
            return RespVOBuilder.failure("参数不能为空");
        }
        Integer num = sysMenuService.deleteBatchIds(list);
        if (num == 0) {
            return RespVOBuilder.failure("批量删除菜单权限表失败");
        } else {
            return RespVOBuilder.success("批量删除菜单权限表成功");
        }
    }


    @ApiOperation(value = "条件查询菜单权限表", notes = "条件查询菜单权限表")
    @ApiImplicitParams({
    })
    @PostMapping("/list")
    public RespVO query(@RequestBody SysMenu sysMenu) {
        if (sysMenu == null) {
            return RespVOBuilder.failure("参数不能为空");
        }
        List<SysMenu> list = sysMenuService.query(sysMenu);
        return RespVOBuilder.success(list);
    }


    @ApiOperation(value = "多文件上传", notes = "多文件上传")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "id，", paramType = "query", required = true, dataType = "Long")
    })
    @PostMapping(value = "/uploads", headers = "content-type=multipart/form-data")
    public RespVO uploads(@RequestParam(value = "files", required = true) MultipartFile[] files, @RequestParam(value = "id", required = false) Long id) {
        Map<String, Object> dataMap = new HashMap<String, Object>();
        String path = "";
        Arrays.stream(files).forEach(mf -> {
            log.error(mf.getOriginalFilename().substring(mf.getOriginalFilename().lastIndexOf(".") + 1));
            log.error("id :{}", id);
        });
        return RespVOBuilder.success(files.length);
    }

    @ApiOperation(value = "单个文件上传", notes = "单个文件上传")
    @ApiImplicitParams({})
    @PostMapping(value = "/upload", headers = "content-type=multipart/form-data")
    public RespVO upload(@RequestParam(value = "file", required = true) MultipartFile file) {
        return fileClient.upload(file);
    }
}
