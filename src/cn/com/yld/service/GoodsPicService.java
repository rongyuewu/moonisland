package cn.com.yld.service;

import java.util.List;
import java.util.Map;

import cn.com.yld.pojo.GoodsPic;

public interface GoodsPicService {
		//分页查询全部
		public List<GoodsPic> findallpage(int page);
		//查询全部
		public List<GoodsPic> findall();
		//id查询
		public List<GoodsPic> findbyid(GoodsPic goodsPic);
		//分页查询
		public List<GoodsPic> findlinmit(int page);
		//添加
		public int addgoodsPic(GoodsPic goodsPic);
		//插入
		public void insert(GoodsPic goodsPic);
		//更新
		public void update(GoodsPic goodsPic);
		//总页数
		public int pagecount();		
}
