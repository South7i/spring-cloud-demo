package com.demo.order.controller;

import com.demo.common.model.ResultModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author: Mr.裴
 * @create 2020/5/16
 * @Description:
 **/
@Slf4j
@RestController
@RequestMapping("/Order")
public class OrderController {

    @Resource
    private RestTemplate restTemplate;

    //用微服务服务名去调用服务
    private static final String paymentUrl = "http://payment-provider-service/Payment/";

    @GetMapping("/{id}")
    public ResultModel getPayment(@PathVariable("id") Long id){
        return restTemplate.getForObject(paymentUrl+id, ResultModel.class );
    }

}
