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
import com.xiaodao.system.service.ISysRoleDeptService;
import com.xiaodao.system.entity.SysRoleDept;
import java.util.List;


/**
 * 角色和部门关联表
 *
 * @author 高磊
 * @email 513684652@qq.com
 * @since jdk 1.8
 */
@RestController
@RequestMapping("/sysRoleDept")
@Api(value = "角色和部门关联表管理", tags = "角色和部门关联表管理")
@Validated
@Slf4j
public class SysRoleDeptController {
    @Autowired
    private ISysRoleDeptService sysRoleDeptService;

    @ApiOperation(value = "分页查询角色和部门关联表", notes = "分页查询角色和部门关联表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageIndex", value = "当前页", dataType = "int", required = true, example = "1", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "每页大小", dataType = "int", defaultValue = "10", example = "10", paramType = "query"),
    })
    @GetMapping("/")
    public RespVO<IPage<SysRoleDept>> queryPage(@RequestParam(value = "pageIndex") int pageIndex,
                                                          @RequestParam(required = false, defaultValue = "10") int pageSize) {
        IPage<SysRoleDept> iPage = sysRoleDeptService.queryPage(pageIndex, pageSize, new SysRoleDept());
        return RespVOBuilder.success(iPage);
    }

    @ApiOperation(value = "通过主键roleId查询角色和部门关联表", notes = "通过主键roleId查询角色和部门关联表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "roleId", paramType = "path", value = "roleId", required = true, dataType = "Long")
    })
    @GetMapping("/{roleId}")
    public RespVO<SysRoleDept> selectByPrimaryKey(@PathVariable(value = "roleId") Long roleId) {
        SysRoleDept sysRoleDept =
            sysRoleDeptService.selectByPrimaryKey(roleId);
        if (sysRoleDept == null){
            return RespVOBuilder.failure("当前角色和部门关联表不存在");
        } else{
            return RespVOBuilder.success(sysRoleDept);
        }
    }

    @ApiOperation(value = "通过主键roleId删除角色和部门关联表", notes = "通过主键roleId删除角色和部门关联表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "roleId", paramType = "path", value = "roleId", required = true, dataType = "Long")
    })
    @DeleteMapping("/{roleId}")
    public RespVO deleteByPrimaryKey(@PathVariable(value = "roleId") Long roleId) {
        Integer num = sysRoleDeptService.deleteByPrimaryKey(roleId);
        if (num == 0) {
            return RespVOBuilder.failure("删除角色和部门关联表失败");
        } else {
            return RespVOBuilder.success("删除角色和部门关联表成功");
        }
    }

    @ApiOperation(value = "新增角色和部门关联表", notes = "新增角色和部门关联表")
    @ApiImplicitParams({
    })
    @PostMapping("/")
    public RespVO insert(@RequestBody SysRoleDept sysRoleDept) {
        if (sysRoleDept == null){
            return RespVOBuilder.failure("参数不能为空");
        }
        Integer num = sysRoleDeptService.insert(sysRoleDept);
        if (num == 0) {
            return RespVOBuilder.failure("添加角色和部门关联表失败");
        } else {
            return RespVOBuilder.success("添加角色和部门关联表成功");
        }
    }

    @ApiOperation(value = "修改角色和部门关联表", notes = "修改角色和部门关联表")
    @ApiImplicitParams({
    })
    @PutMapping("/")
    public RespVO updateByPrimaryKey(@RequestBody SysRoleDept sysRoleDept) {
        if (sysRoleDept == null){
            return RespVOBuilder.failure("参数不能为空");
        }
        Integer num = sysRoleDeptService.updateByPrimaryKey(sysRoleDept);
        if (num == 0) {
            return RespVOBuilder.failure("修改角色和部门关联表失败");
        } else {
            return RespVOBuilder.success("修改角色和部门关联表成功");
        }
    }


    @ApiOperation(value = "通过主键roleId批量删除角色和部门关联表", notes = "通过主键roleId批量删除角色和部门关联表")
    @ApiImplicitParams({
    })
    @DeleteMapping("/deleteBatchPrimaryKeys")
    public RespVO deleteBatchPrimaryKeys(@RequestBody List<Long> list) {
        if (CollectionUtils.isEmpty(list)) {
            return RespVOBuilder.failure("参数不能为空");
        }
        Integer num = sysRoleDeptService.deleteBatchIds(list);
        if (num == 0) {
            return RespVOBuilder.failure("批量删除角色和部门关联表失败");
        } else {
            return RespVOBuilder.success("批量删除角色和部门关联表成功");
        }
    }


    @ApiOperation(value = "条件查询角色和部门关联表", notes = "条件查询角色和部门关联表")
    @ApiImplicitParams({
    })
    @PostMapping("/list")
    public RespVO query(@RequestBody SysRoleDept sysRoleDept) {
        if (sysRoleDept ==null){
            return RespVOBuilder.failure("参数不能为空");
        }
        List<SysRoleDept> list = sysRoleDeptService.query(sysRoleDept);
        return RespVOBuilder.success(list);
    }
}
