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
import com.xiaodao.system.service.ISysDictDataService;
import com.xiaodao.system.entity.SysDictData;
import java.util.List;


/**
 * SysDictData
 *
 * @author ¸ßÀÚ
 * @email 513684652@qq.com
 * @since jdk 1.8
 */
@RestController
@RequestMapping("/sysDictData")
@Api(value = "SysDictData管理", tags = "SysDictData管理")
@Validated
@Slf4j
public class SysDictDataController {
    @Autowired
    private ISysDictDataService sysDictDataService;

    @ApiOperation(value = "分页查询SysDictData", notes = "分页查询SysDictData")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageIndex", value = "当前页", dataType = "int", required = true, example = "1", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "每页大小", dataType = "int", defaultValue = "10", example = "10", paramType = "query"),
    })
    @GetMapping("/")
    public RespVO<IPage<SysDictData>> queryPage(@RequestParam(value = "pageIndex") int pageIndex,
                                                          @RequestParam(required = false, defaultValue = "10") int pageSize) {
        IPage<SysDictData> iPage = sysDictDataService.queryPage(pageIndex, pageSize, new SysDictData());
        return RespVOBuilder.success(iPage);
    }

    @ApiOperation(value = "通过主键dictCode查询SysDictData", notes = "通过主键dictCode查询SysDictData")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "dictCode", paramType = "path", value = "dictCode", required = true, dataType = "Integer")
    })
    @GetMapping("/{dictCode}")
    public RespVO<SysDictData> selectByPrimaryKey(@PathVariable(value = "dictCode") Integer dictCode) {
        SysDictData sysDictData =
            sysDictDataService.selectByPrimaryKey(dictCode);
        if (sysDictData == null){
            return RespVOBuilder.failure("当前SysDictData不存在");
        } else{
            return RespVOBuilder.success(sysDictData);
        }
    }

    @ApiOperation(value = "通过主键dictCode删除SysDictData", notes = "通过主键dictCode删除SysDictData")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "dictCode", paramType = "path", value = "dictCode", required = true, dataType = "Integer")
    })
    @DeleteMapping("/{dictCode}")
    public RespVO deleteByPrimaryKey(@PathVariable(value = "dictCode") Integer dictCode) {
        Integer num = sysDictDataService.deleteByPrimaryKey(dictCode);
        if (num == 0) {
            return RespVOBuilder.failure("删除SysDictData失败");
        } else {
            return RespVOBuilder.success("删除SysDictData成功");
        }
    }

    @ApiOperation(value = "新增SysDictData", notes = "新增SysDictData")
    @ApiImplicitParams({
    })
    @PostMapping("/")
    public RespVO insert(@RequestBody SysDictData sysDictData) {
        if (sysDictData == null){
            return RespVOBuilder.failure("参数不能为空");
        }
        Integer num = sysDictDataService.insert(sysDictData);
        if (num == 0) {
            return RespVOBuilder.failure("添加SysDictData失败");
        } else {
            return RespVOBuilder.success("添加SysDictData成功");
        }
    }

    @ApiOperation(value = "修改SysDictData", notes = "修改SysDictData")
    @ApiImplicitParams({
    })
    @PutMapping("/")
    public RespVO updateByPrimaryKey(@RequestBody SysDictData sysDictData) {
        if (sysDictData == null){
            return RespVOBuilder.failure("参数不能为空");
        }
        Integer num = sysDictDataService.updateByPrimaryKey(sysDictData);
        if (num == 0) {
            return RespVOBuilder.failure("修改SysDictData失败");
        } else {
            return RespVOBuilder.success("修改SysDictData成功");
        }
    }


    @ApiOperation(value = "通过主键dictCode批量删除SysDictData", notes = "通过主键dictCode批量删除SysDictData")
    @ApiImplicitParams({
    })
    @DeleteMapping("/deleteBatchPrimaryKeys")
    public RespVO deleteBatchPrimaryKeys(@RequestBody List<Integer> list) {
        if (CollectionUtils.isEmpty(list)) {
            return RespVOBuilder.failure("参数不能为空");
        }
        Integer num = sysDictDataService.deleteBatchIds(list);
        if (num == 0) {
            return RespVOBuilder.failure("批量删除SysDictData失败");
        } else {
            return RespVOBuilder.success("批量删除SysDictData成功");
        }
    }


    @ApiOperation(value = "条件查询SysDictData", notes = "条件查询SysDictData")
    @ApiImplicitParams({
    })
    @PostMapping("/list")
    public RespVO query(@RequestBody SysDictData sysDictData) {
        if (sysDictData ==null){
            return RespVOBuilder.failure("参数不能为空");
        }
        List<SysDictData> list = sysDictDataService.query(sysDictData);
        return RespVOBuilder.success(list);
    }
}
