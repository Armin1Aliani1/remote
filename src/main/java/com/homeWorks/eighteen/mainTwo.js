$(document).ready(function () {
    $("div").hover(function () {
        $(this).css("background-color", "blue");
    }, function () {
        $(this).css("background-color", "red");
    });
});