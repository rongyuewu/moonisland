package cn.com.yld.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.yld.dao.OptometryDao;
import cn.com.yld.pojo.Optometry;

public class OptometryTest {
	private ApplicationContext context;
	@Before
	public void setup(){
		context=new ClassPathXmlApplicationContext("springmvc-config.xml");
	}
	@Test
	public void test01(){
		OptometryDao dao=(OptometryDao) this.context.getBean("optometryDao");
		List<Optometry> ls=dao.findall();
		for(Optometry optometry:ls){
			System.out.println(optometry.getLAxis());
		}
	}
}
