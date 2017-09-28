package cn.com.yld.service.impl;

import java.util.List;

import cn.com.yld.dao.OrderDao;
import cn.com.yld.pojo.Order;
import cn.com.yld.service.OrderService;

public class OrderServiceImpl implements OrderService {
	private OrderDao orderDao;
	

	public OrderDao getOrderDao() {
		return orderDao;
	}

	public void setOrderDao(OrderDao orderDao) {
		this.orderDao = orderDao;
	}

	@Override
	public List<Order> findorderstatus() {
		return orderDao.findorderstatus();
	}

	@Override
	public List<String> findordernumber() {
		return orderDao.findordernumber();
	}

	@Override
	public void updatederstatus(Order order) {
		orderDao.updatederstatus(order);

	}

}
