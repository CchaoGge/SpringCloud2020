package com.lin.cloud.service.imp;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lin.cloud.mapper.PaymentMapper;
import com.lin.cloud.pojo.Payment;
import com.lin.cloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @Author ccgg
 * @Date 2020/8/21 11:39
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentMapper paymentMapper;
    /**
     * 新增订单
     * @param payment
     * @return
     */
    @Override
    @Transactional
    public int insertPayment(Payment payment) {
        return paymentMapper.insPayment(payment);
    }

    /**
     * 查询订单
     * @param id
     * @return
     */
    @Override
    public Payment selByPaymentId(Long id) {
        Payment payment = paymentMapper.selectById(id);
        return payment;
    }
}
