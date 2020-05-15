package com.demo.payment.controller;

import com.demo.common.entity.Payment;
import com.demo.common.model.ResultModel;
import com.demo.payment.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author: Mr.裴
 * @create 2020/5/15
 * @Description:
 **/
@Slf4j
@RestController
@RequestMapping(value = "/Payment")
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    /**
     * [新增]
     *
     * @author PeiKangLe
     * @date 2020/05/14
     **/
    @PostMapping("/insert")
    public ResultModel insert(@RequestBody Payment payment) {
        int insert = paymentService.insert(payment);
        log.info("添加信息：{},添加结果：{}", payment.toString(), insert);
        return insert > 0 ? ResultModel.success("添加成功") : ResultModel.error("添加失败");
    }

    /**
     * [刪除]
     *
     * @author PeiKangLe
     * @date 2020/05/14
     **/
    @DeleteMapping("/{id}")
    public ResultModel delete(@PathVariable("id") Long id) {
        int delete = paymentService.delete(id);
        log.info("删除信息：{},删除结果：{}", id, delete);
        return delete > 0 ? ResultModel.success("删除成功") : ResultModel.error("删除失败");
    }

    /**
     * [更新]
     *
     * @author PeiKangLe
     * @date 2020/05/14
     **/
    @PutMapping("/update")
    public ResultModel update(Payment payment) {
        int update = paymentService.update(payment);
        log.info("修改信息：{},修改结果：{}", payment.toString(), update);
        return update > 0 ? ResultModel.success("修改成功") : ResultModel.error("修改失败");
    }

    /**
     * [查询] 根据主键 id 查询
     *
     * @author PeiKangLe
     * @date 2020/05/14
     **/
    @GetMapping("/{id}")
    public ResultModel load(@PathVariable("id") Long id) {
        return ResultModel.success("查询成功", paymentService.load(id));
    }

}
