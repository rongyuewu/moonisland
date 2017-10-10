package cn.com.yld.dao;

import java.util.List;

import cn.com.yld.pojo.Admin;

public interface AdminDao {
	public Admin findall(Admin admin);
	public List<Admin> findlist();
}
