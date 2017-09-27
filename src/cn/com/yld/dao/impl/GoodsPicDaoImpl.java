package cn.com.yld.dao.impl;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import cn.com.yld.dao.GoodsPicDao;
import cn.com.yld.mapper.GoodsPicMapper;
import cn.com.yld.pojo.GoodsPic;

public class GoodsPicDaoImpl extends SqlSessionDaoSupport implements GoodsPicDao {

	@Override
	public List<GoodsPic> findall() {
		GoodsPicMapper mapper = this.getSqlSession().getMapper(GoodsPicMapper.class);
		return mapper.findall();
	}

	@Override
	public void insert(GoodsPic goodsPic) {
		GoodsPicMapper mapper = this.getSqlSession().getMapper(GoodsPicMapper.class);
		mapper.insert(goodsPic);

	}

	@Override
	public void update(GoodsPic goodsPic) {
		GoodsPicMapper mapper = this.getSqlSession().getMapper(GoodsPicMapper.class);
		mapper.update(goodsPic);

	}

	@Override
	public void delete(GoodsPic goodsPic) {
		GoodsPicMapper mapper = this.getSqlSession().getMapper(GoodsPicMapper.class);
		mapper.delete(goodsPic);

	}

}
