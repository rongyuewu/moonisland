package cn.com.yld.pojo;
import java.io.Serializable;

   /**
    * Order 实体类
    * Sat Sep 23 10:24:17 CST 2017 anmin
    */ 


public class Order implements Serializable{
	private int orderId; // 订单id
	private String orderNumber; //订单号 (YLD1504083859) 生成策略YLD+时间戳
	private String goodsId;// 商品id
	private String glassId; // 镜片id
	private String userId; // 用户id
	private String optometryId; // 验光单id
	private String orderStatus; // 订单状态（0 待付款，用户购物车点击结算但是未支付，1 待发货，客服确认订单，2 已完成，后台管理确认，到付完成，回款，3 已取消，4 已退款）
	private String shippingStatus; // 配送情况（0 未发货，1 已发货，2 已收货，4退货）
	private String payStatus;// 支付状态（0 未付款，1 付款中，2已付款）
	private String consignee;// 收货人姓名
	private String provinceid;// 收货人省份id
	private String cityid;// 收货人城市id
	private String districtid;// 收货人地区 id
	private String address;// 收货人详细地址
	private String zipcode;// 邮编
	private String phone;//联系方式
	private String payNum;// 购买数量
	private String orderMoney; // 订单金额
	private String postscript;// 留言
	private String shippingId;// 配送方式id
	private String shippingName;// 配送方式名称
	private String shippingNum;// 快递单号
	private String orderTime;// 订单生成时间
	private String goodsAttrid;// 商品属性id
	private String picId;// 图片id
	
	//引入外部对象
	private Goods goods;
	private Glass glass;
	private User user;
	private Optometry optometry;
	private GoodsAttr goodsAttr;
	private GoodsPic goodsPic;
	public int getOrderId() {
		return orderId;
	}
	public String getOrderNumber() {
		return orderNumber;
	}
	public String getGoodsId() {
		return goodsId;
	}
	public String getGlassId() {
		return glassId;
	}
	public String getUserId() {
		return userId;
	}
	public String getOptometryId() {
		return optometryId;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public String getShippingStatus() {
		return shippingStatus;
	}
	public String getPayStatus() {
		return payStatus;
	}
	public String getConsignee() {
		return consignee;
	}
	public String getProvinceid() {
		return provinceid;
	}
	public String getCityid() {
		return cityid;
	}
	public String getDistrictid() {
		return districtid;
	}
	public String getAddress() {
		return address;
	}
	public String getZipcode() {
		return zipcode;
	}
	public String getPhone() {
		return phone;
	}
	public String getPayNum() {
		return payNum;
	}
	public String getOrderMoney() {
		return orderMoney;
	}
	public String getPostscript() {
		return postscript;
	}
	public String getShippingId() {
		return shippingId;
	}
	public String getShippingName() {
		return shippingName;
	}
	public String getShippingNum() {
		return shippingNum;
	}
	public String getOrderTime() {
		return orderTime;
	}
	public String getGoodsAttrid() {
		return goodsAttrid;
	}
	public String getPicId() {
		return picId;
	}
	public Goods getGoods() {
		return goods;
	}
	public Glass getGlass() {
		return glass;
	}
	public User getUser() {
		return user;
	}
	public Optometry getOptometry() {
		return optometry;
	}
	public GoodsAttr getGoodsAttr() {
		return goodsAttr;
	}
	public GoodsPic getGoodsPic() {
		return goodsPic;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}
	public void setGlassId(String glassId) {
		this.glassId = glassId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public void setOptometryId(String optometryId) {
		this.optometryId = optometryId;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public void setShippingStatus(String shippingStatus) {
		this.shippingStatus = shippingStatus;
	}
	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}
	public void setConsignee(String consignee) {
		this.consignee = consignee;
	}
	public void setProvinceid(String provinceid) {
		this.provinceid = provinceid;
	}
	public void setCityid(String cityid) {
		this.cityid = cityid;
	}
	public void setDistrictid(String districtid) {
		this.districtid = districtid;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setPayNum(String payNum) {
		this.payNum = payNum;
	}
	public void setOrderMoney(String orderMoney) {
		this.orderMoney = orderMoney;
	}
	public void setPostscript(String postscript) {
		this.postscript = postscript;
	}
	public void setShippingId(String shippingId) {
		this.shippingId = shippingId;
	}
	public void setShippingName(String shippingName) {
		this.shippingName = shippingName;
	}
	public void setShippingNum(String shippingNum) {
		this.shippingNum = shippingNum;
	}
	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}
	public void setGoodsAttrid(String goodsAttrid) {
		this.goodsAttrid = goodsAttrid;
	}
	public void setPicId(String picId) {
		this.picId = picId;
	}
	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	public void setGlass(Glass glass) {
		this.glass = glass;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public void setOptometry(Optometry optometry) {
		this.optometry = optometry;
	}
	public void setGoodsAttr(GoodsAttr goodsAttr) {
		this.goodsAttr = goodsAttr;
	}
	public void setGoodsPic(GoodsPic goodsPic) {
		this.goodsPic = goodsPic;
	}
	
	
	
	

	

	
	
}

