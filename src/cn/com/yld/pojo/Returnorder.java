package cn.com.yld.pojo;
import java.io.Serializable;

   /**
    * Returnorder 实体类
    * Sat Sep 23 10:24:17 CST 2017 anmin
    */ 


public class Returnorder implements Serializable{
	private int returnId; //退货id
	private String orderId;// 退货订单id
	private String userId; // 用户id
	private String goodsId; // 退货商品id
	private String reason; // 退货理由
	private String returnStatus; // 退货状态(0 等待处理，1 处理完成)
	private String returnTime; // 退货时间

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

