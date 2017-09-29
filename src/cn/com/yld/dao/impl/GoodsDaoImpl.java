package cn.com.yld.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import cn.com.yld.dao.GoodsDao;
import cn.com.yld.mapper.GoodsMapper;
import cn.com.yld.pojo.Goods;

public class GoodsDaoImpl extends SqlSessionDaoSupport implements GoodsDao{

	@Override
	public void insert(Goods goods) {
		GoodsMapper mapper=this.getSqlSession().getMapper(GoodsMapper.class);
		mapper.insert(goods);
	}

	@Override
	public List<Goods> findall() {
		GoodsMapper mapper=this.getSqlSession().getMapper(GoodsMapper.class);
		return mapper.findall();
	}

	@Override
	public Goods findbyid(Goods goods) {
		GoodsMapper mapper=this.getSqlSession().getMapper(GoodsMapper.class);
		return mapper.findbyid(goods);
	}

	@Override
	public void update(Goods goods) {
		GoodsMapper mapper=this.getSqlSession().getMapper(GoodsMapper.class);
		mapper.update(goods);
	}

	@Override
	public List<Goods> findbylimit(int page, int num) {
		GoodsMapper mapper=this.getSqlSession().getMapper(GoodsMapper.class);
		Map<String, Integer> map=new HashMap<String, Integer>();
		map.put("num1", (page-1)*num);
		map.put("num2", num);
		return mapper.findlimit(map);
	}

	@Override
	public void delete(Goods goods) {
		GoodsMapper mapper=this.getSqlSession().getMapper(GoodsMapper.class);
		mapper.delete(goods);
	}

	@Override
	public List<Goods> findbylike(String str) {
		GoodsMapper mapper=this.getSqlSession().getMapper(GoodsMapper.class);
		Map<String, String> map=new HashMap<String, String>();
		map.put("str", str);
		return mapper.findbylike(map);
	}
	//num2 0为升序1为降序
	@Override
	public List<Goods> findlimitpri(int page, int num, int num2) {
		GoodsMapper mapper=this.getSqlSession().getMapper(GoodsMapper.class);
		Map<String, Integer> map=new HashMap<String, Integer>();
		map.put("num1", (page-1)*num);
		map.put("num2", num);
		map.put("num3", num2);
		return mapper.findlimitpri(map);
	}

	@Override
	public int findcount() {
		GoodsMapper mapper=this.getSqlSession().getMapper(GoodsMapper.class);
		return mapper.findcount();
	}

	@Override
	public List<Goods> findbyAvailable() {
		GoodsMapper mapper=this.getSqlSession().getMapper(GoodsMapper.class);
		return mapper.findbyAvailable();
	}

}
