package cn.com.yld.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.yld.dao.AboutDao;
import cn.com.yld.pojo.About;

public class AboutTest {
	private ApplicationContext context;
	@Before
	public void setup(){
		context=new ClassPathXmlApplicationContext("springmvc-config.xml");
	}
	@Test
	public void test01(){
		AboutDao dao=(AboutDao) this.context.getBean("aboutDao");
		List<About> ls=dao.findall();
		for (About about : ls) {
			System.out.println(about.getAboutStyle());
		}
	}
}
