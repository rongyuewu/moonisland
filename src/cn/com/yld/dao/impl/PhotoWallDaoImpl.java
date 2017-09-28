package cn.com.yld.dao.impl;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import cn.com.yld.dao.PhotoWallDao;
import cn.com.yld.mapper.PhotoWallMapper;
import cn.com.yld.pojo.PhotoWall;

public class PhotoWallDaoImpl extends SqlSessionDaoSupport implements PhotoWallDao {
	
	@Override
	public List<PhotoWall> find() {
		PhotoWallMapper mapper = this.getSqlSession().getMapper(PhotoWallMapper.class);
		return mapper.find();
	}

	@Override
	public void insert(PhotoWall photoWall) {
		PhotoWallMapper mapper = this.getSqlSession().getMapper(PhotoWallMapper.class);
		mapper.insert(photoWall);
		
	}

	@Override
	public void update(PhotoWall photoWall) {
		PhotoWallMapper mapper = this.getSqlSession().getMapper(PhotoWallMapper.class);
		mapper.update(photoWall);
	}

}
