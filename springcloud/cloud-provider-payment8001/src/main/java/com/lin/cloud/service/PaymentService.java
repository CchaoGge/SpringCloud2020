package com.lin.cloud.service;

import com.lin.cloud.pojo.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Author ccgg
 * @Date 2020/8/21 11:38
 */
public interface PaymentService {

    /**
     * 新增操作
     * @param payment
     * @return
     */
    int insertPayment(Payment payment);

    /**
     * 查询操作
     * @param id
     * @return
     */
    Payment selByPaymentId(@Param("id") Long id);

}
