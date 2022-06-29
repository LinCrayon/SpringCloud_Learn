package com.lsq.cloud.config;

/**
 * @Author linshengqian
 * @Date 2022/6/23 13:52
 * @description:
 */
import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig
{
    @Bean
    Logger.Level feignLoggerLevel()
    {
        return Logger.Level.FULL;
    }
}

