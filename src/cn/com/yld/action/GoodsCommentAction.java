package cn.com.yld.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.com.yld.pojo.GoodsComment;
import cn.com.yld.service.GoodsCommentService;

@RequestMapping(value="/goodcomment")
@Controller
public class GoodsCommentAction {
	@Autowired
	private GoodsCommentService goodsCommentService;
	@RequestMapping(value="/getlimit")
	@ResponseBody
	public List<GoodsComment> f1(@RequestParam("page") int page){
		return goodsCommentService.findlimit(page);
	}
	@RequestMapping(value="/getnum")
	@ResponseBody
	public int f2(){
		return goodsCommentService.findcount();
	}
	@RequestMapping(value="/delcomment")
	@ResponseBody
	public int f3(@RequestParam("data") int[] arr){
		for (int i = 0; i < arr.length; i++) {
			GoodsComment goodsComment=new GoodsComment();
			goodsComment.setCommentId(arr[i]);
			goodsCommentService.delcomment(goodsComment);
		}
		return 1;
		
	}
	@RequestMapping(value="/getlike")
	@ResponseBody
	public List<GoodsComment> f3(GoodsComment goodsComment){
		return goodsCommentService.findattr(goodsComment);
		
	}
}
