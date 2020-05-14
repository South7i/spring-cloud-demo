package com.demo.order.controller;

import com.demo.common.entity.Payment;
import com.demo.common.model.ResultModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author: Mr.裴
 * @create 2020/5/15
 * @Description:
 **/
@Slf4j
@RestController
@RequestMapping("/Order")
public class OrderController {

    @Resource
    private RestTemplate restTemplate;
    private static final String paymentUrl = "http://localhost:8001/Payment/";

    @GetMapping("/{id}")
    public ResultModel getPayment(@PathVariable("id") Long id){
        return restTemplate.getForObject(paymentUrl+id, ResultModel.class );
    }

    @PostMapping("/create")
    public ResultModel createPayment(Payment payment){
        return restTemplate.postForObject(paymentUrl+"insert",payment, ResultModel.class );
    }


}
