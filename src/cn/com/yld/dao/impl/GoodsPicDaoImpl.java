package cn.com.yld.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import cn.com.yld.dao.GoodsPicDao;
import cn.com.yld.mapper.GoodsPicMapper;
import cn.com.yld.pojo.GoodsPic;

public class GoodsPicDaoImpl extends SqlSessionDaoSupport implements GoodsPicDao {

	@Override
	public List<GoodsPic> findall() {
		GoodsPicMapper mapper=this.getSqlSession().getMapper(GoodsPicMapper.class);
		List<GoodsPic> ls=mapper.findall();
		return ls;
	}
	

	@Override
	public List<GoodsPic> findbyid(GoodsPic goodsPic) {
		GoodsPicMapper mapper=this.getSqlSession().getMapper(GoodsPicMapper.class);
		List<GoodsPic> ls=mapper.findbyid(goodsPic);
		return ls;
	}

	@Override
	public void insert(GoodsPic goodsPic) {
		GoodsPicMapper mapper=this.getSqlSession().getMapper(GoodsPicMapper.class);
		mapper.insert(goodsPic);
	}

	@Override
	public void update(GoodsPic goodsPic) {
		GoodsPicMapper mapper=this.getSqlSession().getMapper(GoodsPicMapper.class);
		mapper.update(goodsPic);
	}
	@Override
	public List<GoodsPic> findlinmit(int page, int num) {
		GoodsPicMapper mapper=this.getSqlSession().getMapper(GoodsPicMapper.class);
		Map<String, Integer> map=new HashMap<>();
		map.put("num1", (page-1)*num);
		map.put("num2", num);
		return mapper.findlinmit(map);
	}
	//总页数
	@Override
	public int pagecount() {
		GoodsPicMapper mapper=this.getSqlSession().getMapper(GoodsPicMapper.class);
		int ls=mapper.pagecount();
		return ls;
	}


	@Override
	public List<GoodsPic> findallpage(int page) {
		GoodsPicMapper mapper=this.getSqlSession().getMapper(GoodsPicMapper.class);
		return mapper.findallpage((page-1)*5);
	}
}
