package cn.com.yld.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.com.yld.pojo.Cart;
import cn.com.yld.pojo.Order;
import cn.com.yld.pojo.User;
import cn.com.yld.service.CartService;

@RequestMapping(value="/cart")
@Controller
public class CartAction {
	@Autowired
	CartService cartService;
	
	@RequestMapping(value="/list")
	@ResponseBody
	public List<Cart> list(User user){
		List<Cart> ls=this.cartService.findall(user);
		return ls;
	}

}
