package cn.com.yld.dao.impl;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import cn.com.yld.dao.AdminDao;
import cn.com.yld.mapper.AdminMapper;
import cn.com.yld.pojo.Admin;

public class AdminDaoImpl extends SqlSessionDaoSupport implements AdminDao {

	@Override
	public Admin findall(Admin admin) {
		AdminMapper mapper=this.getSqlSession().getMapper(AdminMapper.class);
		admin=mapper.findall(admin);
		return admin;
	}

	@Override
	public List<Admin> findlist() {
		AdminMapper mapper = this.getSqlSession().getMapper(AdminMapper.class);
		return mapper.findlist();
	}

}
