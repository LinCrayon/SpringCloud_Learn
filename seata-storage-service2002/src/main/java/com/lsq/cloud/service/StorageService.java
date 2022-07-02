package com.lsq.cloud.service;

/**
 * @Author linshengqian
 * @Date 2022/7/2 16:17
 * @description:
 */
public interface StorageService {
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}
