package com.xiaodao.system.entity.feign;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xiaodao.core.vo.RespVO;
import com.xiaodao.core.vo.RespVOBuilder;
import com.xiaodao.config.MultipartSupportConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.*;
import com.xiaodao.system.entity.SysRoleDept;

import java.util.List;

@FeignClient(value = "system-service", path = "/sysRoleDept", fallbackFactory = SysRoleDeptClientFallback.class, configuration = MultipartSupportConfig.class)
public interface SysRoleDeptClient {

    @GetMapping("/")
    RespVO<IPage<SysRoleDept>> queryPage(@RequestParam(value = "pageIndex") int pageIndex,
                                         @RequestParam(required = false, defaultValue = "10") int pageSize);


    @GetMapping("/{roleId}")
    RespVO<SysRoleDept> selectByPrimaryKey(@PathVariable(value = "roleId") Long roleId);


    @DeleteMapping("/{roleId}")
    RespVO deleteByPrimaryKey(@PathVariable(value = "roleId") Long roleId);


    @PostMapping("/")
    RespVO insert(@RequestBody SysRoleDept sysRoleDept);


    @PutMapping("/")
    RespVO updateByPrimaryKey(@RequestBody SysRoleDept sysRoleDept);


    @DeleteMapping("/deleteBatchPrimaryKeys")
    RespVO deleteBatchPrimaryKeys(@RequestBody List<Long> list);


    @PostMapping("/list")
    RespVO query(@RequestBody SysRoleDept sysRoleDept);
}

class SysRoleDeptClientFallback implements SysRoleDeptClient {


    @Override
    public RespVO<IPage<SysRoleDept>> queryPage(int pageIndex, int pageSize) {
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO<SysRoleDept> selectByPrimaryKey( Long roleId){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO deleteByPrimaryKey( Long roleId){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO insert(@RequestBody SysRoleDept sysRoleDept){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO updateByPrimaryKey(SysRoleDept sysRoleDept){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO deleteBatchPrimaryKeys(List<Long> list){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO query(SysRoleDept sysRoleDept){
        return RespVOBuilder.failure("system-service服务不可用");
    }
}