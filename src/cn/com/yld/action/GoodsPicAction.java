package cn.com.yld.action;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.com.yld.pojo.Goods;
import cn.com.yld.pojo.GoodsPic;
import cn.com.yld.service.GoodsPicService;

@Controller
@RequestMapping(value="/goodsPic")
public class GoodsPicAction {
	
	@Autowired
	private GoodsPicService goodsPicService;
	
	@RequestMapping(value="/number")
	@ResponseBody
	public int f3(){//总页数
		int list=goodsPicService.pagecount();
		return list;
	}
	
	/*@RequestMapping(value="/goodsPiclist")
	@ResponseBody
	public List<GoodsPic> li(int page){
		List<GoodsPic> list=goodsPicService.findlinmit(page);
		return list;
	}*/
	
	@RequestMapping(value="/goodsPiclist2")
	@ResponseBody
	public List<GoodsPic> li2(int page){
		List<GoodsPic> list=goodsPicService.findallpage(page);
		return list;
	}
	
	@RequestMapping(value="/goodsPicall")
	@ResponseBody
	public List<GoodsPic> lis(int page){
		List<GoodsPic> list=goodsPicService.findall();
		for (GoodsPic goodsPic : list) {
			System.out.println(goodsPic.toString());
		}
		return list;
	}
	@RequestMapping(value="/addgoodsPic")
	@ResponseBody
	public int f4(GoodsPic goodsPic){
		return goodsPicService.addgoodsPic(goodsPic);
	}
}
