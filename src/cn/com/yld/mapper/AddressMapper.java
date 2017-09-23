package cn.com.yld.mapper;
import java.util.List;
import cn.com.yld.pojo.Address;

public interface AddressMapper {
	// 查询全部
	public List<Address> findall();

	// 查询全部
	public List<Address> findbyid();

	// 插入
	public void insert(Address address);

	// 更新
	public void update(Address address);
}
