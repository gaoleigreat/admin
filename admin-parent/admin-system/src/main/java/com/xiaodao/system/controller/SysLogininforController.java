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
import com.xiaodao.system.service.ISysLogininforService;
import com.xiaodao.system.entity.SysLogininfor;
import java.util.List;


/**
 * 系统访问记录
 *
 * @author 高磊
 * @email 513684652@qq.com
 * @since jdk 1.8
 */
@RestController
@RequestMapping("/sysLogininfor")
@Api(value = "系统访问记录管理", tags = "系统访问记录管理")
@Validated
@Slf4j
public class SysLogininforController {
    @Autowired
    private ISysLogininforService sysLogininforService;

    @ApiOperation(value = "分页查询系统访问记录", notes = "分页查询系统访问记录")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageIndex", value = "当前页", dataType = "int", required = true, example = "1", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "每页大小", dataType = "int", defaultValue = "10", example = "10", paramType = "query"),
    })
    @GetMapping("/")
    public RespVO<IPage<SysLogininfor>> queryPage(@RequestParam(value = "pageIndex") int pageIndex,
                                                          @RequestParam(required = false, defaultValue = "10") int pageSize) {
        IPage<SysLogininfor> iPage = sysLogininforService.queryPage(pageIndex, pageSize, new SysLogininfor());
        return RespVOBuilder.success(iPage);
    }

    @ApiOperation(value = "通过主键infoId查询系统访问记录", notes = "通过主键infoId查询系统访问记录")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "infoId", paramType = "path", value = "infoId", required = true, dataType = "Long")
    })
    @GetMapping("/{infoId}")
    public RespVO<SysLogininfor> selectByPrimaryKey(@PathVariable(value = "infoId") Long infoId) {
        SysLogininfor sysLogininfor =
            sysLogininforService.selectByPrimaryKey(infoId);
        if (sysLogininfor == null){
            return RespVOBuilder.failure("当前系统访问记录不存在");
        } else{
            return RespVOBuilder.success(sysLogininfor);
        }
    }

    @ApiOperation(value = "通过主键infoId删除系统访问记录", notes = "通过主键infoId删除系统访问记录")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "infoId", paramType = "path", value = "infoId", required = true, dataType = "Long")
    })
    @DeleteMapping("/{infoId}")
    public RespVO deleteByPrimaryKey(@PathVariable(value = "infoId") Long infoId) {
        Integer num = sysLogininforService.deleteByPrimaryKey(infoId);
        if (num == 0) {
            return RespVOBuilder.failure("删除系统访问记录失败");
        } else {
            return RespVOBuilder.success("删除系统访问记录成功");
        }
    }

    @ApiOperation(value = "新增系统访问记录", notes = "新增系统访问记录")
    @ApiImplicitParams({
    })
    @PostMapping("/")
    public RespVO insert(@RequestBody SysLogininfor sysLogininfor) {
        if (sysLogininfor == null){
            return RespVOBuilder.failure("参数不能为空");
        }
        Integer num = sysLogininforService.insert(sysLogininfor);
        if (num == 0) {
            return RespVOBuilder.failure("添加系统访问记录失败");
        } else {
            return RespVOBuilder.success("添加系统访问记录成功");
        }
    }

    @ApiOperation(value = "修改系统访问记录", notes = "修改系统访问记录")
    @ApiImplicitParams({
    })
    @PutMapping("/")
    public RespVO updateByPrimaryKey(@RequestBody SysLogininfor sysLogininfor) {
        if (sysLogininfor == null){
            return RespVOBuilder.failure("参数不能为空");
        }
        Integer num = sysLogininforService.updateByPrimaryKey(sysLogininfor);
        if (num == 0) {
            return RespVOBuilder.failure("修改系统访问记录失败");
        } else {
            return RespVOBuilder.success("修改系统访问记录成功");
        }
    }


    @ApiOperation(value = "通过主键infoId批量删除系统访问记录", notes = "通过主键infoId批量删除系统访问记录")
    @ApiImplicitParams({
    })
    @DeleteMapping("/deleteBatchPrimaryKeys")
    public RespVO deleteBatchPrimaryKeys(@RequestBody List<Long> list) {
        if (CollectionUtils.isEmpty(list)) {
            return RespVOBuilder.failure("参数不能为空");
        }
        Integer num = sysLogininforService.deleteBatchIds(list);
        if (num == 0) {
            return RespVOBuilder.failure("批量删除系统访问记录失败");
        } else {
            return RespVOBuilder.success("批量删除系统访问记录成功");
        }
    }


    @ApiOperation(value = "条件查询系统访问记录", notes = "条件查询系统访问记录")
    @ApiImplicitParams({
    })
    @PostMapping("/list")
    public RespVO query(@RequestBody SysLogininfor sysLogininfor) {
        if (sysLogininfor ==null){
            return RespVOBuilder.failure("参数不能为空");
        }
        List<SysLogininfor> list = sysLogininforService.query(sysLogininfor);
        return RespVOBuilder.success(list);
    }
}
