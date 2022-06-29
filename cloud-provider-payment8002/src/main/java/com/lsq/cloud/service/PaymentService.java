package com.lsq.cloud.service;

/**
 * @Author linshengqian
 * @Date 2022/6/15 22:42
 * @description:
 */
import com.lsq.cloud.entities.Payment;
import org.apache.ibatis.annotations.Param;


public interface PaymentService
{
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
