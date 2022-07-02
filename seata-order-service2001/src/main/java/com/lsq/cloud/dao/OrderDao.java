package com.lsq.cloud.dao;

/**
 * @Author linshengqian
 * @Date 2022/7/2 16:02
 * @description:
 */

import com.lsq.cloud.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OrderDao {
    //1 新建订单
    void create(Order order);

    //2 修改订单状态，从零改为1
    void update(@Param("userId") Long userId,@Param("status") Integer status);
}
