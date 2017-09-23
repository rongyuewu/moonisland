package cn.com.yld.pojo;

   /**
    * Area 实体类
    * Sat Sep 23 08:56:03 CST 2017 anmin
    */ 


public class Area{
	private String areaId;
	private String title;
	private String pid;
	private int sort;

	public void setAreaId(String areaId){
		this.areaId=areaId;
	}

	public String getAreaId(){
		return areaId;
	}

	public void setTitle(String title){
		this.title=title;
	}

	public String getTitle(){
		return title;
	}

	public void setPid(String pid){
		this.pid=pid;
	}

	public String getPid(){
		return pid;
	}

	public void setSort(int sort){
		this.sort=sort;
	}

	public int getSort(){
		return sort;
	}
}

