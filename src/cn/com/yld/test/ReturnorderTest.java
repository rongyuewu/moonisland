package cn.com.yld.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.yld.dao.ReturnorderDao;
import cn.com.yld.pojo.Returnorder;

public class ReturnorderTest {
	private ApplicationContext context;
	@Before
	public void setup(){
		context=new ClassPathXmlApplicationContext("springmvc-config.xml");
	}
	@Test
	public void test01(){
		ReturnorderDao dao = (ReturnorderDao) this.context.getBean("returnorderDao");
		List<Returnorder> ls = dao.findall();
		for (Returnorder returnorder : ls) {
			System.out.println("======"+returnorder.getUserId());
		}
	}
}
