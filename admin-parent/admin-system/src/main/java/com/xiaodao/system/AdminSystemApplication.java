package com.xiaodao.system;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * @Description : TODO
 * @Author : xiaodao
 **/
@SpringBootApplication(scanBasePackages = {"com.xiaodao"})
@EnableDiscoveryClient
@EnableEurekaClient
@EnableFeignClients("com.xiaodao")
@MapperScan("com.xiaodao.system.mapper")
public class AdminSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminSystemApplication.class, args);
    }


}
