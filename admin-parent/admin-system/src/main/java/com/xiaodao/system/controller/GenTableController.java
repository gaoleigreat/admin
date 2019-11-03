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
import com.xiaodao.system.service.IGenTableService;
import com.xiaodao.system.entity.GenTable;
import java.util.List;


/**
 * GenTable
 *
 * @author xiaodao
 * @email 513684652@qq.com
 * @since jdk 1.8
 */
@RestController
@RequestMapping("/genTable")
@Api(value = "GenTable管理", tags = "GenTable管理")
@Validated
@Slf4j
public class GenTableController {
    @Autowired
    private IGenTableService genTableService;

    @ApiOperation(value = "分页查询GenTable", notes = "分页查询GenTable")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageIndex", value = "当前页", dataType = "int", required = true, example = "1", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "每页大小", dataType = "int", defaultValue = "10", example = "10", paramType = "query"),
    })
    @GetMapping("/")
    public RespVO<IPage<GenTable>> queryPage(@RequestParam(value = "pageIndex") int pageIndex,
                                                          @RequestParam(required = false, defaultValue = "10") int pageSize) {
        IPage<GenTable> iPage = genTableService.queryPage(pageIndex, pageSize, new GenTable());
        return RespVOBuilder.success(iPage);
    }

    @ApiOperation(value = "通过主键tableId查询GenTable", notes = "通过主键tableId查询GenTable")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "tableId", paramType = "path", value = "tableId", required = true, dataType = "Long")
    })
    @GetMapping("/{tableId}")
    public RespVO<GenTable> selectByPrimaryKey(@PathVariable(value = "tableId") Long tableId) {
        GenTable genTable =
            genTableService.selectByPrimaryKey(tableId);
        if (genTable == null){
            return RespVOBuilder.failure("当前GenTable不存在");
        } else{
            return RespVOBuilder.success(genTable);
        }
    }

    @ApiOperation(value = "通过主键tableId删除GenTable", notes = "通过主键tableId删除GenTable")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "tableId", paramType = "path", value = "tableId", required = true, dataType = "Long")
    })
    @DeleteMapping("/{tableId}")
    public RespVO deleteByPrimaryKey(@PathVariable(value = "tableId") Long tableId) {
        Integer num = genTableService.deleteByPrimaryKey(tableId);
        if (num == 0) {
            return RespVOBuilder.failure("删除GenTable失败");
        } else {
            return RespVOBuilder.success("删除GenTable成功");
        }
    }

    @ApiOperation(value = "新增GenTable", notes = "新增GenTable")
    @ApiImplicitParams({
    })
    @PostMapping("/")
    public RespVO insert(@RequestBody GenTable genTable) {
        if (genTable == null){
            return RespVOBuilder.failure("参数不能为空");
        }
        Integer num = genTableService.insert(genTable);
        if (num == 0) {
            return RespVOBuilder.failure("添加GenTable失败");
        } else {
            return RespVOBuilder.success("添加GenTable成功");
        }
    }

    @ApiOperation(value = "修改GenTable", notes = "修改GenTable")
    @ApiImplicitParams({
    })
    @PutMapping("/")
    public RespVO updateByPrimaryKey(@RequestBody GenTable genTable) {
        if (genTable == null){
            return RespVOBuilder.failure("参数不能为空");
        }
        Integer num = genTableService.updateByPrimaryKey(genTable);
        if (num == 0) {
            return RespVOBuilder.failure("修改GenTable失败");
        } else {
            return RespVOBuilder.success("修改GenTable成功");
        }
    }


    @ApiOperation(value = "通过主键tableId批量删除GenTable", notes = "通过主键tableId批量删除GenTable")
    @ApiImplicitParams({
    })
    @DeleteMapping("/deleteBatchPrimaryKeys")
    public RespVO deleteBatchPrimaryKeys(@RequestBody List<Long> list) {
        if (CollectionUtils.isEmpty(list)) {
            return RespVOBuilder.failure("参数不能为空");
        }
        Integer num = genTableService.deleteBatchIds(list);
        if (num == 0) {
            return RespVOBuilder.failure("批量删除GenTable失败");
        } else {
            return RespVOBuilder.success("批量删除GenTable成功");
        }
    }


    @ApiOperation(value = "条件查询GenTable", notes = "条件查询GenTable")
    @ApiImplicitParams({
    })
    @PostMapping("/list")
    public RespVO query(@RequestBody GenTable genTable) {
        if (genTable ==null){
            return RespVOBuilder.failure("参数不能为空");
        }
        List<GenTable> list = genTableService.query(genTable);
        return RespVOBuilder.success(list);
    }
}
