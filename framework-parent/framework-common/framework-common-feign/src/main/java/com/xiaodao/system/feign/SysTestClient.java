package com.xiaodao.system.feign;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xiaodao.core.vo.RespVO;
import com.xiaodao.core.vo.RespVOBuilder;
import com.xiaodao.config.MultipartSupportConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.*;
import com.xiaodao.system.entity.SysTest;

import java.util.List;

@FeignClient(value = "system-service", path = "/sysTest", fallbackFactory = SysTestClientFallback.class, configuration = MultipartSupportConfig.class)
public interface SysTestClient {

    @GetMapping("/")
    RespVO<IPage<SysTest>> queryPage(@RequestParam(value = "pageIndex") int pageIndex,
                                     @RequestParam(required = false, defaultValue = "10") int pageSize);


    @GetMapping("/{id}")
    RespVO<SysTest> selectByPrimaryKey(@PathVariable(value = "id") Long id);


    @DeleteMapping("/{id}")
    RespVO deleteByPrimaryKey(@PathVariable(value = "id") Long id);


    @PostMapping("/")
    RespVO insert(@RequestBody SysTest sysTest);


    @PutMapping("/")
    RespVO updateByPrimaryKey(@RequestBody SysTest sysTest);


    @DeleteMapping("/deleteBatchPrimaryKeys")
    RespVO deleteBatchPrimaryKeys(@RequestBody List<Long> list);


    @PostMapping("/list")
    RespVO query(@RequestBody SysTest sysTest);
}

class SysTestClientFallback implements SysTestClient {


    @Override
    public RespVO<IPage<SysTest>> queryPage(int pageIndex, int pageSize) {
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO<SysTest> selectByPrimaryKey( Long id){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO deleteByPrimaryKey( Long id){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO insert(@RequestBody SysTest sysTest){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO updateByPrimaryKey(SysTest sysTest){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO deleteBatchPrimaryKeys(List<Long> list){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO query(SysTest sysTest){
        return RespVOBuilder.failure("system-service服务不可用");
    }
}