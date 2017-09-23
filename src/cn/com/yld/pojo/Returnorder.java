package cn.com.yld.pojo;

   /**
    * Returnorder 实体类
    * Sat Sep 23 08:56:04 CST 2017 anmin
    */ 


public class Returnorder{
	private int returnId;
	private String orderId;
	private String userId;
	private String goodsId;
	private String reason;
	private String returnStatus;
	private String returnTime;

	public void setReturnId(int returnId){
		this.returnId=returnId;
	}

	public int getReturnId(){
		return returnId;
	}

	public void setOrderId(String orderId){
		this.orderId=orderId;
	}

	public String getOrderId(){
		return orderId;
	}

	public void setUserId(String userId){
		this.userId=userId;
	}

	public String getUserId(){
		return userId;
	}

	public void setGoodsId(String goodsId){
		this.goodsId=goodsId;
	}

	public String getGoodsId(){
		return goodsId;
	}

	public void setReason(String reason){
		this.reason=reason;
	}

	public String getReason(){
		return reason;
	}

	public void setReturnStatus(String returnStatus){
		this.returnStatus=returnStatus;
	}

	public String getReturnStatus(){
		return returnStatus;
	}

	public void setReturnTime(String returnTime){
		this.returnTime=returnTime;
	}

	public String getReturnTime(){
		return returnTime;
	}
}

