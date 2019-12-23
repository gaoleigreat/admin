package com.xiaodao.system.entity.feign;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xiaodao.core.vo.RespVO;
import com.xiaodao.core.vo.RespVOBuilder;
import com.xiaodao.config.MultipartSupportConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.*;
import com.xiaodao.system.entity.SysLogininfor;

import java.util.List;

@FeignClient(value = "system-service", path = "/sysLogininfor", fallbackFactory = SysLogininforClientFallback.class, configuration = MultipartSupportConfig.class)
public interface SysLogininforClient {

    @GetMapping("/")
    RespVO<IPage<SysLogininfor>> queryPage(@RequestParam(value = "pageIndex") int pageIndex,
                                           @RequestParam(required = false, defaultValue = "10") int pageSize);


    @GetMapping("/{infoId}")
    RespVO<SysLogininfor> selectByPrimaryKey(@PathVariable(value = "infoId") Long infoId);


    @DeleteMapping("/{infoId}")
    RespVO deleteByPrimaryKey(@PathVariable(value = "infoId") Long infoId);


    @PostMapping("/")
    RespVO insert(@RequestBody SysLogininfor sysLogininfor);


    @PutMapping("/")
    RespVO updateByPrimaryKey(@RequestBody SysLogininfor sysLogininfor);


    @DeleteMapping("/deleteBatchPrimaryKeys")
    RespVO deleteBatchPrimaryKeys(@RequestBody List<Long> list);


    @PostMapping("/list")
    RespVO query(@RequestBody SysLogininfor sysLogininfor);
}

class SysLogininforClientFallback implements SysLogininforClient {


    @Override
    public RespVO<IPage<SysLogininfor>> queryPage(int pageIndex, int pageSize) {
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO<SysLogininfor> selectByPrimaryKey( Long infoId){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO deleteByPrimaryKey( Long infoId){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO insert(@RequestBody SysLogininfor sysLogininfor){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO updateByPrimaryKey(SysLogininfor sysLogininfor){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO deleteBatchPrimaryKeys(List<Long> list){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO query(SysLogininfor sysLogininfor){
        return RespVOBuilder.failure("system-service服务不可用");
    }
}