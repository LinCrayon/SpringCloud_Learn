package com.lsq.cloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @Author linshengqian
 * @Date 2022/6/19 21:52
 * @description:
 */
public interface LoadBalancer{

    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}