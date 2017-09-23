package cn.com.yld.pojo;
import java.io.Serializable;

   /**
    * Cart 实体类
    * Sat Sep 23 10:24:17 CST 2017 anmin
    */ 


public class Cart implements Serializable{
	private int carId;// 购物车id
	private String userId;// 用户id
	private String optometryId;// 验光单id
	private String isFrameonly;// 是否只有镜框(0 表示不仅有镜架还有镜框，1 只有镜架)，默认为0
	private String goodsId;// 商品id
	private String minusPrice;// 立减价格(填写减去的数字)
	private String privilege;// 特权改价（填写可改价最高价格,普通会员无此项）
	private String points;// 积分(设置0或者1,0为不参与积分活动，1参与)
	private String bothNum;// 商品数量
	private String glassId;// 镜片id
	private String catTime;// 购物车时间
	private String cartStatus;// 购物车状态
	private String goodsAttrid;// 商品属性id
	private String picId;// 图片id

	public void setCarId(int carId){
		this.carId=carId;
	}

	public int getCarId(){
		return carId;
	}

	public void setUserId(String userId){
		this.userId=userId;
	}

	public String getUserId(){
		return userId;
	}

	public void setOptometryId(String optometryId){
		this.optometryId=optometryId;
	}

	public String getOptometryId(){
		return optometryId;
	}

	public void setIsFrameonly(String isFrameonly){
		this.isFrameonly=isFrameonly;
	}

	public String getIsFrameonly(){
		return isFrameonly;
	}

	public void setGoodsId(String goodsId){
		this.goodsId=goodsId;
	}

	public String getGoodsId(){
		return goodsId;
	}

	public void setMinusPrice(String minusPrice){
		this.minusPrice=minusPrice;
	}

	public String getMinusPrice(){
		return minusPrice;
	}

	public void setPrivilege(String privilege){
		this.privilege=privilege;
	}

	public String getPrivilege(){
		return privilege;
	}

	public void setPoints(String points){
		this.points=points;
	}

	public String getPoints(){
		return points;
	}

	public void setBothNum(String bothNum){
		this.bothNum=bothNum;
	}

	public String getBothNum(){
		return bothNum;
	}

	public void setGlassId(String glassId){
		this.glassId=glassId;
	}

	public String getGlassId(){
		return glassId;
	}

	public void setCatTime(String catTime){
		this.catTime=catTime;
	}

	public String getCatTime(){
		return catTime;
	}

	public void setCartStatus(String cartStatus){
		this.cartStatus=cartStatus;
	}

	public String getCartStatus(){
		return cartStatus;
	}

	public void setGoodsAttrid(String goodsAttrid){
		this.goodsAttrid=goodsAttrid;
	}

	public String getGoodsAttrid(){
		return goodsAttrid;
	}

	public void setPicId(String picId){
		this.picId=picId;
	}

	public String getPicId(){
		return picId;
	}
}

