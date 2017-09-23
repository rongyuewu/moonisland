package cn.com.yld.pojo;

import java.io.Serializable;

   /**
    * About 实体类
    * Sat Sep 23 10:24:17 CST 2017 anmin
    */ 


public class About implements Serializable{
	private int aboutId;
	private String aboutStyle;
	private String aboutContent;
	private String aboutTime;

	public void setAboutId(int aboutId){
		this.aboutId=aboutId;
	}

	public int getAboutId(){
		return aboutId;
	}

	public void setAboutStyle(String aboutStyle){
		this.aboutStyle=aboutStyle;
	}

	public String getAboutStyle(){
		return aboutStyle;
	}

	public void setAboutContent(String aboutContent){
		this.aboutContent=aboutContent;
	}

	public String getAboutContent(){
		return aboutContent;
	}

	public void setAboutTime(String aboutTime){
		this.aboutTime=aboutTime;
	}

	public String getAboutTime(){
		return aboutTime;
	}
}

