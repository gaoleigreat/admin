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
import com.xiaodao.system.service.ISysUserOnlineService;
import com.xiaodao.system.entity.SysUserOnline;
import java.util.List;


/**
 * 在线用户记录
 *
 * @author 高磊
 * @email 513684652@qq.com
 * @since jdk 1.8
 */
@RestController
@RequestMapping("/sysUserOnline")
@Api(value = "在线用户记录管理", tags = "在线用户记录管理")
@Validated
@Slf4j
public class SysUserOnlineController {
    @Autowired
    private ISysUserOnlineService sysUserOnlineService;

    @ApiOperation(value = "分页查询在线用户记录", notes = "分页查询在线用户记录")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageIndex", value = "当前页", dataType = "int", required = true, example = "1", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "每页大小", dataType = "int", defaultValue = "10", example = "10", paramType = "query"),
    })
    @GetMapping("/")
    public RespVO<IPage<SysUserOnline>> queryPage(@RequestParam(value = "pageIndex") int pageIndex,
                                                          @RequestParam(required = false, defaultValue = "10") int pageSize) {
        IPage<SysUserOnline> iPage = sysUserOnlineService.queryPage(pageIndex, pageSize, new SysUserOnline());
        return RespVOBuilder.success(iPage);
    }

    @ApiOperation(value = "通过主键sessionid查询在线用户记录", notes = "通过主键sessionid查询在线用户记录")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "sessionid", paramType = "path", value = "sessionid", required = true, dataType = "String")
    })
    @GetMapping("/{sessionid}")
    public RespVO<SysUserOnline> selectByPrimaryKey(@PathVariable(value = "sessionid") String sessionid) {
        SysUserOnline sysUserOnline =
            sysUserOnlineService.selectByPrimaryKey(sessionid);
        if (sysUserOnline == null){
            return RespVOBuilder.failure("当前在线用户记录不存在");
        } else{
            return RespVOBuilder.success(sysUserOnline);
        }
    }

    @ApiOperation(value = "通过主键sessionid删除在线用户记录", notes = "通过主键sessionid删除在线用户记录")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "sessionid", paramType = "path", value = "sessionid", required = true, dataType = "String")
    })
    @DeleteMapping("/{sessionid}")
    public RespVO deleteByPrimaryKey(@PathVariable(value = "sessionid") String sessionid) {
        Integer num = sysUserOnlineService.deleteByPrimaryKey(sessionid);
        if (num == 0) {
            return RespVOBuilder.failure("删除在线用户记录失败");
        } else {
            return RespVOBuilder.success("删除在线用户记录成功");
        }
    }

    @ApiOperation(value = "新增在线用户记录", notes = "新增在线用户记录")
    @ApiImplicitParams({
    })
    @PostMapping("/")
    public RespVO insert(@RequestBody SysUserOnline sysUserOnline) {
        if (sysUserOnline == null){
            return RespVOBuilder.failure("参数不能为空");
        }
        Integer num = sysUserOnlineService.insert(sysUserOnline);
        if (num == 0) {
            return RespVOBuilder.failure("添加在线用户记录失败");
        } else {
            return RespVOBuilder.success("添加在线用户记录成功");
        }
    }

    @ApiOperation(value = "修改在线用户记录", notes = "修改在线用户记录")
    @ApiImplicitParams({
    })
    @PutMapping("/")
    public RespVO updateByPrimaryKey(@RequestBody SysUserOnline sysUserOnline) {
        if (sysUserOnline == null){
            return RespVOBuilder.failure("参数不能为空");
        }
        Integer num = sysUserOnlineService.updateByPrimaryKey(sysUserOnline);
        if (num == 0) {
            return RespVOBuilder.failure("修改在线用户记录失败");
        } else {
            return RespVOBuilder.success("修改在线用户记录成功");
        }
    }


    @ApiOperation(value = "通过主键sessionid批量删除在线用户记录", notes = "通过主键sessionid批量删除在线用户记录")
    @ApiImplicitParams({
    })
    @DeleteMapping("/deleteBatchPrimaryKeys")
    public RespVO deleteBatchPrimaryKeys(@RequestBody List<String> list) {
        if (CollectionUtils.isEmpty(list)) {
            return RespVOBuilder.failure("参数不能为空");
        }
        Integer num = sysUserOnlineService.deleteBatchIds(list);
        if (num == 0) {
            return RespVOBuilder.failure("批量删除在线用户记录失败");
        } else {
            return RespVOBuilder.success("批量删除在线用户记录成功");
        }
    }


    @ApiOperation(value = "条件查询在线用户记录", notes = "条件查询在线用户记录")
    @ApiImplicitParams({
    })
    @PostMapping("/list")
    public RespVO query(@RequestBody SysUserOnline sysUserOnline) {
        if (sysUserOnline ==null){
            return RespVOBuilder.failure("参数不能为空");
        }
        List<SysUserOnline> list = sysUserOnlineService.query(sysUserOnline);
        return RespVOBuilder.success(list);
    }
}
