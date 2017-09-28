package cn.com.yld.service.impl;

import java.util.List;

import cn.com.yld.dao.OrderDao;
import cn.com.yld.pojo.Order;
import cn.com.yld.service.OrderService;

public class OrderServiceImpl implements OrderService {
	private OrderDao dao;
	
	public OrderDao getDao() {
		return dao;
	}

	public void setDao(OrderDao dao) {
		this.dao = dao;
	}

	@Override
	public List<Order> findorderstatus() {
		return dao.findorderstatus();
	}

	@Override
	public List<Order> findordernumber() {
		return dao.findordernumber();
	}

	@Override
	public void updatederstatus(Order order) {
		dao.updatederstatus(order);

	}

	@Override
	public List<Order> findorder(Order order) {
		return dao.findorder(order);
	}

}
