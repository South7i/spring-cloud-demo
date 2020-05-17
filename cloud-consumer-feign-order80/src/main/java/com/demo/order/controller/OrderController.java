package com.demo.order.controller;

import com.demo.common.model.ResultModel;
import com.demo.order.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: Mr.裴
 * @create 2020/5/17
 * @Descriptin:
 **/
@RestController
@RequestMapping("/Order")
@Slf4j
public class OrderController {

    @Resource
    private PaymentService paymentService;

    @GetMapping("/{id}")
    public ResultModel load(@PathVariable("id") Long id) {
        return paymentService.load(id);
    }

}
