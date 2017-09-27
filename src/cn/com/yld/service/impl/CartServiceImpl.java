package cn.com.yld.service.impl;

import java.util.List;

import cn.com.yld.dao.CartDao;
import cn.com.yld.pojo.Cart;
import cn.com.yld.pojo.User;
import cn.com.yld.service.CartService;

public class CartServiceImpl implements CartService {
	private CartDao dao;
	
	public CartDao getDao() {
		return dao;
	}

	public void setDao(CartDao dao) {
		this.dao = dao;
	}

	@Override
	public List<Cart> findall(User user) {
		return dao.findall(user);
	}

	@Override
	public void insert(Cart cart) {
		dao.insert(cart);
	}

	@Override
	public void update(Cart cart) {
		dao.update(cart);
	}

	@Override
	public void delete(Cart cart) {
		dao.delete(cart);
	}

	@Override
	public void candelect(Cart cart) {
		dao.candelect(cart);
	}

}
