package com.cloud.sample.service;

import com.cloud.sample.model.Order;

import java.util.List;

/**
 * @Auther: zhiwei
 * @Date: 2019/1/2 18:01
 * @Description:
 */
public interface OrderService {

    void insertOrder(Order order);

    List<Order> selectOrder(Order order);

    void updateOrder(Order order);

    void deleteOrder(Integer orderId);

}
