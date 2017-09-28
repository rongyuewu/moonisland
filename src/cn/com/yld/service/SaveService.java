package cn.com.yld.service;
import java.util.List;
import java.util.Map;

import cn.com.yld.pojo.Save;

public interface SaveService {
	// 查询全部
	public List<Save> findall(Save save);
	// id查询
	public List<Save> findbyid();
	// 插入
	public void insert(Save save);
	// 删除
	public void delete(Save save);
	//页数
	public int pagecount();
	// 分页
	public List<Save> findbylike(int page,int num);
}
