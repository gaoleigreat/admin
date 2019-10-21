package com.xiaodao.feign.system;

import com.xiaodao.core.vo.RespVO;
import com.xiaodao.core.vo.RespVOBuilder;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "system-service", path = "/sysMenu", fallbackFactory = SysMenuClientFallback.class)
public interface SysMenuClient {
    @RequestMapping("{menuId}")
    RespVO selectByPrimaryKey(@PathVariable("menuId") Long menuId);
}

class SysMenuClientFallback implements SysMenuClient {

    @Override
    public RespVO selectByPrimaryKey(Long menuId) {
        return RespVOBuilder.failure("system-service服务不可用");
    }
}