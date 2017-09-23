package cn.com.yld.pojo;
import java.io.Serializable;

   /**
    * User 实体类
    * Sat Sep 23 10:24:17 CST 2017 anmin
    */ 


public class User implements Serializable{
	private int userId; // 用户id
	private String points; // 积分
	private String userLevel; // 会员等级（500 普通会员，5000 普通会员，10000白金会员），随积分变动
	private String isPrivilege; // 是否为特权会员(0 不是，1是),默认为0
	private String privilegeNum;// 特权改价次数(默认10次，使用一次减少一次)
	private String phone; // 注册手机号(手机验证默认为已验证)
	private String nickName; // 昵称
	private String headerPic; // 头像
	private String password; // 密码
	private String sex; // 性别
	private String birthday; // 生日
	private String zipcode; // 邮编
	private String mobile; // 联系电话(默认是注册手机，除非再次指定)
	private String mail;// 邮箱
	private String userTime; // 注册时间
	private String userStatus;// 用户状态(0已删除，1可用)

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

