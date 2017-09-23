package cn.com.yld.pojo;
import java.io.Serializable;

   /**
    * Save 实体类
    * Sat Sep 23 10:24:17 CST 2017 anmin
    */ 


public class Save implements Serializable{
	private int saveId;
	private String goodsId;
	private String userId;
	private String saveTime;

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

