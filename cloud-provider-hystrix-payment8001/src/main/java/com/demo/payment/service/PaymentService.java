package com.demo.payment.service;

import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author: Mr.裴
 * @create 2020/5/17
 * @Description:
 **/
@Service
public class PaymentService {

    //服务熔断
    @HystrixCommand(fallbackMethod = "getSerialTimeOutFallBack",commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled",value = "true"),  //是否开启断路器
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"),   //请求次数
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"),  //时间范围
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60"), //失败率达到多少后跳闸
    })
    public String getSerialById(Long id){
        System.out.println("id +" + id);
        if (id<0){
            throw  new RuntimeException("id no valid");
        }
        return "OK:" + IdUtil.simpleUUID() + "\t 线程池：" + Thread.currentThread().getName();
    }

    public String getSerialOk() {
        return "OK:" + IdUtil.simpleUUID() + "\t 线程池：" + Thread.currentThread().getName();
    }

    //    指定操作时间在1.5s 内 超时后 服务降级。执行 getSerialTimeOutFallBack
    @HystrixCommand(fallbackMethod = "getSerialTimeOutFallBack",
            commandProperties = {@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")})
    public String getSerialTimeOut() {
        try {
            TimeUnit.MILLISECONDS.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "TimeOut:" + IdUtil.simpleUUID() + "\t 线程池：" + Thread.currentThread().getName();
    }

    public String getSerialTimeOutFallBack() {
        return "请再给我一点时间，我正在努力处理中  \t /(ㄒoㄒ)/~~";
    }

    public String getSerialTimeOutFallBack(Long id) {
        return "请再给我一点时间，我正在努力处理中  \t /(ㄒoㄒ)/~~" + id;
    }
}
