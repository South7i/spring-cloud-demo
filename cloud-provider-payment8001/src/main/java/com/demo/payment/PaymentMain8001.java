package com.demo.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: Mr.裴
 * @create 2020/5/14
 * @Description: 启动程序
 **/
@SpringBootApplication
@EnableEurekaClient
//启动服务发现
@EnableDiscoveryClient
public class PaymentMain8001 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8001.class, args);
        System.out.println("PaymentMain8001 已启动");
    }

}
