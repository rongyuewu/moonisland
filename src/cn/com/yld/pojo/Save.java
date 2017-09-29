package cn.com.yld.pojo;
import java.io.Serializable;

   /**
    * Save 实体类
    * Sat Sep 23 10:24:17 CST 2017 anmin
    */ 


public class Save implements Serializable{
	private int saveId; // 收藏id
	private String goodsId; // 商品id
	private String userId; // 用户id
	private String saveTime; // 收藏时间
	private User user;
	private Goods goods;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Goods getGoods() {
		return goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}

	public void setSaveId(int saveId){
		this.saveId=saveId;
	}

	public int getSaveId(){
		return saveId;
	}

	public void setGoodsId(String goodsId){
		this.goodsId=goodsId;
	}

	public String getGoodsId(){
		return goodsId;
	}

	public void setUserId(String userId){
		this.userId=userId;
	}

	public String getUserId(){
		return userId;
	}

	public void setSaveTime(String saveTime){
		this.saveTime=saveTime;
	}

	public String getSaveTime(){
		return saveTime;
	}
}

