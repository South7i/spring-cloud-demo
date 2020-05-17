package com.demo.oreder.controller;

import com.demo.oreder.service.PaymentErrorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: Mr.裴
 * @create 2020/5/17
 * @Description: 本控制器不主动指定 降级方法
 **/
@RestController
@RequestMapping("/order")
@Slf4j
public class OrderErrorConteoller {

    @Resource
    private PaymentErrorService paymentErrorService;

    @GetMapping("/serialError")
    public String gerSerialOk(){
        return paymentErrorService.gerSerialError();
    }

}
