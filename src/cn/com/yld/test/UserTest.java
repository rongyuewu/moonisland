package cn.com.yld.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.yld.dao.AboutDao;
import cn.com.yld.dao.UserDao;
import cn.com.yld.pojo.About;
import cn.com.yld.pojo.User;

public class UserTest {
	private ApplicationContext context;
	@Before
	public void setup(){
		context=new ClassPathXmlApplicationContext("springmvc-config.xml");
	}
	@Test
	public void test01(){
		UserDao dao=(UserDao) this.context.getBean("userDao");
		List<User> ls=dao.findall();
		for (User user : ls) {
			System.out.println(user.getNickName());
		}
	}
}
