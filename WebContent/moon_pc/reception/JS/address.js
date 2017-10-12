// ------------------------------address页面js-----------------------------
var $ = function(id){
	return document.getElementById(id);
}
var $$ = function(name){
	return document.getElementsByName(name)
}
var bill_select_imgs = $$('bill_select_img');
var bill_code = $('bill_code');
var writeMsg = $('writeMsg');
// --------实现填写优惠码、备注信息的隐藏显示--------
bill_select_imgs[0].onclick = function(){
	if (bill_select_imgs[0].className == "img cursor") {
		bill_select_imgs[0].className = "new_img cursor";
		bill_code.className = "show";
	}
	else if(bill_select_imgs[0].className == "new_img cursor"){
		bill_select_imgs[0].className = "img cursor";
		bill_code.className = "hidden";
	}
}
bill_select_imgs[1].onclick = function(){
	if (bill_select_imgs[1].className == "img cursor") {
		bill_select_imgs[1].className = "new_img cursor";
		writeMsg.className = "show";
	}
	else if(bill_select_imgs[1].className == "new_img cursor") {
		bill_select_imgs[1].className = "img cursor";
		writeMsg.className = "hidden";
	}
}
//------清空文本框的初始内容--------
function address_clearContent(){
	var text1 = $("text1");
	if (text1.innerHTML == "&nbsp;&nbsp;输入您的留言...") {
		text1.innerHTML = "";
	}
}
// -----------------实现添加地址-------------------
var receipts = $('receipts');
var receipts_02 = $('receipts_02');
function add_address(){
	var oldImg = receipts_02;
	var newImg = oldImg.cloneNode(true);
	// receipts.innerHTML += newImg;
	oldImg.parentNode.appendChild(newImg); // 在父节点插入克隆的节点 
}