package com.lsq.cloud.domain;

/**
 * @Author linshengqian
 * @Date 2022/7/2 16:15
 * @description:
 */
import lombok.Data;

@Data
public class Storage {

    private Long id;

    /**
     * 产品id
     */
    private Long productId;

    /**
     * 总库存
     */
    private Integer total;

    /**
     * 已用库存
     */
    private Integer used;

    /**
     * 剩余库存
     */
    private Integer residue;
}
