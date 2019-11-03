package com.xiaodao.system.feign;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xiaodao.core.vo.RespVO;
import com.xiaodao.core.vo.RespVOBuilder;
import com.xiaodao.config.MultipartSupportConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.*;
import com.xiaodao.system.entity.SysDept;

import java.util.List;

@FeignClient(value = "system-service", path = "/sysDept", fallbackFactory = SysDeptClientFallback.class, configuration = MultipartSupportConfig.class)
public interface SysDeptClient {

    @GetMapping("/")
    RespVO<IPage<SysDept>> queryPage(@RequestParam(value = "pageIndex") int pageIndex,
                                     @RequestParam(required = false, defaultValue = "10") int pageSize);


    @GetMapping("/{deptId}")
    RespVO<SysDept> selectByPrimaryKey(@PathVariable(value = "deptId") Long deptId);


    @DeleteMapping("/{deptId}")
    RespVO deleteByPrimaryKey(@PathVariable(value = "deptId") Long deptId);


    @PostMapping("/")
    RespVO insert(@RequestBody SysDept sysDept);


    @PutMapping("/")
    RespVO updateByPrimaryKey(@RequestBody SysDept sysDept);


    @DeleteMapping("/deleteBatchPrimaryKeys")
    RespVO deleteBatchPrimaryKeys(@RequestBody List<Long> list);


    @PostMapping("/list")
    RespVO query(@RequestBody SysDept sysDept);
}

class SysDeptClientFallback implements SysDeptClient {


    @Override
    public RespVO<IPage<SysDept>> queryPage(int pageIndex, int pageSize) {
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO<SysDept> selectByPrimaryKey( Long deptId){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO deleteByPrimaryKey( Long deptId){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO insert(@RequestBody SysDept sysDept){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO updateByPrimaryKey(SysDept sysDept){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO deleteBatchPrimaryKeys(List<Long> list){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO query(SysDept sysDept){
        return RespVOBuilder.failure("system-service服务不可用");
    }
}