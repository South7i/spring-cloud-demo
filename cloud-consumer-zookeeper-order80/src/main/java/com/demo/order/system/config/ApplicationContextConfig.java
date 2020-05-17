package com.demo.order.system.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author: Mr.裴
 * @create 2020/5/16
 * @Description:
 **/
@Configuration
public class ApplicationContextConfig {
    @Bean
    //RestTemplate并且开启了客户端负载均衡功能
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
