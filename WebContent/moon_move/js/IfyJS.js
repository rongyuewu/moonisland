<!--显示隐藏遮罩-->
/*$('#dropdownMenu1').click(function () {
    if($('#zhezhao').css('display')=='none'){
        $('#zhezhao').show();
        /!*$(this).css('color','red');*!/
    }else {
        $('#zhezhao').hide();
        /!*$(this).css('color','black');*!/
    }
})
$(".dropdown div").click(function(){

    if(!$(this).hasClass("red")){
        $(".dropdown div").removeClass("red");
        $(this).addClass("red");
    }else{
        $(this).removeClass("red");
    }
})*/
$('button').each(function () {
    $(this).click(function(){

        if($(this).css('color')=='rgb(255, 0, 0)'){
            $(this).css('color','black').siblings().css('color','black');
        }else{
            $(this).css('color','red').siblings().css('color','black');
        }

    });
});

