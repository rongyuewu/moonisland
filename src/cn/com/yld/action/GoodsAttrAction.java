package cn.com.yld.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.com.yld.service.GoodsAttrService;

@RequestMapping(value="/goodsattr")
@Controller
public class GoodsAttrAction {
	private GoodsAttrService goodsAttrService;

}
