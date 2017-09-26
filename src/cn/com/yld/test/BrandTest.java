package cn.com.yld.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.yld.dao.BrandDao;
import cn.com.yld.pojo.Brand;

public class BrandTest {

	private ApplicationContext context;
	@Before
	public void setup(){
		context=new ClassPathXmlApplicationContext("springmvc-config.xml");
	}
	@Test
	public void test1(){
		BrandDao dao = (BrandDao) this.context.getBean("brandDao");
		List<Brand> ls = dao.findall();
		for (Brand brand : ls) {
			System.out.println(brand.getBrandName());
		}
	}
}
