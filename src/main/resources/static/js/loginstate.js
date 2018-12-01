$(function () {
    $.ajax({
        type: "POST",
        url: "/loginstate",
        dataType: "json",
        statusCode:{
            200:function () {
                // $(location).attr('href', 'index.html');
            },
            400:function () {
                $(location).attr('href', 'login.html');
            }
        }
    })
})