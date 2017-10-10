package cn.com.yld.mapper;

import java.util.List;
import cn.com.yld.pojo.User;

public interface UserMapper {
	//查询所有用户
	public List<User> findall();
	//查询单个用户
	public User finduser(User user);
	//用户登录
	public User findlogin(User user);
	//添加用户
	public void insert(User user);
	//更改用户
	public void update(User user);
	//删除用户
	public void delete(User user);
	
}
