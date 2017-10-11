function $(id){
		return document.getElementById(id);
	}
	window.onload=function(){
	var alipay=$("complete_alipay");//这是支付宝
	var cont=$("complete_wechat");//这是微信
	var truea=$("complete_true");//这是图片
	var trueb=$("complete_wetrue");
	alipay.onclick=function(){
		cont.className = ""
		this.className = "complete_alipaya";
		truea.className = "complete_show";
		trueb.className = "complete_hide";
	}
	cont.onclick=function(){
		alipay.className = ""
		this.className = "complete_alipaya";
		truea.className = "complete_hide";
		trueb.className = "complete_show";
	}
}