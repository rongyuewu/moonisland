function show(){
			var btn=document.getElementById('btn');
			var zh=document.getElementsByName('yu');
			var ch=document.getElementById("btf")
			for (var i = 0; i < zh.length; i++) {
				if (btn.checked==true) {
					zh[i].checked=true;
				}else{
					zh[i].checked=false;
				}
			}

		}
		function shoa(){
			var zh=document.getElementsByName('yu');
			var ch=document.getElementById("btf");
			for(var j = 0; j<=zh.length;j++){
				if (ch.checked==true) {
					zh[j].checked=true;
				}else{
					zh[j].checked=false;
				}
			}
		}