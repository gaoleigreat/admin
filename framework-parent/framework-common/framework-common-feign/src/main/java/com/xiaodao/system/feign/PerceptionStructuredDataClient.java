package com.xiaodao.system.feign;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xiaodao.core.vo.RespVO;
import com.xiaodao.core.vo.RespVOBuilder;
import com.xiaodao.config.MultipartSupportConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.*;
import com.xiaodao.system.entity.PerceptionStructuredData;

import java.util.List;

@FeignClient(value = "system-service", path = "/perceptionStructuredData", fallbackFactory = PerceptionStructuredDataClientFallback.class, configuration = MultipartSupportConfig.class)
public interface PerceptionStructuredDataClient {

    @GetMapping("/")
    RespVO<IPage<PerceptionStructuredData>> queryPage(@RequestParam(value = "pageIndex") int pageIndex,
                                                      @RequestParam(required = false, defaultValue = "10") int pageSize);


    @GetMapping("/{id}")
    RespVO<PerceptionStructuredData> selectByPrimaryKey(@PathVariable(value = "id") Long id);


    @DeleteMapping("/{id}")
    RespVO deleteByPrimaryKey(@PathVariable(value = "id") Long id);


    @PostMapping("/")
    RespVO insert(@RequestBody PerceptionStructuredData perceptionStructuredData);


    @PutMapping("/")
    RespVO updateByPrimaryKey(@RequestBody PerceptionStructuredData perceptionStructuredData);


    @DeleteMapping("/deleteBatchPrimaryKeys")
    RespVO deleteBatchPrimaryKeys(@RequestBody List<Long> list);


    @PostMapping("/list")
    RespVO query(@RequestBody PerceptionStructuredData perceptionStructuredData);
}

class PerceptionStructuredDataClientFallback implements PerceptionStructuredDataClient {


    @Override
    public RespVO<IPage<PerceptionStructuredData>> queryPage(int pageIndex, int pageSize) {
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO<PerceptionStructuredData> selectByPrimaryKey( Long id){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO deleteByPrimaryKey( Long id){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO insert(@RequestBody PerceptionStructuredData perceptionStructuredData){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO updateByPrimaryKey(PerceptionStructuredData perceptionStructuredData){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO deleteBatchPrimaryKeys(List<Long> list){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO query(PerceptionStructuredData perceptionStructuredData){
        return RespVOBuilder.failure("system-service服务不可用");
    }
}