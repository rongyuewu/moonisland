package cn.com.yld.pojo;
import java.io.Serializable;

   /**
    * GoodsAttr 实体类
    * Sat Sep 23 10:24:17 CST 2017 anmin
    */ 


public class GoodsAttr implements Serializable{
	private int attrId;//属性编号
	private String goodsId;//商品id
	private String material;//材质
	private String border;//边框
	private String size;//大小
	private String function;//功能
	private String brandId;//品牌
	private String color;//颜色
	private String price;//价格（和商品价格一致，筛选条件）

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

