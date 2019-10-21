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
 * 通知公告表
 *
 * @author 高磊
 * @email 513684652@qq.com
 * @since jdk 1.8
 */
@RestController
@RequestMapping("/sysNotice")
@Api(value = "通知公告表管理", tags = "通知公告表管理")
@Validated
@Slf4j
public class SysNoticeController {
    @Autowired
    private ISysNoticeService sysNoticeService;

    @ApiOperation(value = "分页查询通知公告表", notes = "分页查询通知公告表")
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

    @ApiOperation(value = "通过主键noticeId查询通知公告表", notes = "通过主键noticeId查询通知公告表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "noticeId", paramType = "path", value = "noticeId", required = true, dataType = "Long")
    })
    @GetMapping("/{noticeId}")
    public RespVO<SysNotice> selectByPrimaryKey(@PathVariable(value = "noticeId") Long noticeId) {
        SysNotice sysNotice =
            sysNoticeService.selectByPrimaryKey(noticeId);
        if (sysNotice == null){
            return RespVOBuilder.failure("当前通知公告表不存在");
        } else{
            return RespVOBuilder.success(sysNotice);
        }
    }

    @ApiOperation(value = "通过主键noticeId删除通知公告表", notes = "通过主键noticeId删除通知公告表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "noticeId", paramType = "path", value = "noticeId", required = true, dataType = "Long")
    })
    @DeleteMapping("/{noticeId}")
    public RespVO deleteByPrimaryKey(@PathVariable(value = "noticeId") Long noticeId) {
        Integer num = sysNoticeService.deleteByPrimaryKey(noticeId);
        if (num == 0) {
            return RespVOBuilder.failure("删除通知公告表失败");
        } else {
            return RespVOBuilder.success("删除通知公告表成功");
        }
    }

    @ApiOperation(value = "新增通知公告表", notes = "新增通知公告表")
    @ApiImplicitParams({
    })
    @PostMapping("/")
    public RespVO insert(@RequestBody SysNotice sysNotice) {
        if (sysNotice == null){
            return RespVOBuilder.failure("参数不能为空");
        }
        Integer num = sysNoticeService.insert(sysNotice);
        if (num == 0) {
            return RespVOBuilder.failure("添加通知公告表失败");
        } else {
            return RespVOBuilder.success("添加通知公告表成功");
        }
    }

    @ApiOperation(value = "修改通知公告表", notes = "修改通知公告表")
    @ApiImplicitParams({
    })
    @PutMapping("/")
    public RespVO updateByPrimaryKey(@RequestBody SysNotice sysNotice) {
        if (sysNotice == null){
            return RespVOBuilder.failure("参数不能为空");
        }
        Integer num = sysNoticeService.updateByPrimaryKey(sysNotice);
        if (num == 0) {
            return RespVOBuilder.failure("修改通知公告表失败");
        } else {
            return RespVOBuilder.success("修改通知公告表成功");
        }
    }


    @ApiOperation(value = "通过主键noticeId批量删除通知公告表", notes = "通过主键noticeId批量删除通知公告表")
    @ApiImplicitParams({
    })
    @DeleteMapping("/deleteBatchPrimaryKeys")
    public RespVO deleteBatchPrimaryKeys(@RequestBody List<Long> list) {
        if (CollectionUtils.isEmpty(list)) {
            return RespVOBuilder.failure("参数不能为空");
        }
        Integer num = sysNoticeService.deleteBatchIds(list);
        if (num == 0) {
            return RespVOBuilder.failure("批量删除通知公告表失败");
        } else {
            return RespVOBuilder.success("批量删除通知公告表成功");
        }
    }


    @ApiOperation(value = "条件查询通知公告表", notes = "条件查询通知公告表")
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
