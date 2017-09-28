package cn.com.yld.service.impl;

import java.util.List;

import cn.com.yld.dao.CartDao;
import cn.com.yld.pojo.Cart;
import cn.com.yld.pojo.User;
import cn.com.yld.service.CartService;

public class CartServiceImpl implements CartService {
	private CartDao cartDao;
	
	public CartDao getCartDao() {
		return cartDao;
	}

	public void setCartDao(CartDao cartDao) {
		this.cartDao = cartDao;
	}

	@Override
	public List<Cart> findall(User user) {
		return cartDao.findall(user);
	}

	@Override
	public void insert(Cart cart) {
		cartDao.insert(cart);
	}

	@Override
	public void update(Cart cart) {
		cartDao.update(cart);
	}

	@Override
	public void delete(Cart cart) {
		cartDao.delete(cart);
	}

	@Override
	public void candelect(Cart cart) {
		cartDao.candelect(cart);
	}

}
