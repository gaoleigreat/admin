package com.xiaodao.system.feign;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xiaodao.core.vo.RespVO;
import com.xiaodao.core.vo.RespVOBuilder;
import com.xiaodao.config.MultipartSupportConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.*;
import com.xiaodao.system.entity.SysDictType;

import java.util.List;

@FeignClient(value = "system-service", path = "/sysDictType", fallbackFactory = SysDictTypeClientFallback.class, configuration = MultipartSupportConfig.class)
public interface SysDictTypeClient {

    @GetMapping("/")
    RespVO<IPage<SysDictType>> queryPage(@RequestParam(value = "pageIndex") int pageIndex,
                                         @RequestParam(required = false, defaultValue = "10") int pageSize);


    @GetMapping("/{dictId}")
    RespVO<SysDictType> selectByPrimaryKey(@PathVariable(value = "dictId") Long dictId);


    @DeleteMapping("/{dictId}")
    RespVO deleteByPrimaryKey(@PathVariable(value = "dictId") Long dictId);


    @PostMapping("/")
    RespVO insert(@RequestBody SysDictType sysDictType);


    @PutMapping("/")
    RespVO updateByPrimaryKey(@RequestBody SysDictType sysDictType);


    @DeleteMapping("/deleteBatchPrimaryKeys")
    RespVO deleteBatchPrimaryKeys(@RequestBody List<Long> list);


    @PostMapping("/list")
    RespVO query(@RequestBody SysDictType sysDictType);
}

class SysDictTypeClientFallback implements SysDictTypeClient {


    @Override
    public RespVO<IPage<SysDictType>> queryPage(int pageIndex, int pageSize) {
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO<SysDictType> selectByPrimaryKey( Long dictId){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO deleteByPrimaryKey( Long dictId){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO insert(@RequestBody SysDictType sysDictType){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO updateByPrimaryKey(SysDictType sysDictType){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO deleteBatchPrimaryKeys(List<Long> list){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO query(SysDictType sysDictType){
        return RespVOBuilder.failure("system-service服务不可用");
    }
}