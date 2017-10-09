package cn.com.yld.dao;

import java.util.List;

import cn.com.yld.pojo.Returnorder;

public interface ReturnorderDao {
	public List<Returnorder> findall();
	public void insert(Returnorder order);
	public void updatestatus(Returnorder order);
}
