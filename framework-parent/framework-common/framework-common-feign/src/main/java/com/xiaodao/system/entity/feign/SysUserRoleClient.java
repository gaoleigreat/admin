package com.xiaodao.system.entity.feign;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xiaodao.core.vo.RespVO;
import com.xiaodao.core.vo.RespVOBuilder;
import com.xiaodao.config.MultipartSupportConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.*;
import com.xiaodao.system.entity.SysUserRole;

import java.util.List;

@FeignClient(value = "system-service", path = "/sysUserRole", fallbackFactory = SysUserRoleClientFallback.class, configuration = MultipartSupportConfig.class)
public interface SysUserRoleClient {

    @GetMapping("/")
    RespVO<IPage<SysUserRole>> queryPage(@RequestParam(value = "pageIndex") int pageIndex,
                                         @RequestParam(required = false, defaultValue = "10") int pageSize);


    @GetMapping("/{userId}")
    RespVO<SysUserRole> selectByPrimaryKey(@PathVariable(value = "userId") Long userId);


    @DeleteMapping("/{userId}")
    RespVO deleteByPrimaryKey(@PathVariable(value = "userId") Long userId);


    @PostMapping("/")
    RespVO insert(@RequestBody SysUserRole sysUserRole);


    @PutMapping("/")
    RespVO updateByPrimaryKey(@RequestBody SysUserRole sysUserRole);


    @DeleteMapping("/deleteBatchPrimaryKeys")
    RespVO deleteBatchPrimaryKeys(@RequestBody List<Long> list);


    @PostMapping("/list")
    RespVO query(@RequestBody SysUserRole sysUserRole);
}

class SysUserRoleClientFallback implements SysUserRoleClient {


    @Override
    public RespVO<IPage<SysUserRole>> queryPage(int pageIndex, int pageSize) {
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO<SysUserRole> selectByPrimaryKey( Long userId){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO deleteByPrimaryKey( Long userId){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO insert(@RequestBody SysUserRole sysUserRole){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO updateByPrimaryKey(SysUserRole sysUserRole){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO deleteBatchPrimaryKeys(List<Long> list){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO query(SysUserRole sysUserRole){
        return RespVOBuilder.failure("system-service服务不可用");
    }
}