window.onload = function  () {
	var imgs = document.getElementsByName("titleImg");
	var names = document.getElementsByName("titleName1")
	for(var i=0;i<names.length;i++){
		names[i].onclick = function (){
			for(var j=0;j<names.length;j++){
				if (names[j] == this) {
					names[j].className = "select";
					imgs[j].className = "show";
				}
				else{
					names[j].className = "";
					imgs[j].className = "";
				}
			}
		}
	}
}
//=========================================全选==================================
function allShow () {
   var all = $ ("boxAll")
   var names = document.getElementsByName("check")
   for(var i = 0; i<names.length;i++){
    if (all.checked) {
        names[i].checked = true;
    }else{
        names[i].checked = false;
    }
}
}

// ================================================去修改/完善信息===============================================

function $(id) {
	return document.getElementById(id);
}
function main_right_ul1(){
    var epal_info = $("epal_info");
    var epal_info_none = $("epal_info_none");
    var epal = $("epal");
    var infoNone = $("infoNone");
    epal_info.className = "main_last_none";
    epal_info_none.className = "main_last_dis_block";
    infoNone.className = "infoNone";
}

// ===============================================将修改的信息在原页面显示====================================
function main_last_none() {
    var epal_info = $("epal_info");
    var epal_info_none = $("epal_info_none");
    var infoNone = $("infoNone");
    //点击提交信息返回原页面
    epal_info.className = "main_last_dis_block2";
    epal_info_none.className = "main_last_none"; 
    infoNone.className = "infoBlock";
}

// ===================================================城市级联======================================================
var addressInit = function(_cmbProvince, _cmbCity, _cmbArea, defaultProvince, defaultCity, defaultArea){
    var cmbProvince = document.getElementById(_cmbProvince);
    var cmbCity = document.getElementById(_cmbCity);
    var cmbArea = document.getElementById(_cmbArea);

    function cmbSelect(cmb, str){
        for(var i=0; i<cmb.options.length; i++){
            if(cmb.options[i].value == str){
                cmb.selectedIndex = i;
                return;
            }
        }
    }
    function cmbAddOption(cmb, str, obj){
        var option = document.createElement("OPTION");
        cmb.options.add(option);
        option.innerHTML = str;
        option.value = str;
        option.obj = obj;
    }

    function changeCity(){
        cmbArea.options.length = 0;
        if(cmbCity.selectedIndex == -1)return;
        var item = cmbCity.options[cmbCity.selectedIndex].obj;
        for(var i=0; i<item.areaList.length; i++)
        {
            cmbAddOption(cmbArea, item.areaList[i], null);
        }
        cmbSelect(cmbArea, defaultArea);
    }
    function changeProvince() {
        cmbCity.options.length = 0;
        cmbCity.onchange = null;
        if(cmbProvince.selectedIndex == -1)return;
        var item = cmbProvince.options[cmbProvince.selectedIndex].obj;
        for(var i=0; i<item.cityList.length; i++) {
            cmbAddOption(cmbCity, item.cityList[i].name, item.cityList[i]);
        }
        cmbSelect(cmbCity, defaultCity);
        changeCity();
        cmbCity.onchange = changeCity;
    }

    for(var i=0; i<provinceList.length; i++){
        cmbAddOption(cmbProvince, provinceList[i].name, provinceList[i]);
    }
    cmbSelect(cmbProvince, defaultProvince);
    changeProvince();
    cmbProvince.onchange = changeProvince;
}

var provinceList = [
{name:'北京', cityList:[         
{name:'市辖区', areaList:['东城区','西城区','崇文区','宣武区','朝阳区','丰台区','石景山区','海淀区','门头沟区','房山区','通州区','顺义区','昌平区','大兴区','怀柔区','平谷区']},
{name:'县', areaList:['密云县','延庆县']}
]},
{name:'上海', cityList:[         
{name:'市辖区', areaList:['黄浦区','卢湾区','徐汇区','长宁区','静安区','普陀区','闸北区','虹口区','杨浦区','闵行区','宝山区','金山区','松江区','青浦区','南汇区','奉贤区']},   
{name:'县', areaList:['崇明县']}
]}
];

// =====================================照片墙===================================
window.onload = function () {
    var opt = document.getElementsByName("opacity1");
    for(var i = 0 ; i<opt.length ; i++){
        opt[i].onmouseover=function(){
            this.style.opacity = 0.8;
        }
        opt[i].onmouseout = function () {
            this.style.opacity = 1;
        }
    }

}
















