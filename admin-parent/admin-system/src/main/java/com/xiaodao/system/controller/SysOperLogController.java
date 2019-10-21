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
import com.xiaodao.system.service.ISysOperLogService;
import com.xiaodao.system.entity.SysOperLog;
import java.util.List;


/**
 * 操作日志记录
 *
 * @author 高磊
 * @email 513684652@qq.com
 * @since jdk 1.8
 */
@RestController
@RequestMapping("/sysOperLog")
@Api(value = "操作日志记录管理", tags = "操作日志记录管理")
@Validated
@Slf4j
public class SysOperLogController {
    @Autowired
    private ISysOperLogService sysOperLogService;

    @ApiOperation(value = "分页查询操作日志记录", notes = "分页查询操作日志记录")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageIndex", value = "当前页", dataType = "int", required = true, example = "1", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "每页大小", dataType = "int", defaultValue = "10", example = "10", paramType = "query"),
    })
    @GetMapping("/")
    public RespVO<IPage<SysOperLog>> queryPage(@RequestParam(value = "pageIndex") int pageIndex,
                                                          @RequestParam(required = false, defaultValue = "10") int pageSize) {
        IPage<SysOperLog> iPage = sysOperLogService.queryPage(pageIndex, pageSize, new SysOperLog());
        return RespVOBuilder.success(iPage);
    }

    @ApiOperation(value = "通过主键operId查询操作日志记录", notes = "通过主键operId查询操作日志记录")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "operId", paramType = "path", value = "operId", required = true, dataType = "Long")
    })
    @GetMapping("/{operId}")
    public RespVO<SysOperLog> selectByPrimaryKey(@PathVariable(value = "operId") Long operId) {
        SysOperLog sysOperLog =
            sysOperLogService.selectByPrimaryKey(operId);
        if (sysOperLog == null){
            return RespVOBuilder.failure("当前操作日志记录不存在");
        } else{
            return RespVOBuilder.success(sysOperLog);
        }
    }

    @ApiOperation(value = "通过主键operId删除操作日志记录", notes = "通过主键operId删除操作日志记录")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "operId", paramType = "path", value = "operId", required = true, dataType = "Long")
    })
    @DeleteMapping("/{operId}")
    public RespVO deleteByPrimaryKey(@PathVariable(value = "operId") Long operId) {
        Integer num = sysOperLogService.deleteByPrimaryKey(operId);
        if (num == 0) {
            return RespVOBuilder.failure("删除操作日志记录失败");
        } else {
            return RespVOBuilder.success("删除操作日志记录成功");
        }
    }

    @ApiOperation(value = "新增操作日志记录", notes = "新增操作日志记录")
    @ApiImplicitParams({
    })
    @PostMapping("/")
    public RespVO insert(@RequestBody SysOperLog sysOperLog) {
        if (sysOperLog == null){
            return RespVOBuilder.failure("参数不能为空");
        }
        Integer num = sysOperLogService.insert(sysOperLog);
        if (num == 0) {
            return RespVOBuilder.failure("添加操作日志记录失败");
        } else {
            return RespVOBuilder.success("添加操作日志记录成功");
        }
    }

    @ApiOperation(value = "修改操作日志记录", notes = "修改操作日志记录")
    @ApiImplicitParams({
    })
    @PutMapping("/")
    public RespVO updateByPrimaryKey(@RequestBody SysOperLog sysOperLog) {
        if (sysOperLog == null){
            return RespVOBuilder.failure("参数不能为空");
        }
        Integer num = sysOperLogService.updateByPrimaryKey(sysOperLog);
        if (num == 0) {
            return RespVOBuilder.failure("修改操作日志记录失败");
        } else {
            return RespVOBuilder.success("修改操作日志记录成功");
        }
    }


    @ApiOperation(value = "通过主键operId批量删除操作日志记录", notes = "通过主键operId批量删除操作日志记录")
    @ApiImplicitParams({
    })
    @DeleteMapping("/deleteBatchPrimaryKeys")
    public RespVO deleteBatchPrimaryKeys(@RequestBody List<Long> list) {
        if (CollectionUtils.isEmpty(list)) {
            return RespVOBuilder.failure("参数不能为空");
        }
        Integer num = sysOperLogService.deleteBatchIds(list);
        if (num == 0) {
            return RespVOBuilder.failure("批量删除操作日志记录失败");
        } else {
            return RespVOBuilder.success("批量删除操作日志记录成功");
        }
    }


    @ApiOperation(value = "条件查询操作日志记录", notes = "条件查询操作日志记录")
    @ApiImplicitParams({
    })
    @PostMapping("/list")
    public RespVO query(@RequestBody SysOperLog sysOperLog) {
        if (sysOperLog ==null){
            return RespVOBuilder.failure("参数不能为空");
        }
        List<SysOperLog> list = sysOperLogService.query(sysOperLog);
        return RespVOBuilder.success(list);
    }
}
