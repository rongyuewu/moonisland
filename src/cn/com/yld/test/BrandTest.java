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
			System.out.println(brand.getBrandStatus());
		}
	}
	@Test
	public void test2(){
		BrandDao dao = (BrandDao) this.context.getBean("brandDao");
		Brand brand = new Brand();
		brand.setBrandName("lala");
		brand.setBrandCon("lala");
		brand.setBrandLogo("lala");
		brand.setBrandStatus("1");
		dao.insert(brand);
		
	}
	@Test
	public void test3(){
		BrandDao dao = (BrandDao) this.context.getBean("brandDao");
		Brand brand = new Brand();
		brand.setBrandId(10);
		brand.setBrandName("hehe");
		brand.setBrandCon("hehe");
		dao.update(brand);
	}
	@Test
	public void test4(){
		BrandDao dao = (BrandDao) this.context.getBean("brandDao");
		Brand brand = new Brand();
		brand.setBrandId(12);
		dao.delete(brand);
	}
	@Test
	public void test5(){
		BrandDao dao = (BrandDao) this.context.getBean("brandDao");
		Brand brand = new Brand();
		brand.setBrandId(12);
		dao.cleandelete(brand);
	}
}


