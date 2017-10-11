package cn.com.yld.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.com.yld.pojo.PhotoWall;
import cn.com.yld.service.PhotoWallService;
@RequestMapping(value="/photowall")
@Controller
public class PhotoWallAction {
	@Autowired
	private PhotoWallService pwservice;
	
	@RequestMapping(value="/list")
	@ResponseBody
	public List<PhotoWall> pwlist(){
		return this.pwservice.findall();
	}
	//插入
	@RequestMapping(value="/insert")
	@ResponseBody
	public int pwinsert(PhotoWall photoWall){ 
		System.out.println(photoWall);
		return pwservice.insert(photoWall);
	}
	//停用
	@RequestMapping(value="/delPhoto")
	@ResponseBody
	public PhotoWall delpwall(PhotoWall photoWall){
		System.out.println(photoWall.getPhotoId());
		pwservice.update(photoWall);
		return photoWall;
	}
	
}
