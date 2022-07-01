package com.lsq.cloud;

/**
 * @Author linshengqian
 * @Date 2022/7/1 12:34
 * @description:
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class NacosConfigClientMain3377 {
    public static void main(String[] args){
        SpringApplication.run(NacosConfigClientMain3377.class, args);
    }
}

