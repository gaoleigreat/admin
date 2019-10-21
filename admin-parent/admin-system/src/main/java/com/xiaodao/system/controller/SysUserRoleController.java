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
import com.xiaodao.system.service.ISysUserRoleService;
import com.xiaodao.system.entity.SysUserRole;
import java.util.List;


/**
 * 用户和角色关联表
 *
 * @author 高磊
 * @email 513684652@qq.com
 * @since jdk 1.8
 */
@RestController
@RequestMapping("/sysUserRole")
@Api(value = "用户和角色关联表管理", tags = "用户和角色关联表管理")
@Validated
@Slf4j
public class SysUserRoleController {
    @Autowired
    private ISysUserRoleService sysUserRoleService;

    @ApiOperation(value = "分页查询用户和角色关联表", notes = "分页查询用户和角色关联表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageIndex", value = "当前页", dataType = "int", required = true, example = "1", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "每页大小", dataType = "int", defaultValue = "10", example = "10", paramType = "query"),
    })
    @GetMapping("/")
    public RespVO<IPage<SysUserRole>> queryPage(@RequestParam(value = "pageIndex") int pageIndex,
                                                          @RequestParam(required = false, defaultValue = "10") int pageSize) {
        IPage<SysUserRole> iPage = sysUserRoleService.queryPage(pageIndex, pageSize, new SysUserRole());
        return RespVOBuilder.success(iPage);
    }

    @ApiOperation(value = "通过主键userId查询用户和角色关联表", notes = "通过主键userId查询用户和角色关联表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", paramType = "path", value = "userId", required = true, dataType = "Long")
    })
    @GetMapping("/{userId}")
    public RespVO<SysUserRole> selectByPrimaryKey(@PathVariable(value = "userId") Long userId) {
        SysUserRole sysUserRole =
            sysUserRoleService.selectByPrimaryKey(userId);
        if (sysUserRole == null){
            return RespVOBuilder.failure("当前用户和角色关联表不存在");
        } else{
            return RespVOBuilder.success(sysUserRole);
        }
    }

    @ApiOperation(value = "通过主键userId删除用户和角色关联表", notes = "通过主键userId删除用户和角色关联表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", paramType = "path", value = "userId", required = true, dataType = "Long")
    })
    @DeleteMapping("/{userId}")
    public RespVO deleteByPrimaryKey(@PathVariable(value = "userId") Long userId) {
        Integer num = sysUserRoleService.deleteByPrimaryKey(userId);
        if (num == 0) {
            return RespVOBuilder.failure("删除用户和角色关联表失败");
        } else {
            return RespVOBuilder.success("删除用户和角色关联表成功");
        }
    }

    @ApiOperation(value = "新增用户和角色关联表", notes = "新增用户和角色关联表")
    @ApiImplicitParams({
    })
    @PostMapping("/")
    public RespVO insert(@RequestBody SysUserRole sysUserRole) {
        if (sysUserRole == null){
            return RespVOBuilder.failure("参数不能为空");
        }
        Integer num = sysUserRoleService.insert(sysUserRole);
        if (num == 0) {
            return RespVOBuilder.failure("添加用户和角色关联表失败");
        } else {
            return RespVOBuilder.success("添加用户和角色关联表成功");
        }
    }

    @ApiOperation(value = "修改用户和角色关联表", notes = "修改用户和角色关联表")
    @ApiImplicitParams({
    })
    @PutMapping("/")
    public RespVO updateByPrimaryKey(@RequestBody SysUserRole sysUserRole) {
        if (sysUserRole == null){
            return RespVOBuilder.failure("参数不能为空");
        }
        Integer num = sysUserRoleService.updateByPrimaryKey(sysUserRole);
        if (num == 0) {
            return RespVOBuilder.failure("修改用户和角色关联表失败");
        } else {
            return RespVOBuilder.success("修改用户和角色关联表成功");
        }
    }


    @ApiOperation(value = "通过主键userId批量删除用户和角色关联表", notes = "通过主键userId批量删除用户和角色关联表")
    @ApiImplicitParams({
    })
    @DeleteMapping("/deleteBatchPrimaryKeys")
    public RespVO deleteBatchPrimaryKeys(@RequestBody List<Long> list) {
        if (CollectionUtils.isEmpty(list)) {
            return RespVOBuilder.failure("参数不能为空");
        }
        Integer num = sysUserRoleService.deleteBatchIds(list);
        if (num == 0) {
            return RespVOBuilder.failure("批量删除用户和角色关联表失败");
        } else {
            return RespVOBuilder.success("批量删除用户和角色关联表成功");
        }
    }


    @ApiOperation(value = "条件查询用户和角色关联表", notes = "条件查询用户和角色关联表")
    @ApiImplicitParams({
    })
    @PostMapping("/list")
    public RespVO query(@RequestBody SysUserRole sysUserRole) {
        if (sysUserRole ==null){
            return RespVOBuilder.failure("参数不能为空");
        }
        List<SysUserRole> list = sysUserRoleService.query(sysUserRole);
        return RespVOBuilder.success(list);
    }
}
