package com.xiaodao.system.feign;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xiaodao.core.vo.RespVO;
import com.xiaodao.core.vo.RespVOBuilder;
import com.xiaodao.config.MultipartSupportConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.*;
import com.xiaodao.system.entity.SysRoleMenu;

import java.util.List;

@FeignClient(value = "system-service", path = "/sysRoleMenu", fallbackFactory = SysRoleMenuClientFallback.class, configuration = MultipartSupportConfig.class)
public interface SysRoleMenuClient {

    @GetMapping("/")
    RespVO<IPage<SysRoleMenu>> queryPage(@RequestParam(value = "pageIndex") int pageIndex,
                                         @RequestParam(required = false, defaultValue = "10") int pageSize);


    @GetMapping("/{roleId}")
    RespVO<SysRoleMenu> selectByPrimaryKey(@PathVariable(value = "roleId") Long roleId);


    @DeleteMapping("/{roleId}")
    RespVO deleteByPrimaryKey(@PathVariable(value = "roleId") Long roleId);


    @PostMapping("/")
    RespVO insert(@RequestBody SysRoleMenu sysRoleMenu);


    @PutMapping("/")
    RespVO updateByPrimaryKey(@RequestBody SysRoleMenu sysRoleMenu);


    @DeleteMapping("/deleteBatchPrimaryKeys")
    RespVO deleteBatchPrimaryKeys(@RequestBody List<Long> list);


    @PostMapping("/list")
    RespVO query(@RequestBody SysRoleMenu sysRoleMenu);
}

class SysRoleMenuClientFallback implements SysRoleMenuClient {


    @Override
    public RespVO<IPage<SysRoleMenu>> queryPage(int pageIndex, int pageSize) {
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO<SysRoleMenu> selectByPrimaryKey( Long roleId){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO deleteByPrimaryKey( Long roleId){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO insert(@RequestBody SysRoleMenu sysRoleMenu){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO updateByPrimaryKey(SysRoleMenu sysRoleMenu){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO deleteBatchPrimaryKeys(List<Long> list){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO query(SysRoleMenu sysRoleMenu){
        return RespVOBuilder.failure("system-service服务不可用");
    }
}