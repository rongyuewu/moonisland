package cn.com.yld.action;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.com.yld.pojo.Brand;
import cn.com.yld.pojo.Glass;
import cn.com.yld.pojo.Goods;
import cn.com.yld.service.BrandService;

@Controller
@RequestMapping(value="/brand")
public class BrandAction {
	@Autowired
	BrandService brandService;
	
	@RequestMapping(value="/number")
	@ResponseBody
	public int f1(){
		int num=brandService.findnumber();
		return num;
	}
	@RequestMapping(value="/brandlist")
	@ResponseBody
	public List<Brand> f2(){
		List<Brand> list=brandService.findall();
		return list;
	}
	@RequestMapping(value="/brandlistjs")
	@ResponseBody
	public List<Brand> showListjs(){
		return this.brandService.findall();
	}
	@RequestMapping(value="/addbrand")
	@ResponseBody
	public int f4(Brand brand){
		return brandService.addbrand(brand);
	}
	@RequestMapping(value="/delbrand")
	@ResponseBody
	public int f5(Brand brand){
		brandService.delete(brand);
		return 1;
	}
}
