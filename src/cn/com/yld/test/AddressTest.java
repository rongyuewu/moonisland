package cn.com.yld.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sun.jndi.url.corbaname.corbanameURLContextFactory;

import cn.com.yld.dao.AddressDao;
import cn.com.yld.pojo.Address;

public class AddressTest {
	private ApplicationContext context;
	@Before
	public void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext("springmvc-config.xml");
	}

	@Test
	public void test() {
		AddressDao dao = (AddressDao) this.context.getBean("addressDao");
		List<Address> ls = dao.findall();
		for (Address address : ls) {
			System.out.println(address.getUserName());
		}
	}

}
