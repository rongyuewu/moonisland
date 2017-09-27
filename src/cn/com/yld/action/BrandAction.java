package cn.com.yld.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.com.yld.service.BrandService;

@Controller
@RequestMapping(value="/brand")
public class BrandAction {
	@Autowired
	BrandService brandService;
	
}
