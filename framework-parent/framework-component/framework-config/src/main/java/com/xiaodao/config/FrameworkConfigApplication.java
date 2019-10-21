package com.xiaodao.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Description : TODO
 * @Author : xiaodao
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigServer
public class FrameworkConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(FrameworkConfigApplication.class,args);
    }
}
