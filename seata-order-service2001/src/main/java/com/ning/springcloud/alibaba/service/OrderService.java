package com.ning.springcloud.alibaba.service;

import com.ning.springcloud.alibaba.domain.Order;

public interface OrderService {

    /**
     * 创建订单
     */
    void create(Order order);
}
