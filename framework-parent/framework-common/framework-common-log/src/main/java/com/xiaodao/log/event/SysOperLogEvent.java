package com.xiaodao.log.event;


import com.xiaodao.admin.entity.SysOperLog;
import org.springframework.context.ApplicationEvent;

/**
 * 系统日志事件
 */
public class SysOperLogEvent extends ApplicationEvent
{
    //
    private static final long serialVersionUID = 8905017895058642111L;

    public SysOperLogEvent(SysOperLog source)
    {
        super(source);
    }
}