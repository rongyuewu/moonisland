package cn.com.yld.dao.impl;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import cn.com.yld.dao.GlassDao;
import cn.com.yld.mapper.GlassMapper;
import cn.com.yld.pojo.Glass;

public class GlassDaoImpl extends SqlSessionDaoSupport implements GlassDao {

	@Override
	public List<Glass> findall() {
		GlassMapper mapper = this.getSqlSession().getMapper(GlassMapper.class);
		List<Glass> ls = mapper.findall();
		return ls;
	}

	@Override
	public List<Glass> findbyid() {
		GlassMapper mapper = this.getSqlSession().getMapper(GlassMapper.class);
		return mapper.findbyid();
	}

	@Override
	public void insert(Glass glass) {
		GlassMapper mapper = this.getSqlSession().getMapper(GlassMapper.class);
		mapper.insert(glass);
	}

	@Override
	public void update(Glass glass) {
		GlassMapper mapper = this.getSqlSession().getMapper(GlassMapper.class);
		mapper.update(glass);
	}

	@Override
	public void delete(Glass glass) {
		GlassMapper mapper = this.getSqlSession().getMapper(GlassMapper.class);
		mapper.delete(glass);
	}

	@Override
	public List<Glass> findbylike() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void cleandelete(Glass glass) {
		GlassMapper mapper = this.getSqlSession().getMapper(GlassMapper.class);
		mapper.cleandelete(glass);;
	}

}
