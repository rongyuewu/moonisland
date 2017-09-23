package cn.com.yld.mapper;
import java.util.List;
import cn.com.yld.pojo.Admin;

public interface AdminMapper {
	// 查询全部
	public List<Admin> findall();

	// 查询全部
	public List<Admin> findbyid();

	// 插入
	public void insert(Admin admin);

	// 更新
	public void update(Admin admin);
}
