package com.xiaodao.system.entity.feign;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xiaodao.core.vo.RespVO;
import com.xiaodao.core.vo.RespVOBuilder;
import com.xiaodao.config.MultipartSupportConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.*;
import com.xiaodao.system.entity.SysNotice;

import java.util.List;

@FeignClient(value = "system-service", path = "/sysNotice", fallbackFactory = SysNoticeClientFallback.class, configuration = MultipartSupportConfig.class)
public interface SysNoticeClient {

    @GetMapping("/")
    RespVO<IPage<SysNotice>> queryPage(@RequestParam(value = "pageIndex") int pageIndex,
                                       @RequestParam(required = false, defaultValue = "10") int pageSize);


    @GetMapping("/{noticeId}")
    RespVO<SysNotice> selectByPrimaryKey(@PathVariable(value = "noticeId") Long noticeId);


    @DeleteMapping("/{noticeId}")
    RespVO deleteByPrimaryKey(@PathVariable(value = "noticeId") Long noticeId);


    @PostMapping("/")
    RespVO insert(@RequestBody SysNotice sysNotice);


    @PutMapping("/")
    RespVO updateByPrimaryKey(@RequestBody SysNotice sysNotice);


    @DeleteMapping("/deleteBatchPrimaryKeys")
    RespVO deleteBatchPrimaryKeys(@RequestBody List<Long> list);


    @PostMapping("/list")
    RespVO query(@RequestBody SysNotice sysNotice);
}

class SysNoticeClientFallback implements SysNoticeClient {


    @Override
    public RespVO<IPage<SysNotice>> queryPage(int pageIndex, int pageSize) {
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO<SysNotice> selectByPrimaryKey( Long noticeId){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO deleteByPrimaryKey( Long noticeId){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO insert(@RequestBody SysNotice sysNotice){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO updateByPrimaryKey(SysNotice sysNotice){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO deleteBatchPrimaryKeys(List<Long> list){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO query(SysNotice sysNotice){
        return RespVOBuilder.failure("system-service服务不可用");
    }
}