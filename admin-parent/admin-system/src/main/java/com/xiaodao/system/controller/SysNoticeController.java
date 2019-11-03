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
import com.xiaodao.system.service.ISysNoticeService;
import com.xiaodao.system.entity.SysNotice;
import java.util.List;


/**
 * SysNotice
 *
 * @author xiaodao
 * @email 513684652@qq.com
 * @since jdk 1.8
 */
@RestController
@RequestMapping("/sysNotice")
@Api(value = "SysNotice管理", tags = "SysNotice管理")
@Validated
@Slf4j
public class SysNoticeController {
    @Autowired
    private ISysNoticeService sysNoticeService;

    @ApiOperation(value = "分页查询SysNotice", notes = "分页查询SysNotice")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageIndex", value = "当前页", dataType = "int", required = true, example = "1", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "每页大小", dataType = "int", defaultValue = "10", example = "10", paramType = "query"),
    })
    @GetMapping("/")
    public RespVO<IPage<SysNotice>> queryPage(@RequestParam(value = "pageIndex") int pageIndex,
                                                          @RequestParam(required = false, defaultValue = "10") int pageSize) {
        IPage<SysNotice> iPage = sysNoticeService.queryPage(pageIndex, pageSize, new SysNotice());
        return RespVOBuilder.success(iPage);
    }

    @ApiOperation(value = "通过主键noticeId查询SysNotice", notes = "通过主键noticeId查询SysNotice")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "noticeId", paramType = "path", value = "noticeId", required = true, dataType = "Long")
    })
    @GetMapping("/{noticeId}")
    public RespVO<SysNotice> selectByPrimaryKey(@PathVariable(value = "noticeId") Long noticeId) {
        SysNotice sysNotice =
            sysNoticeService.selectByPrimaryKey(noticeId);
        if (sysNotice == null){
            return RespVOBuilder.failure("当前SysNotice不存在");
        } else{
            return RespVOBuilder.success(sysNotice);
        }
    }

    @ApiOperation(value = "通过主键noticeId删除SysNotice", notes = "通过主键noticeId删除SysNotice")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "noticeId", paramType = "path", value = "noticeId", required = true, dataType = "Long")
    })
    @DeleteMapping("/{noticeId}")
    public RespVO deleteByPrimaryKey(@PathVariable(value = "noticeId") Long noticeId) {
        Integer num = sysNoticeService.deleteByPrimaryKey(noticeId);
        if (num == 0) {
            return RespVOBuilder.failure("删除SysNotice失败");
        } else {
            return RespVOBuilder.success("删除SysNotice成功");
        }
    }

    @ApiOperation(value = "新增SysNotice", notes = "新增SysNotice")
    @ApiImplicitParams({
    })
    @PostMapping("/")
    public RespVO insert(@RequestBody SysNotice sysNotice) {
        if (sysNotice == null){
            return RespVOBuilder.failure("参数不能为空");
        }
        Integer num = sysNoticeService.insert(sysNotice);
        if (num == 0) {
            return RespVOBuilder.failure("添加SysNotice失败");
        } else {
            return RespVOBuilder.success("添加SysNotice成功");
        }
    }

    @ApiOperation(value = "修改SysNotice", notes = "修改SysNotice")
    @ApiImplicitParams({
    })
    @PutMapping("/")
    public RespVO updateByPrimaryKey(@RequestBody SysNotice sysNotice) {
        if (sysNotice == null){
            return RespVOBuilder.failure("参数不能为空");
        }
        Integer num = sysNoticeService.updateByPrimaryKey(sysNotice);
        if (num == 0) {
            return RespVOBuilder.failure("修改SysNotice失败");
        } else {
            return RespVOBuilder.success("修改SysNotice成功");
        }
    }


    @ApiOperation(value = "通过主键noticeId批量删除SysNotice", notes = "通过主键noticeId批量删除SysNotice")
    @ApiImplicitParams({
    })
    @DeleteMapping("/deleteBatchPrimaryKeys")
    public RespVO deleteBatchPrimaryKeys(@RequestBody List<Long> list) {
        if (CollectionUtils.isEmpty(list)) {
            return RespVOBuilder.failure("参数不能为空");
        }
        Integer num = sysNoticeService.deleteBatchIds(list);
        if (num == 0) {
            return RespVOBuilder.failure("批量删除SysNotice失败");
        } else {
            return RespVOBuilder.success("批量删除SysNotice成功");
        }
    }


    @ApiOperation(value = "条件查询SysNotice", notes = "条件查询SysNotice")
    @ApiImplicitParams({
    })
    @PostMapping("/list")
    public RespVO query(@RequestBody SysNotice sysNotice) {
        if (sysNotice ==null){
            return RespVOBuilder.failure("参数不能为空");
        }
        List<SysNotice> list = sysNoticeService.query(sysNotice);
        return RespVOBuilder.success(list);
    }
}
