package cn.com.yld.service;

import java.util.List;

import cn.com.yld.pojo.Order;

public interface OrderService {
	public List<Order> findorderstatus();
	public List<Order> findordernumber();
	public void updatederstatus(Order order);
	public List<Order> findorder(Order order);
}
