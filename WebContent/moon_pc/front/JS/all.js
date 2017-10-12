function $(id){
	return document.getElementById(id);
}
function rootDirectoryShow(a){
	var catalogContentUl1Li = 'catalogContentUl1Li'+a;
	var catalogContentUl1LiS = 'catalogContentUl1LiS'+a;
	$(catalogContentUl1Li).style.background = "#FF9300";
	$(catalogContentUl1Li).style.color = "#FFFFFF";
	$(catalogContentUl1LiS).style.color = "#FFFFFF";
}
function rootDirectoryShow_2(a){
	var catalogContentUl1Li = 'catalogContentUl1Li'+a;
	var catalogContentUl1LiS = 'catalogContentUl1LiS'+a;
	$(catalogContentUl1Li).style.background = "#FFFFFF";
	$(catalogContentUl1Li).style.color = "#707070";
	$(catalogContentUl1LiS).style.color = "#313131";
}

// =======================help==============================

function help1(){
	var help = document.getElementById("Show__help");
	if (help.style.display=="block"){
		help.style.display="none";
	}else{
		help.style.display="block";
	}
}

function close1() {
	var help = document.getElementById("Show__help");
	if (help.style.display == "block") {
		help.style.display = "none";
	}else {
		help.style.display = "block";

	}
}

// =======================个人中心==============================
function geren_zhuye(){
	var person_1 = document.getElementById("person_1");
	if (person_1.style.display=="block"){
		person_1.style.display="none";
	}else{
		person_1.style.display="block";
	}
}





function showInfor4Show1(){
	$('showInfor4_3').style.display = "block";
}
function showInfor4Show2(){
	$('showInfor4_3').style.display = "none";
}
function showInfor4Show1_1(){
	$('showInfor4_4').style.display = "block";
}
function showInfor4Show2_1(){
	$('showInfor4_4').style.display = "none";
}

function ad2Map0LiUnderline(x){
	var  ad2Map0Li_S = "ad2Map0Li_" + x;
	$(ad2Map0Li_S).className = "ad2Map0Li_1";
	$(ad2Map0Li_S).style.color = "#181818";
	$(ad2Map0Li_S).style.textAlign = "center";
}
function ad2Map0LiUnderlineUp(x){
	var  ad2Map0Li_S = "ad2Map0Li_" + x;
	$(ad2Map0Li_S).className = "";
	$(ad2Map0Li_S).style.color = "#B1B1B1";
	$(ad2Map0Li_S).style.textAlign = "center";
}
function ad2Map0LiUnderlineUp_B(x){
	var  ad2Map0Li_S = "ad2Map0Li_" + x;
	$(ad2Map0Li_S).className = "";
	$(ad2Map0Li_S).style.color = "#3D3D3D";
	$(ad2Map0Li_S).style.textAlign = "center";
}
// <!-- =================大广告============== -->
function adMapShow_3(a){
	adMap_0S = "adMap_0" + a;
	$(adMap_0S).style.opacity = 0.8;
}
function addMapShow2(){
	$(adMap_0S).style.opacity = 1;
}
		// <!-- =================广告2男士============== -->
		function ad2MapShow1(a){
			ad2Map_0S = "ad2Map_0" + a;
			$(ad2Map_0S).style.opacity = 0.8;
		}
		function ad2MapShow2(){
			$(ad2Map_0S).style.opacity = 1;
		}
		// <!-- =================广告3女士============== -->
		function ad3Map1Show1(a){
			ad3Map_0S = "ad3Map_0" + a;
			$(ad3Map_0S).style.opacity = 0.8;
		}
		function ad3Map1Show2(){
			$(ad3Map_0S).style.opacity = 1;
		}
		// <!-- =================广告4学生============== -->
		function ad4MapShow1(a){
			ad4Map_0S = "ad4Map_0" + a;
			$(ad4Map_0S).style.opacity = 0.8;
		}
		function ad4MapShow2(){
			$(ad4Map_0S).style.opacity = 1;
		}
		// <!-- =================广告5太阳镜============== -->
		function ad5MapShow1(a){
			ad5Map_0S = "ad5Map_0" + a;
			$(ad5Map_0S).style.opacity = 0.8;
		}
		function ad5MapShow2(){
			$(ad5Map_0S).style.opacity = 1;
		}