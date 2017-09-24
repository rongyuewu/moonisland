package cn.com.yld.dao.impl;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import cn.com.yld.dao.AdminDao;
import cn.com.yld.mapper.AdminMapper;
import cn.com.yld.pojo.Admin;

public class AdminDaoImpl extends SqlSessionDaoSupport implements AdminDao {

	@Override
	public Admin find(Admin admin) {
		AdminMapper mapper=this.getSqlSession().getMapper(AdminMapper.class);
		admin=mapper.find(admin);
		return admin;
	}

}
