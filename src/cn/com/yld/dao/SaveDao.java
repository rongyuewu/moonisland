package cn.com.yld.dao;
import java.util.List;
import java.util.Map;

import cn.com.yld.pojo.Save;

public interface SaveDao {
	// 查询全部
	public List<Save> findall();
	// id查询
	public List<Save> findbyid(Save save);
	// 插入
	public void insert(Save save);
	// 删除
	public void delete(Save save);
	//页数
	public int pagecount();
	// 分页
	public List<Save> findbylimit(Map map);
}
