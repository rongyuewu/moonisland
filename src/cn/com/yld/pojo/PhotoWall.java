package cn.com.yld.pojo;
import java.io.Serializable;

   /**
    * PhotoWall 实体类
    * Sat Sep 23 10:24:17 CST 2017 anmin
    */ 


public class PhotoWall implements Serializable{
	private int photoId; // 照片墙id
	private String photoUrl; // 照片墙地址
	private String photoWord; // 照片描述
	private String photoTime;// 添加时间
	private String photoStatus;//状态0选中1未选中

	public void setPhotoId(int photoId){
		this.photoId=photoId;
	}

	public int getPhotoId(){
		return photoId;
	}


	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
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

	public String getPhotoStatus() {
		return photoStatus;
	}

	public void setPhotoStatus(String photoStatus) {
		this.photoStatus = photoStatus;
	}
	
}

