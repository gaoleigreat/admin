package com.xiaodao.system.feign;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xiaodao.core.vo.RespVO;
import com.xiaodao.core.vo.RespVOBuilder;
import com.xiaodao.config.MultipartSupportConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.*;
import com.xiaodao.system.entity.SysUserPost;

import java.util.List;

@FeignClient(value = "system-service", path = "/sysUserPost", fallbackFactory = SysUserPostClientFallback.class, configuration = MultipartSupportConfig.class)
public interface SysUserPostClient {

    @GetMapping("/")
    RespVO<IPage<SysUserPost>> queryPage(@RequestParam(value = "pageIndex") int pageIndex,
                                         @RequestParam(required = false, defaultValue = "10") int pageSize);


    @GetMapping("/{userId}")
    RespVO<SysUserPost> selectByPrimaryKey(@PathVariable(value = "userId") Long userId);


    @DeleteMapping("/{userId}")
    RespVO deleteByPrimaryKey(@PathVariable(value = "userId") Long userId);


    @PostMapping("/")
    RespVO insert(@RequestBody SysUserPost sysUserPost);


    @PutMapping("/")
    RespVO updateByPrimaryKey(@RequestBody SysUserPost sysUserPost);


    @DeleteMapping("/deleteBatchPrimaryKeys")
    RespVO deleteBatchPrimaryKeys(@RequestBody List<Long> list);


    @PostMapping("/list")
    RespVO query(@RequestBody SysUserPost sysUserPost);
}

class SysUserPostClientFallback implements SysUserPostClient {


    @Override
    public RespVO<IPage<SysUserPost>> queryPage(int pageIndex, int pageSize) {
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO<SysUserPost> selectByPrimaryKey( Long userId){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO deleteByPrimaryKey( Long userId){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO insert(@RequestBody SysUserPost sysUserPost){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO updateByPrimaryKey(SysUserPost sysUserPost){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO deleteBatchPrimaryKeys(List<Long> list){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO query(SysUserPost sysUserPost){
        return RespVOBuilder.failure("system-service服务不可用");
    }
}