package cn.com.yld.pojo;
import java.io.Serializable;

   /**
    * GoodsComment 实体类
    * Sat Sep 23 10:24:17 CST 2017 anmin
    */ 


public class GoodsComment implements Serializable{
	private int commentId;//评论编号
	private String goodsId;//商品id
	private String userId;//用户id
	private String orderId;//订单编号
	private String commentContentword;//商品评论文字
	private String commentContentimg;//商品评论图片(存储所有图片路径，以|分割)，最多3张，单张不大于2M
	private String guarantee;//商品质量星级（以1--5表示）
	private String server;//服务态度星级(以1--5表示)，可以为null
	private String logistics;//物流态度星级(以1--5表示)，可以为null
	private String commentStatus;//评论状态
	private String commentTime;//评论时间

	public void setCommentId(int commentId){
		this.commentId=commentId;
	}

	public int getCommentId(){
		return commentId;
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

	public void setOrderId(String orderId){
		this.orderId=orderId;
	}

	public String getOrderId(){
		return orderId;
	}

	public void setCommentContentword(String commentContentword){
		this.commentContentword=commentContentword;
	}

	public String getCommentContentword(){
		return commentContentword;
	}

	public void setCommentContentimg(String commentContentimg){
		this.commentContentimg=commentContentimg;
	}

	public String getCommentContentimg(){
		return commentContentimg;
	}

	public void setGuarantee(String guarantee){
		this.guarantee=guarantee;
	}

	public String getGuarantee(){
		return guarantee;
	}

	public void setServer(String server){
		this.server=server;
	}

	public String getServer(){
		return server;
	}

	public void setLogistics(String logistics){
		this.logistics=logistics;
	}

	public String getLogistics(){
		return logistics;
	}

	public void setCommentStatus(String commentStatus){
		this.commentStatus=commentStatus;
	}

	public String getCommentStatus(){
		return commentStatus;
	}

	public void setCommentTime(String commentTime){
		this.commentTime=commentTime;
	}

	public String getCommentTime(){
		return commentTime;
	}
}

