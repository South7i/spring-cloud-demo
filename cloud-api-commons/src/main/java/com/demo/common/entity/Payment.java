package com.demo.common.entity;

/**
 * @author: Mr.裴
 * @create 2020/5/14
 * @Description: 支付entity
 **/

import lombok.Data;

import java.io.Serializable;

/**
 *  payment
 * @author PeiKangLe 2020-05-14
 */
@Data
public class Payment implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Long id;

    /**
     * serial
     */
    private String serial;

    public Payment() {
    }

}
