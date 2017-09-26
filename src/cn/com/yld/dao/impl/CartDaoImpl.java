package cn.com.yld.dao.impl;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import cn.com.yld.dao.CartDao;
import cn.com.yld.mapper.CartMapper;
import cn.com.yld.pojo.Cart;
import cn.com.yld.pojo.User;

public class CartDaoImpl extends SqlSessionDaoSupport implements CartDao {

	@Override
	public List<Cart> findall(User user) {
		CartMapper mapper=this.getSqlSession().getMapper(CartMapper.class);
		return mapper.findall(user);
	}

	@Override
	public void insert(Cart cart) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Cart cart) {
		// TODO Auto-generated method stub

	}

}
