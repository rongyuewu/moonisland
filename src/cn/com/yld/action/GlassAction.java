package cn.com.yld.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.com.yld.dao.GlassDao;
import cn.com.yld.pojo.Glass;
import cn.com.yld.service.GlassService;

@Controller
@RequestMapping(value="/glass")
public class GlassAction {

	@Autowired
	GlassService glassService;
	
	@RequestMapping(value="/number")
	@ResponseBody
	public int f1(){
		int num=glassService.findnumber();
		return num;
	}
	@RequestMapping(value="/glasslist")
	@ResponseBody
	public List<Glass> f2(){
		List<Glass> list=glassService.findall();
		return list;
	}
}
