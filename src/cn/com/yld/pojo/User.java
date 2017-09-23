package cn.com.yld.pojo;
import java.io.Serializable;

   /**
    * User 实体类
    * Sat Sep 23 10:24:17 CST 2017 anmin
    */ 


public class User implements Serializable{
	private int userId;
	private String points;
	private String userLevel;
	private String isPrivilege;
	private String privilegeNum;
	private String phone;
	private String nickName;
	private String headerPic;
	private String password;
	private String sex;
	private String birthday;
	private String zipcode;
	private String mobile;
	private String mail;
	private String userTime;
	private String userStatus;

	public void setUserId(int userId){
		this.userId=userId;
	}

	public int getUserId(){
		return userId;
	}

	public void setPoints(String points){
		this.points=points;
	}

	public String getPoints(){
		return points;
	}

	public void setUserLevel(String userLevel){
		this.userLevel=userLevel;
	}

	public String getUserLevel(){
		return userLevel;
	}

	public void setIsPrivilege(String isPrivilege){
		this.isPrivilege=isPrivilege;
	}

	public String getIsPrivilege(){
		return isPrivilege;
	}

	public void setPrivilegeNum(String privilegeNum){
		this.privilegeNum=privilegeNum;
	}

	public String getPrivilegeNum(){
		return privilegeNum;
	}

	public void setPhone(String phone){
		this.phone=phone;
	}

	public String getPhone(){
		return phone;
	}

	public void setNickName(String nickName){
		this.nickName=nickName;
	}

	public String getNickName(){
		return nickName;
	}

	public void setHeaderPic(String headerPic){
		this.headerPic=headerPic;
	}

	public String getHeaderPic(){
		return headerPic;
	}

	public void setPassword(String password){
		this.password=password;
	}

	public String getPassword(){
		return password;
	}

	public void setSex(String sex){
		this.sex=sex;
	}

	public String getSex(){
		return sex;
	}

	public void setBirthday(String birthday){
		this.birthday=birthday;
	}

	public String getBirthday(){
		return birthday;
	}

	public void setZipcode(String zipcode){
		this.zipcode=zipcode;
	}

	public String getZipcode(){
		return zipcode;
	}

	public void setMobile(String mobile){
		this.mobile=mobile;
	}

	public String getMobile(){
		return mobile;
	}

	public void setMail(String mail){
		this.mail=mail;
	}

	public String getMail(){
		return mail;
	}

	public void setUserTime(String userTime){
		this.userTime=userTime;
	}

	public String getUserTime(){
		return userTime;
	}

	public void setUserStatus(String userStatus){
		this.userStatus=userStatus;
	}

	public String getUserStatus(){
		return userStatus;
	}
}

