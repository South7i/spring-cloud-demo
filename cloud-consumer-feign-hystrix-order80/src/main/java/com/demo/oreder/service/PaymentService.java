package com.demo.oreder.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient(value = "PAYMENT-PROVIDER-HYSTRIX-SERVICE")
public interface PaymentService {

    @GetMapping("/payment/serialOk")
    public String gerSerialOk();

    @GetMapping("/payment/serialTimeout")
    public String gerSerialTimeOut();

}
