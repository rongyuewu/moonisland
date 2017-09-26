package cn.com.yld.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.yld.dao.AboutDao;
import cn.com.yld.dao.CartDao;
import cn.com.yld.pojo.About;
import cn.com.yld.pojo.Cart;
import cn.com.yld.pojo.User;

public class CartTest {
	private ApplicationContext context;
	@Before
	public void setup(){
		context=new ClassPathXmlApplicationContext("springmvc-config.xml");
	}
	@Test
	public void test01(){
		CartDao dao=(CartDao) this.context.getBean("cartDao");
		User user=new User();
		user.setUserId(1);
		List<Cart> ls=dao.findall(user);
		for (Cart cart : ls) {
			System.out.println(cart);
		}
	}
}
