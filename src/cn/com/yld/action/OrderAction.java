package cn.com.yld.action;


import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import cn.com.yld.pojo.Order;
import cn.com.yld.service.OrderService;

@RequestMapping(value="/order")
@Controller
public class OrderAction {
	@Autowired
	OrderService orderService;
	
	
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
