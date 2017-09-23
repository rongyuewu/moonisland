package cn.com.yld.pojo;

   /**
    * GoodsAttr 实体类
    * Sat Sep 23 08:56:04 CST 2017 anmin
    */ 


public class GoodsAttr{
	private int attrId;
	private String goodsId;
	private String material;
	private String border;
	private String size;
	private String function;
	private String brandId;
	private String color;
	private String price;

	public void setAttrId(int attrId){
		this.attrId=attrId;
	}

	public int getAttrId(){
		return attrId;
	}

	public void setGoodsId(String goodsId){
		this.goodsId=goodsId;
	}

	public String getGoodsId(){
		return goodsId;
	}

	public void setMaterial(String material){
		this.material=material;
	}

	public String getMaterial(){
		return material;
	}

	public void setBorder(String border){
		this.border=border;
	}

	public String getBorder(){
		return border;
	}

	public void setSize(String size){
		this.size=size;
	}

	public String getSize(){
		return size;
	}

	public void setFunction(String function){
		this.function=function;
	}

	public String getFunction(){
		return function;
	}

	public void setBrandId(String brandId){
		this.brandId=brandId;
	}

	public String getBrandId(){
		return brandId;
	}

	public void setColor(String color){
		this.color=color;
	}

	public String getColor(){
		return color;
	}

	public void setPrice(String price){
		this.price=price;
	}

	public String getPrice(){
		return price;
	}
}

