package com.demo.oreder.service;

/**
 * @author: Mr.裴
 * @create 2020/5/17
 * @Description:  实现 PaymentService 的方法， 为接口方法进行异常处理
 **/
//@Component
public class PaymentFallCallService implements PaymentErrorService{

    @Override
    public String gerSerialError() {
        return "当前进展好像没那么顺利";
    }
}
