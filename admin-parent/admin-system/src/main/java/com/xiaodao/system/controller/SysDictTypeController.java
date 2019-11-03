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
import com.xiaodao.system.service.ISysDictTypeService;
import com.xiaodao.system.entity.SysDictType;
import java.util.List;


/**
 * SysDictType
 *
 * @author xiaodao
 * @email 513684652@qq.com
 * @since jdk 1.8
 */
@RestController
@RequestMapping("/sysDictType")
@Api(value = "SysDictType管理", tags = "SysDictType管理")
@Validated
@Slf4j
public class SysDictTypeController {
    @Autowired
    private ISysDictTypeService sysDictTypeService;

    @ApiOperation(value = "分页查询SysDictType", notes = "分页查询SysDictType")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageIndex", value = "当前页", dataType = "int", required = true, example = "1", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "每页大小", dataType = "int", defaultValue = "10", example = "10", paramType = "query"),
    })
    @GetMapping("/")
    public RespVO<IPage<SysDictType>> queryPage(@RequestParam(value = "pageIndex") int pageIndex,
                                                          @RequestParam(required = false, defaultValue = "10") int pageSize) {
        IPage<SysDictType> iPage = sysDictTypeService.queryPage(pageIndex, pageSize, new SysDictType());
        return RespVOBuilder.success(iPage);
    }

    @ApiOperation(value = "通过主键dictId查询SysDictType", notes = "通过主键dictId查询SysDictType")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "dictId", paramType = "path", value = "dictId", required = true, dataType = "Long")
    })
    @GetMapping("/{dictId}")
    public RespVO<SysDictType> selectByPrimaryKey(@PathVariable(value = "dictId") Long dictId) {
        SysDictType sysDictType =
            sysDictTypeService.selectByPrimaryKey(dictId);
        if (sysDictType == null){
            return RespVOBuilder.failure("当前SysDictType不存在");
        } else{
            return RespVOBuilder.success(sysDictType);
        }
    }

    @ApiOperation(value = "通过主键dictId删除SysDictType", notes = "通过主键dictId删除SysDictType")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "dictId", paramType = "path", value = "dictId", required = true, dataType = "Long")
    })
    @DeleteMapping("/{dictId}")
    public RespVO deleteByPrimaryKey(@PathVariable(value = "dictId") Long dictId) {
        Integer num = sysDictTypeService.deleteByPrimaryKey(dictId);
        if (num == 0) {
            return RespVOBuilder.failure("删除SysDictType失败");
        } else {
            return RespVOBuilder.success("删除SysDictType成功");
        }
    }

    @ApiOperation(value = "新增SysDictType", notes = "新增SysDictType")
    @ApiImplicitParams({
    })
    @PostMapping("/")
    public RespVO insert(@RequestBody SysDictType sysDictType) {
        if (sysDictType == null){
            return RespVOBuilder.failure("参数不能为空");
        }
        Integer num = sysDictTypeService.insert(sysDictType);
        if (num == 0) {
            return RespVOBuilder.failure("添加SysDictType失败");
        } else {
            return RespVOBuilder.success("添加SysDictType成功");
        }
    }

    @ApiOperation(value = "修改SysDictType", notes = "修改SysDictType")
    @ApiImplicitParams({
    })
    @PutMapping("/")
    public RespVO updateByPrimaryKey(@RequestBody SysDictType sysDictType) {
        if (sysDictType == null){
            return RespVOBuilder.failure("参数不能为空");
        }
        Integer num = sysDictTypeService.updateByPrimaryKey(sysDictType);
        if (num == 0) {
            return RespVOBuilder.failure("修改SysDictType失败");
        } else {
            return RespVOBuilder.success("修改SysDictType成功");
        }
    }


    @ApiOperation(value = "通过主键dictId批量删除SysDictType", notes = "通过主键dictId批量删除SysDictType")
    @ApiImplicitParams({
    })
    @DeleteMapping("/deleteBatchPrimaryKeys")
    public RespVO deleteBatchPrimaryKeys(@RequestBody List<Long> list) {
        if (CollectionUtils.isEmpty(list)) {
            return RespVOBuilder.failure("参数不能为空");
        }
        Integer num = sysDictTypeService.deleteBatchIds(list);
        if (num == 0) {
            return RespVOBuilder.failure("批量删除SysDictType失败");
        } else {
            return RespVOBuilder.success("批量删除SysDictType成功");
        }
    }


    @ApiOperation(value = "条件查询SysDictType", notes = "条件查询SysDictType")
    @ApiImplicitParams({
    })
    @PostMapping("/list")
    public RespVO query(@RequestBody SysDictType sysDictType) {
        if (sysDictType ==null){
            return RespVOBuilder.failure("参数不能为空");
        }
        List<SysDictType> list = sysDictTypeService.query(sysDictType);
        return RespVOBuilder.success(list);
    }
}
