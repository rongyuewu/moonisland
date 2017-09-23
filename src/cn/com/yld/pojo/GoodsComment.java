package cn.com.yld.pojo;

   /**
    * GoodsComment 实体类
    * Sat Sep 23 08:56:04 CST 2017 anmin
    */ 


public class GoodsComment{
	private int commentId;
	private String goodsId;
	private String userId;
	private String orderId;
	private String commentContentword;
	private String commentContentimg;
	private String guarantee;
	private String server;
	private String logistics;
	private String commentStatus;
	private String commentTime;

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

