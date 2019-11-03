package com.xiaodao.system.feign;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xiaodao.core.vo.RespVO;
import com.xiaodao.core.vo.RespVOBuilder;
import com.xiaodao.config.MultipartSupportConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.*;
import com.xiaodao.system.entity.PerceptionFile;

import java.util.List;

@FeignClient(value = "system-service", path = "/perceptionFile", fallbackFactory = PerceptionFileClientFallback.class, configuration = MultipartSupportConfig.class)
public interface PerceptionFileClient {

    @GetMapping("/")
    RespVO<IPage<PerceptionFile>> queryPage(@RequestParam(value = "pageIndex") int pageIndex,
                                            @RequestParam(required = false, defaultValue = "10") int pageSize);


    @GetMapping("/{id}")
    RespVO<PerceptionFile> selectByPrimaryKey(@PathVariable(value = "id") Long id);


    @DeleteMapping("/{id}")
    RespVO deleteByPrimaryKey(@PathVariable(value = "id") Long id);


    @PostMapping("/")
    RespVO insert(@RequestBody PerceptionFile perceptionFile);


    @PutMapping("/")
    RespVO updateByPrimaryKey(@RequestBody PerceptionFile perceptionFile);


    @DeleteMapping("/deleteBatchPrimaryKeys")
    RespVO deleteBatchPrimaryKeys(@RequestBody List<Long> list);


    @PostMapping("/list")
    RespVO query(@RequestBody PerceptionFile perceptionFile);
}

class PerceptionFileClientFallback implements PerceptionFileClient {


    @Override
    public RespVO<IPage<PerceptionFile>> queryPage(int pageIndex, int pageSize) {
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO<PerceptionFile> selectByPrimaryKey( Long id){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO deleteByPrimaryKey( Long id){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO insert(@RequestBody PerceptionFile perceptionFile){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO updateByPrimaryKey(PerceptionFile perceptionFile){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO deleteBatchPrimaryKeys(List<Long> list){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO query(PerceptionFile perceptionFile){
        return RespVOBuilder.failure("system-service服务不可用");
    }
}