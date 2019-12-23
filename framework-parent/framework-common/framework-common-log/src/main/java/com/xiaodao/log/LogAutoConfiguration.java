package com.xiaodao.log;


import com.xiaodao.feign.system.client.SysLogininforClient;
import com.xiaodao.feign.system.client.SysOperLogClient;
import com.xiaodao.log.aspect.OperLogAspect;
import com.xiaodao.log.listen.LogListener;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@Configuration
@AllArgsConstructor
@ConditionalOnWebApplication
public class LogAutoConfiguration
{
    @Autowired
    private SysLogininforClient sysLogininforClient;

    @Autowired
    private SysOperLogClient sysOperLogClient;

    @Bean
    public LogListener sysOperLogListener()
    {
        return new LogListener(sysLogininforClient,sysOperLogClient);
    }

    @Bean
    public OperLogAspect operLogAspect()
    {
        return new OperLogAspect();
    }
}