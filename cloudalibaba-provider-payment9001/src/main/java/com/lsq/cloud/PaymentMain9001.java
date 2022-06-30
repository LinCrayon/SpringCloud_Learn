package com.lsq.cloud;

/**
 * @Author linshengqian
 * @Date 2022/6/30 22:28
 * @description:
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class PaymentMain9001{
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain9001.class, args);
    }
}