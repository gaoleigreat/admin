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
import  com.xiaodao.system.service.ISysPostService;
import com.xiaodao.admin.entity.SysPost;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import java.util.List;
import java.util.Map;

/**
 * SysPost
 *
 * @author ¸ßÀÚ
 * @email tyut_gaolei@163.com
 * @since jdk 1.8
 */
@RestController
@RequestMapping("/sysPost")
@Api(value = "岗位信息管理", tags = "岗位信息管理")
@Validated
@Slf4j
public class SysPostController {
    @Autowired
    private ISysPostService sysPostService;


    @ApiOperation(value = "新增", notes = "新增")
    @ApiImplicitParams({
    })
    @PostMapping("/insert")
    public RespVO insert(@RequestBody SysPost sysPost) {

        int resultNum = sysPostService.insert(sysPost);
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
    public RespVO insertSelective(@RequestBody SysPost sysPost) {
        int resultNum = sysPostService.insertSelective(sysPost);
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
    public RespVO batchInsert(@RequestBody List<SysPost> list) {
        int resultNum = sysPostService.batchInsert(list);
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
    public RespVO batchInsertSelective(@RequestBody List<SysPost> list) {
        int resultNum = sysPostService.batchInsertSelective(list);
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
    public RespVO updateByPrimaryKey(@RequestBody SysPost sysPost) {
        int resultNum = sysPostService.updateByPrimaryKey(sysPost);
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
    public RespVO updateSelectiveByPrimaryKey(@RequestBody SysPost sysPost) {
        int resultNum = sysPostService.updateSelectiveByPrimaryKey(sysPost);
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
    public RespVO batchUpdate(@RequestBody List<SysPost> list) {
        int resultNum = sysPostService.batchUpdate(list);
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
    public RespVO batchUpdateSelective(@RequestBody List<SysPost> list) {
        int resultNum = sysPostService.batchUpdateSelective(list);
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
    public RespVO upsert(@RequestBody SysPost sysPost) {
        int resultNum = sysPostService.upsert(sysPost);
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
    public RespVO upsertSelective(@RequestBody SysPost sysPost) {
        int resultNum = sysPostService.upsertSelective(sysPost);
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
    public RespVO batchUpsert(@RequestBody List<SysPost> list) {
        int resultNum = sysPostService.batchUpsert(list);
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
    public RespVO batchUpsertSelective(@RequestBody List<SysPost> list) {
        int resultNum = sysPostService.batchUpsertSelective(list);
        if (resultNum == 0) {
            return RespVOBuilder.failure("插入更新失败");
        } else {
            return RespVOBuilder.success("插入更新成功");
        }
    }


    @ApiOperation(value = "通过主键删除", notes = "通过主键删除")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "postId", paramType = "path", value = "postId", required = true, dataType = "Long")
    })
    @DeleteMapping("/{postId}")
    public RespVO deleteByPrimaryKey(@PathVariable(value = "postId") Long postId) {
        Integer resultNum = sysPostService.deleteByPrimaryKey(postId);
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
        int resultNum = sysPostService.deleteBatchByPrimaryKeys(list);
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
    public RespVO delete(@RequestBody SysPost sysPost) {

        int resultNum = sysPostService.delete(sysPost);
        if (resultNum > 0) {
            return RespVOBuilder.success("删除成功");
        } else {
            return RespVOBuilder.failure("删除失败");
        }

    }

    @ApiOperation(value = "通过主键查询", notes = "通过主键批量查询")
    @ApiImplicitParams({
    })
    @GetMapping("/{postId}")
    public RespVO<SysPost> queryByPrimaryKey(@PathVariable(value = "postId") Long postId) {
        SysPost sysPost = sysPostService.queryByPrimaryKey(postId);
        return RespVOBuilder.success(sysPost);
    }

    @ApiOperation(value = "通过主键批量查询", notes = "通过主键批量查询")
    @ApiImplicitParams({
    })
    @PostMapping("/queryBatchPrimaryKeys")
    public RespVO<RespDataVO<SysPost>> queryBatchPrimaryKeys(@RequestBody List<Long> list) {
        List< SysPost> sysPosts = sysPostService.queryBatchPrimaryKeys(list);
        return RespVOBuilder.success(sysPosts);
    }

    @ApiOperation(value = "条件查询一个", notes = "条件查询一个")
    @ApiImplicitParams({
    })
    @PostMapping("/queryOne")
    public RespVO<SysPost> queryOne(@RequestBody SysPost sysPost) {
        sysPost =sysPostService.queryOne(sysPost);
        return RespVOBuilder.success(sysPost);
    }

    @ApiOperation(value = "条件查询", notes = "条件查询")
    @ApiImplicitParams({
    })
    @PostMapping("/queryByCondition")
    public RespVO<RespDataVO<SysPost>> queryByCondition(@RequestBody SysPost sysPost) {
        List<SysPost> list = sysPostService.queryByCondition(sysPost);
        return RespVOBuilder.success(list);
    }

    @ApiOperation(value = "条件分页查询", notes = "条件分页查询")
    @ApiImplicitParams({
    })
    @PostMapping("/queryPageByCondition")
    public RespVO<PageInfo<SysPost>> queryPageByCondition(@RequestBody SysPost sysPost) {
        PageHelper.startPage(sysPost.getPageIndex(),sysPost.getPageSie());
        List<SysPost> list = sysPostService.queryByCondition(sysPost);
        return RespVOBuilder.success(new PageInfo(list));
    }

    @ApiOperation(value = "模糊查询", notes = "模糊查询")
    @ApiImplicitParams({
    })
    @PostMapping("/queryFuzzy")
    public RespVO<RespDataVO<SysPost>> queryFuzzy(@RequestBody SysPost sysPost) {
        List<SysPost> list = sysPostService.queryFuzzy(sysPost);
        return RespVOBuilder.success(list);
    }


    @ApiOperation(value = "模糊分页查询", notes = "模糊分页查询")
    @ApiImplicitParams({
    })
    @PostMapping("/queryPageFuzzy")
    public RespVO<PageInfo<SysPost>> queryPageFuzzy(@RequestBody SysPost sysPost) {
        PageHelper.startPage(sysPost.getPageIndex(),sysPost.getPageSie());
        List<SysPost> list = sysPostService.queryFuzzy(sysPost);
        return RespVOBuilder.success(new PageInfo(list));
    }


    @ApiOperation(value = "模糊条件查询", notes = "条件模糊查询")
    @ApiImplicitParams({
    })
    @PostMapping("/queryByLikeCondition")
    public RespVO<RespDataVO<SysPost>> queryByLikeCondition(@RequestBody SysPost sysPost) {
        List<SysPost> list = sysPostService.queryByLikeCondition(sysPost);
        return RespVOBuilder.success(list);
    }

    @ApiOperation(value = "模糊分页条件查询", notes = "条件模糊查询")
    @ApiImplicitParams({
    })
    @PostMapping("/queryPageByLikeCondition")
    public RespVO<PageInfo<SysPost>> queryPageByLikeCondition(@RequestBody SysPost sysPost) {
        PageHelper.startPage(sysPost.getPageIndex(),sysPost.getPageSie());
        List<SysPost> list = sysPostService.queryByLikeCondition(sysPost);
        return RespVOBuilder.success(new PageInfo(list));
    }

    @ApiOperation(value = "条件查询数量", notes = "条件查询数量")
    @ApiImplicitParams({
    })
    @PostMapping("/queryCount")
    public RespVO<Long> queryCount(@RequestBody SysPost sysPost) {
        long count = sysPostService.queryCount(sysPost);
        return RespVOBuilder.success(count);
    }


    @ApiOperation(value = "分组统计", notes = "分组统计")
    @ApiImplicitParams({
    })
    @PostMapping("/statisticsGroup")
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroup(@RequestBody SysPost sysPost) {
        List<Map<String, Object>> maps = sysPostService.statisticsGroup(sysPost);
        return RespVOBuilder.success(maps);
    }


    @ApiOperation(value = "日统计", notes = "分组统计")
    @ApiImplicitParams({
    })
    @PostMapping("/statisticsGroupByDay")
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByDay(@RequestBody SysPost sysPost) {
        List<Map<String, Object>> maps = sysPostService.statisticsGroupByDay(sysPost);
        return RespVOBuilder.success(maps);
    }

    @ApiOperation(value = "月统计", notes = "分组统计")
    @ApiImplicitParams({
    })
    @PostMapping("/statisticsGroupByMonth")
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByMonth(@RequestBody SysPost sysPost) {
        List<Map<String, Object>> maps = sysPostService.statisticsGroupByMonth(sysPost);
        return RespVOBuilder.success(maps);
    }

    @ApiOperation(value = "年统计", notes = "分组统计")
    @ApiImplicitParams({
    })
    @PostMapping("/statisticsGroupByYear")
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByYear(@RequestBody SysPost sysPost) {
        List<Map<String, Object>> maps = sysPostService.statisticsGroupByYear(sysPost);
        return RespVOBuilder.success(maps);
    }

}
