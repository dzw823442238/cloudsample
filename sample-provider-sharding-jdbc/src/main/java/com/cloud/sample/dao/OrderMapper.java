package com.cloud.sample.dao;

import com.cloud.sample.model.Order;

import java.util.List;

/**
 * @Auther: zhiwei
 * @Date: 2019/1/2 17:51
 * @Description:
 */
public interface OrderMapper {

    void insertOrder(Order order);

    List<Order> selectOrder(Order order);

    void updateOrder(Order order);

    void deleteOrder(Integer orderId);




}
