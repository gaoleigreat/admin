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
import com.xiaodao.system.service.ISysPostService;
import com.xiaodao.system.entity.SysPost;
import java.util.List;


/**
 * SysPost
 *
 * @author ¸ßÀÚ
 * @email 513684652@qq.com
 * @since jdk 1.8
 */
@RestController
@RequestMapping("/sysPost")
@Api(value = "SysPost管理", tags = "SysPost管理")
@Validated
@Slf4j
public class SysPostController {
    @Autowired
    private ISysPostService sysPostService;

    @ApiOperation(value = "分页查询SysPost", notes = "分页查询SysPost")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageIndex", value = "当前页", dataType = "int", required = true, example = "1", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "每页大小", dataType = "int", defaultValue = "10", example = "10", paramType = "query"),
    })
    @GetMapping("/")
    public RespVO<IPage<SysPost>> queryPage(@RequestParam(value = "pageIndex") int pageIndex,
                                                          @RequestParam(required = false, defaultValue = "10") int pageSize) {
        IPage<SysPost> iPage = sysPostService.queryPage(pageIndex, pageSize, new SysPost());
        return RespVOBuilder.success(iPage);
    }

    @ApiOperation(value = "通过主键postId查询SysPost", notes = "通过主键postId查询SysPost")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "postId", paramType = "path", value = "postId", required = true, dataType = "Long")
    })
    @GetMapping("/{postId}")
    public RespVO<SysPost> selectByPrimaryKey(@PathVariable(value = "postId") Long postId) {
        SysPost sysPost =
            sysPostService.selectByPrimaryKey(postId);
        if (sysPost == null){
            return RespVOBuilder.failure("当前SysPost不存在");
        } else{
            return RespVOBuilder.success(sysPost);
        }
    }

    @ApiOperation(value = "通过主键postId删除SysPost", notes = "通过主键postId删除SysPost")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "postId", paramType = "path", value = "postId", required = true, dataType = "Long")
    })
    @DeleteMapping("/{postId}")
    public RespVO deleteByPrimaryKey(@PathVariable(value = "postId") Long postId) {
        Integer num = sysPostService.deleteByPrimaryKey(postId);
        if (num == 0) {
            return RespVOBuilder.failure("删除SysPost失败");
        } else {
            return RespVOBuilder.success("删除SysPost成功");
        }
    }

    @ApiOperation(value = "新增SysPost", notes = "新增SysPost")
    @ApiImplicitParams({
    })
    @PostMapping("/")
    public RespVO insert(@RequestBody SysPost sysPost) {
        if (sysPost == null){
            return RespVOBuilder.failure("参数不能为空");
        }
        Integer num = sysPostService.insert(sysPost);
        if (num == 0) {
            return RespVOBuilder.failure("添加SysPost失败");
        } else {
            return RespVOBuilder.success("添加SysPost成功");
        }
    }

    @ApiOperation(value = "修改SysPost", notes = "修改SysPost")
    @ApiImplicitParams({
    })
    @PutMapping("/")
    public RespVO updateByPrimaryKey(@RequestBody SysPost sysPost) {
        if (sysPost == null){
            return RespVOBuilder.failure("参数不能为空");
        }
        Integer num = sysPostService.updateByPrimaryKey(sysPost);
        if (num == 0) {
            return RespVOBuilder.failure("修改SysPost失败");
        } else {
            return RespVOBuilder.success("修改SysPost成功");
        }
    }


    @ApiOperation(value = "通过主键postId批量删除SysPost", notes = "通过主键postId批量删除SysPost")
    @ApiImplicitParams({
    })
    @DeleteMapping("/deleteBatchPrimaryKeys")
    public RespVO deleteBatchPrimaryKeys(@RequestBody List<Long> list) {
        if (CollectionUtils.isEmpty(list)) {
            return RespVOBuilder.failure("参数不能为空");
        }
        Integer num = sysPostService.deleteBatchIds(list);
        if (num == 0) {
            return RespVOBuilder.failure("批量删除SysPost失败");
        } else {
            return RespVOBuilder.success("批量删除SysPost成功");
        }
    }


    @ApiOperation(value = "条件查询SysPost", notes = "条件查询SysPost")
    @ApiImplicitParams({
    })
    @PostMapping("/list")
    public RespVO query(@RequestBody SysPost sysPost) {
        if (sysPost ==null){
            return RespVOBuilder.failure("参数不能为空");
        }
        List<SysPost> list = sysPostService.query(sysPost);
        return RespVOBuilder.success(list);
    }
}
