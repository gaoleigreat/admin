package com.xiaodao.system.feign;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xiaodao.core.vo.RespVO;
import com.xiaodao.core.vo.RespVOBuilder;
import com.xiaodao.config.MultipartSupportConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.*;
import com.xiaodao.system.entity.SysRole;

import java.util.List;

@FeignClient(value = "system-service", path = "/sysRole", fallbackFactory = SysRoleClientFallback.class, configuration = MultipartSupportConfig.class)
public interface SysRoleClient {

    @GetMapping("/")
    RespVO<IPage<SysRole>> queryPage(@RequestParam(value = "pageIndex") int pageIndex,
                                     @RequestParam(required = false, defaultValue = "10") int pageSize);


    @GetMapping("/{roleId}")
    RespVO<SysRole> selectByPrimaryKey(@PathVariable(value = "roleId") Long roleId);


    @DeleteMapping("/{roleId}")
    RespVO deleteByPrimaryKey(@PathVariable(value = "roleId") Long roleId);


    @PostMapping("/")
    RespVO insert(@RequestBody SysRole sysRole);


    @PutMapping("/")
    RespVO updateByPrimaryKey(@RequestBody SysRole sysRole);


    @DeleteMapping("/deleteBatchPrimaryKeys")
    RespVO deleteBatchPrimaryKeys(@RequestBody List<Long> list);


    @PostMapping("/list")
    RespVO query(@RequestBody SysRole sysRole);
}

class SysRoleClientFallback implements SysRoleClient {


    @Override
    public RespVO<IPage<SysRole>> queryPage(int pageIndex, int pageSize) {
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO<SysRole> selectByPrimaryKey( Long roleId){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO deleteByPrimaryKey( Long roleId){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO insert(@RequestBody SysRole sysRole){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO updateByPrimaryKey(SysRole sysRole){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO deleteBatchPrimaryKeys(List<Long> list){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO query(SysRole sysRole){
        return RespVOBuilder.failure("system-service服务不可用");
    }
}