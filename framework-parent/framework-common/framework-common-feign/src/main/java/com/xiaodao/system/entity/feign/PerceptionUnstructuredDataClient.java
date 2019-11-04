package com.xiaodao.system.entity.feign;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xiaodao.core.vo.RespVO;
import com.xiaodao.core.vo.RespVOBuilder;
import com.xiaodao.config.MultipartSupportConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.*;
import com.xiaodao.system.entity.PerceptionUnstructuredData;

import java.util.List;

@FeignClient(value = "system-service", path = "/perceptionUnstructuredData", fallbackFactory = PerceptionUnstructuredDataClientFallback.class, configuration = MultipartSupportConfig.class)
public interface PerceptionUnstructuredDataClient {

    @GetMapping("/")
    RespVO<IPage<PerceptionUnstructuredData>> queryPage(@RequestParam(value = "pageIndex") int pageIndex,
                                                        @RequestParam(required = false, defaultValue = "10") int pageSize);


    @GetMapping("/{id}")
    RespVO<PerceptionUnstructuredData> selectByPrimaryKey(@PathVariable(value = "id") Long id);


    @DeleteMapping("/{id}")
    RespVO deleteByPrimaryKey(@PathVariable(value = "id") Long id);


    @PostMapping("/")
    RespVO insert(@RequestBody PerceptionUnstructuredData perceptionUnstructuredData);


    @PutMapping("/")
    RespVO updateByPrimaryKey(@RequestBody PerceptionUnstructuredData perceptionUnstructuredData);


    @DeleteMapping("/deleteBatchPrimaryKeys")
    RespVO deleteBatchPrimaryKeys(@RequestBody List<Long> list);


    @PostMapping("/list")
    RespVO query(@RequestBody PerceptionUnstructuredData perceptionUnstructuredData);
}

class PerceptionUnstructuredDataClientFallback implements PerceptionUnstructuredDataClient {


    @Override
    public RespVO<IPage<PerceptionUnstructuredData>> queryPage(int pageIndex, int pageSize) {
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO<PerceptionUnstructuredData> selectByPrimaryKey( Long id){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO deleteByPrimaryKey( Long id){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO insert(@RequestBody PerceptionUnstructuredData perceptionUnstructuredData){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO updateByPrimaryKey(PerceptionUnstructuredData perceptionUnstructuredData){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO deleteBatchPrimaryKeys(List<Long> list){
        return RespVOBuilder.failure("system-service服务不可用");
    }


    @Override
    public RespVO query(PerceptionUnstructuredData perceptionUnstructuredData){
        return RespVOBuilder.failure("system-service服务不可用");
    }
}