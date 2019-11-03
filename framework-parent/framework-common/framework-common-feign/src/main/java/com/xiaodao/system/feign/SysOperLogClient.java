package com.xiaodao.system.feign;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xiaodao.core.vo.RespVO;
import com.xiaodao.core.vo.RespVOBuilder;
import com.xiaodao.config.MultipartSupportConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.*;
import com.xiaodao.system.entity.SysOperLog;

import java.util.List;

@FeignClient(value = "system-service", path = "/sysOperLog", fallbackFactory = SysOperLogClientFallback.class, configuration = MultipartSupportConfig.class)
public interface SysOperLogClient {

    @GetMapping("/")
    RespVO<IPage<SysOperLog>> queryPage(@RequestParam(value = "pageIndex") int pageIndex,
                                        @RequestParam(required = false, defaultValue = "10") int pageSize);


    @GetMapping("/{operId}")
    RespVO<SysOperLog> selectByPrimaryKey(@PathVariable(value = "operId") Long operId);


    @DeleteMapping("/{operId}")
    RespVO deleteByPrimaryKey(@PathVariable(value = "operId") Long operId);


    @PostMapping("/")
    RespVO insert(@RequestBody SysOperLog sysOperLog);


    @PutMapping("/")
    RespVO updateByPrimaryKey(@RequestBody SysOperLog sysOperLog);


    @DeleteMapping("/deleteBatchPrimaryKeys")
    RespVO deleteBatchPrimaryKeys(@RequestBody List<Long> list);


    @PostMapping("/list")
    RespVO query(@RequestBody SysOperLog sysOperLog);
}

class SysOperLogClientFallback implements SysOperLogClient {


    @Override
    public RespVO<IPage<SysOperLog>> queryPage(int pageIndex, int pageSize) {
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO<SysOperLog> selectByPrimaryKey( Long operId){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO deleteByPrimaryKey( Long operId){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO insert(@RequestBody SysOperLog sysOperLog){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO updateByPrimaryKey(SysOperLog sysOperLog){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO deleteBatchPrimaryKeys(List<Long> list){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO query(SysOperLog sysOperLog){
        return RespVOBuilder.failure("system-service服务不可用");
    }
}