package com.demo.oreder.controller;

import com.demo.oreder.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: Mr.裴
 * @create 2020/5/17
 * @Description:
 **/
@RestController
@RequestMapping("/order")
@Slf4j
public class OrderConteoller {

    @Resource
    private PaymentService paymentService;

    @GetMapping("/serialOk")
    public String gerSerialOk(){
        return paymentService.gerSerialOk();
    }

    @GetMapping("/serialTimeout")
    public String gerSerialTimeOut(){
        return paymentService.gerSerialTimeOut();
    }



}
