package com.xiaodao.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description : TODO
 * @Author : xiaodao
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class FrameworkGtewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(FrameworkGtewayApplication.class,args);
    }
}
