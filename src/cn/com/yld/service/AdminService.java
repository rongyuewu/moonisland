package cn.com.yld.service;

import java.util.List;

import cn.com.yld.pojo.Admin;

public interface AdminService {
	public Admin findall(Admin admin);
	public List<Admin> findlist();
}
