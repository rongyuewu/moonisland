package cn.com.yld.dao.impl;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import cn.com.yld.dao.ReturnorderDao;
import cn.com.yld.mapper.ReturnorderMapper;
import cn.com.yld.pojo.Returnorder;

public class ReturnorderDaoImpl extends SqlSessionDaoSupport implements ReturnorderDao {

	@Override
	public List<Returnorder> findall() {
		ReturnorderMapper mapper  = this.getSqlSession().getMapper(ReturnorderMapper.class);
		return mapper.findall();
	}

	@Override
	public void insert(Returnorder order) {
		ReturnorderMapper mapper  = this.getSqlSession().getMapper(ReturnorderMapper.class);
		mapper.insert(order);

	}

	@Override
	public void update(Returnorder order) {
		ReturnorderMapper mapper  = this.getSqlSession().getMapper(ReturnorderMapper.class);
		mapper.update(order);

	}

}
