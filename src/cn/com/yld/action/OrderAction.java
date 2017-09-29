package cn.com.yld.action;


import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.com.yld.pojo.Order;
import cn.com.yld.service.OrderService;

@RequestMapping(value="/order")
@Controller
public class OrderAction {
	@Autowired
	OrderService orderService;
	
	@RequestMapping(value="/todingdan")
	public void handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        resp.sendRedirect("../admin/dingdan-list.html");

    }
	@RequestMapping(value="/list")
	@ResponseBody
	public List<Order> list(){
		List<Order> ls=this.orderService.findordernumber();
		return ls;
	}
	@RequestMapping(value="/xiangxi")
	@ResponseBody
	public List<Order> xiangxi(@RequestParam("number") String number){
		System.out.println(number);
		Order order=new Order();
		order.setOrderNumber(number);
		List<Order> ls=this.orderService.findorder(order);
		return ls;
	}
	@RequestMapping(value="/xiugai")
	@ResponseBody
	public void xiugai(@RequestParam("number") String number){
		System.out.println(number);
		Order order=new Order();
		order.setOrderNumber(number);
		this.orderService.updatederstatus(order);
	}
}
