package com.demo.oreder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author: Mr.裴
 * @create 2020/5/17
 * @Description:
 **/
@SpringBootApplication
@EnableFeignClients
public class OrderFeignHystrixMain80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderFeignHystrixMain80.class, args);
        System.out.println("OrderFeignHystrixMain80 start ok");
    }

}
