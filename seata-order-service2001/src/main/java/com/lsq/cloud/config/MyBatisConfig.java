package com.lsq.cloud.config;

/**
 * @Author linshengqian
 * @Date 2022/7/2 16:09
 * @description:
 */
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.lsq.cloud.dao"})
public class MyBatisConfig {
}
