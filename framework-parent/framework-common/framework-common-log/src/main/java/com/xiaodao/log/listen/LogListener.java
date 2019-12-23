package com.xiaodao.log.listen;

import com.xiaodao.feign.system.client.SysLogininforClient;
import com.xiaodao.feign.system.client.SysOperLogClient;
import com.xiaodao.feign.system.entity.SysLogininfor;
import com.xiaodao.feign.system.entity.SysOperLog;
import com.xiaodao.log.event.SysLogininforEvent;
import com.xiaodao.log.event.SysOperLogEvent;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;

/**
 * 异步监听日志事件
 */
@Slf4j
@AllArgsConstructor
public class LogListener {
    @Autowired
    private SysLogininforClient sysLogininforClient;
    @Autowired
    private SysOperLogClient sysOperLogClient;

    @Async
    @Order
    @EventListener(SysOperLogEvent.class)
    public void listenOperLog(SysOperLogEvent event) {
        SysOperLog sysOperLog = (SysOperLog) event.getSource();
        sysOperLogClient.insert(sysOperLog);
        log.info("远程操作日志记录成功：{}", sysOperLog);
    }

    @Async
    @Order
    @EventListener(SysLogininforEvent.class)
    public void listenLoginifor(SysLogininforEvent event) {
        SysLogininfor sysLogininfor = (SysLogininfor) event.getSource();
        sysLogininforClient.insert(sysLogininfor);
        log.info("远程访问日志记录成功：{}", sysLogininfor);
    }
}