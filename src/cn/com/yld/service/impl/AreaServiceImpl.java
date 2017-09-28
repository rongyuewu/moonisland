package cn.com.yld.service.impl;

import java.util.List;

import cn.com.yld.dao.AreaDao;
import cn.com.yld.pojo.Area;
import cn.com.yld.service.AreaService;

public class AreaServiceImpl implements AreaService {
	private AreaDao areadao;
	

	public AreaDao getAreadao() {
		return areadao;
	}

	public void setAreadao(AreaDao areadao) {
		this.areadao = areadao;
	}

	@Override
	public List<Area> findall() {
		return areadao.findall();
	}

	@Override
	public List<Area> findbyid(Area area) {
		return areadao.findbyid(area);
	}

}
