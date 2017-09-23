package cn.com.yld.pojo;
import java.io.Serializable;

   /**
    * Area 实体类
    * Sat Sep 23 10:24:17 CST 2017 anmin
    */ 


public class Area implements Serializable{
	private String areaId;//地区id
	private String title;//地区名称
	private String pid;//父级地区ID
	private int sort;//排序值

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

