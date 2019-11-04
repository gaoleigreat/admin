package com.xiaodao.system.entity.feign;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xiaodao.core.vo.RespVO;
import com.xiaodao.core.vo.RespVOBuilder;
import com.xiaodao.config.MultipartSupportConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.*;
import com.xiaodao.system.entity.SysUser;

import java.util.List;

@FeignClient(value = "system-service", path = "/sysUser", fallbackFactory = SysUserClientFallback.class, configuration = MultipartSupportConfig.class)
public interface SysUserClient {

    @GetMapping("/")
    RespVO<IPage<SysUser>> queryPage(@RequestParam(value = "pageIndex") int pageIndex,
                                     @RequestParam(required = false, defaultValue = "10") int pageSize);


    @GetMapping("/{userId}")
    RespVO<SysUser> selectByPrimaryKey(@PathVariable(value = "userId") Long userId);


    @DeleteMapping("/{userId}")
    RespVO deleteByPrimaryKey(@PathVariable(value = "userId") Long userId);


    @PostMapping("/")
    RespVO insert(@RequestBody SysUser sysUser);


    @PutMapping("/")
    RespVO updateByPrimaryKey(@RequestBody SysUser sysUser);


    @DeleteMapping("/deleteBatchPrimaryKeys")
    RespVO deleteBatchPrimaryKeys(@RequestBody List<Long> list);


    @PostMapping("/list")
    RespVO query(@RequestBody SysUser sysUser);
}

class SysUserClientFallback implements SysUserClient {


    @Override
    public RespVO<IPage<SysUser>> queryPage(int pageIndex, int pageSize) {
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO<SysUser> selectByPrimaryKey( Long userId){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO deleteByPrimaryKey( Long userId){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO insert(@RequestBody SysUser sysUser){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO updateByPrimaryKey(SysUser sysUser){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO deleteBatchPrimaryKeys(List<Long> list){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO query(SysUser sysUser){
        return RespVOBuilder.failure("system-service服务不可用");
    }
}