package cn.com.yld.mapper;
import java.util.List;
import cn.com.yld.pojo.Address;

public interface AddressMapper {
	// 查询全部
	public List<Address> findall();

	// 根据id查询
	public List<Address> findbyid(Address address);

	// 插入
	public void insert(Address address);

	// 删除
	public void delect(Address address);

	// 修改状态1
	public void update(Address address);

	// 修改状态0
	public void updatezero(Address address);
}
