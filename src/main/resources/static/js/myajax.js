function myajax_c(url,type,url_upload,url_download){
    $.ajax({
        type: type,
        url: url,
        dataType: "json",
        success: function (data) {
            var dataObj = data.list;
            con = "";
            $.each(dataObj, function (index, item) {
                var toFile = '否';
                if (item.tofile == 1) {
                    toFile = '是';
                } else {
                    toFile;
                }
                con += "<tr>" +
                    "<td><input name=\"ids\" value=\"1\" type=\"checkbox\"></td>" +
                    "<td>" + item.id + "</td>" +
                    "<td>" + item.aName + "</td><td>" +
                    "" + item.stageName + "</td>" +
                    "<td>" + item.fromtime + "</td>" +
                    "<td>" + item.totime + "</td>" +
                    "<td>" + item.tel + "</td>" +
                    "<td>" + toFile + "</td>" +
                    "<td><div class=\"am-btn-toolbar\">" +
                    "<div class=\"am-btn-group am-btn-group-xs\">" +
                    "<button id='file' data-id='" + item.id + "' data-name='" + item.filehost + "' type=\"button\" class=\"file am-btn am-btn-default am-btn-xs am-text-secondary btnEdit\">" +
                    "<span class=\"am-icon-pencil-square-o\"></span> 操作</button></div></div></td></tr>"
                //"<td><div class=\"am-btn-toolbar\"><div class=\"am-btn-group am-btn-group-xs\"><button type=\"button\" class=\"am-btn am-btn-default am-btn-xs am-text-secondary btnEdit\"><span class=\"am-icon-pencil-square-o\"></span> 编辑</button></div></div></td></tr>"
            });
            $("#tUser").html(con);
            $("#pageNums").val(data.pageNum)
            $(".file").click(function () {
                var fileHost = $("#file").attr("data-name");
                var id = $("#file").attr("data-id");
                $.jq_Panel({
                    title: "附件管理",
                    iframeWidth: 500,
                    iframeHeight: 300,
                    content: '<div class="am-btn-toolbar">' +
                        '<div class="am-btn-group am-btn-group-xs">' +
                        '<form method="POST" enctype="multipart/form-data" action="'+url_upload+'">' +
                        '<input type="file" name="file" style="width: 230px;height: 25px;"/>' +
                        '<input type="submit" value="上传" style="background:#df3834;">' +
                        '<input type="hidden" name="id" value="'+id+'" >' +
                        '</form>' +
                        '<button type="button" data-name="'+fileHost+'" class="am-btn am-btn-default am-btn-xs am-text-danger am-hide-sm-only down">' +
                        '<span class="am-icon-trash-o">' +
                        '</span> 下载' + '</button></div></div>\n'
                });
                $(".down").click(function () {
                    var fileName=($(this).attr("data-name"));
                    window.location.href=url_download+"?fileName="+fileName;
                });
            });
        }
    })
}
function searchName(url,aname,type,url_upload,url_download){
    $.ajax({
        type: type,
        url: url,
        data:{name:aname},
        dataType: "json",
        success: function (data) {
            var dataObj = data;
            con = "";
            $.each(dataObj, function (index, item) {
                var toFile = '否';
                if (item.tofile == 1) {
                    toFile = '是';
                } else {
                    toFile;
                }
                con += "<tr>" +
                    "<td><input name=\"ids\" value=\"1\" type=\"checkbox\"></td>" +
                    "<td>" + item.id + "</td>" +
                    "<td>" + item.aName + "</td><td>" +
                    "" + item.stageName + "</td>" +
                    "<td>" + item.fromtime + "</td>" +
                    "<td>" + item.totime + "</td>" +
                    "<td>" + item.tel + "</td>" +
                    "<td>" + toFile + "</td>" +
                    "<td><div class=\"am-btn-toolbar\">" +
                    "<div class=\"am-btn-group am-btn-group-xs\">" +
                    "<button id='file' data-id='" + item.id + "' data-name='" + item.filehost + "' type=\"button\" class=\"file am-btn am-btn-default am-btn-xs am-text-secondary btnEdit\">" +
                    "<span class=\"am-icon-pencil-square-o\"></span> 操作</button></div></div></td></tr>"
                //"<td><div class=\"am-btn-toolbar\"><div class=\"am-btn-group am-btn-group-xs\"><button type=\"button\" class=\"am-btn am-btn-default am-btn-xs am-text-secondary btnEdit\"><span class=\"am-icon-pencil-square-o\"></span> 编辑</button></div></div></td></tr>"
            });
            $("#tUser").html(con);
            $("#pageNums").val(data.pageNum)
            $(".file").click(function () {
                var fileHost = $("#file").attr("data-name");
                var id = $("#file").attr("data-id");
                $.jq_Panel({
                    title: "附件管理",
                    iframeWidth: 500,
                    iframeHeight: 300,
                    content: '<div class="am-btn-toolbar">' +
                        '<div class="am-btn-group am-btn-group-xs">' +
                        '<form method="POST" enctype="multipart/form-data" action="'+url_upload+'">' +
                        '<input type="file" name="file" style="width: 230px;height: 25px;"/>' +
                        '<input type="submit" value="上传" style="background:#df3834;">' +
                        '<input type="hidden" name="id" value="'+id+'" >' +
                        '</form>' +
                        '<button type="button" data-name="'+fileHost+'" class="am-btn am-btn-default am-btn-xs am-text-danger am-hide-sm-only down">' +
                        '<span class="am-icon-trash-o">' +
                        '</span> 下载' + '</button></div></div>\n'
                });
                $(".down").click(function () {
                    var fileName=($(this).attr("data-name"));
                    window.location.href=url_download+"?fileName="+fileName;
                });
            });
        }
    })
}