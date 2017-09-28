package cn.com.yld.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.com.yld.pojo.Goods;
import cn.com.yld.service.GoodsService;

@RequestMapping(value="/goods")
@Controller
public class GoodsAction {
	@Autowired
	private GoodsService goodsService;
	@RequestMapping(value="/getnum")
	@ResponseBody
	public int f1(){
		int num=goodsService.findcount();
		return num;
	}
	@RequestMapping(value="/getgoods")
	@ResponseBody
	public List<Goods> f2(){
		List<Goods> list=goodsService.findgoods();
		return list;
	}
}
