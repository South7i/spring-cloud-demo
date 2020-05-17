package com.demo.payment.controller;

import com.demo.payment.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: Mr.裴
 * @create 2020/5/17
 * @Description:
 **/
@RestController
@Slf4j
@RequestMapping("/payment")
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @GetMapping("/serial/{id}")
    public String gerSerialById(@PathVariable("id") Long id)
    {
        return paymentService.getSerialById(id);
    }

    @GetMapping("/serialOk")
    public String gerSerialOk(){
        return paymentService.getSerialOk();
    }

    @GetMapping("/serialTimeout")
    public String gerSerialTimeOut(){
        return paymentService.getSerialTimeOut();
    }

    @GetMapping("/serialError")
    public String gerErrorT(){
        int i= 10/0;
        return "我是你永远得不到的人";
    }

}
