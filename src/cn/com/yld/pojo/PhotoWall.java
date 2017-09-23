package cn.com.yld.pojo;
import java.io.Serializable;

   /**
    * PhotoWall 实体类
    * Sat Sep 23 10:24:17 CST 2017 anmin
    */ 


public class PhotoWall implements Serializable{
	private int photoId;
	private String photoUrl;
	private String photoWord;
	private String photoTime;

	public void setPhotoId(int photoId){
		this.photoId=photoId;
	}

	public int getPhotoId(){
		return photoId;
	}

	public void setPhotoUrl(String photoUrl){
		this.photoUrl=photoUrl;
	}

	public String getPhotoUrl(){
		return photoUrl;
	}

	public void setPhotoWord(String photoWord){
		this.photoWord=photoWord;
	}

	public String getPhotoWord(){
		return photoWord;
	}

	public void setPhotoTime(String photoTime){
		this.photoTime=photoTime;
	}

	public String getPhotoTime(){
		return photoTime;
	}
}

