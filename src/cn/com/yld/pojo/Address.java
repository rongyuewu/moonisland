package cn.com.yld.pojo;
import java.io.Serializable;

   /**
    * Address 实体类
    * Sat Sep 23 10:24:17 CST 2017 anmin
    */ 


public class Address implements Serializable{
	private int addressId;
	private String provinceid;
	private String cityid;
	private String districtid;
	private String address;
	private String zipcode;
	private String phone;
	private String userId;
	private String userName;
	private String addressState;

	public void setAddressId(int addressId){
		this.addressId=addressId;
	}

	public int getAddressId(){
		return addressId;
	}

	public void setProvinceid(String provinceid){
		this.provinceid=provinceid;
	}

	public String getProvinceid(){
		return provinceid;
	}

	public void setCityid(String cityid){
		this.cityid=cityid;
	}

	public String getCityid(){
		return cityid;
	}

	public void setDistrictid(String districtid){
		this.districtid=districtid;
	}

	public String getDistrictid(){
		return districtid;
	}

	public void setAddress(String address){
		this.address=address;
	}

	public String getAddress(){
		return address;
	}

	public void setZipcode(String zipcode){
		this.zipcode=zipcode;
	}

	public String getZipcode(){
		return zipcode;
	}

	public void setPhone(String phone){
		this.phone=phone;
	}

	public String getPhone(){
		return phone;
	}

	public void setUserId(String userId){
		this.userId=userId;
	}

	public String getUserId(){
		return userId;
	}

	public void setUserName(String userName){
		this.userName=userName;
	}

	public String getUserName(){
		return userName;
	}

	public void setAddressState(String addressState){
		this.addressState=addressState;
	}

	public String getAddressState(){
		return addressState;
	}
}

