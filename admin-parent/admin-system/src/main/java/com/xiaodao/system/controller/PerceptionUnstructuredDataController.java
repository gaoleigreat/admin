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
import com.xiaodao.system.service.IPerceptionUnstructuredDataService;
import com.xiaodao.system.entity.PerceptionUnstructuredData;
import java.util.List;


/**
 * PerceptionUnstructuredData
 *
 * @author ¸ßÀÚ
 * @email 513684652@qq.com
 * @since jdk 1.8
 */
@RestController
@RequestMapping("/perceptionUnstructuredData")
@Api(value = "PerceptionUnstructuredData管理", tags = "PerceptionUnstructuredData管理")
@Validated
@Slf4j
public class PerceptionUnstructuredDataController {
    @Autowired
    private IPerceptionUnstructuredDataService perceptionUnstructuredDataService;

    @ApiOperation(value = "分页查询PerceptionUnstructuredData", notes = "分页查询PerceptionUnstructuredData")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageIndex", value = "当前页", dataType = "int", required = true, example = "1", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "每页大小", dataType = "int", defaultValue = "10", example = "10", paramType = "query"),
    })
    @GetMapping("/")
    public RespVO<IPage<PerceptionUnstructuredData>> queryPage(@RequestParam(value = "pageIndex") int pageIndex,
                                                          @RequestParam(required = false, defaultValue = "10") int pageSize) {
        IPage<PerceptionUnstructuredData> iPage = perceptionUnstructuredDataService.queryPage(pageIndex, pageSize, new PerceptionUnstructuredData());
        return RespVOBuilder.success(iPage);
    }

    @ApiOperation(value = "通过主键id查询PerceptionUnstructuredData", notes = "通过主键id查询PerceptionUnstructuredData")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", paramType = "path", value = "id", required = true, dataType = "Long")
    })
    @GetMapping("/{id}")
    public RespVO<PerceptionUnstructuredData> selectByPrimaryKey(@PathVariable(value = "id") Long id) {
        PerceptionUnstructuredData perceptionUnstructuredData =
            perceptionUnstructuredDataService.selectByPrimaryKey(id);
        if (perceptionUnstructuredData == null){
            return RespVOBuilder.failure("当前PerceptionUnstructuredData不存在");
        } else{
            return RespVOBuilder.success(perceptionUnstructuredData);
        }
    }

    @ApiOperation(value = "通过主键id删除PerceptionUnstructuredData", notes = "通过主键id删除PerceptionUnstructuredData")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", paramType = "path", value = "id", required = true, dataType = "Long")
    })
    @DeleteMapping("/{id}")
    public RespVO deleteByPrimaryKey(@PathVariable(value = "id") Long id) {
        Integer num = perceptionUnstructuredDataService.deleteByPrimaryKey(id);
        if (num == 0) {
            return RespVOBuilder.failure("删除PerceptionUnstructuredData失败");
        } else {
            return RespVOBuilder.success("删除PerceptionUnstructuredData成功");
        }
    }

    @ApiOperation(value = "新增PerceptionUnstructuredData", notes = "新增PerceptionUnstructuredData")
    @ApiImplicitParams({
    })
    @PostMapping("/")
    public RespVO insert(@RequestBody PerceptionUnstructuredData perceptionUnstructuredData) {
        if (perceptionUnstructuredData == null){
            return RespVOBuilder.failure("参数不能为空");
        }
        Integer num = perceptionUnstructuredDataService.insert(perceptionUnstructuredData);
        if (num == 0) {
            return RespVOBuilder.failure("添加PerceptionUnstructuredData失败");
        } else {
            return RespVOBuilder.success("添加PerceptionUnstructuredData成功");
        }
    }

    @ApiOperation(value = "修改PerceptionUnstructuredData", notes = "修改PerceptionUnstructuredData")
    @ApiImplicitParams({
    })
    @PutMapping("/")
    public RespVO updateByPrimaryKey(@RequestBody PerceptionUnstructuredData perceptionUnstructuredData) {
        if (perceptionUnstructuredData == null){
            return RespVOBuilder.failure("参数不能为空");
        }
        Integer num = perceptionUnstructuredDataService.updateByPrimaryKey(perceptionUnstructuredData);
        if (num == 0) {
            return RespVOBuilder.failure("修改PerceptionUnstructuredData失败");
        } else {
            return RespVOBuilder.success("修改PerceptionUnstructuredData成功");
        }
    }


    @ApiOperation(value = "通过主键id批量删除PerceptionUnstructuredData", notes = "通过主键id批量删除PerceptionUnstructuredData")
    @ApiImplicitParams({
    })
    @DeleteMapping("/deleteBatchPrimaryKeys")
    public RespVO deleteBatchPrimaryKeys(@RequestBody List<Long> list) {
        if (CollectionUtils.isEmpty(list)) {
            return RespVOBuilder.failure("参数不能为空");
        }
        Integer num = perceptionUnstructuredDataService.deleteBatchIds(list);
        if (num == 0) {
            return RespVOBuilder.failure("批量删除PerceptionUnstructuredData失败");
        } else {
            return RespVOBuilder.success("批量删除PerceptionUnstructuredData成功");
        }
    }


    @ApiOperation(value = "条件查询PerceptionUnstructuredData", notes = "条件查询PerceptionUnstructuredData")
    @ApiImplicitParams({
    })
    @PostMapping("/list")
    public RespVO query(@RequestBody PerceptionUnstructuredData perceptionUnstructuredData) {
        if (perceptionUnstructuredData ==null){
            return RespVOBuilder.failure("参数不能为空");
        }
        List<PerceptionUnstructuredData> list = perceptionUnstructuredDataService.query(perceptionUnstructuredData);
        return RespVOBuilder.success(list);
    }
}
