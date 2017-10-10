package cn.com.yld.mapper;
import java.util.List;
import cn.com.yld.pojo.Admin;

public interface AdminMapper {
	// 查询全部
	public Admin findall(Admin admin);
	public List<Admin> findlist();

}
