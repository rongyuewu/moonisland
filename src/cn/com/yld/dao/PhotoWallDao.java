package cn.com.yld.dao;
import java.util.List;
import cn.com.yld.pojo.PhotoWall;

public interface PhotoWallDao {
	// 查询全部
	public List<PhotoWall> find();
	// 插入
	public void insert(PhotoWall photoWall);
	//更新
	public void update(PhotoWall photoWall);
}
