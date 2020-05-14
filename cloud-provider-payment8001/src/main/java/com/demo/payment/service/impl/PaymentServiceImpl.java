package com.demo.payment.service.impl;

import com.demo.common.entity.Payment;
import com.demo.payment.dao.PaymentDao;
import com.demo.payment.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: Mr.裴
 * @create 2020/5/15
 * @Description:
 **/
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int insert(Payment payment) {
        return paymentDao.insert(payment);
    }

    @Override
    public int delete(Long id) {
        return paymentDao.delete(id);
    }

    @Override
    public int update(Payment payment) {
        return paymentDao.update(payment);
    }

    @Override
    public Payment load(Long id) {
        return paymentDao.load(id);
    }
}
