package cn.com.yld.mapper;

import java.util.List;
import cn.com.yld.pojo.User;

public interface UserMapper {
	//查询全部
	public List<User> findall();
	//查询单个用户
	public List<User> findbyid();
	//插入
	public void insert(User user);
	//更新
	public void update(User user);
}
