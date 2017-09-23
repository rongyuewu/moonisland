package cn.com.yld.pojo;

   /**
    * Cart 实体类
    * Sat Sep 23 08:56:03 CST 2017 anmin
    */ 


public class Cart{
	private int carId;
	private String userId;
	private String optometryId;
	private String isFrameonly;
	private String goodsId;
	private String minusPrice;
	private String privilege;
	private String points;
	private String bothNum;
	private String glassId;
	private String catTime;
	private String cartStatus;
	private String goodsAttrid;
	private String picId;

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

