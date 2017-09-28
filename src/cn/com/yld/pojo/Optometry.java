package cn.com.yld.pojo;
import java.io.Serializable;

   /**
    * Optometry 实体类
    * Sat Sep 23 10:24:17 CST 2017 anmin
    */ 


public class Optometry implements Serializable{
	private int optometryId;// 验光单id
	private String userId;// 用户id
	private String rSph;// 右眼球镜
	private String rCyl;// 右眼柱镜
	private String rAxis;// 右眼轴线
	private String lSph; // 左眼球镜
	private String lCyl;// 左眼柱镜
	private String lAxis; // 左眼轴线
	private String pd;// 瞳距
	private String optometryTime; // 验光单添加时间
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setOptometryId(int optometryId){
		this.optometryId=optometryId;
	}

	public int getOptometryId(){
		return optometryId;
	}

	public void setUserId(String userId){
		this.userId=userId;
	}

	public String getUserId(){
		return userId;
	}

	public void setRSph(String rSph){
		this.rSph=rSph;
	}

	public String getRSph(){
		return rSph;
	}

	public void setRCyl(String rCyl){
		this.rCyl=rCyl;
	}

	public String getRCyl(){
		return rCyl;
	}

	public void setRAxis(String rAxis){
		this.rAxis=rAxis;
	}

	public String getRAxis(){
		return rAxis;
	}

	public void setLSph(String lSph){
		this.lSph=lSph;
	}

	public String getLSph(){
		return lSph;
	}

	public void setLCyl(String lCyl){
		this.lCyl=lCyl;
	}

	public String getLCyl(){
		return lCyl;
	}

	public void setLAxis(String lAxis){
		this.lAxis=lAxis;
	}

	public String getLAxis(){
		return lAxis;
	}

	public void setPd(String pd){
		this.pd=pd;
	}

	public String getPd(){
		return pd;
	}

	public void setOptometryTime(String optometryTime){
		this.optometryTime=optometryTime;
	}

	public String getOptometryTime(){
		return optometryTime;
	}
}

