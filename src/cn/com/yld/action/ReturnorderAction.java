package cn.com.yld.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.com.yld.pojo.Returnorder;
import cn.com.yld.service.ReturnorderService;

@RequestMapping(value="returnorder")
@Controller
public class ReturnorderAction {
	@Autowired
	ReturnorderService returnorderService;
	
	@RequestMapping(value="list")
	@ResponseBody
	public List<Returnorder> list() {
		List<Returnorder> ls=returnorderService.find();
		return ls;
	}
}
