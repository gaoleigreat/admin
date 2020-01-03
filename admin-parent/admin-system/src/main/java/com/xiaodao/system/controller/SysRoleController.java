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
import  com.xiaodao.system.service.ISysRoleService;
import com.xiaodao.admin.entity.SysRole;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import java.util.List;
import java.util.Map;

/**
 * SysRole
 *
 * @author ¸ßÀÚ
 * @email tyut_gaolei@163.com
 * @since jdk 1.8
 */
@RestController
@RequestMapping("/sysRole")
@Api(value = "角色管理", tags = "角色管理")
@Validated
@Slf4j
public class SysRoleController {
    @Autowired
    private ISysRoleService sysRoleService;


    @ApiOperation(value = "新增", notes = "新增")
    @ApiImplicitParams({
    })
    @PostMapping("/insert")
    public RespVO insert(@RequestBody SysRole sysRole) {

        int resultNum = sysRoleService.insert(sysRole);
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
    public RespVO insertSelective(@RequestBody SysRole sysRole) {
        int resultNum = sysRoleService.insertSelective(sysRole);
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
    public RespVO batchInsert(@RequestBody List<SysRole> list) {
        int resultNum = sysRoleService.batchInsert(list);
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
    public RespVO batchInsertSelective(@RequestBody List<SysRole> list) {
        int resultNum = sysRoleService.batchInsertSelective(list);
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
    public RespVO updateByPrimaryKey(@RequestBody SysRole sysRole) {
        int resultNum = sysRoleService.updateByPrimaryKey(sysRole);
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
    public RespVO updateSelectiveByPrimaryKey(@RequestBody SysRole sysRole) {
        int resultNum = sysRoleService.updateSelectiveByPrimaryKey(sysRole);
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
    public RespVO batchUpdate(@RequestBody List<SysRole> list) {
        int resultNum = sysRoleService.batchUpdate(list);
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
    public RespVO batchUpdateSelective(@RequestBody List<SysRole> list) {
        int resultNum = sysRoleService.batchUpdateSelective(list);
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
    public RespVO upsert(@RequestBody SysRole sysRole) {
        int resultNum = sysRoleService.upsert(sysRole);
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
    public RespVO upsertSelective(@RequestBody SysRole sysRole) {
        int resultNum = sysRoleService.upsertSelective(sysRole);
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
    public RespVO batchUpsert(@RequestBody List<SysRole> list) {
        int resultNum = sysRoleService.batchUpsert(list);
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
    public RespVO batchUpsertSelective(@RequestBody List<SysRole> list) {
        int resultNum = sysRoleService.batchUpsertSelective(list);
        if (resultNum == 0) {
            return RespVOBuilder.failure("插入更新失败");
        } else {
            return RespVOBuilder.success("插入更新成功");
        }
    }


    @ApiOperation(value = "通过主键删除", notes = "通过主键删除")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "roleId", paramType = "path", value = "roleId", required = true, dataType = "Long")
    })
    @DeleteMapping("/{roleId}")
    public RespVO deleteByPrimaryKey(@PathVariable(value = "roleId") Long roleId) {
        Integer resultNum = sysRoleService.deleteByPrimaryKey(roleId);
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
        int resultNum = sysRoleService.deleteBatchByPrimaryKeys(list);
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
    public RespVO delete(@RequestBody SysRole sysRole) {

        int resultNum = sysRoleService.delete(sysRole);
        if (resultNum > 0) {
            return RespVOBuilder.success("删除成功");
        } else {
            return RespVOBuilder.failure("删除失败");
        }

    }

    @ApiOperation(value = "通过主键查询", notes = "通过主键批量查询")
    @ApiImplicitParams({
    })
    @GetMapping("/{roleId}")
    public RespVO<SysRole> queryByPrimaryKey(@PathVariable(value = "roleId") Long roleId) {
        SysRole sysRole = sysRoleService.queryByPrimaryKey(roleId);
        return RespVOBuilder.success(sysRole);
    }

    @ApiOperation(value = "通过主键批量查询", notes = "通过主键批量查询")
    @ApiImplicitParams({
    })
    @PostMapping("/queryBatchPrimaryKeys")
    public RespVO<RespDataVO<SysRole>> queryBatchPrimaryKeys(@RequestBody List<Long> list) {
        List< SysRole> sysRoles = sysRoleService.queryBatchPrimaryKeys(list);
        return RespVOBuilder.success(sysRoles);
    }

    @ApiOperation(value = "条件查询一个", notes = "条件查询一个")
    @ApiImplicitParams({
    })
    @PostMapping("/queryOne")
    public RespVO<SysRole> queryOne(@RequestBody SysRole sysRole) {
        sysRole =sysRoleService.queryOne(sysRole);
        return RespVOBuilder.success(sysRole);
    }

    @ApiOperation(value = "条件查询", notes = "条件查询")
    @ApiImplicitParams({
    })
    @PostMapping("/queryByCondition")
    public RespVO<RespDataVO<SysRole>> queryByCondition(@RequestBody SysRole sysRole) {
        List<SysRole> list = sysRoleService.queryByCondition(sysRole);
        return RespVOBuilder.success(list);
    }

    @ApiOperation(value = "条件分页查询", notes = "条件分页查询")
    @ApiImplicitParams({
    })
    @PostMapping("/queryPageByCondition")
    public RespVO<PageInfo<SysRole>> queryPageByCondition(@RequestBody SysRole sysRole) {
        PageHelper.startPage(sysRole.getPageIndex(),sysRole.getPageSie());
        List<SysRole> list = sysRoleService.queryByCondition(sysRole);
        return RespVOBuilder.success(new PageInfo(list));
    }

    @ApiOperation(value = "模糊查询", notes = "模糊查询")
    @ApiImplicitParams({
    })
    @PostMapping("/queryFuzzy")
    public RespVO<RespDataVO<SysRole>> queryFuzzy(@RequestBody SysRole sysRole) {
        List<SysRole> list = sysRoleService.queryFuzzy(sysRole);
        return RespVOBuilder.success(list);
    }


    @ApiOperation(value = "模糊分页查询", notes = "模糊分页查询")
    @ApiImplicitParams({
    })
    @PostMapping("/queryPageFuzzy")
    public RespVO<PageInfo<SysRole>> queryPageFuzzy(@RequestBody SysRole sysRole) {
        PageHelper.startPage(sysRole.getPageIndex(),sysRole.getPageSie());
        List<SysRole> list = sysRoleService.queryFuzzy(sysRole);
        return RespVOBuilder.success(new PageInfo(list));
    }


    @ApiOperation(value = "模糊条件查询", notes = "条件模糊查询")
    @ApiImplicitParams({
    })
    @PostMapping("/queryByLikeCondition")
    public RespVO<RespDataVO<SysRole>> queryByLikeCondition(@RequestBody SysRole sysRole) {
        List<SysRole> list = sysRoleService.queryByLikeCondition(sysRole);
        return RespVOBuilder.success(list);
    }

    @ApiOperation(value = "模糊分页条件查询", notes = "条件模糊查询")
    @ApiImplicitParams({
    })
    @PostMapping("/queryPageByLikeCondition")
    public RespVO<PageInfo<SysRole>> queryPageByLikeCondition(@RequestBody SysRole sysRole) {
        PageHelper.startPage(sysRole.getPageIndex(),sysRole.getPageSie());
        List<SysRole> list = sysRoleService.queryByLikeCondition(sysRole);
        return RespVOBuilder.success(new PageInfo(list));
    }

    @ApiOperation(value = "条件查询数量", notes = "条件查询数量")
    @ApiImplicitParams({
    })
    @PostMapping("/queryCount")
    public RespVO<Long> queryCount(@RequestBody SysRole sysRole) {
        long count = sysRoleService.queryCount(sysRole);
        return RespVOBuilder.success(count);
    }


    @ApiOperation(value = "分组统计", notes = "分组统计")
    @ApiImplicitParams({
    })
    @PostMapping("/statisticsGroup")
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroup(@RequestBody SysRole sysRole) {
        List<Map<String, Object>> maps = sysRoleService.statisticsGroup(sysRole);
        return RespVOBuilder.success(maps);
    }


    @ApiOperation(value = "日统计", notes = "分组统计")
    @ApiImplicitParams({
    })
    @PostMapping("/statisticsGroupByDay")
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByDay(@RequestBody SysRole sysRole) {
        List<Map<String, Object>> maps = sysRoleService.statisticsGroupByDay(sysRole);
        return RespVOBuilder.success(maps);
    }

    @ApiOperation(value = "月统计", notes = "分组统计")
    @ApiImplicitParams({
    })
    @PostMapping("/statisticsGroupByMonth")
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByMonth(@RequestBody SysRole sysRole) {
        List<Map<String, Object>> maps = sysRoleService.statisticsGroupByMonth(sysRole);
        return RespVOBuilder.success(maps);
    }

    @ApiOperation(value = "年统计", notes = "分组统计")
    @ApiImplicitParams({
    })
    @PostMapping("/statisticsGroupByYear")
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByYear(@RequestBody SysRole sysRole) {
        List<Map<String, Object>> maps = sysRoleService.statisticsGroupByYear(sysRole);
        return RespVOBuilder.success(maps);
    }

}
