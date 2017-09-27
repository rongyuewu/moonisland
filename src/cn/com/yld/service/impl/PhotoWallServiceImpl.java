package cn.com.yld.service.impl;

import java.util.List;

import cn.com.yld.dao.PhotoWallDao;
import cn.com.yld.pojo.PhotoWall;
import cn.com.yld.service.PhotoWallService;

public class PhotoWallServiceImpl implements PhotoWallService {
	private PhotoWallDao dao;

	public PhotoWallDao getDao() {
		return dao;
	}

	public void setDao(PhotoWallDao dao) {
		this.dao = dao;
	}

	@Override
	public List<PhotoWall> find() {
		return dao.find();
		
	}

	@Override
	public void insert(PhotoWall photoWall) {
		dao.insert(photoWall);
		
	}

	@Override
	public void delete(PhotoWall photoWall) {
		dao.delete(photoWall);
		
	}


}
