package cn.com.yld.pojo;
import java.io.Serializable;

   /**
    * Address 实体类
    * Sat Sep 23 10:24:17 CST 2017 anmin
    */ 


public class Address implements Serializable{
	private int addressId;//收货地址id
	private String provinceid;//省份id
	private String cityid;//城市ID
	private String districtid;//地区ID
	private String address;//详细地址
	private String zipcode;//邮编
	private String phone;//电话
	private String userId;//用户id
	private String userName;//收货人姓名
	private String addressState;//收货地址状态
	private User user;//关联类
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

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

