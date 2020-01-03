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
import  com.xiaodao.system.service.ISysNoticeService;
import com.xiaodao.feign.system.entity.SysNotice;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import java.util.List;
import java.util.Map;

/**
 * SysNotice
 *
 * @author ¸ßÀÚ
 * @email tyut_gaolei@163.com
 * @since jdk 1.8
 */
@RestController
@RequestMapping("/sysNotice")
@Api(value = "通知公告表管理", tags = "通知公告表管理")
@Validated
@Slf4j
public class SysNoticeController {
    @Autowired
    private ISysNoticeService sysNoticeService;


    @ApiOperation(value = "新增", notes = "新增")
    @ApiImplicitParams({
    })
    @PostMapping("/insert")
    public RespVO insert(@RequestBody SysNotice sysNotice) {

        int resultNum = sysNoticeService.insert(sysNotice);
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
    public RespVO insertSelective(@RequestBody SysNotice sysNotice) {
        int resultNum = sysNoticeService.insertSelective(sysNotice);
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
    public RespVO batchInsert(@RequestBody List<SysNotice> list) {
        int resultNum = sysNoticeService.batchInsert(list);
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
    public RespVO batchInsertSelective(@RequestBody List<SysNotice> list) {
        int resultNum = sysNoticeService.batchInsertSelective(list);
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
    public RespVO updateByPrimaryKey(@RequestBody SysNotice sysNotice) {
        int resultNum = sysNoticeService.updateByPrimaryKey(sysNotice);
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
    public RespVO updateSelectiveByPrimaryKey(@RequestBody SysNotice sysNotice) {
        int resultNum = sysNoticeService.updateSelectiveByPrimaryKey(sysNotice);
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
    public RespVO batchUpdate(@RequestBody List<SysNotice> list) {
        int resultNum = sysNoticeService.batchUpdate(list);
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
    public RespVO batchUpdateSelective(@RequestBody List<SysNotice> list) {
        int resultNum = sysNoticeService.batchUpdateSelective(list);
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
    public RespVO upsert(@RequestBody SysNotice sysNotice) {
        int resultNum = sysNoticeService.upsert(sysNotice);
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
    public RespVO upsertSelective(@RequestBody SysNotice sysNotice) {
        int resultNum = sysNoticeService.upsertSelective(sysNotice);
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
    public RespVO batchUpsert(@RequestBody List<SysNotice> list) {
        int resultNum = sysNoticeService.batchUpsert(list);
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
    public RespVO batchUpsertSelective(@RequestBody List<SysNotice> list) {
        int resultNum = sysNoticeService.batchUpsertSelective(list);
        if (resultNum == 0) {
            return RespVOBuilder.failure("插入更新失败");
        } else {
            return RespVOBuilder.success("插入更新成功");
        }
    }


    @ApiOperation(value = "通过主键删除", notes = "通过主键删除")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "noticeId", paramType = "path", value = "noticeId", required = true, dataType = "Integer")
    })
    @DeleteMapping("/{noticeId}")
    public RespVO deleteByPrimaryKey(@PathVariable(value = "noticeId") Integer noticeId) {
        Integer resultNum = sysNoticeService.deleteByPrimaryKey(noticeId);
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
    public RespVO deleteBatchByPrimaryKeys(@RequestBody List<Integer> list) {
        int resultNum = sysNoticeService.deleteBatchByPrimaryKeys(list);
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
    public RespVO delete(@RequestBody SysNotice sysNotice) {

        int resultNum = sysNoticeService.delete(sysNotice);
        if (resultNum > 0) {
            return RespVOBuilder.success("删除成功");
        } else {
            return RespVOBuilder.failure("删除失败");
        }

    }

    @ApiOperation(value = "通过主键查询", notes = "通过主键批量查询")
    @ApiImplicitParams({
    })
    @GetMapping("/{noticeId}")
    public RespVO<SysNotice> queryByPrimaryKey(@PathVariable(value = "noticeId") Integer noticeId) {
        SysNotice sysNotice = sysNoticeService.queryByPrimaryKey(noticeId);
        return RespVOBuilder.success(sysNotice);
    }

    @ApiOperation(value = "通过主键批量查询", notes = "通过主键批量查询")
    @ApiImplicitParams({
    })
    @PostMapping("/queryBatchPrimaryKeys")
    public RespVO<RespDataVO<SysNotice>> queryBatchPrimaryKeys(@RequestBody List<Integer> list) {
        List< SysNotice> sysNotices = sysNoticeService.queryBatchPrimaryKeys(list);
        return RespVOBuilder.success(sysNotices);
    }

    @ApiOperation(value = "条件查询一个", notes = "条件查询一个")
    @ApiImplicitParams({
    })
    @PostMapping("/queryOne")
    public RespVO<SysNotice> queryOne(@RequestBody SysNotice sysNotice) {
        sysNotice =sysNoticeService.queryOne(sysNotice);
        return RespVOBuilder.success(sysNotice);
    }

    @ApiOperation(value = "条件查询", notes = "条件查询")
    @ApiImplicitParams({
    })
    @PostMapping("/queryByCondition")
    public RespVO<RespDataVO<SysNotice>> queryByCondition(@RequestBody SysNotice sysNotice) {
        List<SysNotice> list = sysNoticeService.queryByCondition(sysNotice);
        return RespVOBuilder.success(list);
    }

    @ApiOperation(value = "条件分页查询", notes = "条件分页查询")
    @ApiImplicitParams({
    })
    @PostMapping("/queryPageByCondition")
    public RespVO<PageInfo<SysNotice>> queryPageByCondition(@RequestBody SysNotice sysNotice) {
        PageHelper.startPage(sysNotice.getPageIndex(),sysNotice.getPageSie());
        List<SysNotice> list = sysNoticeService.queryByCondition(sysNotice);
        return RespVOBuilder.success(new PageInfo(list));
    }

    @ApiOperation(value = "模糊查询", notes = "模糊查询")
    @ApiImplicitParams({
    })
    @PostMapping("/queryFuzzy")
    public RespVO<RespDataVO<SysNotice>> queryFuzzy(@RequestBody SysNotice sysNotice) {
        List<SysNotice> list = sysNoticeService.queryFuzzy(sysNotice);
        return RespVOBuilder.success(list);
    }


    @ApiOperation(value = "模糊分页查询", notes = "模糊分页查询")
    @ApiImplicitParams({
    })
    @PostMapping("/queryPageFuzzy")
    public RespVO<PageInfo<SysNotice>> queryPageFuzzy(@RequestBody SysNotice sysNotice) {
        PageHelper.startPage(sysNotice.getPageIndex(),sysNotice.getPageSie());
        List<SysNotice> list = sysNoticeService.queryFuzzy(sysNotice);
        return RespVOBuilder.success(new PageInfo(list));
    }


    @ApiOperation(value = "模糊条件查询", notes = "条件模糊查询")
    @ApiImplicitParams({
    })
    @PostMapping("/queryByLikeCondition")
    public RespVO<RespDataVO<SysNotice>> queryByLikeCondition(@RequestBody SysNotice sysNotice) {
        List<SysNotice> list = sysNoticeService.queryByLikeCondition(sysNotice);
        return RespVOBuilder.success(list);
    }

    @ApiOperation(value = "模糊分页条件查询", notes = "条件模糊查询")
    @ApiImplicitParams({
    })
    @PostMapping("/queryPageByLikeCondition")
    public RespVO<PageInfo<SysNotice>> queryPageByLikeCondition(@RequestBody SysNotice sysNotice) {
        PageHelper.startPage(sysNotice.getPageIndex(),sysNotice.getPageSie());
        List<SysNotice> list = sysNoticeService.queryByLikeCondition(sysNotice);
        return RespVOBuilder.success(new PageInfo(list));
    }

    @ApiOperation(value = "条件查询数量", notes = "条件查询数量")
    @ApiImplicitParams({
    })
    @PostMapping("/queryCount")
    public RespVO<Long> queryCount(@RequestBody SysNotice sysNotice) {
        long count = sysNoticeService.queryCount(sysNotice);
        return RespVOBuilder.success(count);
    }


    @ApiOperation(value = "分组统计", notes = "分组统计")
    @ApiImplicitParams({
    })
    @PostMapping("/statisticsGroup")
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroup(@RequestBody SysNotice sysNotice) {
        List<Map<String, Object>> maps = sysNoticeService.statisticsGroup(sysNotice);
        return RespVOBuilder.success(maps);
    }


    @ApiOperation(value = "日统计", notes = "分组统计")
    @ApiImplicitParams({
    })
    @PostMapping("/statisticsGroupByDay")
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByDay(@RequestBody SysNotice sysNotice) {
        List<Map<String, Object>> maps = sysNoticeService.statisticsGroupByDay(sysNotice);
        return RespVOBuilder.success(maps);
    }

    @ApiOperation(value = "月统计", notes = "分组统计")
    @ApiImplicitParams({
    })
    @PostMapping("/statisticsGroupByMonth")
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByMonth(@RequestBody SysNotice sysNotice) {
        List<Map<String, Object>> maps = sysNoticeService.statisticsGroupByMonth(sysNotice);
        return RespVOBuilder.success(maps);
    }

    @ApiOperation(value = "年统计", notes = "分组统计")
    @ApiImplicitParams({
    })
    @PostMapping("/statisticsGroupByYear")
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByYear(@RequestBody SysNotice sysNotice) {
        List<Map<String, Object>> maps = sysNoticeService.statisticsGroupByYear(sysNotice);
        return RespVOBuilder.success(maps);
    }

}
