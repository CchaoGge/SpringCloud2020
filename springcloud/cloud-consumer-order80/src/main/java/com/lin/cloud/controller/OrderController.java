package com.lin.cloud.controller;

import com.lin.cloud.pojo.CommonResult;
import com.lin.cloud.pojo.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author ccgg
 * @Date 2020/8/21 21:31
 */
@Slf4j
@RestController
public class OrderController {

    public static final String PAYMENT_URL = "http://localhost:8001";

    @Resource
    private RestTemplate restTemplate;

    /**
     * 新增支付信息
     * @param payment
     * @return
     */
    @RequestMapping("consumer/payment/addPayment")
    public CommonResult< Payment > create(Payment payment) {
        CommonResult commonResult = restTemplate.postForObject(PAYMENT_URL + "/payment/addPayment", payment, CommonResult.class);
        return commonResult;
    }


    /**
     * 查询支付信息
     */
    @RequestMapping("consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id){
        return restTemplate.getForObject(PAYMENT_URL+"/payment/get/"+id, CommonResult.class);
    }

}
