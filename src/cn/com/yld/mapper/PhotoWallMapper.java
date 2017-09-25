package cn.com.yld.mapper;
import java.util.List;
import cn.com.yld.pojo.Goods;
import cn.com.yld.pojo.PhotoWall;

public interface PhotoWallMapper {
	// 查询全部
	public PhotoWall find(PhotoWall photoWall);
	// id查询
	public List<PhotoWall> findbyid();
	// 插入
	public void insert(PhotoWall photoWall);

	// 更新
	public void update(PhotoWall photoWall);

	// 分页
	public List<PhotoWall> findbylike();
}
