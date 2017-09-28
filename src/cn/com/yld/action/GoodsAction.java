package cn.com.yld.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.com.yld.service.GoodsService;

@RequestMapping(value="/goods")
@Controller
public class GoodsAction {
	private GoodsService goodsService;
}
