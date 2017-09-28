package cn.com.yld.service.impl;

import java.util.List;

import cn.com.yld.dao.PhotoWallDao;
import cn.com.yld.pojo.PhotoWall;
import cn.com.yld.service.PhotoWallService;

public class PhotoWallServiceImpl implements PhotoWallService {
	private PhotoWallDao photoWallDao;

	public PhotoWallDao getPhotoWallDao() {
		return photoWallDao;
	}

	public void setPhotoWallDao(PhotoWallDao photoWallDao) {
		this.photoWallDao = photoWallDao;
	}

	@Override
	public List<PhotoWall> find() {
		return photoWallDao.find();
		
	}

	@Override
	public void insert(PhotoWall photoWall) {
		photoWallDao.insert(photoWall);
		
	}

	@Override
	public void update(PhotoWall photoWall) {
		photoWallDao.update(photoWall);
		
	}


}
