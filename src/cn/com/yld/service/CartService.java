package cn.com.yld.service;

import java.util.List;

import cn.com.yld.pojo.Cart;
import cn.com.yld.pojo.User;

public interface CartService {
	//查询单个用户记录
		public List<Cart> findall(User user);
		//插入
		public void insert(Cart cart);
		//更新
		public void update(Cart cart);
}
