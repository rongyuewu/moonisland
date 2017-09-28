package cn.com.yld.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.yld.dao.AboutDao;
import cn.com.yld.dao.OrderDao;
import cn.com.yld.pojo.About;
import cn.com.yld.pojo.Order;
import cn.com.yld.service.OrderService;

public class OrderTest {
	private ApplicationContext context;
	@Before
	public void setup(){
		context=new ClassPathXmlApplicationContext("springmvc-config.xml");
	}
	@Test
	public void test01(){
		OrderService dao=(OrderService) this.context.getBean("orderService");
		List<Order> ls=dao.findordernumber();
		for (Order order1 : ls) {
			System.out.println(order1.toString());
		}
	}
}
