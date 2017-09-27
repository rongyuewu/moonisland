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
	
	
	//引入外部对象
	private Goods goods;
	private Glass glass;
	private User user;
	private Optometry optometry;
	private GoodsAttr goodsAttr;
	private GoodsPic goodsPic;
	
	

	public Goods getGoods() {
		return goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}

	public Glass getGlass() {
		return glass;
	}

	public void setGlass(Glass glass) {
		this.glass = glass;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Optometry getOptometry() {
		return optometry;
	}

	public void setOptometry(Optometry optometry) {
		this.optometry = optometry;
	}

	public GoodsAttr getGoodsAttr() {
		return goodsAttr;
	}

	public void setGoodsAttr(GoodsAttr goodsAttr) {
		this.goodsAttr = goodsAttr;
	}

	public GoodsPic getGoodsPic() {
		return goodsPic;
	}

	public void setGoodsPic(GoodsPic goodsPic) {
		this.goodsPic = goodsPic;
	}

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

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cart(String userId, String optometryId, String isFrameonly, String goodsId, String minusPrice,
			String privilege, String points, String bothNum, String glassId, String catTime, String cartStatus,
			String goodsAttrid, String picId) {
		super();
		this.userId = userId;
		this.optometryId = optometryId;
		this.isFrameonly = isFrameonly;
		this.goodsId = goodsId;
		this.minusPrice = minusPrice;
		this.privilege = privilege;
		this.points = points;
		this.bothNum = bothNum;
		this.glassId = glassId;
		this.catTime = catTime;
		this.cartStatus = cartStatus;
		this.goodsAttrid = goodsAttrid;
		
	}

	@Override
	public String toString() {
		return "Cart [carId=" + carId + ", userId=" + userId + ", optometryId=" + optometryId + ", isFrameonly="
				+ isFrameonly + ", goodsId=" + goodsId + ", minusPrice=" + minusPrice + ", privilege=" + privilege
				+ ", points=" + points + ", bothNum=" + bothNum + ", glassId=" + glassId + ", catTime=" + catTime
				+ ", cartStatus=" + cartStatus + ", goodsAttrid=" + goodsAttrid + ", picId=" + picId + "]";
	}
	
	
}

