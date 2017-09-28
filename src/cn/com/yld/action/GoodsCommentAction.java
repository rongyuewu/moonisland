package cn.com.yld.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.com.yld.service.GoodsCommentService;

@RequestMapping(value="/goodcomment")
@Controller
public class GoodsCommentAction {
	private GoodsCommentService goodsCommentService;
}
