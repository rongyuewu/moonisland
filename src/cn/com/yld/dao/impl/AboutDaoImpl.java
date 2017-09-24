package cn.com.yld.dao.impl;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import cn.com.yld.dao.AboutDao;
import cn.com.yld.mapper.AboutMapper;
import cn.com.yld.pojo.About;

public class AboutDaoImpl extends SqlSessionDaoSupport implements AboutDao {

	@Override
	public List<About> findall() {
		AboutMapper mapper= this.getSqlSession().getMapper(AboutMapper.class);
		List<About> ls=mapper.findall();
		return ls;
	}

	@Override
	public void insert(About about) {
		AboutMapper mapper= this.getSqlSession().getMapper(AboutMapper.class);
		mapper.insert(about);
	}

	@Override
	public void update(About about) {
		
		AboutMapper mapper= this.getSqlSession().getMapper(AboutMapper.class);
		mapper.update(about);
	}

	@Override
	public void delete(About about) {
		AboutMapper mapper= this.getSqlSession().getMapper(AboutMapper.class);
		mapper.delete(about);
	}

}
