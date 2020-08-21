package com.lin.cloud.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lin.cloud.pojo.Payment;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 *
 * @author: ccgg
 *
 * @create: 2020-08-21 11:22
 **/
@Mapper
public interface PaymentMapper extends BaseMapper<Payment> {
    /**
     * 新增订单
     * @param payment
     * @return
     */
    int insPayment(Payment payment);
}
