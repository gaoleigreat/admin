package com.xiaodao.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;


/**
 * @Description : TODO
 * @Author : xiaodao
 **/
@SpringBootApplication(scanBasePackages = {"com.xiaodao"})
@EnableDiscoveryClient
@EnableEurekaClient
@EnableFeignClients("com.xiaodao")
public class AdminAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminAuthApplication.class, args);
    }
}
