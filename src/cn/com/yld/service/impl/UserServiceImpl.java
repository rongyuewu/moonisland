package cn.com.yld.service.impl;

import java.util.List;

import cn.com.yld.dao.UserDao;
import cn.com.yld.pojo.User;
import cn.com.yld.service.UserService;

public class UserServiceImpl implements UserService {
	private UserDao dao;
	
	public UserDao getDao() {
		return dao;
	}

	public void setDao(UserDao dao) {
		this.dao = dao;
	}

	@Override
	public List<User> findall() {
		return dao.findall();
	}

	@Override
	public User finduser(User user) {
		return dao.finduser(user);
	}

	@Override
	public void insert(User user) {
		dao.insert(user);
	}

	@Override
	public void update(User user) {
		dao.update(user);
	}
	@Override
	public void delete(User user) {
		dao.delete(user);
	}

	@Override
	public void cleandelete(User user) {
		dao.cleandelete(user);
	}

	@Override
	public User findlogin(User user) {
		return dao.findlogin(user);
	}

}
