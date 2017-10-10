package cn.com.yld.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.com.yld.pojo.Admin;
import cn.com.yld.pojo.User;
import cn.com.yld.service.AdminService;
import cn.com.yld.tools.EncUtils;

@RequestMapping(value="/admin")
@Controller
public class AdminAction {
	@Autowired
	private AdminService adminService;
	@RequestMapping(value="/adminLogin")
	public ModelAndView dologin(Admin admin){
		ModelAndView mv = new ModelAndView();
		String name = admin.getName();
		String pwd = EncUtils.str2MD5(admin.getPwd());
		admin.setName(name);
		admin.setPwd(pwd);
		System.out.println("name:"+name+"pwd:"+pwd);
		admin = adminService.findall(admin);
		mv.setViewName("index.html");
		return mv;
	}
	
	@RequestMapping(value="/list")
	@ResponseBody
	public List<Admin> alist(){
		return this.adminService.findlist();
	}
}
