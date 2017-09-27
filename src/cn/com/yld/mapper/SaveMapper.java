package cn.com.yld.mapper;
import java.util.List;
import java.util.Map;

import cn.com.yld.pojo.Save;

public interface SaveMapper {
	// 查询全部
	public List<Save> findall();
	// id查询
	public List<Save> findbyid(Save save);
	// 插入
	public void insert(Save save);
	// 更新
	public void update(Save save);
	//总页数
	public int pagecount();
	// 分页
	public List<Save> findbylike(Map<String, Integer> map);
}
