package cn.com.yld.mapper;
import java.util.List;
import cn.com.yld.pojo.Goods;
import cn.com.yld.pojo.PhotoWall;

public interface PhotoWallMapper {
	// 查询全部
	public List<PhotoWall> findall();
	// 插入
	public void insert(PhotoWall photoWall);
	//更新
	public void update(PhotoWall photoWall);

}
