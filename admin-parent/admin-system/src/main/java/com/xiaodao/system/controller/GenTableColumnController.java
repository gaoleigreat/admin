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
import com.xiaodao.system.service.IGenTableColumnService;
import com.xiaodao.system.entity.GenTableColumn;
import java.util.List;


/**
 * GenTableColumn
 *
 * @author ¸ßÀÚ
 * @email 513684652@qq.com
 * @since jdk 1.8
 */
@RestController
@RequestMapping("/genTableColumn")
@Api(value = "GenTableColumn管理", tags = "GenTableColumn管理")
@Validated
@Slf4j
public class GenTableColumnController {
    @Autowired
    private IGenTableColumnService genTableColumnService;

    @ApiOperation(value = "分页查询GenTableColumn", notes = "分页查询GenTableColumn")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageIndex", value = "当前页", dataType = "int", required = true, example = "1", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "每页大小", dataType = "int", defaultValue = "10", example = "10", paramType = "query"),
    })
    @GetMapping("/")
    public RespVO<IPage<GenTableColumn>> queryPage(@RequestParam(value = "pageIndex") int pageIndex,
                                                          @RequestParam(required = false, defaultValue = "10") int pageSize) {
        IPage<GenTableColumn> iPage = genTableColumnService.queryPage(pageIndex, pageSize, new GenTableColumn());
        return RespVOBuilder.success(iPage);
    }

    @ApiOperation(value = "通过主键columnId查询GenTableColumn", notes = "通过主键columnId查询GenTableColumn")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "columnId", paramType = "path", value = "columnId", required = true, dataType = "Long")
    })
    @GetMapping("/{columnId}")
    public RespVO<GenTableColumn> selectByPrimaryKey(@PathVariable(value = "columnId") Long columnId) {
        GenTableColumn genTableColumn =
            genTableColumnService.selectByPrimaryKey(columnId);
        if (genTableColumn == null){
            return RespVOBuilder.failure("当前GenTableColumn不存在");
        } else{
            return RespVOBuilder.success(genTableColumn);
        }
    }

    @ApiOperation(value = "通过主键columnId删除GenTableColumn", notes = "通过主键columnId删除GenTableColumn")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "columnId", paramType = "path", value = "columnId", required = true, dataType = "Long")
    })
    @DeleteMapping("/{columnId}")
    public RespVO deleteByPrimaryKey(@PathVariable(value = "columnId") Long columnId) {
        Integer num = genTableColumnService.deleteByPrimaryKey(columnId);
        if (num == 0) {
            return RespVOBuilder.failure("删除GenTableColumn失败");
        } else {
            return RespVOBuilder.success("删除GenTableColumn成功");
        }
    }

    @ApiOperation(value = "新增GenTableColumn", notes = "新增GenTableColumn")
    @ApiImplicitParams({
    })
    @PostMapping("/")
    public RespVO insert(@RequestBody GenTableColumn genTableColumn) {
        if (genTableColumn == null){
            return RespVOBuilder.failure("参数不能为空");
        }
        Integer num = genTableColumnService.insert(genTableColumn);
        if (num == 0) {
            return RespVOBuilder.failure("添加GenTableColumn失败");
        } else {
            return RespVOBuilder.success("添加GenTableColumn成功");
        }
    }

    @ApiOperation(value = "修改GenTableColumn", notes = "修改GenTableColumn")
    @ApiImplicitParams({
    })
    @PutMapping("/")
    public RespVO updateByPrimaryKey(@RequestBody GenTableColumn genTableColumn) {
        if (genTableColumn == null){
            return RespVOBuilder.failure("参数不能为空");
        }
        Integer num = genTableColumnService.updateByPrimaryKey(genTableColumn);
        if (num == 0) {
            return RespVOBuilder.failure("修改GenTableColumn失败");
        } else {
            return RespVOBuilder.success("修改GenTableColumn成功");
        }
    }


    @ApiOperation(value = "通过主键columnId批量删除GenTableColumn", notes = "通过主键columnId批量删除GenTableColumn")
    @ApiImplicitParams({
    })
    @DeleteMapping("/deleteBatchPrimaryKeys")
    public RespVO deleteBatchPrimaryKeys(@RequestBody List<Long> list) {
        if (CollectionUtils.isEmpty(list)) {
            return RespVOBuilder.failure("参数不能为空");
        }
        Integer num = genTableColumnService.deleteBatchIds(list);
        if (num == 0) {
            return RespVOBuilder.failure("批量删除GenTableColumn失败");
        } else {
            return RespVOBuilder.success("批量删除GenTableColumn成功");
        }
    }


    @ApiOperation(value = "条件查询GenTableColumn", notes = "条件查询GenTableColumn")
    @ApiImplicitParams({
    })
    @PostMapping("/list")
    public RespVO query(@RequestBody GenTableColumn genTableColumn) {
        if (genTableColumn ==null){
            return RespVOBuilder.failure("参数不能为空");
        }
        List<GenTableColumn> list = genTableColumnService.query(genTableColumn);
        return RespVOBuilder.success(list);
    }
}
