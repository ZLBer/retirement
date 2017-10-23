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