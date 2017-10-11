window.onload = function(){
	var overplustime = 60;
			// var timer ;
			function time(btn){
				// if (timer) {
				// 	clearTimeout(timer);
				// }
				if (overplustime == 0) {
					btn.removeAttribute("disabled");
					btn.innerHTML = "重新获取验证码";
					btn.style.backgroundColor = "#545454";
					overplustime = 60;
				} else {
					btn.setAttribute ("disabled",true);
					btn.innerHTML="重新发送(" + overplustime + ")";  
					overplustime--;  
					timer = setTimeout(function() {  
						time(btn)  
					},  
					1000) ; 

				}
			}
			document.getElementById("ct_4").onclick = function(){
				time(this);
				this.style.backgroundColor = "#FF0000"
			}
}