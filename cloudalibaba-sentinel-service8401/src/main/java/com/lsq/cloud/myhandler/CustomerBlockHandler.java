package com.lsq.cloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.lsq.cloud.entities.CommonResult;

/**
 * @Author linshengqian
 * @Date 2022/7/2 9:18
 * @description:
 */
public class CustomerBlockHandler {
    public static CommonResult handlerException(BlockException exception) {
        return new CommonResult(4444,"按客戶自定义,global handlerException----1");
    }

    public static CommonResult handlerException2(BlockException exception) {
        return new CommonResult(4444,"按客戶自定义,global handlerException----2");
    }
}
