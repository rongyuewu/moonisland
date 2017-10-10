package cn.com.yld.service.impl;

import java.util.List;

import cn.com.yld.dao.UserDao;
import cn.com.yld.pojo.User;
import cn.com.yld.service.UserService;

public class UserServiceImpl implements UserService {
	private UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public List<User> findall() {
		return userDao.findall();
	}

	@Override
	public User finduser(User user) {
		return userDao.finduser(user);
	}

	@Override
	public void insert(User user) {
		userDao.insert(user);
	}

	@Override
	public void update(User user) {
		userDao.update(user);
	}
	@Override
	public void delete(User user) {
		userDao.delete(user);
	}

	@Override
	public User findlogin(User user) {
		return userDao.findlogin(user);
	}

}
