package com.lin.cloud.controller;

import com.lin.cloud.pojo.CommonResult;
import com.lin.cloud.pojo.Payment;
import com.lin.cloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Author ccgg
 * @Date 2020/8/21 11:47
 */
@Slf4j
@RestController
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    /**
     * 新增订单
     * @param payment
     * @return
     */
    @RequestMapping("payment/addPayment")
    public CommonResult addPayment(@RequestBody Payment payment){
        int result = paymentService.insertPayment(payment);
        log.info("9999>插入结果"+result);
        if (result>0){
            return new CommonResult(200,"新增成功",result);
        }
        return new CommonResult(400,"新增失败",null);
    }

    @RequestMapping(value = "payment/get/{id}")
    public CommonResult queryByPaymentId(@PathVariable Long id){
        Payment payment = paymentService.selByPaymentId(id);
        log.info("查看返回数据"+payment);
        if (payment !=null){
            return new CommonResult(200,"操作成功",payment);
        }
        return new CommonResult(400,"失败失败"+id,null);
    }

  
}
