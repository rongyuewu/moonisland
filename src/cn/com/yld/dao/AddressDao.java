package cn.com.yld.dao;
import java.util.List;
import cn.com.yld.pojo.Address;

public interface AddressDao {
	// 查询全部
	public List<Address> findall();
	// 根据id查询
	public List<Address> findbyid(Address address);
	// 插入
	public int insert(Address address);
	// 删除
	public void delect(Address address);
	// 更新
	public void update(Address address);
}
