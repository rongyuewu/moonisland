package cn.com.yld.pojo;
import java.io.Serializable;

   /**
    * Admin 实体类
    * Sat Sep 23 10:24:17 CST 2017 anmin
    */ 


public class Admin implements Serializable{
	private int id;//用户id
	private String name;//登陆账户
	private String pwd;//登录密码
	private String status;//管理员权限
	private String addTime;//添加时间

	public void setId(int id){
		this.id=id;
	}

	public int getId(){
		return id;
	}

	public void setName(String name){
		this.name=name;
	}

	public String getName(){
		return name;
	}

	public void setPwd(String pwd){
		this.pwd=pwd;
	}

	public String getPwd(){
		return pwd;
	}

	public void setStatus(String status){
		this.status=status;
	}

	public String getStatus(){
		return status;
	}

	public void setAddTime(String addTime){
		this.addTime=addTime;
	}

	public String getAddTime(){
		return addTime;
	}
}

