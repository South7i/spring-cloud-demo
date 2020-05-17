package com.demo.payment.service;

import cn.hutool.core.util.IdUtil;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author: Mr.裴
 * @create 2020/5/17
 * @Description:
 **/
@Service
public class PaymentService {

    public String getSerialOk(){
        return "OK:" + IdUtil.simpleUUID() + "\t 线程池："+ Thread.currentThread().getName();
    }

    public String getSerialTimeOut(){
        try {
            TimeUnit.MILLISECONDS.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "TimeOut:" + IdUtil.simpleUUID() + "\t 线程池："+ Thread.currentThread().getName();
    }
}
