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
// // -------------添加、删除条件，相关特效----------------------
var selected_conditions_ul = $("selected_conditions_ul");
var the_condition = document.getElementsByName('the_condition');
var imgs = selected_conditions_ul.getElementsByTagName('img');
var selected_conditions_ul = $("selected_conditions_ul");
var uls = $("selected_conditions_ul");
var lis = document.getElementsByName("selected_li");
for(i=0; i<the_condition.length; i++){
	the_condition[i].onclick=function () {
		// show(this);
		var newLi = document.createElement("li");
		newLi.className = "selected_content";
		newLi.setAttribute("name","selected_li");
		newLi.setAttribute("onmouseover","show_close(this)");
		newLi.setAttribute("onmouseout","colse_this(this)");
		var lis = document.getElementsByName("selected_li");
		for(j=0; j<the_condition.length; j++){
			if(the_condition[j] == this){
				newLi.innerHTML = the_condition[j].innerHTML + 
				"<img class='none_close' src='Images/前台/2-男士女士太阳镜/images/close.jpg' title='删除此条件' alt='close_this' onclick='colse_this(this)'>";
			}	
		}
		selected_conditions_ul.appendChild(newLi);
	}
}
// 点叉 删除已选条件
function colse_this(a){
	for(var i=0; i<imgs.length; i++){
		imgs[i].onclick = function (a){
			for(var j=0; j<imgs.length; j++){
				if (imgs[j] == this) {
					lis[j].className = "hidden";
				}
			}
		}
	}
}
// // -------------鼠标略过已选条件，出现close---------------
function show_close(a){
	for(var i=0; i<lis.length; i++){
		lis[i].onmouseover = function(a){
			for(var j=0; j<lis.length; j++){
				if (lis[j] == this) {
					imgs[j].className = "none_close show_close";
				}else{
					imgs[j].className = "none_close";
				}
			}
		}
	}
}
function hidden_colse(a){
	for(var i=0; i<lis.length; i++){
		lis[i].onmouseout = function(a){
			for(var j=0; j<lis.length; j++){
				if (lis[j] == this) {
					imgs[j].className = "none_close";
				}
			}
		}
	}
}
colse_this(this);
show_close(this);
colse_this(this);










// function show(a){
// 	var lis = document.getElementsByName("selected_li");
// 	var uls = $("selected_conditions_ul");
// 	var num = "";
// 	for (i = 0; i < lis.length; i++) {
// 		if (a.innerText != lis[i].innerText) {
// 			num = num+"<li id='li1'>已选条件：</li>" +"<li class='selected_content' name='selected_li' onclick='show(this)'>"+the_condition[i].innerHTML+"<img class='none_close' src='Images/前台/2-男士女士太阳镜/images/close.jpg' title='删除此条件' alt='close_this'>"+"</li>";
// 		}
// 	}
// 	uls.innerHTML = num;
// }
// // var a = 3;
// function add(){
// 	uls = document.getElementById("uls");
// 	var num = "";
// 	num = num +"<li class='selected_content' name='selected_li' onclick='show(this)'>"+the_condition[i].innerHTML+"<img class='none_close' src='Images/前台/2-男士女士太阳镜/images/close.jpg' title='删除此条件' alt='close_this'>"+"</li>";
// 	// num = num +"<li class='lis' onclick='show(this)'>"+ ++a +"</li>";
// 	uls.innerHTML += num;
// }
