package com.demo.config.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Mr.裴
 * @create 2020/5/17
 * @Description:
 **/
@RestController
@RequestMapping("config")
@Slf4j
// 动态根据cloud Config 改变配置组件  @RefreshScope
// 没有消息总线需每次post 手动刷新 curl -X POST http://localhost:3355/actuator/refresh
@RefreshScope
public class ConfigController {

    @Value("${config.info}")
    private String info;

    @GetMapping("/configInfo")
    public String getConfigInfo(){
        return info;
    }

}
