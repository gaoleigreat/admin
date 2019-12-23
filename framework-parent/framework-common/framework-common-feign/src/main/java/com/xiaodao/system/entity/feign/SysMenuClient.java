package com.xiaodao.system.entity.feign;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xiaodao.core.vo.RespVO;
import com.xiaodao.core.vo.RespVOBuilder;
import com.xiaodao.config.MultipartSupportConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.*;
import com.xiaodao.system.entity.SysMenu;

import java.util.List;

@FeignClient(value = "system-service", path = "/sysMenu", fallbackFactory = SysMenuClientFallback.class, configuration = MultipartSupportConfig.class)
public interface SysMenuClient {

    @GetMapping("/")
    RespVO<IPage<SysMenu>> queryPage(@RequestParam(value = "pageIndex") int pageIndex,
                                     @RequestParam(required = false, defaultValue = "10") int pageSize);


    @GetMapping("/{menuId}")
    RespVO<SysMenu> selectByPrimaryKey(@PathVariable(value = "menuId") Long menuId);


    @DeleteMapping("/{menuId}")
    RespVO deleteByPrimaryKey(@PathVariable(value = "menuId") Long menuId);


    @PostMapping("/")
    RespVO insert(@RequestBody SysMenu sysMenu);


    @PutMapping("/")
    RespVO updateByPrimaryKey(@RequestBody SysMenu sysMenu);


    @DeleteMapping("/deleteBatchPrimaryKeys")
    RespVO deleteBatchPrimaryKeys(@RequestBody List<Long> list);


    @PostMapping("/list")
    RespVO query(@RequestBody SysMenu sysMenu);
}

class SysMenuClientFallback implements SysMenuClient {


    @Override
    public RespVO<IPage<SysMenu>> queryPage(int pageIndex, int pageSize) {
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO<SysMenu> selectByPrimaryKey( Long menuId){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO deleteByPrimaryKey( Long menuId){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO insert(@RequestBody SysMenu sysMenu){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO updateByPrimaryKey(SysMenu sysMenu){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO deleteBatchPrimaryKeys(List<Long> list){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO query(SysMenu sysMenu){
        return RespVOBuilder.failure("system-service服务不可用");
    }
}