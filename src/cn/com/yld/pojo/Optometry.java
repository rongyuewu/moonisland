package cn.com.yld.pojo;

   /**
    * Optometry 实体类
    * Sat Sep 23 08:56:04 CST 2017 anmin
    */ 


public class Optometry{
	private int optometryId;
	private String userId;
	private String rSph;
	private String rCyl;
	private String rAxis;
	private String lSph;
	private String lCyl;
	private String lAxis;
	private String pd;
	private String optometryTime;

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

