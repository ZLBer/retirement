/**
 * 绑定事件
 */
$(function () {
    getData($('#test>#submit'),'/student/dotest');
    addCheckBox($("#data-table-filter"),fields,updateTableOption);
    addRadio($("#graphic-x"),fields,updateGraphic);
    $('#export-to-excel').click(function () {
        if (!verifiedData()){
            return;
        }
        generateExcelTitle();
        generateExcelBody();
        JSONToExcelConvertor(JSON_DATA.data,"人员信息表",JSON_DATA.title);
    })
});

function verifiedData() {
    if (tableOptions.data===undefined||tableOptions.data.length==0){
        alert("还没有数据，请先查询！");
        return false;
    }
    return true;
}
/**
 * 数据表格
 */
//{"value":"ID", "type":"ROW_HEADER_HEADER", "datatype":"string"},
function generateExcelTitle(){
    for (var i=0;i<fields.length;i++){
        var field = fields[i];
        var a = {
            "value":field.title,
            "type":"ROW_HEADER",
            "datatype":"string"
        };
        JSON_DATA.title.push(a);
    }
}
function generateExcelBody() {
    for (var i=0;i<tableOptions.data.length;i++){
        var row = [];
        var data = tableOptions.data[i];
        for (var pname in data){
            var c = {
                "value":data[pname],
                "type":"ROW_HEADER"
            };
            row.push(c);
        }
        JSON_DATA.data.push(row);
    }
}
/**
 * 向指定元素增加checkbox
 * @param element
 * @param array
 * @param func
 */
function addCheckBox(element,array,func) {
    for (var i=0;i<array.length;i++) {
        element.append(array[i].title + "<input type='checkbox' name='table-field-option' value='" + i + "' checked>&nbsp;&nbsp;&nbsp;")
    }
    var inputs = element.children("input");
    for (var input in inputs){
        $(input).change(func);
    }
}

/**
 * 依照复选框改变表格列选项
 */
function updateTableOption() {
    if (!verifiedData()){
        return;
    }
    var a = $("input[name=table-field-option]");
    var newCol = new Array({checkbox:true});
    for (var i=0;i<a.length;i++){
        if ($(a[i]).prop("checked")) {
            newCol.push(fields[i]);
        }
    }
    tableOptions.cols[0] = newCol;
    table.render(tableOptions);
}
var fields = [
    {field:'studentId',title:'ID',width:100,sort:true},
    {field:'studentName',title:'姓名',width:100},
    {field:'studentSex',title:'性别',width:100},
    {field:'studentCollege',title:'学院',width:100},
    {field:'studentMajor',title:'专业',width:100},
    {field:'studentTel',title:'电话',width:100},
    {field:'studentEmail',title:'邮箱',width:100},
    {field:'studentQq',title:'QQ',width:100}
];
var table;
var tableOptions = {
    elem:'#dataTable',
    height:315,
    cols:[ [
        {checkbox:true},
        {field:'studentId',title:'ID',width:100,sort:true},
        {field:'studentName',title:'姓名',width:100},
        {field:'studentSex',title:'性别',width:100},
        {field:'studentCollege',title:'学院',width:100},
        {field:'studentMajor',title:'专业',width:100},
        {field:'studentTel',title:'电话',width:100},
        {field:'studentEmail',title:'邮箱',width:100},
        {field:'studentQq',title:'QQ',width:100}
    ] ],
    page:true,
    width:900
};
layui.use('table', function(){
    table = layui.table;
    table.render(tableOptions)
});

/**
 * 获取数据
 * @param element
 * @param url
 */
function getData(element,url) {
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
        $.post(url,param,function (data,status,xhr) {
            if(status==="success") {
                tableOptions.data = data;
//                                layui.use('table', function(){
//                                    var table = layui.table;
//                                    table.render(tableOptions);
//                                });
                table.render(tableOptions)
            }else{
                layer.msg('请求失败，请重试',{icon:2,time:time})
            }
        })
    })
}


/**
 * 图表
 */
function addRadio(element,array,func) {
    for (var i=0;i<array.length;i++) {
        element.append(array[i].title + "<input type='radio' name='graphic-x-option' value='" + i + "'>&nbsp;&nbsp;&nbsp;")
    }
    var inputs = element.children("input");
    for (var input in inputs){
        $(input).change(func);
    }
}

function processData(fieldName){
    var a = {};
    for (var i=0;i<tableOptions.data.length;i++){
        var value = tableOptions.data[i][fieldName];
        if (a.hasOwnProperty(value)){
            a[value] += 1;
        }else{
            a[value] = 1;
        }
    }
    var array = [[],[]];
    for (var name in a){
        array[0].push(name);
        array[1].push(a[name]);
    }
    return array;
}
function updateGraphic() {
    if (!verifiedData()){
        return;
    }
    var a = $("input[name=graphic-x-option]:checked").val();
    option.legend.data = new Array(fields[a].title);
    var array = processData(fields[a].field);
    option.xAxis.data = array[0];
    option.series[0].name = fields[a].title;
    option.series[0].data = array[1];
    myChart.setOption(option);
}
// 基于准备好的dom，初始化echarts实例
var myChart = echarts.init(document.getElementById('main'));

// 指定图表的配置项和数据
var option = {
    title: {
        text: '柱状图统计'
    },
    tooltip: {},
    legend: {
        data:['']
    },
    xAxis: {
        //data: ["衬衫","羊毛衫","雪纺衫","裤子","高跟鞋","袜子"]
        data: []
    },
    yAxis: {},
    series: [{
        name: '',
        type: 'bar',
        //data: [5, 20, 36, 10, 10, 20]
        data: []
    }]
};

// 使用刚指定的配置项和数据显示图表。
myChart.setOption(option);