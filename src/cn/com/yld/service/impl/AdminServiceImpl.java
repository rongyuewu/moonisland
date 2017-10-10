package cn.com.yld.service.impl;

import java.util.List;

import cn.com.yld.dao.AdminDao;
import cn.com.yld.pojo.Admin;
import cn.com.yld.service.AdminService;

public class AdminServiceImpl implements AdminService {
	private AdminDao adminDao;

	public AdminDao getAdminDao() {
		return adminDao;
	}

	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}

	@Override
	public Admin findall(Admin admin) {
		return adminDao.findall(admin);
	}

	@Override
	public List<Admin> findlist() {
		return adminDao.findlist();
	}

}
