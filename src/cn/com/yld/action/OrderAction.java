package cn.com.yld.action;

import java.util.List;


import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.com.yld.pojo.Order;
import cn.com.yld.service.OrderService;

@RequestMapping(value="/order")
@Controller
public class OrderAction {
	private ApplicationContext context;
	@Before
	public void setup(){
		context=new ClassPathXmlApplicationContext("springmvc-config.xml");
	}
	@RequestMapping(value="todingdan")
	@ResponseBody
	public ModelAndView todingdan(){
		ModelAndView mView=new ModelAndView();
		mView.setViewName("WEB-INF/admin/dingdan-list.html");
		return mView;
	}
	
	@RequestMapping(value="list")
	@ResponseBody
	public ModelAndView list(){
		OrderService orderService=(OrderService) this.context.getBean("orderService");
		ModelAndView mView=new ModelAndView();
		List<Order> ls=orderService.findordernumber();
		mView.setViewName("WEB-INF/admin/dingdan-list.html");
		mView.addObject("orderLs",ls);
		return mView;
	}
}
