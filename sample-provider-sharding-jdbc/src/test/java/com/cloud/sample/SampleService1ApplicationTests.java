package com.cloud.sample;

import com.cloud.sample.model.Order;
import com.cloud.sample.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SampleService1ApplicationTests {

	@Autowired
	private OrderService orderService;
	@Test
	public void contextLoads() {
		Order order = new Order();
		order.setUserId(1);
		orderService.selectOrder(order);
	}

}
