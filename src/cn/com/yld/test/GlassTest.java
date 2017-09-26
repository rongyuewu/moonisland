package cn.com.yld.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.yld.dao.GlassDao;
import cn.com.yld.pojo.Glass;


public class GlassTest {
	
	private ApplicationContext context;
	@Before
	public void setup(){
		context=new ClassPathXmlApplicationContext("springmvc-config.xml");
	}
	@Test
	public void test1(){
		GlassDao dao = (GlassDao) this.context.getBean("glassDa o");
		List<Glass> ls = dao.findall();
		for (Glass glass : ls) {
			System.out.println(glass.getGlassName());
		}
	}
}


