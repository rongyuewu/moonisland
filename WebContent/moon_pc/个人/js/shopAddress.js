function $(id) {
	return document.getElementById(id);
}
function showNmae() {
	var name = $('name');
	var nameSpan = $('nameSpan');
	nameSpan.innerHTML = "";
	var nameReg=/\d{6}/;

	if (!nameReg.test(email_address.value)) {
		nameSpan.innerHTML = "请输入正确的邮政编码";
		return false;
	}
	return true;
}