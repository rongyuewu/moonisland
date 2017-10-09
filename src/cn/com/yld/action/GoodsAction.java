package cn.com.yld.action;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	@RequestMapping(value="/getlimit")
	@ResponseBody
	public List<Goods> f3(@RequestParam("page") String page){
		List<Goods> list=goodsService.findlimit(Integer.valueOf(page));
		return list;
	}
	@RequestMapping(value="/getlike")
	@ResponseBody
	public List<Goods> f4(@RequestParam("like") String like){
		List<Goods> list=goodsService.findlike(like);
		return list;
	}
	@RequestMapping(value="/addgoods")
	@ResponseBody
	public int f4(Goods goods){
		return goodsService.addgoods(goods);
	}
	@RequestMapping(value="/delgoods")
	@ResponseBody
	public int f5(@RequestParam("data") int[] arr){
		List<Goods> list=new ArrayList<Goods>();
		for (int i = 0; i < arr.length; i++) {
			Goods good=new Goods();
			good.setGoodsId(arr[i]);
			list.add(good);	
		}
		goodsService.delgoods(list);
		return 1;
		
	}
}
