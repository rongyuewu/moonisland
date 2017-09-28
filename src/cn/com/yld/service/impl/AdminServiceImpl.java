package cn.com.yld.service.impl;

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
	public Admin find(Admin admin) {
		return adminDao.find(admin);
	}

}
