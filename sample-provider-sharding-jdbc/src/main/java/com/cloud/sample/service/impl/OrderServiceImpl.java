package com.cloud.sample.service.impl;

import com.cloud.sample.dao.OrderMapper;
import com.cloud.sample.model.Order;
import com.cloud.sample.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

/**
 * @Auther: zhiwei
 * @Date: 2019/1/2 18:02
 * @Description:
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;

    @Override
    public void insertOrder(Order order) {
        Assert.notNull(order,"订单不能为空");
        orderMapper.insertOrder(order);
    }

    @Override
    public List<Order> selectOrder(Order order) {
        Assert.notNull(order,"查询条件不能为空");
        return orderMapper.selectOrder(order);
    }

    @Override
    public void updateOrder(Order order) {
        Assert.notNull(order,"修改订单 参数不能为空");
        orderMapper.updateOrder(order);
    }

    @Override
    public void deleteOrder(Integer orderId) {
        orderMapper.deleteOrder(orderId);
    }
}
