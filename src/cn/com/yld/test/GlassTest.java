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
		GlassDao dao = (GlassDao) this.context.getBean("glassDao");
		List<Glass> ls = dao.findall();
		for (Glass glass : ls) {
			System.out.println(glass.getGlassName());
		}
	}
	@Test
	public void test2(){
		GlassDao dao = (GlassDao) this.context.getBean("glassDao");
		Glass glass = new Glass();
		glass.setGlassName("hehe");
		glass.setGlassStyle("hehe");
		glass.setGlassPrice("100");
		glass.setCylPrice("20");
		dao.insert(glass);
	}
	@Test
	public void test3(){
		GlassDao dao = (GlassDao) this.context.getBean("glassDao");
		Glass glass = new Glass();
		glass.setGlassId(21);
		glass.setColor2("hehe");
		glass.setGlassStyle("haha");
		dao.update(glass);
	}
	@Test
	public void test4(){
		GlassDao dao = (GlassDao) this.context.getBean("glassDao");
		Glass glass = new Glass();
		glass.setGlassId(22);
		dao.delete(glass);
	}
	@Test
	public void test5(){
		GlassDao dao = (GlassDao) this.context.getBean("glassDao");
		Glass glass = new Glass();
		glass.setGlassId(22);
		dao.cleandelete(glass);
	}
}


