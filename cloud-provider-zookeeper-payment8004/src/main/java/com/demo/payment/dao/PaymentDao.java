package com.demo.payment.dao;

import com.demo.common.entity.Payment;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: Mr.裴
 * @create 2020/5/14
 * @Description:
 **/
@Mapper
public interface PaymentDao {

    /**
     * [新增]
     * @author PeiKangLe
     * @date 2020/05/14
     **/
    int insert(Payment payment);

    /**
     * [刪除]
     * @author PeiKangLe
     * @date 2020/05/14
     **/
    int delete(Long id);

    /**
     * [更新]
     * @author PeiKangLe
     * @date 2020/05/14
     **/
    int update(Payment payment);

    /**
     * [查询] 根据主键 id 查询
     * @author PeiKangLe
     * @date 2020/05/14
     **/
    Payment load(Long id);

}
