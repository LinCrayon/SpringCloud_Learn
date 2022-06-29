package com.lsq.cloud.service.impl;

/**
 * @Author linshengqian
 * @Date 2022/6/15 22:42
 * @description:
 */
import com.lsq.cloud.dao.PaymentDao;
import com.lsq.cloud.entities.Payment;
import com.lsq.cloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService
{
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment)
    {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id)
    {
        return paymentDao.getPaymentById(id);
    }
}
