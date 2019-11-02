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
import com.xiaodao.system.service.ISysUserService;
import com.xiaodao.system.entity.SysUser;
import java.util.List;


/**
 * SysUser
 *
 * @author 高磊
 * @email 513684652@qq.com
 * @since jdk 1.8
 */
@RestController
@RequestMapping("/sysUser")
@Api(value = "SysUser管理", tags = "SysUser管理")
@Validated
@Slf4j
public class SysUserController {
    @Autowired
    private ISysUserService sysUserService;

    @ApiOperation(value = "分页查询SysUser", notes = "分页查询SysUser")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageIndex", value = "当前页", dataType = "int", required = true, example = "1", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "每页大小", dataType = "int", defaultValue = "10", example = "10", paramType = "query"),
    })
    @GetMapping("/")
    public RespVO<IPage<SysUser>> queryPage(@RequestParam(value = "pageIndex") int pageIndex,
                                                          @RequestParam(required = false, defaultValue = "10") int pageSize) {
        IPage<SysUser> iPage = sysUserService.queryPage(pageIndex, pageSize, new SysUser());
        return RespVOBuilder.success(iPage);
    }

    @ApiOperation(value = "通过主键userId查询SysUser", notes = "通过主键userId查询SysUser")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", paramType = "path", value = "userId", required = true, dataType = "Long")
    })
    @GetMapping("/{userId}")
    public RespVO<SysUser> selectByPrimaryKey(@PathVariable(value = "userId") Long userId) {
        SysUser sysUser =
            sysUserService.selectByPrimaryKey(userId);
        if (sysUser == null){
            return RespVOBuilder.failure("当前SysUser不存在");
        } else{
            return RespVOBuilder.success(sysUser);
        }
    }

    @ApiOperation(value = "通过主键userId删除SysUser", notes = "通过主键userId删除SysUser")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", paramType = "path", value = "userId", required = true, dataType = "Long")
    })
    @DeleteMapping("/{userId}")
    public RespVO deleteByPrimaryKey(@PathVariable(value = "userId") Long userId) {
        Integer num = sysUserService.deleteByPrimaryKey(userId);
        if (num == 0) {
            return RespVOBuilder.failure("删除SysUser失败");
        } else {
            return RespVOBuilder.success("删除SysUser成功");
        }
    }

    @ApiOperation(value = "新增SysUser", notes = "新增SysUser")
    @ApiImplicitParams({
    })
    @PostMapping("/")
    public RespVO insert(@RequestBody SysUser sysUser) {
        if (sysUser == null){
            return RespVOBuilder.failure("参数不能为空");
        }
        Integer num = sysUserService.insert(sysUser);
        if (num == 0) {
            return RespVOBuilder.failure("添加SysUser失败");
        } else {
            return RespVOBuilder.success("添加SysUser成功");
        }
    }

    @ApiOperation(value = "修改SysUser", notes = "修改SysUser")
    @ApiImplicitParams({
    })
    @PutMapping("/")
    public RespVO updateByPrimaryKey(@RequestBody SysUser sysUser) {
        if (sysUser == null){
            return RespVOBuilder.failure("参数不能为空");
        }
        Integer num = sysUserService.updateByPrimaryKey(sysUser);
        if (num == 0) {
            return RespVOBuilder.failure("修改SysUser失败");
        } else {
            return RespVOBuilder.success("修改SysUser成功");
        }
    }


    @ApiOperation(value = "通过主键userId批量删除SysUser", notes = "通过主键userId批量删除SysUser")
    @ApiImplicitParams({
    })
    @DeleteMapping("/deleteBatchPrimaryKeys")
    public RespVO deleteBatchPrimaryKeys(@RequestBody List<Long> list) {
        if (CollectionUtils.isEmpty(list)) {
            return RespVOBuilder.failure("参数不能为空");
        }
        Integer num = sysUserService.deleteBatchIds(list);
        if (num == 0) {
            return RespVOBuilder.failure("批量删除SysUser失败");
        } else {
            return RespVOBuilder.success("批量删除SysUser成功");
        }
    }


    @ApiOperation(value = "条件查询SysUser", notes = "条件查询SysUser")
    @ApiImplicitParams({
    })
    @PostMapping("/list")
    public RespVO query(@RequestBody SysUser sysUser) {
        if (sysUser ==null){
            return RespVOBuilder.failure("参数不能为空");
        }
        List<SysUser> list = sysUserService.query(sysUser);
        return RespVOBuilder.success(list);
    }
}
