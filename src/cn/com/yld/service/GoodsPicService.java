package cn.com.yld.service;

import java.util.List;
import java.util.Map;

import cn.com.yld.pojo.GoodsPic;

public interface GoodsPicService {
		//查询全部
		public List<GoodsPic> findall();
		//id查询
		public List<GoodsPic> findbyid(GoodsPic goodsPic);
		//分页查询
		public List<GoodsPic> findlinmit(int page);
		//插入
		public void insert(GoodsPic goodsPic);
		//更新
		public void update(GoodsPic goodsPic);
}
