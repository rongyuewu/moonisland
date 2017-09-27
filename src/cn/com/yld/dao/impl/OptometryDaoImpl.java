package cn.com.yld.dao.impl;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import cn.com.yld.dao.OptometryDao;
import cn.com.yld.mapper.OptometryMapper;
import cn.com.yld.pojo.Optometry;

public class OptometryDaoImpl extends SqlSessionDaoSupport implements OptometryDao {

	@Override
	public List<Optometry> findall() {
		OptometryMapper mapper=this.getSqlSession().getMapper(OptometryMapper.class);
		List<Optometry> ls=mapper.findall();
		return ls;
	}

	@Override
	public List<Optometry> findbyid() {
		OptometryMapper mapper=this.getSqlSession().getMapper(OptometryMapper.class);
		List<Optometry> ls=mapper.findbyid();
		return ls;
	}

	@Override
	public void insert(Optometry optometry) {
		OptometryMapper mapper=this.getSqlSession().getMapper(OptometryMapper.class);
		mapper.insert(optometry);

	}

	@Override
	public void update(Optometry optometry) {
		OptometryMapper mapper=this.getSqlSession().getMapper(OptometryMapper.class);
		mapper.update(optometry);
	}

}
