package com.demo.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: Mr.裴
 * @create 2020/5/16
 * @Description:
 **/
@SpringBootApplication
// 该注解用于向consul或者zookeeper作为注册中心注册服务
@EnableDiscoveryClient
public class PaymentZookeeperMain8004 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentZookeeperMain8004.class, args);
        System.out.println("PaymentMain8004 已启动");
    }

}
