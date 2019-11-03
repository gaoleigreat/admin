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
import com.xiaodao.system.service.IPerceptionFileService;
import com.xiaodao.system.entity.PerceptionFile;
import java.util.List;


/**
 * PerceptionFile
 *
 * @author xiaodao
 * @email 513684652@qq.com
 * @since jdk 1.8
 */
@RestController
@RequestMapping("/perceptionFile")
@Api(value = "PerceptionFile管理", tags = "PerceptionFile管理")
@Validated
@Slf4j
public class PerceptionFileController {
    @Autowired
    private IPerceptionFileService perceptionFileService;

    @ApiOperation(value = "分页查询PerceptionFile", notes = "分页查询PerceptionFile")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageIndex", value = "当前页", dataType = "int", required = true, example = "1", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "每页大小", dataType = "int", defaultValue = "10", example = "10", paramType = "query"),
    })
    @GetMapping("/")
    public RespVO<IPage<PerceptionFile>> queryPage(@RequestParam(value = "pageIndex") int pageIndex,
                                                          @RequestParam(required = false, defaultValue = "10") int pageSize) {
        IPage<PerceptionFile> iPage = perceptionFileService.queryPage(pageIndex, pageSize, new PerceptionFile());
        return RespVOBuilder.success(iPage);
    }

    @ApiOperation(value = "通过主键id查询PerceptionFile", notes = "通过主键id查询PerceptionFile")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", paramType = "path", value = "id", required = true, dataType = "Long")
    })
    @GetMapping("/{id}")
    public RespVO<PerceptionFile> selectByPrimaryKey(@PathVariable(value = "id") Long id) {
        PerceptionFile perceptionFile =
            perceptionFileService.selectByPrimaryKey(id);
        if (perceptionFile == null){
            return RespVOBuilder.failure("当前PerceptionFile不存在");
        } else{
            return RespVOBuilder.success(perceptionFile);
        }
    }

    @ApiOperation(value = "通过主键id删除PerceptionFile", notes = "通过主键id删除PerceptionFile")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", paramType = "path", value = "id", required = true, dataType = "Long")
    })
    @DeleteMapping("/{id}")
    public RespVO deleteByPrimaryKey(@PathVariable(value = "id") Long id) {
        Integer num = perceptionFileService.deleteByPrimaryKey(id);
        if (num == 0) {
            return RespVOBuilder.failure("删除PerceptionFile失败");
        } else {
            return RespVOBuilder.success("删除PerceptionFile成功");
        }
    }

    @ApiOperation(value = "新增PerceptionFile", notes = "新增PerceptionFile")
    @ApiImplicitParams({
    })
    @PostMapping("/")
    public RespVO insert(@RequestBody PerceptionFile perceptionFile) {
        if (perceptionFile == null){
            return RespVOBuilder.failure("参数不能为空");
        }
        Integer num = perceptionFileService.insert(perceptionFile);
        if (num == 0) {
            return RespVOBuilder.failure("添加PerceptionFile失败");
        } else {
            return RespVOBuilder.success("添加PerceptionFile成功");
        }
    }

    @ApiOperation(value = "修改PerceptionFile", notes = "修改PerceptionFile")
    @ApiImplicitParams({
    })
    @PutMapping("/")
    public RespVO updateByPrimaryKey(@RequestBody PerceptionFile perceptionFile) {
        if (perceptionFile == null){
            return RespVOBuilder.failure("参数不能为空");
        }
        Integer num = perceptionFileService.updateByPrimaryKey(perceptionFile);
        if (num == 0) {
            return RespVOBuilder.failure("修改PerceptionFile失败");
        } else {
            return RespVOBuilder.success("修改PerceptionFile成功");
        }
    }


    @ApiOperation(value = "通过主键id批量删除PerceptionFile", notes = "通过主键id批量删除PerceptionFile")
    @ApiImplicitParams({
    })
    @DeleteMapping("/deleteBatchPrimaryKeys")
    public RespVO deleteBatchPrimaryKeys(@RequestBody List<Long> list) {
        if (CollectionUtils.isEmpty(list)) {
            return RespVOBuilder.failure("参数不能为空");
        }
        Integer num = perceptionFileService.deleteBatchIds(list);
        if (num == 0) {
            return RespVOBuilder.failure("批量删除PerceptionFile失败");
        } else {
            return RespVOBuilder.success("批量删除PerceptionFile成功");
        }
    }


    @ApiOperation(value = "条件查询PerceptionFile", notes = "条件查询PerceptionFile")
    @ApiImplicitParams({
    })
    @PostMapping("/list")
    public RespVO query(@RequestBody PerceptionFile perceptionFile) {
        if (perceptionFile ==null){
            return RespVOBuilder.failure("参数不能为空");
        }
        List<PerceptionFile> list = perceptionFileService.query(perceptionFile);
        return RespVOBuilder.success(list);
    }
}
