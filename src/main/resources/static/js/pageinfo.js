function getpage(url,num) {
    $("#prePage").on('click',function () {
        if(Number($("#pageNums").val())<=1){
            myajax_c(url+"?pageNum=1","GET")
        }else {
            myajax_c(url+"?pageNum="+(Number($("#pageNums").val())-1),"GET")
        }
    })
    $("#nextPage").on('click',function () {
        if(Number($("#pageNums").val())>=num){
            myajax_c(url+"?pageNum="+num,"GET")
        }else {
            // $(window).attr('location','/CommentatorContract?pageNum='+(Number(urlpage)+1));
            myajax_c(url+"?pageNum="+(Number($("#pageNums").val())+1),"GET")
        }
    })
    $("#pageJump").on('click',function () {
        if(Number($("#pageNums").val())<=1){
            myajax_c(url+"?pageNum=1","GET")
        }else if(Number($("#pageNums").val())>=num){
            myajax_c(url+"?pageNum="+num,"GET")
        }else{
            // $(window).attr('location','/CommentatorContract?pageNum='+$("#pageNums").val());
            myajax_c(url+"?pageNum="+Number($("#pageNums").val()),"GET")

        }
    })
    $("body").keydown(function() {
        if (event.keyCode == "13") {
            $('#pageJump').click();
        }
    });
}

