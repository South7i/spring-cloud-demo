package com.demo.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: Mr.裴
 * @create 2020/5/16
 * @Description:
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class OrderZookeeperMain80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderZookeeperMain80.class, args);
        System.out.println("OrderZookeeperMain80 启动成功");
    }

}
