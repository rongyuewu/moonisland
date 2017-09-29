package cn.com.yld.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.com.yld.pojo.Brand;
import cn.com.yld.service.BrandService;

@Controller
@RequestMapping(value="/brand")
public class BrandAction {
	@Autowired
	BrandService brandService;
	
	@RequestMapping(value="/brandlist")
	public ModelAndView showList(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/WEB-INF/jsp/brand.jsp");
		mv.addObject("brands", this.brandService.findall());
		return mv;
	}
	@RequestMapping(value="/brandlistjs")
	@ResponseBody
	public List<Brand> showListjs(){
		return this.brandService.findall();
	}
}
