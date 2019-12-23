package com.xiaodao.gateway.util;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author yanglf
 * @descript
 * @since 2018/12/20
 **/
@ConfigurationProperties(prefix = "permission")
@Component
@Data
public class PermissionPatternUrl {
    private List<String> blackUrls;

    private List<String> whiteUrls;

}
