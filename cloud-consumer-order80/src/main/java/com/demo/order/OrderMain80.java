package com.demo.order;

import com.demo.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author: Mr.裴
 * @create 2020/5/15
 * @Description:
 **/
@SpringBootApplication
@EnableEurekaClient
//开启 ribbon 定义微服务名 使用指定 负载均衡策略
@RibbonClient(name = "PAYMENT-PROVIDER-SERVICE",configuration = MySelfRule.class)
public class OrderMain80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class,args);
        System.out.println("Oder80 启动成功");
    }
}
