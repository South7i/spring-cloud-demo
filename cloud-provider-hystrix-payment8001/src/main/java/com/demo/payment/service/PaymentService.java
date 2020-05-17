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

    public String getSerialOk() {
        return "OK:" + IdUtil.simpleUUID() + "\t 线程池：" + Thread.currentThread().getName();
    }

//    指定操作时间在1.5s 内 超时后 服务降级。执行 getSerialTimeOutFallBack
    @HystrixCommand(fallbackMethod = "getSerialTimeOutFallBack",
            commandProperties = {
                    @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",
                            value = "3000")
            })
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
}
