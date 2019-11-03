package com.xiaodao.system.feign;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xiaodao.core.vo.RespVO;
import com.xiaodao.core.vo.RespVOBuilder;
import com.xiaodao.config.MultipartSupportConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.*;
import com.xiaodao.system.entity.SysConfig;

import java.util.List;

@FeignClient(value = "system-service", path = "/sysConfig", fallbackFactory = SysConfigClientFallback.class, configuration = MultipartSupportConfig.class)
public interface SysConfigClient {

    @GetMapping("/")
    RespVO<IPage<SysConfig>> queryPage(@RequestParam(value = "pageIndex") int pageIndex,
                                       @RequestParam(required = false, defaultValue = "10") int pageSize);


    @GetMapping("/{configId}")
    RespVO<SysConfig> selectByPrimaryKey(@PathVariable(value = "configId") Long configId);


    @DeleteMapping("/{configId}")
    RespVO deleteByPrimaryKey(@PathVariable(value = "configId") Long configId);


    @PostMapping("/")
    RespVO insert(@RequestBody SysConfig sysConfig);


    @PutMapping("/")
    RespVO updateByPrimaryKey(@RequestBody SysConfig sysConfig);


    @DeleteMapping("/deleteBatchPrimaryKeys")
    RespVO deleteBatchPrimaryKeys(@RequestBody List<Long> list);


    @PostMapping("/list")
    RespVO query(@RequestBody SysConfig sysConfig);
}

class SysConfigClientFallback implements SysConfigClient {


    @Override
    public RespVO<IPage<SysConfig>> queryPage(int pageIndex, int pageSize) {
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO<SysConfig> selectByPrimaryKey( Long configId){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO deleteByPrimaryKey( Long configId){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO insert(@RequestBody SysConfig sysConfig){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO updateByPrimaryKey(SysConfig sysConfig){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO deleteBatchPrimaryKeys(List<Long> list){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO query(SysConfig sysConfig){
        return RespVOBuilder.failure("system-service服务不可用");
    }
}