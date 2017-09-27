package cn.com.yld.pojo;
import java.io.Serializable;

   /**
    * Brand 实体类
    * Sat Sep 23 10:24:17 CST 2017 anmin
    */ 


public class Brand implements Serializable{
	private int brandId;// 品牌id
	private String brandName;// 品牌名称
	private String brandLogo;// logo路径
	private String brandCon;// 品牌描述
	private String brandAddtime;// 添加时间
	private String brandStatus;

	public String getBrandStatus() {
		return brandStatus;
	}

	public void setBrandStatus(String brandStatus) {
		this.brandStatus = brandStatus;
	}

	public void setBrandId(int brandId){
		this.brandId=brandId;
	}

	public int getBrandId(){
		return brandId;
	}

	public void setBrandName(String brandName){
		this.brandName=brandName;
	}

	public String getBrandName(){
		return brandName;
	}

	public void setBrandLogo(String brandLogo){
		this.brandLogo=brandLogo;
	}

	public String getBrandLogo(){
		return brandLogo;
	}

	public void setBrandCon(String brandCon){
		this.brandCon=brandCon;
	}

	public String getBrandCon(){
		return brandCon;
	}

	public void setBrandAddtime(String brandAddtime){
		this.brandAddtime=brandAddtime;
	}

	public String getBrandAddtime(){
		return brandAddtime;
	}
}

