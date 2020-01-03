package com.xiaodao.system.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import com.xiaodao.core.result.RespVO;
import com.xiaodao.core.result.RespDataVO;
import com.xiaodao.core.result.RespVOBuilder;
import  com.xiaodao.system.service.ISysConfigService;
import com.xiaodao.feign.system.entity.SysConfig;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import java.util.List;
import java.util.Map;

/**
 * SysConfig
 *
 * @author ¸ßÀÚ
 * @email tyut_gaolei@163.com
 * @since jdk 1.8
 */
@RestController
@RequestMapping("/sysConfig")
@Api(value = "参数管理", tags = "参数管理")
@Validated
@Slf4j
public class SysConfigController {
    @Autowired
    private ISysConfigService sysConfigService;


    @ApiOperation(value = "新增", notes = "新增")
    @ApiImplicitParams({
    })
    @PostMapping("/insert")
    public RespVO insert(@RequestBody SysConfig sysConfig) {

        int resultNum = sysConfigService.insert(sysConfig);
        if (resultNum == 0) {
            return RespVOBuilder.failure("插入失败");
        } else {
            return RespVOBuilder.success("插入成功");
        }
    }

    @ApiOperation(value = "带有空值判断的新增", notes = "带有空值判断的新增")
    @ApiImplicitParams({
    })
    @PostMapping("/insertSelective")
    public RespVO insertSelective(@RequestBody SysConfig sysConfig) {
        int resultNum = sysConfigService.insertSelective(sysConfig);
        if (resultNum == 0) {
            return RespVOBuilder.failure("插入失败");
        } else {
            return RespVOBuilder.success("插入成功");
        }
    }


    @ApiOperation(value = "批量插入", notes = "批量插入")
    @ApiImplicitParams({
    })
    @PostMapping("/batchInsert")
    public RespVO batchInsert(@RequestBody List<SysConfig> list) {
        int resultNum = sysConfigService.batchInsert(list);
        if (resultNum == 0) {
            return RespVOBuilder.failure("插入失败");
        } else {
            return RespVOBuilder.success("插入成功");
        }
    }

    @ApiOperation(value = "带有空值判断的批量插入", notes = "带有空值判断的批量插入")
    @ApiImplicitParams({
    })
    @PostMapping("/batchInsertSelective")
    public RespVO batchInsertSelective(@RequestBody List<SysConfig> list) {
        int resultNum = sysConfigService.batchInsertSelective(list);
        if (resultNum == 0) {
            return RespVOBuilder.failure("插入失败");
        } else {
            return RespVOBuilder.success("插入成功");
        }
    }


    @ApiOperation(value = "根据主键更新", notes = "根据主键更新")
    @ApiImplicitParams({
    })
    @PutMapping("/updateByPrimaryKey")
    public RespVO updateByPrimaryKey(@RequestBody SysConfig sysConfig) {
        int resultNum = sysConfigService.updateByPrimaryKey(sysConfig);
        if (resultNum == 0) {
            return RespVOBuilder.failure("更新失败");
        } else {
            return RespVOBuilder.success("更新成功");
        }
    }

    @ApiOperation(value = "带有空值判断的主键更新", notes = "带有空值判断的主键更新")
    @ApiImplicitParams({
    })
    @PutMapping("/updateSelectiveByPrimaryKey")
    public RespVO updateSelectiveByPrimaryKey(@RequestBody SysConfig sysConfig) {
        int resultNum = sysConfigService.updateSelectiveByPrimaryKey(sysConfig);
        if (resultNum == 0) {
            return RespVOBuilder.failure("更新失败");
        } else {
            return RespVOBuilder.success("更新成功");
        }
    }

    @ApiOperation(value = "批量更新", notes = "批量更新")
    @ApiImplicitParams({
    })
    @PutMapping("/batchUpdate")
    public RespVO batchUpdate(@RequestBody List<SysConfig> list) {
        int resultNum = sysConfigService.batchUpdate(list);
        if (resultNum == 0) {
            return RespVOBuilder.failure("更新失败");
        } else {
            return RespVOBuilder.success("更新成功");
        }
    }


    @ApiOperation(value = "带有空值判断的批量更新", notes = "带有空值判断的批量更新")
    @ApiImplicitParams({
    })
    @PutMapping("/batchUpdateSelective")
    public RespVO batchUpdateSelective(@RequestBody List<SysConfig> list) {
        int resultNum = sysConfigService.batchUpdateSelective(list);
        if (resultNum == 0) {
            return RespVOBuilder.failure("更新失败");
        } else {
            return RespVOBuilder.success("更新成功");
        }
    }

    @ApiOperation(value = "更新插入", notes = "更新插入")
    @ApiImplicitParams({
    })
    @PostMapping("/upsert")
    public RespVO upsert(@RequestBody SysConfig sysConfig) {
        int resultNum = sysConfigService.upsert(sysConfig);
        if (resultNum == 0) {
            return RespVOBuilder.failure("插入更新失败");
        } else {
            return RespVOBuilder.success("插入更新成功");
        }
    }


    @ApiOperation(value = "带有空值判断的更新插入", notes = "带有空值判断的更新插入")
    @ApiImplicitParams({
    })
    @PostMapping("/upsertSelective")
    public RespVO upsertSelective(@RequestBody SysConfig sysConfig) {
        int resultNum = sysConfigService.upsertSelective(sysConfig);
        if (resultNum == 0) {
            return RespVOBuilder.failure("插入更新失败");
        } else {
            return RespVOBuilder.success("插入更新成功");
        }
    }


    @ApiOperation(value = "批量更新插入", notes = "批量更新插入")
    @ApiImplicitParams({
    })
    @PostMapping("/batchUpsert")
    public RespVO batchUpsert(@RequestBody List<SysConfig> list) {
        int resultNum = sysConfigService.batchUpsert(list);
        if (resultNum == 0) {
            return RespVOBuilder.failure("插入更新失败");
        } else {
            return RespVOBuilder.success("插入更新成功");
        }
    }

    @ApiOperation(value = "带有空值判断的批量更新插入", notes = "带有空值判断的批量更新插入")
    @ApiImplicitParams({
    })
    @PostMapping("/batchUpsertSelective")
    public RespVO batchUpsertSelective(@RequestBody List<SysConfig> list) {
        int resultNum = sysConfigService.batchUpsertSelective(list);
        if (resultNum == 0) {
            return RespVOBuilder.failure("插入更新失败");
        } else {
            return RespVOBuilder.success("插入更新成功");
        }
    }


    @ApiOperation(value = "通过主键删除", notes = "通过主键删除")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "configId", paramType = "path", value = "configId", required = true, dataType = "Long")
    })
    @DeleteMapping("/{configId}")
    public RespVO deleteByPrimaryKey(@PathVariable(value = "configId") Long configId) {
        Integer resultNum = sysConfigService.deleteByPrimaryKey(configId);
        if (resultNum == 0) {
            return RespVOBuilder.failure("删除失败");
        } else {
            return RespVOBuilder.success("删除成功");
        }
    }

    @ApiOperation(value = "通过主键批量删除", notes = "通过主键批量删除")
    @ApiImplicitParams({
    })
    @DeleteMapping("/deleteBatchByPrimaryKeys")
    public RespVO deleteBatchByPrimaryKeys(@RequestBody List<Long> list) {
        int resultNum = sysConfigService.deleteBatchByPrimaryKeys(list);
        if (resultNum > 0) {
            return RespVOBuilder.success("删除成功");
        } else {
            return RespVOBuilder.failure("删除失败");
        }
    }

    @ApiOperation(value = "条件删除", notes = "条件删除")
    @ApiImplicitParams({
    })
    @DeleteMapping("/delete")
    public RespVO delete(@RequestBody SysConfig sysConfig) {

        int resultNum = sysConfigService.delete(sysConfig);
        if (resultNum > 0) {
            return RespVOBuilder.success("删除成功");
        } else {
            return RespVOBuilder.failure("删除失败");
        }

    }

    @ApiOperation(value = "通过主键查询", notes = "通过主键批量查询")
    @ApiImplicitParams({
    })
    @GetMapping("/{configId}")
    public RespVO<SysConfig> queryByPrimaryKey(@PathVariable(value = "configId") Long configId) {
        SysConfig sysConfig = sysConfigService.queryByPrimaryKey(configId);
        return RespVOBuilder.success(sysConfig);
    }

    @ApiOperation(value = "通过主键批量查询", notes = "通过主键批量查询")
    @ApiImplicitParams({
    })
    @PostMapping("/queryBatchPrimaryKeys")
    public RespVO<RespDataVO<SysConfig>> queryBatchPrimaryKeys(@RequestBody List<Long> list) {
        List< SysConfig> sysConfigs = sysConfigService.queryBatchPrimaryKeys(list);
        return RespVOBuilder.success(sysConfigs);
    }

    @ApiOperation(value = "条件查询一个", notes = "条件查询一个")
    @ApiImplicitParams({
    })
    @PostMapping("/queryOne")
    public RespVO<SysConfig> queryOne(@RequestBody SysConfig sysConfig) {
        sysConfig =sysConfigService.queryOne(sysConfig);
        return RespVOBuilder.success(sysConfig);
    }

    @ApiOperation(value = "条件查询", notes = "条件查询")
    @ApiImplicitParams({
    })
    @PostMapping("/queryByCondition")
    public RespVO<RespDataVO<SysConfig>> queryByCondition(@RequestBody SysConfig sysConfig) {
        List<SysConfig> list = sysConfigService.queryByCondition(sysConfig);
        return RespVOBuilder.success(list);
    }

    @ApiOperation(value = "条件分页查询", notes = "条件分页查询")
    @ApiImplicitParams({
    })
    @PostMapping("/queryPageByCondition")
    public RespVO<PageInfo<SysConfig>> queryPageByCondition(@RequestBody SysConfig sysConfig) {
        PageHelper.startPage(sysConfig.getPageIndex(),sysConfig.getPageSie());
        List<SysConfig> list = sysConfigService.queryByCondition(sysConfig);
        return RespVOBuilder.success(new PageInfo(list));
    }

    @ApiOperation(value = "模糊查询", notes = "模糊查询")
    @ApiImplicitParams({
    })
    @PostMapping("/queryFuzzy")
    public RespVO<RespDataVO<SysConfig>> queryFuzzy(@RequestBody SysConfig sysConfig) {
        List<SysConfig> list = sysConfigService.queryFuzzy(sysConfig);
        return RespVOBuilder.success(list);
    }


    @ApiOperation(value = "模糊分页查询", notes = "模糊分页查询")
    @ApiImplicitParams({
    })
    @PostMapping("/queryPageFuzzy")
    public RespVO<PageInfo<SysConfig>> queryPageFuzzy(@RequestBody SysConfig sysConfig) {
        PageHelper.startPage(sysConfig.getPageIndex(),sysConfig.getPageSie());
        List<SysConfig> list = sysConfigService.queryFuzzy(sysConfig);
        return RespVOBuilder.success(new PageInfo(list));
    }


    @ApiOperation(value = "模糊条件查询", notes = "条件模糊查询")
    @ApiImplicitParams({
    })
    @PostMapping("/queryByLikeCondition")
    public RespVO<RespDataVO<SysConfig>> queryByLikeCondition(@RequestBody SysConfig sysConfig) {
        List<SysConfig> list = sysConfigService.queryByLikeCondition(sysConfig);
        return RespVOBuilder.success(list);
    }

    @ApiOperation(value = "模糊分页条件查询", notes = "条件模糊查询")
    @ApiImplicitParams({
    })
    @PostMapping("/queryPageByLikeCondition")
    public RespVO<PageInfo<SysConfig>> queryPageByLikeCondition(@RequestBody SysConfig sysConfig) {
        PageHelper.startPage(sysConfig.getPageIndex(),sysConfig.getPageSie());
        List<SysConfig> list = sysConfigService.queryByLikeCondition(sysConfig);
        return RespVOBuilder.success(new PageInfo(list));
    }

    @ApiOperation(value = "条件查询数量", notes = "条件查询数量")
    @ApiImplicitParams({
    })
    @PostMapping("/queryCount")
    public RespVO<Long> queryCount(@RequestBody SysConfig sysConfig) {
        long count = sysConfigService.queryCount(sysConfig);
        return RespVOBuilder.success(count);
    }


    @ApiOperation(value = "分组统计", notes = "分组统计")
    @ApiImplicitParams({
    })
    @PostMapping("/statisticsGroup")
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroup(@RequestBody SysConfig sysConfig) {
        List<Map<String, Object>> maps = sysConfigService.statisticsGroup(sysConfig);
        return RespVOBuilder.success(maps);
    }


    @ApiOperation(value = "日统计", notes = "分组统计")
    @ApiImplicitParams({
    })
    @PostMapping("/statisticsGroupByDay")
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByDay(@RequestBody SysConfig sysConfig) {
        List<Map<String, Object>> maps = sysConfigService.statisticsGroupByDay(sysConfig);
        return RespVOBuilder.success(maps);
    }

    @ApiOperation(value = "月统计", notes = "分组统计")
    @ApiImplicitParams({
    })
    @PostMapping("/statisticsGroupByMonth")
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByMonth(@RequestBody SysConfig sysConfig) {
        List<Map<String, Object>> maps = sysConfigService.statisticsGroupByMonth(sysConfig);
        return RespVOBuilder.success(maps);
    }

    @ApiOperation(value = "年统计", notes = "分组统计")
    @ApiImplicitParams({
    })
    @PostMapping("/statisticsGroupByYear")
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByYear(@RequestBody SysConfig sysConfig) {
        List<Map<String, Object>> maps = sysConfigService.statisticsGroupByYear(sysConfig);
        return RespVOBuilder.success(maps);
    }

}
