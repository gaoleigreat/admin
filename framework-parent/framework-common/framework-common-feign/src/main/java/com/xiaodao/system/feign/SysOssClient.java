package com.xiaodao.system.feign;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xiaodao.core.vo.RespVO;
import com.xiaodao.core.vo.RespVOBuilder;
import com.xiaodao.config.MultipartSupportConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.*;
import com.xiaodao.system.entity.SysOss;

import java.util.List;

@FeignClient(value = "system-service", path = "/sysOss", fallbackFactory = SysOssClientFallback.class, configuration = MultipartSupportConfig.class)
public interface SysOssClient {

    @GetMapping("/")
    RespVO<IPage<SysOss>> queryPage(@RequestParam(value = "pageIndex") int pageIndex,
                                    @RequestParam(required = false, defaultValue = "10") int pageSize);


    @GetMapping("/{id}")
    RespVO<SysOss> selectByPrimaryKey(@PathVariable(value = "id") Long id);


    @DeleteMapping("/{id}")
    RespVO deleteByPrimaryKey(@PathVariable(value = "id") Long id);


    @PostMapping("/")
    RespVO insert(@RequestBody SysOss sysOss);


    @PutMapping("/")
    RespVO updateByPrimaryKey(@RequestBody SysOss sysOss);


    @DeleteMapping("/deleteBatchPrimaryKeys")
    RespVO deleteBatchPrimaryKeys(@RequestBody List<Long> list);


    @PostMapping("/list")
    RespVO query(@RequestBody SysOss sysOss);
}

class SysOssClientFallback implements SysOssClient {


    @Override
    public RespVO<IPage<SysOss>> queryPage(int pageIndex, int pageSize) {
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO<SysOss> selectByPrimaryKey( Long id){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO deleteByPrimaryKey( Long id){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO insert(@RequestBody SysOss sysOss){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO updateByPrimaryKey(SysOss sysOss){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO deleteBatchPrimaryKeys(List<Long> list){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO query(SysOss sysOss){
        return RespVOBuilder.failure("system-service服务不可用");
    }
}