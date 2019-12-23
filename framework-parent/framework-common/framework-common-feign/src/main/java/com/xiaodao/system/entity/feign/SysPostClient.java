package com.xiaodao.system.entity.feign;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xiaodao.core.vo.RespVO;
import com.xiaodao.core.vo.RespVOBuilder;
import com.xiaodao.config.MultipartSupportConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.*;
import com.xiaodao.system.entity.SysPost;

import java.util.List;

@FeignClient(value = "system-service", path = "/sysPost", fallbackFactory = SysPostClientFallback.class, configuration = MultipartSupportConfig.class)
public interface SysPostClient {

    @GetMapping("/")
    RespVO<IPage<SysPost>> queryPage(@RequestParam(value = "pageIndex") int pageIndex,
                                     @RequestParam(required = false, defaultValue = "10") int pageSize);


    @GetMapping("/{postId}")
    RespVO<SysPost> selectByPrimaryKey(@PathVariable(value = "postId") Long postId);


    @DeleteMapping("/{postId}")
    RespVO deleteByPrimaryKey(@PathVariable(value = "postId") Long postId);


    @PostMapping("/")
    RespVO insert(@RequestBody SysPost sysPost);


    @PutMapping("/")
    RespVO updateByPrimaryKey(@RequestBody SysPost sysPost);


    @DeleteMapping("/deleteBatchPrimaryKeys")
    RespVO deleteBatchPrimaryKeys(@RequestBody List<Long> list);


    @PostMapping("/list")
    RespVO query(@RequestBody SysPost sysPost);
}

class SysPostClientFallback implements SysPostClient {


    @Override
    public RespVO<IPage<SysPost>> queryPage(int pageIndex, int pageSize) {
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO<SysPost> selectByPrimaryKey( Long postId){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO deleteByPrimaryKey( Long postId){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO insert(@RequestBody SysPost sysPost){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO updateByPrimaryKey(SysPost sysPost){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO deleteBatchPrimaryKeys(List<Long> list){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO query(SysPost sysPost){
        return RespVOBuilder.failure("system-service服务不可用");
    }
}