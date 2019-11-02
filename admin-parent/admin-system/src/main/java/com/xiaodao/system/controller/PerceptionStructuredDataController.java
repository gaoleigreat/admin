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
import com.xiaodao.system.service.IPerceptionStructuredDataService;
import com.xiaodao.system.entity.PerceptionStructuredData;
import java.util.List;


/**
 * PerceptionStructuredData
 *
 * @author 高磊
 * @email 513684652@qq.com
 * @since jdk 1.8
 */
@RestController
@RequestMapping("/perceptionStructuredData")
@Api(value = "PerceptionStructuredData管理", tags = "PerceptionStructuredData管理")
@Validated
@Slf4j
public class PerceptionStructuredDataController {
    @Autowired
    private IPerceptionStructuredDataService perceptionStructuredDataService;

    @ApiOperation(value = "分页查询PerceptionStructuredData", notes = "分页查询PerceptionStructuredData")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageIndex", value = "当前页", dataType = "int", required = true, example = "1", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "每页大小", dataType = "int", defaultValue = "10", example = "10", paramType = "query"),
    })
    @GetMapping("/")
    public RespVO<IPage<PerceptionStructuredData>> queryPage(@RequestParam(value = "pageIndex") int pageIndex,
                                                          @RequestParam(required = false, defaultValue = "10") int pageSize) {
        IPage<PerceptionStructuredData> iPage = perceptionStructuredDataService.queryPage(pageIndex, pageSize, new PerceptionStructuredData());
        return RespVOBuilder.success(iPage);
    }

    @ApiOperation(value = "通过主键id查询PerceptionStructuredData", notes = "通过主键id查询PerceptionStructuredData")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", paramType = "path", value = "id", required = true, dataType = "Long")
    })
    @GetMapping("/{id}")
    public RespVO<PerceptionStructuredData> selectByPrimaryKey(@PathVariable(value = "id") Long id) {
        PerceptionStructuredData perceptionStructuredData =
            perceptionStructuredDataService.selectByPrimaryKey(id);
        if (perceptionStructuredData == null){
            return RespVOBuilder.failure("当前PerceptionStructuredData不存在");
        } else{
            return RespVOBuilder.success(perceptionStructuredData);
        }
    }

    @ApiOperation(value = "通过主键id删除PerceptionStructuredData", notes = "通过主键id删除PerceptionStructuredData")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", paramType = "path", value = "id", required = true, dataType = "Long")
    })
    @DeleteMapping("/{id}")
    public RespVO deleteByPrimaryKey(@PathVariable(value = "id") Long id) {
        Integer num = perceptionStructuredDataService.deleteByPrimaryKey(id);
        if (num == 0) {
            return RespVOBuilder.failure("删除PerceptionStructuredData失败");
        } else {
            return RespVOBuilder.success("删除PerceptionStructuredData成功");
        }
    }

    @ApiOperation(value = "新增PerceptionStructuredData", notes = "新增PerceptionStructuredData")
    @ApiImplicitParams({
    })
    @PostMapping("/")
    public RespVO insert(@RequestBody PerceptionStructuredData perceptionStructuredData) {
        if (perceptionStructuredData == null){
            return RespVOBuilder.failure("参数不能为空");
        }
        Integer num = perceptionStructuredDataService.insert(perceptionStructuredData);
        if (num == 0) {
            return RespVOBuilder.failure("添加PerceptionStructuredData失败");
        } else {
            return RespVOBuilder.success("添加PerceptionStructuredData成功");
        }
    }

    @ApiOperation(value = "修改PerceptionStructuredData", notes = "修改PerceptionStructuredData")
    @ApiImplicitParams({
    })
    @PutMapping("/")
    public RespVO updateByPrimaryKey(@RequestBody PerceptionStructuredData perceptionStructuredData) {
        if (perceptionStructuredData == null){
            return RespVOBuilder.failure("参数不能为空");
        }
        Integer num = perceptionStructuredDataService.updateByPrimaryKey(perceptionStructuredData);
        if (num == 0) {
            return RespVOBuilder.failure("修改PerceptionStructuredData失败");
        } else {
            return RespVOBuilder.success("修改PerceptionStructuredData成功");
        }
    }


    @ApiOperation(value = "通过主键id批量删除PerceptionStructuredData", notes = "通过主键id批量删除PerceptionStructuredData")
    @ApiImplicitParams({
    })
    @DeleteMapping("/deleteBatchPrimaryKeys")
    public RespVO deleteBatchPrimaryKeys(@RequestBody List<Long> list) {
        if (CollectionUtils.isEmpty(list)) {
            return RespVOBuilder.failure("参数不能为空");
        }
        Integer num = perceptionStructuredDataService.deleteBatchIds(list);
        if (num == 0) {
            return RespVOBuilder.failure("批量删除PerceptionStructuredData失败");
        } else {
            return RespVOBuilder.success("批量删除PerceptionStructuredData成功");
        }
    }


    @ApiOperation(value = "条件查询PerceptionStructuredData", notes = "条件查询PerceptionStructuredData")
    @ApiImplicitParams({
    })
    @PostMapping("/list")
    public RespVO query(@RequestBody PerceptionStructuredData perceptionStructuredData) {
        if (perceptionStructuredData ==null){
            return RespVOBuilder.failure("参数不能为空");
        }
        List<PerceptionStructuredData> list = perceptionStructuredDataService.query(perceptionStructuredData);
        return RespVOBuilder.success(list);
    }
}
