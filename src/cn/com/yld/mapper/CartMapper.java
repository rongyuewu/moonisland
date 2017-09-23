package cn.com.yld.mapper;

import java.util.List;
import cn.com.yld.pojo.Cart;

public interface CartMapper {
	//查询全部
	public List<Cart> findall();
	//查询全部
	public List<Cart> findbyid();
	//插入
	public void insert(Cart cart);
	//更新
	public void update(Cart cart);
}
