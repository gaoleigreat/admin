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
import com.xiaodao.system.service.ISysUserPostService;
import com.xiaodao.system.entity.SysUserPost;
import java.util.List;


/**
 * SysUserPost
 *
 * @author 高磊
 * @email 513684652@qq.com
 * @since jdk 1.8
 */
@RestController
@RequestMapping("/sysUserPost")
@Api(value = "SysUserPost管理", tags = "SysUserPost管理")
@Validated
@Slf4j
public class SysUserPostController {
    @Autowired
    private ISysUserPostService sysUserPostService;

    @ApiOperation(value = "分页查询SysUserPost", notes = "分页查询SysUserPost")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageIndex", value = "当前页", dataType = "int", required = true, example = "1", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "每页大小", dataType = "int", defaultValue = "10", example = "10", paramType = "query"),
    })
    @GetMapping("/")
    public RespVO<IPage<SysUserPost>> queryPage(@RequestParam(value = "pageIndex") int pageIndex,
                                                          @RequestParam(required = false, defaultValue = "10") int pageSize) {
        IPage<SysUserPost> iPage = sysUserPostService.queryPage(pageIndex, pageSize, new SysUserPost());
        return RespVOBuilder.success(iPage);
    }

    @ApiOperation(value = "通过主键userId查询SysUserPost", notes = "通过主键userId查询SysUserPost")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", paramType = "path", value = "userId", required = true, dataType = "Long")
    })
    @GetMapping("/{userId}")
    public RespVO<SysUserPost> selectByPrimaryKey(@PathVariable(value = "userId") Long userId) {
        SysUserPost sysUserPost =
            sysUserPostService.selectByPrimaryKey(userId);
        if (sysUserPost == null){
            return RespVOBuilder.failure("当前SysUserPost不存在");
        } else{
            return RespVOBuilder.success(sysUserPost);
        }
    }

    @ApiOperation(value = "通过主键userId删除SysUserPost", notes = "通过主键userId删除SysUserPost")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", paramType = "path", value = "userId", required = true, dataType = "Long")
    })
    @DeleteMapping("/{userId}")
    public RespVO deleteByPrimaryKey(@PathVariable(value = "userId") Long userId) {
        Integer num = sysUserPostService.deleteByPrimaryKey(userId);
        if (num == 0) {
            return RespVOBuilder.failure("删除SysUserPost失败");
        } else {
            return RespVOBuilder.success("删除SysUserPost成功");
        }
    }

    @ApiOperation(value = "新增SysUserPost", notes = "新增SysUserPost")
    @ApiImplicitParams({
    })
    @PostMapping("/")
    public RespVO insert(@RequestBody SysUserPost sysUserPost) {
        if (sysUserPost == null){
            return RespVOBuilder.failure("参数不能为空");
        }
        Integer num = sysUserPostService.insert(sysUserPost);
        if (num == 0) {
            return RespVOBuilder.failure("添加SysUserPost失败");
        } else {
            return RespVOBuilder.success("添加SysUserPost成功");
        }
    }

    @ApiOperation(value = "修改SysUserPost", notes = "修改SysUserPost")
    @ApiImplicitParams({
    })
    @PutMapping("/")
    public RespVO updateByPrimaryKey(@RequestBody SysUserPost sysUserPost) {
        if (sysUserPost == null){
            return RespVOBuilder.failure("参数不能为空");
        }
        Integer num = sysUserPostService.updateByPrimaryKey(sysUserPost);
        if (num == 0) {
            return RespVOBuilder.failure("修改SysUserPost失败");
        } else {
            return RespVOBuilder.success("修改SysUserPost成功");
        }
    }


    @ApiOperation(value = "通过主键userId批量删除SysUserPost", notes = "通过主键userId批量删除SysUserPost")
    @ApiImplicitParams({
    })
    @DeleteMapping("/deleteBatchPrimaryKeys")
    public RespVO deleteBatchPrimaryKeys(@RequestBody List<Long> list) {
        if (CollectionUtils.isEmpty(list)) {
            return RespVOBuilder.failure("参数不能为空");
        }
        Integer num = sysUserPostService.deleteBatchIds(list);
        if (num == 0) {
            return RespVOBuilder.failure("批量删除SysUserPost失败");
        } else {
            return RespVOBuilder.success("批量删除SysUserPost成功");
        }
    }


    @ApiOperation(value = "条件查询SysUserPost", notes = "条件查询SysUserPost")
    @ApiImplicitParams({
    })
    @PostMapping("/list")
    public RespVO query(@RequestBody SysUserPost sysUserPost) {
        if (sysUserPost ==null){
            return RespVOBuilder.failure("参数不能为空");
        }
        List<SysUserPost> list = sysUserPostService.query(sysUserPost);
        return RespVOBuilder.success(list);
    }
}
