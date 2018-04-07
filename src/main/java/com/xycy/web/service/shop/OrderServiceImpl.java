package com.xycy.web.service.shop;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xycy.web.dao.shop.OrderDao;

@Service
public class OrderServiceImpl implements OrderService {

	@Resource
	private OrderDao orderDao;
}
