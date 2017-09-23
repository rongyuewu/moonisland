package cn.com.yld.pojo;

   /**
    * Brand 实体类
    * Sat Sep 23 08:56:03 CST 2017 anmin
    */ 


public class Brand{
	private int brandId;
	private String brandName;
	private String brandLogo;
	private String brandCon;
	private String brandAddtime;

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

