package cn.com.yld.mapper;
import java.util.List;

import cn.com.yld.pojo.Save;

public interface SaveMapper {
	// 查询全部
	public Save find(Save save);
	// id查询
	public List<Save> findbyid();
	// 插入
	public void insert(Save save);

	// 更新
	public void update(Save save);

	// 分页
	public List<Save> findbylike();
}
