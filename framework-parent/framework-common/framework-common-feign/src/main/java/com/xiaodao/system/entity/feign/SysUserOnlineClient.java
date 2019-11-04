package com.xiaodao.system.entity.feign;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xiaodao.core.vo.RespVO;
import com.xiaodao.core.vo.RespVOBuilder;
import com.xiaodao.config.MultipartSupportConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.*;
import com.xiaodao.system.entity.SysUserOnline;

import java.util.List;

@FeignClient(value = "system-service", path = "/sysUserOnline", fallbackFactory = SysUserOnlineClientFallback.class, configuration = MultipartSupportConfig.class)
public interface SysUserOnlineClient {

    @GetMapping("/")
    RespVO<IPage<SysUserOnline>> queryPage(@RequestParam(value = "pageIndex") int pageIndex,
                                           @RequestParam(required = false, defaultValue = "10") int pageSize);


    @GetMapping("/{sessionid}")
    RespVO<SysUserOnline> selectByPrimaryKey(@PathVariable(value = "sessionid") String sessionid);


    @DeleteMapping("/{sessionid}")
    RespVO deleteByPrimaryKey(@PathVariable(value = "sessionid") String sessionid);


    @PostMapping("/")
    RespVO insert(@RequestBody SysUserOnline sysUserOnline);


    @PutMapping("/")
    RespVO updateByPrimaryKey(@RequestBody SysUserOnline sysUserOnline);


    @DeleteMapping("/deleteBatchPrimaryKeys")
    RespVO deleteBatchPrimaryKeys(@RequestBody List<String> list);


    @PostMapping("/list")
    RespVO query(@RequestBody SysUserOnline sysUserOnline);
}

class SysUserOnlineClientFallback implements SysUserOnlineClient {


    @Override
    public RespVO<IPage<SysUserOnline>> queryPage(int pageIndex, int pageSize) {
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO<SysUserOnline> selectByPrimaryKey( String sessionid){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO deleteByPrimaryKey( String sessionid){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO insert(@RequestBody SysUserOnline sysUserOnline){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO updateByPrimaryKey(SysUserOnline sysUserOnline){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO deleteBatchPrimaryKeys(List<String> list){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO query(SysUserOnline sysUserOnline){
        return RespVOBuilder.failure("system-service服务不可用");
    }
}