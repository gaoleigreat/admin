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
import com.xiaodao.system.service.ISysTestService;
import com.xiaodao.system.entity.SysTest;
import java.util.List;


/**
 * 测试
 *
 * @author 高磊
 * @email 513684652@qq.com
 * @since jdk 1.8
 */
@RestController
@RequestMapping("/sysTest")
@Api(value = "测试管理", tags = "测试管理")
@Validated
@Slf4j
public class SysTestController {
    @Autowired
    private ISysTestService sysTestService;

    @ApiOperation(value = "分页查询测试", notes = "分页查询测试")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageIndex", value = "当前页", dataType = "int", required = true, example = "1", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "每页大小", dataType = "int", defaultValue = "10", example = "10", paramType = "query"),
    })
    @GetMapping("/")
    public RespVO<IPage<SysTest>> queryPage(@RequestParam(value = "pageIndex") int pageIndex,
                                                          @RequestParam(required = false, defaultValue = "10") int pageSize) {
        IPage<SysTest> iPage = sysTestService.queryPage(pageIndex, pageSize, new SysTest());
        return RespVOBuilder.success(iPage);
    }

    @ApiOperation(value = "通过主键id查询测试", notes = "通过主键id查询测试")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", paramType = "path", value = "id", required = true, dataType = "Long")
    })
    @GetMapping("/{id}")
    public RespVO<SysTest> selectByPrimaryKey(@PathVariable(value = "id") Long id) {
        SysTest sysTest =
            sysTestService.selectByPrimaryKey(id);
        if (sysTest == null){
            return RespVOBuilder.failure("当前测试不存在");
        } else{
            return RespVOBuilder.success(sysTest);
        }
    }

    @ApiOperation(value = "通过主键id删除测试", notes = "通过主键id删除测试")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", paramType = "path", value = "id", required = true, dataType = "Long")
    })
    @DeleteMapping("/{id}")
    public RespVO deleteByPrimaryKey(@PathVariable(value = "id") Long id) {
        Integer num = sysTestService.deleteByPrimaryKey(id);
        if (num == 0) {
            return RespVOBuilder.failure("删除测试失败");
        } else {
            return RespVOBuilder.success("删除测试成功");
        }
    }

    @ApiOperation(value = "新增测试", notes = "新增测试")
    @ApiImplicitParams({
    })
    @PostMapping("/")
    public RespVO insert(@RequestBody SysTest sysTest) {
        if (sysTest == null){
            return RespVOBuilder.failure("参数不能为空");
        }
        Integer num = sysTestService.insert(sysTest);
        if (num == 0) {
            return RespVOBuilder.failure("添加测试失败");
        } else {
            return RespVOBuilder.success("添加测试成功");
        }
    }

    @ApiOperation(value = "修改测试", notes = "修改测试")
    @ApiImplicitParams({
    })
    @PutMapping("/")
    public RespVO updateByPrimaryKey(@RequestBody SysTest sysTest) {
        if (sysTest == null){
            return RespVOBuilder.failure("参数不能为空");
        }
        Integer num = sysTestService.updateByPrimaryKey(sysTest);
        if (num == 0) {
            return RespVOBuilder.failure("修改测试失败");
        } else {
            return RespVOBuilder.success("修改测试成功");
        }
    }


    @ApiOperation(value = "通过主键id批量删除测试", notes = "通过主键id批量删除测试")
    @ApiImplicitParams({
    })
    @DeleteMapping("/deleteBatchPrimaryKeys")
    public RespVO deleteBatchPrimaryKeys(@RequestBody List<Long> list) {
        if (CollectionUtils.isEmpty(list)) {
            return RespVOBuilder.failure("参数不能为空");
        }
        Integer num = sysTestService.deleteBatchIds(list);
        if (num == 0) {
            return RespVOBuilder.failure("批量删除测试失败");
        } else {
            return RespVOBuilder.success("批量删除测试成功");
        }
    }


    @ApiOperation(value = "条件查询测试", notes = "条件查询测试")
    @ApiImplicitParams({
    })
    @PostMapping("/list")
    public RespVO query(@RequestBody SysTest sysTest) {
        if (sysTest ==null){
            return RespVOBuilder.failure("参数不能为空");
        }
        List<SysTest> list = sysTestService.query(sysTest);
        return RespVOBuilder.success(list);
    }
}
