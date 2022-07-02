package com.lsq.cloud.service;

/**
 * @Author linshengqian
 * @Date 2022/7/2 10:42
 * @description:
 */

import com.lsq.cloud.entities.CommonResult;
import com.lsq.cloud.entities.Payment;
import org.springframework.stereotype.Component;

@Component
public class PaymentFallbackServiceImpl implements PaymentService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id){
        return new CommonResult<>(44444,"服务降级返回," +
                "---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}

