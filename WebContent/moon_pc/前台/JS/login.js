
	window.onload=function(){
	var con1 = document.getElementById('div1')
	var con2 = document.getElementById('div2')
	var span1 = document.getElementById('span1')
	var span2 = document.getElementById('span2')
	
	span1.onclick = function () {
		con1.className = "show";
		con2.className = "hide";
		span1.className = "select";
		span2.className = "";
	}
	span2.onclick = function () {
		con1.className = "hide";
		con2.className = "show";
		span1.className = "";
		span2.className = "select";

	}
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
					btn.innerHTML=overplustime+"秒" ;  
					overplustime--;  
					timer = setTimeout(function() {  
						time(btn)  
					},  
					1000) ; 

				}
			}
			document.getElementById("validate").onclick = function(){
				time(this);
				this.style.backgroundColor = "#FF0000"
			}

}