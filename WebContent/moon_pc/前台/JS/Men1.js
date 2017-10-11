// ----------------封装通用函数----------------
var $ = function(id){
	return document.getElementById(id);
}
var $$ = function(name){
	return document.getElementsByName(name)
}
// -----------------------------Men页面js---------------------------------
var products = $$('products');
var imgss = $$('img');
// var btns = $('btns');
var btns = $$('btns');
// -------------鼠标略过产品图片，相关特效-------------------
// ------遍历producuts数组，逐个绑定鼠标略过事件-------
for(var i=0;i<imgss.length;i++){
	imgss[i].onmouseover = function(){
		for(var j=0;j<imgss.length;j++){
			if (imgss[j] == this) {
				imgss[j].className = "select_products";
				btns[j].className = "btns show";
			}else{
				imgss[j].className = "noselect_products";
				btns[j].className = "btns";
			}
		}
	}
}
// -------------添加、删除条件，相关特效----------------------
// var selected_conditions_ul = $("selected_conditions_ul");
// var the_condition = document.getElementsByName('the_condition');
// var imgs = selected_conditions_ul.getElementsByTagName('img');
// var selected_conditions_ul = $("selected_conditions_ul");
// var lis = document.getElementsByName("selected_li");
// for(i=0;i<the_condition.length;i++){
// 	the_condition[i].onclick=function () {
// 		var spa = document.createElement("li");
// 		spa.className = "selected_content";
// 		spa.setAttribute("name","selected_li");
// 		var lis = document.getElementsByName("selected_li");
// 		for(j=0; j<the_condition.length; j++){
// 			if(the_condition[j] == this){
// 				spa.innerHTML = the_condition[j].innerHTML + 
// 				"<img class='show_close' src='Images/前台/2-男士女士太阳镜/images/close.jpg' title='删除此条件' alt='close_this'>";
// 			}	
// 		}
// 		selected_conditions_ul.appendChild(spa);
// 	}
// }
// for(var i=0; i<imgs.length; i++){
// 	imgs[i].onclick = function (){
// 		for(var j=0; j<imgs.length; j++){
// 			if (imgs[j] == this) {
// 				lis[j].className = "hidden";
// 			}
// 		}
// 	}
// }
// // -------------鼠标略过已选条件，出现close---------------
// for(var i=0; i<lis.length; i++){
// 	lis[i].onmouseover = function(){
// 		for(var j=0; j<lis.length; j++){
// 			if (lis[j] == this) {
// 				imgs[j].className = "show_close";
// 			}else{
// 				imgs[j].className = "none_close";
// 			}
// 		}
// 	}
// }
// for(var i=0; i<lis.length; i++){
// 	lis[i].onmouseout = function(){
// 		for(var j=0; j<lis.length; j++){
// 			if (lis[j] == this) {
// 				imgs[j].className = "none_close";
// 			}
// 		}
// 	}
// }

