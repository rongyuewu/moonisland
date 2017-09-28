package cn.com.yld.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.yld.dao.GoodsPicDao;
import cn.com.yld.dao.OptometryDao;
import cn.com.yld.pojo.Goods;
import cn.com.yld.pojo.GoodsPic;
import cn.com.yld.pojo.Optometry;
import cn.com.yld.pojo.User;

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
	@Test
	public void test02(){
		OptometryDao dao=(OptometryDao) this.context.getBean("optometryDao");
		Optometry optometry=new Optometry();
		optometry.setUserId("2");
		List<Optometry> ls=dao.findbyid(optometry);
	}
	@Test
	public void test03(){
		Optometry optometry=new Optometry();
		User users=new User();
		users.setBirthday("2017");
		optometry.setLAxis("123");
		optometry.setLSph("666");
		optometry.setUser(users);
		OptometryDao dao=(OptometryDao) this.context.getBean("optometryDao");
		dao.insert(optometry);
	}
	@Test
	public void test04(){
		OptometryDao dao=(OptometryDao) this.context.getBean("optometryDao");
		Optometry optometry=new Optometry();
		optometry.setUserId("2");
		optometry.setRSph("你好");
		dao.update(optometry);
	}
}
