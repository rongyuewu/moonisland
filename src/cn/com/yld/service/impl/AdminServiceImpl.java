package cn.com.yld.service.impl;

import cn.com.yld.dao.AdminDao;
import cn.com.yld.pojo.Admin;
import cn.com.yld.service.AdminService;

public class AdminServiceImpl implements AdminService {
	private AdminDao dao;
	
	public AdminDao getDao() {
		return dao;
	}

	public void setDao(AdminDao dao) {
		this.dao = dao;
	}

	@Override
	public Admin find(Admin admin) {
		return dao.find(admin);
	}

}
