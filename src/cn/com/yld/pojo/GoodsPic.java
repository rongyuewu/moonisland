package cn.com.yld.pojo;
import java.io.Serializable;

   /**
    * GoodsPic 实体类
    * Sat Sep 23 10:24:17 CST 2017 anmin
    */ 


public class GoodsPic implements Serializable{
	private int picId;//图片编号
	private String goodsId;//商品编号
	private String pic1;//图片1
	private String pic2;
	private String pic3;
	private String pic4;
	private String pic1Thumb;//缩略图1
	private String pic2Thumb;
	private String pic3Thumb;
	private String pic4Thumb;
	private Goods goods;
	public Goods getGoods() {
		return goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}

	public void setPicId(int picId){
		this.picId=picId;
	}

	public int getPicId(){
		return picId;
	}

	public void setGoodsId(String goodsId){
		this.goodsId=goodsId;
	}

	public String getGoodsId(){
		return goodsId;
	}

	public void setPic1(String pic1){
		this.pic1=pic1;
	}

	public String getPic1(){
		return pic1;
	}

	public void setPic2(String pic2){
		this.pic2=pic2;
	}

	public String getPic2(){
		return pic2;
	}

	public void setPic3(String pic3){
		this.pic3=pic3;
	}

	public String getPic3(){
		return pic3;
	}

	public void setPic4(String pic4){
		this.pic4=pic4;
	}

	public String getPic4(){
		return pic4;
	}

	public void setPic1Thumb(String pic1Thumb){
		this.pic1Thumb=pic1Thumb;
	}

	public String getPic1Thumb(){
		return pic1Thumb;
	}

	public void setPic2Thumb(String pic2Thumb){
		this.pic2Thumb=pic2Thumb;
	}

	public String getPic2Thumb(){
		return pic2Thumb;
	}

	public void setPic3Thumb(String pic3Thumb){
		this.pic3Thumb=pic3Thumb;
	}

	public String getPic3Thumb(){
		return pic3Thumb;
	}

	public void setPic4Thumb(String pic4Thumb){
		this.pic4Thumb=pic4Thumb;
	}

	public String getPic4Thumb(){
		return pic4Thumb;
	}
}

