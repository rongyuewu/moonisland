package cn.com.yld.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import cn.com.yld.pojo.User;
import cn.com.yld.service.UserService;
import cn.com.yld.tools.EncUtils;

@RequestMapping(value="/user")
@Controller
public class UserAction {
	@Autowired
	private UserService userService;
	@RequestMapping(value="/login")
	public User tologin(User user){
		String name = user.getPhone();
		String pwd = EncUtils.str2MD5(user.getPassword());
		user.setPassword(pwd);
		user.setPhone(name);
		user=userService.findlogin(user);
		return user;
	}
	@RequestMapping(value="/list")
	@ResponseBody
	public List<User> ulist(){
		return this.userService.findall();
	}
	
	@RequestMapping(value="/deluser")
	@ResponseBody
	public User deluser(User user){
		System.out.println(user.getUserId());
		userService.delete(user);
		return user;
	}
	
}