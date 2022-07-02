package com.lsq.cloud.dao;

/**
 * @Author linshengqian
 * @Date 2022/7/2 16:15
 * @description:
 */
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StorageDao {

    //扣减库存
    void decrease(@Param("productId") Long productId, @Param("count") Integer count);
}
