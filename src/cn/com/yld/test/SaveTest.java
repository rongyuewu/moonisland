package cn.com.yld.test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.yld.dao.SaveDao;
import cn.com.yld.pojo.Save;

public class SaveTest {
	private ApplicationContext context;
	
	@Before
	public void setup(){
		context=new ClassPathXmlApplicationContext("springmvc-config.xml");
	}
	@Test
	public void test() {
		SaveDao dao = (SaveDao) this.context.getBean("saveDao");
		List<Save> ls=dao.findall();
		System.out.println(ls);
	}
	@Test
	public void test1() {
		SaveDao dao = (SaveDao) this.context.getBean("saveDao");
		Save save = new Save();
		save.setUserId("1");
		List<Save> ls=dao.findbyid(save);
		System.out.println(ls);
	}
	@Test
	public void test3() {
		SaveDao dao = (SaveDao) this.context.getBean("saveDao");
		Save save = new Save();
		save.setGoodsId("1");
		save.setUserId("1");
		save.setSaveTime("20070926");
		dao.insert(save);
		System.out.println(dao);
	}
	@Test
	public void test4(){
		SaveDao dao = (SaveDao) this.context.getBean("saveDao");
		Save save = new Save();
		save.setSaveId(5);
		dao.delete(save);
		System.out.println(dao);
	} 
	@Test 
	public void test5(){
		SaveDao dao = (SaveDao) this.context.getBean("saveDao");
		Map map=new HashMap();
		map.put("num1", 1);
		map.put("num2", "2");
		List<Save> ls= dao.findbylimit(map);
		for (Save save : ls) {
			System.out.println(save.toString());
		}
	}
	@Test 
	public void test6(){
		SaveDao dao = (SaveDao) this.context.getBean("saveDao");
		dao.pagecount();
		System.out.println(dao);
	}
}
