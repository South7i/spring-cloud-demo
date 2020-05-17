package com.demo.payment.service;

import com.demo.common.entity.Payment;

/**
 * com.demo.payment
 * @author PeiKangLe
 * @date 2020/05/14
 */
public interface PaymentService {

    /**
     * 新增
     */
    public int insert(Payment payment);

    /**
     * 删除
     */
    public int delete(Long id);

    /**
     * 更新
     */
    public int update(Payment payment);

    /**
     * 根据主键 id 查询
     */
    public Payment load(Long id);

}
