package cn.com.yld.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.com.yld.pojo.PhotoWall;
import cn.com.yld.service.PhotoWallService;
@RequestMapping(value="/photowall")
@Controller
public class PhotoWallAction {
	@Autowired
	private PhotoWallService service;
	
	@RequestMapping(value="/list")
	@ResponseBody
	public List<PhotoWall> pwlist(){
		return this.service.findall();
	}
	/*@RequestMapping(value="/insert")
	@ResponseBody
	public List<PhotoWall> pwinsert(){
		return this.service.insert();
	}*/
}
