package com.demo.oreder.controller;

import com.demo.oreder.service.PaymentService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @author: Mr.裴
 * @create 2020/5/17
 * @Description:
 **/
//@RestController
@RequestMapping("/order")
@Slf4j
// 默认降级方法 未指定降级方法的， 使用默认降级方法
@DefaultProperties(defaultFallback = "globalFallBack")
public class OrderConteoller {

    @Resource
    private PaymentService paymentService;

    // 开启Hystrix
    @HystrixCommand
    @GetMapping("/serialOk")
    public String gerSerialOk(){
        int i = 10/0;
        return paymentService.gerSerialOk();
    }

    @GetMapping("/serialTimeout")
    @HystrixCommand(fallbackMethod = "gerSerialTimeOutFallBack",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1500")  //1.5秒钟以内就是正常的业务逻辑
    })
    public String gerSerialTimeOut(){
        return paymentService.gerSerialTimeOut();
    }

    public String gerSerialTimeOutFallBack(){
        return "小脑袋瓜有点疼！ \t  ╥﹏╥...";
    }

    public String globalFallBack(){
        return "出现了点紧急情况 ，我正在努力修复中！";
    }





}
