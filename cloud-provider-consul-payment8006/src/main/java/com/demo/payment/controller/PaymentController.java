package com.demo.payment.controller;

import com.demo.common.model.ResultModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author: Mr.裴
 * @create 2020/5/16
 * @Description:
 **/
@Slf4j
@RestController
@RequestMapping("/Payment")
public class PaymentController {

    @Value("${server.port}")
    private String port;

    /**
     * @author PeiKangLe
     * @date 2020/05/16
     **/
    @GetMapping("/getuuid")
    public ResultModel getUuid() {
        return ResultModel.success("服务端口号："+port + "查询成功", UUID.randomUUID().toString());
    }

}
