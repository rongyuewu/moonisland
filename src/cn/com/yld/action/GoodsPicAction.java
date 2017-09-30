package cn.com.yld.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import cn.com.yld.pojo.GoodsPic;
import cn.com.yld.service.GoodsPicService;

@Controller
@RequestMapping(value="/goodsPic")
public class GoodsPicAction {
	
	@Autowired
	private GoodsPicService goodsPicService;
	
	@RequestMapping(value="/goodsPiclist")
	@ResponseBody
	public List<GoodsPic> li(){
		List<GoodsPic> list=goodsPicService.findall();
		return list;
	}
}
