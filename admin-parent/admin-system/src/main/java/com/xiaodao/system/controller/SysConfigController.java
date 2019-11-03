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
import com.xiaodao.system.service.ISysConfigService;
import com.xiaodao.system.entity.SysConfig;
import java.util.List;


/**
 * SysConfig
 *
 * @author xiaodao
 * @email 513684652@qq.com
 * @since jdk 1.8
 */
@RestController
@RequestMapping("/sysConfig")
@Api(value = "SysConfig管理", tags = "SysConfig管理")
@Validated
@Slf4j
public class SysConfigController {
    @Autowired
    private ISysConfigService sysConfigService;

    @ApiOperation(value = "分页查询SysConfig", notes = "分页查询SysConfig")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageIndex", value = "当前页", dataType = "int", required = true, example = "1", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "每页大小", dataType = "int", defaultValue = "10", example = "10", paramType = "query"),
    })
    @GetMapping("/")
    public RespVO<IPage<SysConfig>> queryPage(@RequestParam(value = "pageIndex") int pageIndex,
                                                          @RequestParam(required = false, defaultValue = "10") int pageSize) {
        IPage<SysConfig> iPage = sysConfigService.queryPage(pageIndex, pageSize, new SysConfig());
        return RespVOBuilder.success(iPage);
    }

    @ApiOperation(value = "通过主键configId查询SysConfig", notes = "通过主键configId查询SysConfig")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "configId", paramType = "path", value = "configId", required = true, dataType = "Long")
    })
    @GetMapping("/{configId}")
    public RespVO<SysConfig> selectByPrimaryKey(@PathVariable(value = "configId") Long configId) {
        SysConfig sysConfig =
            sysConfigService.selectByPrimaryKey(configId);
        if (sysConfig == null){
            return RespVOBuilder.failure("当前SysConfig不存在");
        } else{
            return RespVOBuilder.success(sysConfig);
        }
    }

    @ApiOperation(value = "通过主键configId删除SysConfig", notes = "通过主键configId删除SysConfig")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "configId", paramType = "path", value = "configId", required = true, dataType = "Long")
    })
    @DeleteMapping("/{configId}")
    public RespVO deleteByPrimaryKey(@PathVariable(value = "configId") Long configId) {
        Integer num = sysConfigService.deleteByPrimaryKey(configId);
        if (num == 0) {
            return RespVOBuilder.failure("删除SysConfig失败");
        } else {
            return RespVOBuilder.success("删除SysConfig成功");
        }
    }

    @ApiOperation(value = "新增SysConfig", notes = "新增SysConfig")
    @ApiImplicitParams({
    })
    @PostMapping("/")
    public RespVO insert(@RequestBody SysConfig sysConfig) {
        if (sysConfig == null){
            return RespVOBuilder.failure("参数不能为空");
        }
        Integer num = sysConfigService.insert(sysConfig);
        if (num == 0) {
            return RespVOBuilder.failure("添加SysConfig失败");
        } else {
            return RespVOBuilder.success("添加SysConfig成功");
        }
    }

    @ApiOperation(value = "修改SysConfig", notes = "修改SysConfig")
    @ApiImplicitParams({
    })
    @PutMapping("/")
    public RespVO updateByPrimaryKey(@RequestBody SysConfig sysConfig) {
        if (sysConfig == null){
            return RespVOBuilder.failure("参数不能为空");
        }
        Integer num = sysConfigService.updateByPrimaryKey(sysConfig);
        if (num == 0) {
            return RespVOBuilder.failure("修改SysConfig失败");
        } else {
            return RespVOBuilder.success("修改SysConfig成功");
        }
    }


    @ApiOperation(value = "通过主键configId批量删除SysConfig", notes = "通过主键configId批量删除SysConfig")
    @ApiImplicitParams({
    })
    @DeleteMapping("/deleteBatchPrimaryKeys")
    public RespVO deleteBatchPrimaryKeys(@RequestBody List<Long> list) {
        if (CollectionUtils.isEmpty(list)) {
            return RespVOBuilder.failure("参数不能为空");
        }
        Integer num = sysConfigService.deleteBatchIds(list);
        if (num == 0) {
            return RespVOBuilder.failure("批量删除SysConfig失败");
        } else {
            return RespVOBuilder.success("批量删除SysConfig成功");
        }
    }


    @ApiOperation(value = "条件查询SysConfig", notes = "条件查询SysConfig")
    @ApiImplicitParams({
    })
    @PostMapping("/list")
    public RespVO query(@RequestBody SysConfig sysConfig) {
        if (sysConfig ==null){
            return RespVOBuilder.failure("参数不能为空");
        }
        List<SysConfig> list = sysConfigService.query(sysConfig);
        return RespVOBuilder.success(list);
    }
}
