package cn.com.yld.pojo;

   /**
    * Admin 实体类
    * Sat Sep 23 08:56:03 CST 2017 anmin
    */ 


public class Admin{
	private int id;
	private String name;
	private String pwd;
	private String status;
	private String addTime;

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
