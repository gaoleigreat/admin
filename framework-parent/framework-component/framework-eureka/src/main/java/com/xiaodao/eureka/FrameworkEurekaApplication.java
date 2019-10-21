package com.xiaodao.eureka;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Description : TODO
 * @Author : xiaodao
 **/
@EnableEurekaServer
@SpringBootApplication
public class FrameworkEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(FrameworkEurekaApplication.class,args);
    }
}
