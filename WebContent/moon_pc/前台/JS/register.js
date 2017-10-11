//注册js代码这是短信验证码
	window.onload=function(){
	var overplustime = 60;
			var timer ;
			function time(btn){
				if (timer) {
					clearTimeout(timer);
				}
				btn.removeAttribute("disabled");
				if (overplustime <=0) {
					btn.innerHTML = "重新获取验证码";
					btn.style.backgroundColor = "#545454";
					overplustime = 60;
				} else {
					btn.setAttribute("disabled","true");
					btn.innerHTML=  overplustime + "秒";  
					overplustime--;  
					timer = setTimeout(function() {  
						time(btn)  
					},  
					1000) ; 

				}
			}
			document.getElementById("register_button").onclick = function(){
				time(this);
				this.style.backgroundColor = "#FF0000";
				document.getElementById("conregister_button").style.backgroundColor= "#FF0000";
			}//密码的正则表达式

	var psw = document.getElementById('psw');

	psw.onkeyup = function (){
	var cNum =	/^\d+$/;                     //纯数字
	var cEng =  /^[a-zA-Z]+$/;               //纯英文
	var special  =  /^[@#$%^&amp;]+$/;       //纯特殊符号
	var numOrEng =  /^(?!\d+$)(?![a-zA-Z]+$)[a-zA-Z\d]+$/;   //数字+英文
	var speOrEng =  /^(?![a-zA-Z]+$)(?![@#$%^&amp;]+$)[a-zA-Z@#$%^&amp;]+$/;  //英文+特殊符号
	var numOrspe =  /^(?!\d+)(?![@#$%^&amp;]+$)[\d@#$%^&amp;]+$/;   //数字+特殊符号
	var sty   =  /(?=.*[a-z])(?=.*\d)(?=.*[#@!~%.^&*,><])[a-z\d#@!~%^&*]/;  //数字 + 特殊符号 + 字母

	var span1 = document.getElementById('high_span');
	var span2 = document.getElementById('mid_span');
	var span3 = document.getElementById('low_span');

	if (this.value.length == 0) {
		span3.style.backgroundColor = "#E8E8E8"
		span3.style.color = "#B6B6B6";
		span1.style.backgroundColor = "#E8E8E8";
		span2.style.backgroundColor = "#E8E8E8";
		span1.style.color = "#B6B6B6";
		span2.style.color = "#B6B6B6";
	}
	if (cNum.test(this.value) || cEng.test(this.value) || special.test(this.value)) {
		span3.style.backgroundColor = "#FF0000"
		span3.style.color = "#FFFFFF";
		span1.style.backgroundColor = "#E8E8E8";
		span2.style.backgroundColor = "#E8E8E8";
		span1.style.color = "#B6B6B6";
		span2.style.color = "#B6B6B6";

	}
	if (numOrEng.test(this.value) || speOrEng.test(this.value) || numOrspe.test(this.value)) {
		span3.style.backgroundColor = "#E8E8E8"
		span3.style.color = "#B6B6B6";
		span1.style.backgroundColor = "#E8E8E8";
		span2.style.backgroundColor = "#FFB72A";
		span1.style.color = "#B6B6B6";
		span2.style.color = "#FFFFFF";

	}

	if (sty.test(this.value)) {
		span3.style.backgroundColor = "#E8E8E8"
		span3.style.color = "#B6B6B6";
		span1.style.backgroundColor = "#78D03B";
		span2.style.backgroundColor = "#E8E8E8";
		span1.style.color = "#FFFFFF";
		span2.style.color = "#B6B6B6";

	}
}
}
function $(id){
	return  document.getElementById(id);
}
function checkPwd(){
			var psw = $("psw");
			var pwdId = $("register_spanqw");
			pwdId.innerHTML = ""; 
			var reg = /^[a-zA-Z0-9]{4,10}$/;	
			if(!reg.test(psw.value)){
				pwdId.innerHTML = "两次密码不一致";
				pwdId.style.color="#ff0000";

				return false;
			}
			return true;
		}
	function checkRepwd(){
			var repwd = $("register_repadw");
			var psw = $("psw");
			var repwdId = $("register_no");
			repwdId.innerHTML = "";
			if(psw.value != repwd.value){
				repwdId.innerHTML = "两次密码不一致";
				repwdId.style.color="#ff0000";
				return false;
			}
			return true;
		}   
		function check() {
			var flag = true;

			if (checkPwd() == false) {
				flag = false;
			}
			if (checkRepwd() == false) {
				flag = false;
			}
			return flag;
		}

  