package com.demo.oreder.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient(value = "PAYMENT-PROVIDER-HYSTRIX-SERVICE",fallback = PaymentFallCallService.class)
public interface PaymentErrorService {

    @GetMapping("/payment/serialError")
    public String gerSerialError();

}
