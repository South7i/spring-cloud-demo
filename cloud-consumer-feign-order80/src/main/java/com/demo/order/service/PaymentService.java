package com.demo.order.service;

import com.demo.common.model.ResultModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Component
@FeignClient(value = "PAYMENT-PROVIDER-SERVICE")
public interface PaymentService {

    @GetMapping("/Payment/{id}")
    ResultModel load(@PathVariable("id") Long id);

    @GetMapping("/Payment/strTimeOut")
    public String getStrTimeOut();

}
