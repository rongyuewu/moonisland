package cn.com.yld.service.impl;

import java.util.List;

import cn.com.yld.dao.ReturnorderDao;
import cn.com.yld.pojo.Returnorder;
import cn.com.yld.service.ReturnorderService;

public class ReturnorderServiceImpl implements ReturnorderService {
	private ReturnorderDao dao;
	

	public ReturnorderDao getDao() {
		return dao;
	}

	public void setDao(ReturnorderDao dao) {
		this.dao = dao;
	}

	@Override
	public List<Returnorder> find() {
		return dao.findall();
	}

	@Override
	public void insert(Returnorder returnorder) {
		dao.insert(returnorder);
	}

	@Override
	public void update(Returnorder returnorder) {
		dao.update(returnorder);
	}

}
