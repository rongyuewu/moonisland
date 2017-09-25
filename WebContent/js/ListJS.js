
$(document).ready(function() {
    $(".col-xs-8").hide();
    $("ul li:first").addClass("ul li:hover").show();
    $(".col-xs-8:first").show();

    $("ul li").click(function() {
        $("ul li").removeClass("ul li:hover");
        $(this).addClass("ul li:hover");
        $(".col-xs-8").hide();
        var activeTab = $(this).find("a").attr("href");
        $(activeTab).fadeIn();
        return false;
    });
});