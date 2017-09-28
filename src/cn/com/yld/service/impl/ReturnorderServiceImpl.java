package cn.com.yld.service.impl;

import java.util.List;

import cn.com.yld.dao.ReturnorderDao;
import cn.com.yld.pojo.Returnorder;
import cn.com.yld.service.ReturnorderService;

public class ReturnorderServiceImpl implements ReturnorderService {
	private ReturnorderDao returnorderdao;
	
	public ReturnorderDao getReturnorderdao() {
		return returnorderdao;
	}

	public void setReturnorderdao(ReturnorderDao returnorderdao) {
		this.returnorderdao = returnorderdao;
	}

	@Override
	public List<Returnorder> find() {
		return returnorderdao.findall();
	}

	@Override
	public void insert(Returnorder returnorder) {
		returnorderdao.insert(returnorder);
	}

	@Override
	public void update(Returnorder returnorder) {
		returnorderdao.update(returnorder);
	}

}
