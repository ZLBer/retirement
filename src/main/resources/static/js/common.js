var layer;
var element;
var table;
$(function () {
    //调用layer模块
    layui.use('layer',function () {
        layer = layui.layer;
    })
    layui.use('element',function () {
        element = layui.element;
    })
    // layui.use('table', function(){
    //     table = layui.table;
    // });
    bindAjaxSubmitTo($("#modifyPwd>#submit"),"/modifyPwd");
    bindAjaxSubmitTo($("#personalInfo>#submit"),"/student/perfectPersonalInfo");
    bindAjaxSubmitTo($("#addSubject>#submit"),"/teacher/saveSubject");
    seletAll($("#selectAll1"));
    seletAll($("#selectAll2"));
    seletAll($("#selectAll3"));
    seletAll($("#selectAll4"));
    seletAll($("#selectAll5"));
    seletAll($("#selectAll6"));
    progressbar();
    //bindAjaxSubmitTo($("#test>#submit"),"/student/dotest");
});
//通用绑定按钮异步提交操作
function bindAjaxSubmitTo(element,url) {
    var time = 1500;
    element.on("click",function () {
        var inputs = element.siblings("input");
        var selectors = element.siblings("select");
        var param = {};
        for(var i=0;i<inputs.length;i++){
            var input = $(inputs[i]);
            param[input.attr("name")]=input.val();
        }
        for(var i=0;i<selectors.length;i++){
            var input = $(selectors[i]);
            param[input.attr("name")]=input.val();
        }
        $.post(url,param,function (data,status) {
            if(status==="success") {
                if (data.state == 1) {
                    layer.msg(data.msg, {icon: 1, time:time})
                }else{
                    layer.msg(data.msg, {icon: 2, time: time})
                }
            }else{
                layer.msg('请求失败，请重试',{icon:2,time:time})
            }
        })
    })
}
function seletAll(element){
   element.click(  function(){
        var checkboxName="i"+element.prop("name");
        if(this.checked){
            $("input[name="+checkboxName+"]").prop('checked', true)
        }else{
            $("input[name="+checkboxName+"]").prop('checked', false)
        }
    })
}
function progressbar() {
    var time = 1500;

    $("#submitExcel").click( function(){
        $.ajax({
            url: "/admin/uploadExcel",
            type: 'POST',
            cache: false,
            data: new FormData($('#infoLogoForm')[0]),
            processData: false,
            contentType: false,
            dataType:"json",
            success : function(data) {
                if (data.state == 1) {
                    layer.msg('上传成功，正在处理数据',{icon:1,time:time})
                    $("#percent").show();
                  var  interval= window.setInterval(function(){
                        $.ajax({
                            url: "/admin/percent",
                            type: 'GET',
                            processData: false,
                            contentType: false,
                            dataType:"json",
                            success : function(data) {
                                if (data.state == 1) {

                                    if(data.msg="100%")
                                    clearInterval(interval);
                                    element.progress('percentChildren',data.msg)
                                }
                                }
                            })

                    },1000);
                } else {
                    layer.msg('请求失败，请重试',{icon:2,time:time})
                }
            }
        }).on(function () {

        });
    });
}