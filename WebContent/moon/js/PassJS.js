/*
$(".imgs img").click(function{
    $(this).attr("src","images/check.png");
})*/
$("#image").click(function(){
    $(this).attr('src',$(this).attr('src')=='icon/check.png'?'icon/check-fill.png':'icon/check.png');
    if($(this).attr('src')=='icon/check.png'){
        $("#phone").val($("#phon").val());
        $("#phon").hide();
        $("#phone").show();
    }else {
        $("#phon").val($("#phone").val());
        $("#phone").hide();
        $("#phon").show();
    }

})


