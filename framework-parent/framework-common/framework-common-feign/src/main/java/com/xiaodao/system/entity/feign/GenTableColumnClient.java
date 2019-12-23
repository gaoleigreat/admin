package com.xiaodao.system.entity.feign;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xiaodao.core.vo.RespVO;
import com.xiaodao.core.vo.RespVOBuilder;
import com.xiaodao.config.MultipartSupportConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.*;
import com.xiaodao.system.entity.GenTableColumn;

import java.util.List;

@FeignClient(value = "system-service", path = "/genTableColumn", fallbackFactory = GenTableColumnClientFallback.class, configuration = MultipartSupportConfig.class)
public interface GenTableColumnClient {

    @GetMapping("/")
    RespVO<IPage<GenTableColumn>> queryPage(@RequestParam(value = "pageIndex") int pageIndex,
                                            @RequestParam(required = false, defaultValue = "10") int pageSize);


    @GetMapping("/{columnId}")
    RespVO<GenTableColumn> selectByPrimaryKey(@PathVariable(value = "columnId") Long columnId);


    @DeleteMapping("/{columnId}")
    RespVO deleteByPrimaryKey(@PathVariable(value = "columnId") Long columnId);


    @PostMapping("/")
    RespVO insert(@RequestBody GenTableColumn genTableColumn);


    @PutMapping("/")
    RespVO updateByPrimaryKey(@RequestBody GenTableColumn genTableColumn);


    @DeleteMapping("/deleteBatchPrimaryKeys")
    RespVO deleteBatchPrimaryKeys(@RequestBody List<Long> list);


    @PostMapping("/list")
    RespVO query(@RequestBody GenTableColumn genTableColumn);
}

class GenTableColumnClientFallback implements GenTableColumnClient {


    @Override
    public RespVO<IPage<GenTableColumn>> queryPage(int pageIndex, int pageSize) {
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO<GenTableColumn> selectByPrimaryKey( Long columnId){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO deleteByPrimaryKey( Long columnId){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO insert(@RequestBody GenTableColumn genTableColumn){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO updateByPrimaryKey(GenTableColumn genTableColumn){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO deleteBatchPrimaryKeys(List<Long> list){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO query(GenTableColumn genTableColumn){
        return RespVOBuilder.failure("system-service服务不可用");
    }
}