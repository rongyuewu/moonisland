/*
$(".imgs img").click(function{
    $(this).attr("src","images/check.png");
})*/
$("#image").click(function(){
    $(this).attr('src',$(this).attr('src')=='images/check.png'?'images/check-fill.png':'images/check.png');
    if($(this).attr('src')=='images/check.png'){
        $("#phone").val($("#phon").val());
        $("#phon").hide();
        $("#phone").show();
    }else {
        $("#phon").val($("#phone").val());
        $("#phone").hide();
        $("#phon").show();
    }

})


