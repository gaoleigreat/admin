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
import com.xiaodao.system.service.ISysDeptService;
import com.xiaodao.system.entity.SysDept;
import java.util.List;


/**
 * SysDept
 *
 * @author xiaodao
 * @email 513684652@qq.com
 * @since jdk 1.8
 */
@RestController
@RequestMapping("/sysDept")
@Api(value = "SysDept管理", tags = "SysDept管理")
@Validated
@Slf4j
public class SysDeptController {
    @Autowired
    private ISysDeptService sysDeptService;

    @ApiOperation(value = "分页查询SysDept", notes = "分页查询SysDept")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageIndex", value = "当前页", dataType = "int", required = true, example = "1", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "每页大小", dataType = "int", defaultValue = "10", example = "10", paramType = "query"),
    })
    @GetMapping("/")
    public RespVO<IPage<SysDept>> queryPage(@RequestParam(value = "pageIndex") int pageIndex,
                                                          @RequestParam(required = false, defaultValue = "10") int pageSize) {
        IPage<SysDept> iPage = sysDeptService.queryPage(pageIndex, pageSize, new SysDept());
        return RespVOBuilder.success(iPage);
    }

    @ApiOperation(value = "通过主键deptId查询SysDept", notes = "通过主键deptId查询SysDept")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "deptId", paramType = "path", value = "deptId", required = true, dataType = "Long")
    })
    @GetMapping("/{deptId}")
    public RespVO<SysDept> selectByPrimaryKey(@PathVariable(value = "deptId") Long deptId) {
        SysDept sysDept =
            sysDeptService.selectByPrimaryKey(deptId);
        if (sysDept == null){
            return RespVOBuilder.failure("当前SysDept不存在");
        } else{
            return RespVOBuilder.success(sysDept);
        }
    }

    @ApiOperation(value = "通过主键deptId删除SysDept", notes = "通过主键deptId删除SysDept")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "deptId", paramType = "path", value = "deptId", required = true, dataType = "Long")
    })
    @DeleteMapping("/{deptId}")
    public RespVO deleteByPrimaryKey(@PathVariable(value = "deptId") Long deptId) {
        Integer num = sysDeptService.deleteByPrimaryKey(deptId);
        if (num == 0) {
            return RespVOBuilder.failure("删除SysDept失败");
        } else {
            return RespVOBuilder.success("删除SysDept成功");
        }
    }

    @ApiOperation(value = "新增SysDept", notes = "新增SysDept")
    @ApiImplicitParams({
    })
    @PostMapping("/")
    public RespVO insert(@RequestBody SysDept sysDept) {
        if (sysDept == null){
            return RespVOBuilder.failure("参数不能为空");
        }
        Integer num = sysDeptService.insert(sysDept);
        if (num == 0) {
            return RespVOBuilder.failure("添加SysDept失败");
        } else {
            return RespVOBuilder.success("添加SysDept成功");
        }
    }

    @ApiOperation(value = "修改SysDept", notes = "修改SysDept")
    @ApiImplicitParams({
    })
    @PutMapping("/")
    public RespVO updateByPrimaryKey(@RequestBody SysDept sysDept) {
        if (sysDept == null){
            return RespVOBuilder.failure("参数不能为空");
        }
        Integer num = sysDeptService.updateByPrimaryKey(sysDept);
        if (num == 0) {
            return RespVOBuilder.failure("修改SysDept失败");
        } else {
            return RespVOBuilder.success("修改SysDept成功");
        }
    }


    @ApiOperation(value = "通过主键deptId批量删除SysDept", notes = "通过主键deptId批量删除SysDept")
    @ApiImplicitParams({
    })
    @DeleteMapping("/deleteBatchPrimaryKeys")
    public RespVO deleteBatchPrimaryKeys(@RequestBody List<Long> list) {
        if (CollectionUtils.isEmpty(list)) {
            return RespVOBuilder.failure("参数不能为空");
        }
        Integer num = sysDeptService.deleteBatchIds(list);
        if (num == 0) {
            return RespVOBuilder.failure("批量删除SysDept失败");
        } else {
            return RespVOBuilder.success("批量删除SysDept成功");
        }
    }


    @ApiOperation(value = "条件查询SysDept", notes = "条件查询SysDept")
    @ApiImplicitParams({
    })
    @PostMapping("/list")
    public RespVO query(@RequestBody SysDept sysDept) {
        if (sysDept ==null){
            return RespVOBuilder.failure("参数不能为空");
        }
        List<SysDept> list = sysDeptService.query(sysDept);
        return RespVOBuilder.success(list);
    }
}
