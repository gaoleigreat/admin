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
import com.xiaodao.system.service.ISysOssService;
import com.xiaodao.system.entity.SysOss;
import java.util.List;


/**
 * 文件上传
 *
 * @author 高磊
 * @email 513684652@qq.com
 * @since jdk 1.8
 */
@RestController
@RequestMapping("/sysOss")
@Api(value = "文件上传管理", tags = "文件上传管理")
@Validated
@Slf4j
public class SysOssController {
    @Autowired
    private ISysOssService sysOssService;

    @ApiOperation(value = "分页查询文件上传", notes = "分页查询文件上传")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageIndex", value = "当前页", dataType = "int", required = true, example = "1", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "每页大小", dataType = "int", defaultValue = "10", example = "10", paramType = "query"),
    })
    @GetMapping("/")
    public RespVO<IPage<SysOss>> queryPage(@RequestParam(value = "pageIndex") int pageIndex,
                                                          @RequestParam(required = false, defaultValue = "10") int pageSize) {
        IPage<SysOss> iPage = sysOssService.queryPage(pageIndex, pageSize, new SysOss());
        return RespVOBuilder.success(iPage);
    }

    @ApiOperation(value = "通过主键id查询文件上传", notes = "通过主键id查询文件上传")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", paramType = "path", value = "id", required = true, dataType = "Long")
    })
    @GetMapping("/{id}")
    public RespVO<SysOss> selectByPrimaryKey(@PathVariable(value = "id") Long id) {
        SysOss sysOss =
            sysOssService.selectByPrimaryKey(id);
        if (sysOss == null){
            return RespVOBuilder.failure("当前文件上传不存在");
        } else{
            return RespVOBuilder.success(sysOss);
        }
    }

    @ApiOperation(value = "通过主键id删除文件上传", notes = "通过主键id删除文件上传")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", paramType = "path", value = "id", required = true, dataType = "Long")
    })
    @DeleteMapping("/{id}")
    public RespVO deleteByPrimaryKey(@PathVariable(value = "id") Long id) {
        Integer num = sysOssService.deleteByPrimaryKey(id);
        if (num == 0) {
            return RespVOBuilder.failure("删除文件上传失败");
        } else {
            return RespVOBuilder.success("删除文件上传成功");
        }
    }

    @ApiOperation(value = "新增文件上传", notes = "新增文件上传")
    @ApiImplicitParams({
    })
    @PostMapping("/")
    public RespVO insert(@RequestBody SysOss sysOss) {
        if (sysOss == null){
            return RespVOBuilder.failure("参数不能为空");
        }
        Integer num = sysOssService.insert(sysOss);
        if (num == 0) {
            return RespVOBuilder.failure("添加文件上传失败");
        } else {
            return RespVOBuilder.success("添加文件上传成功");
        }
    }

    @ApiOperation(value = "修改文件上传", notes = "修改文件上传")
    @ApiImplicitParams({
    })
    @PutMapping("/")
    public RespVO updateByPrimaryKey(@RequestBody SysOss sysOss) {
        if (sysOss == null){
            return RespVOBuilder.failure("参数不能为空");
        }
        Integer num = sysOssService.updateByPrimaryKey(sysOss);
        if (num == 0) {
            return RespVOBuilder.failure("修改文件上传失败");
        } else {
            return RespVOBuilder.success("修改文件上传成功");
        }
    }


    @ApiOperation(value = "通过主键id批量删除文件上传", notes = "通过主键id批量删除文件上传")
    @ApiImplicitParams({
    })
    @DeleteMapping("/deleteBatchPrimaryKeys")
    public RespVO deleteBatchPrimaryKeys(@RequestBody List<Long> list) {
        if (CollectionUtils.isEmpty(list)) {
            return RespVOBuilder.failure("参数不能为空");
        }
        Integer num = sysOssService.deleteBatchIds(list);
        if (num == 0) {
            return RespVOBuilder.failure("批量删除文件上传失败");
        } else {
            return RespVOBuilder.success("批量删除文件上传成功");
        }
    }


    @ApiOperation(value = "条件查询文件上传", notes = "条件查询文件上传")
    @ApiImplicitParams({
    })
    @PostMapping("/list")
    public RespVO query(@RequestBody SysOss sysOss) {
        if (sysOss ==null){
            return RespVOBuilder.failure("参数不能为空");
        }
        List<SysOss> list = sysOssService.query(sysOss);
        return RespVOBuilder.success(list);
    }
}
