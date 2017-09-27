package cn.com.yld.dao.impl;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import cn.com.yld.dao.OrderDao;
import cn.com.yld.mapper.OrderMapper;
import cn.com.yld.pojo.Order;

public class OrderDaoImpl extends SqlSessionDaoSupport implements OrderDao {

	@Override
	public List<Order> findorderstatus() {
		OrderMapper mapper=this.getSqlSession().getMapper(OrderMapper.class);
		return mapper.findorderstatus();
	}

	@Override
	public List<Order> findordernumber() {
		OrderMapper mapper=this.getSqlSession().getMapper(OrderMapper.class);
		return mapper.findordernumber();
	}

	@Override
	public void updatederstatus(Order order) {
		OrderMapper mapper=this.getSqlSession().getMapper(OrderMapper.class);
		mapper.updatederstatus(order);
	}

	@Override
	public List<Order> findorder(Order order) {
		OrderMapper mapper=this.getSqlSession().getMapper(OrderMapper.class);
		return mapper.findorder(order);
	}
}