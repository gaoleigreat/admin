package com.xiaodao.system.feign;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xiaodao.core.vo.RespVO;
import com.xiaodao.core.vo.RespVOBuilder;
import com.xiaodao.config.MultipartSupportConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.*;
import com.xiaodao.system.entity.SysDictData;

import java.util.List;

@FeignClient(value = "system-service", path = "/sysDictData", fallbackFactory = SysDictDataClientFallback.class, configuration = MultipartSupportConfig.class)
public interface SysDictDataClient {

    @GetMapping("/")
    RespVO<IPage<SysDictData>> queryPage(@RequestParam(value = "pageIndex") int pageIndex,
                                         @RequestParam(required = false, defaultValue = "10") int pageSize);


    @GetMapping("/{dictCode}")
    RespVO<SysDictData> selectByPrimaryKey(@PathVariable(value = "dictCode") Integer dictCode);


    @DeleteMapping("/{dictCode}")
    RespVO deleteByPrimaryKey(@PathVariable(value = "dictCode") Integer dictCode);


    @PostMapping("/")
    RespVO insert(@RequestBody SysDictData sysDictData);


    @PutMapping("/")
    RespVO updateByPrimaryKey(@RequestBody SysDictData sysDictData);


    @DeleteMapping("/deleteBatchPrimaryKeys")
    RespVO deleteBatchPrimaryKeys(@RequestBody List<Integer> list);


    @PostMapping("/list")
    RespVO query(@RequestBody SysDictData sysDictData);
}

class SysDictDataClientFallback implements SysDictDataClient {


    @Override
    public RespVO<IPage<SysDictData>> queryPage(int pageIndex, int pageSize) {
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO<SysDictData> selectByPrimaryKey( Integer dictCode){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO deleteByPrimaryKey( Integer dictCode){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO insert(@RequestBody SysDictData sysDictData){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO updateByPrimaryKey(SysDictData sysDictData){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO deleteBatchPrimaryKeys(List<Integer> list){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO query(SysDictData sysDictData){
        return RespVOBuilder.failure("system-service服务不可用");
    }
}