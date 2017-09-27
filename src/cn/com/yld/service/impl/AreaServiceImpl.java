package cn.com.yld.service.impl;

import java.util.List;

import cn.com.yld.dao.AreaDao;
import cn.com.yld.pojo.Area;
import cn.com.yld.service.AreaService;

public class AreaServiceImpl implements AreaService {
	private AreaDao dao;
	
	public AreaDao getDao() {
		return dao;
	}

	public void setDao(AreaDao dao) {
		this.dao = dao;
	}

	@Override
	public List<Area> findall() {
		return dao.findall();
	}

	@Override
	public List<Area> findbyid(Area area) {
		return dao.findbyid(area);
	}

}
