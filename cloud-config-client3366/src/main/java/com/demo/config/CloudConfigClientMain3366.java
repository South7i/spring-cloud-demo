package com.demo.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: Mr.裴
 * @create 2020/5/17
 * @Description:
 **/
@SpringBootApplication
@EnableEurekaClient
public class CloudConfigClientMain3366 {

    public static void main(String[] args) {
        SpringApplication.run(CloudConfigClientMain3366.class, args);
        System.out.println("CloudConfigMain3366 start ok");
    }

}
