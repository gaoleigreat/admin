package com.xiaodao.system.feign;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xiaodao.core.vo.RespVO;
import com.xiaodao.core.vo.RespVOBuilder;
import com.xiaodao.config.MultipartSupportConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.*;
import com.xiaodao.system.entity.GenTable;

import java.util.List;

@FeignClient(value = "system-service", path = "/genTable", fallbackFactory = GenTableClientFallback.class, configuration = MultipartSupportConfig.class)
public interface GenTableClient {

    @GetMapping("/")
    RespVO<IPage<GenTable>> queryPage(@RequestParam(value = "pageIndex") int pageIndex,
                                      @RequestParam(required = false, defaultValue = "10") int pageSize);


    @GetMapping("/{tableId}")
    RespVO<GenTable> selectByPrimaryKey(@PathVariable(value = "tableId") Long tableId);


    @DeleteMapping("/{tableId}")
    RespVO deleteByPrimaryKey(@PathVariable(value = "tableId") Long tableId);


    @PostMapping("/")
    RespVO insert(@RequestBody GenTable genTable);


    @PutMapping("/")
    RespVO updateByPrimaryKey(@RequestBody GenTable genTable);


    @DeleteMapping("/deleteBatchPrimaryKeys")
    RespVO deleteBatchPrimaryKeys(@RequestBody List<Long> list);


    @PostMapping("/list")
    RespVO query(@RequestBody GenTable genTable);
}

class GenTableClientFallback implements GenTableClient {


    @Override
    public RespVO<IPage<GenTable>> queryPage(int pageIndex, int pageSize) {
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO<GenTable> selectByPrimaryKey( Long tableId){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO deleteByPrimaryKey( Long tableId){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO insert(@RequestBody GenTable genTable){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO updateByPrimaryKey(GenTable genTable){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO deleteBatchPrimaryKeys(List<Long> list){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO query(GenTable genTable){
        return RespVOBuilder.failure("system-service服务不可用");
    }
}