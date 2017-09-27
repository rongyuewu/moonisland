package cn.com.yld.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.yld.dao.AreaDao;
import cn.com.yld.pojo.Area;

public class AreaTest {
	private ApplicationContext context;
	@Before
	public void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext("springmvc-config.xml");
	}

	@Test
	public void test() {
		AreaDao dao = (AreaDao) this.context.getBean("areadao");
		List<Area> ls = dao.findall();
		for (Area area : ls) {
			System.out.println(area.getTitle());
		}
	}
	@Test
	public void test1(){
		AreaDao dao = (AreaDao) this.context.getBean("areadao");
		Area area = new Area();
		area.setAreaId("130000");
		List<Area> ls = dao.findbyid(area);
		for (Area a : ls) {
			System.out.println(a.getTitle());
		}
	}

}
