package com.demo.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author: Mr.裴
 * @create 2020/5/17
 * @Description:
 **/
@SpringBootApplication
@EnableConfigServer
public class CloudConfigCenterMain3344 {

    public static void main(String[] args) {
        SpringApplication.run(CloudConfigCenterMain3344.class, args);
        System.out.println("CloudConfigCenterMain3344 start ok");
    }

}
