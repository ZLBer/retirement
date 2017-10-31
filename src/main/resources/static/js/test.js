var selectorAndInputs = [6];
var addButtons;
var removeButtons;
/**
 * 绑定事件
 */
$(function () {
    // initTableOptions();
    getSelectorsAndInputs();
    bindOnAddAndRemoveButtion();
    getData($('#test').find('#submit'),'/student/dotest');
    addCheckBox($("#data-table-filter"),fields,updateTableOption);
    addRadio($("#graphic-x"),fields,updateGraphic);
    $('#export-to-excel').click(function () {
        if (!verifiedData()){
            return;
        }
        generateExcelTitle();
        generateExcelBody();
        JSONToExcelConvertor(JSON_DATA.data,"人员信息表",JSON_DATA.title);
    });
});
/**
 *
 * @param element
 */
function bindInputNameWithSelectors(element) {
    var name = $(element).prop("value");
    var inputs = $(element).siblings("input");
    $(inputs[0]).prop("name",name);
    $(inputs[1]).prop("name",name+"2");
    var selects = $(element).siblings("select");
    $(selects[0]).prop("name",name+"Type");
    $(selects[1]).prop("name",name+"Type2");
}
/**
 *
 */
function bindOnAddAndRemoveButtion() {
    addButtons = $(".add-field");
    removeButtons = $(".remove-field");
}
function add(element) {
    for (var i=0;i<addButtons.length;i++){
        if (addButtons[i]===element){
            $(addButtons[i]).parent().append(selectorAndInputs[i].clone());
            return;
        }
    }
}
function removeS(element) {
    for (var i=0;i<removeButtons.length;i++){
        if (removeButtons[i]===element){
            $(element).siblings(".selectors-and-inputs:last").remove();
            return;
        }
    }
}
/**
 * 获取每个表的查询字段原型html
 */
function getSelectorsAndInputs() {
    var a = $(".data-filter");
    for (var i=0;i<a.length;i++){
        selectorAndInputs[i]=$(a[i]).children(".selectors-and-inputs").clone();
    }
}
/**
 * 验证数据有效性
 * @returns {boolean}
 */
function verifiedData() {
    if (tableOptions.data===undefined||tableOptions.data.length===0){
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
    var i;
    for (i=0;i<array.length;i++) {
        element.append(array[i].title + "<input type='checkbox' name='table-field-option' value='" + i + "' checked>&nbsp;&nbsp;&nbsp;")
    }
    var inputs = element.children("input");
    for (i=0;i<inputs.length;i++){
        $(inputs[i]).change(func);
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
    newCol.push({fixed: 'right', width:150, align:'center', toolbar: '#barDemo'});
    tableOptions.cols[0] = newCol;
    table.render(tableOptions);
}
function initTableOptions() {
    for (var a in fields){
        tableOptions.cols[0].push(a);
    }
}
var fields = [
    //基本信息字段7
    {field:'name',title:'姓名',width:100},
    {field:'sex',title:'性别',width:100},
    {field:'nation',title:'民族',width:100},
    {field:'nativePlace',title:'籍贯',width:100},
    {field:'birthday',title:'出生年月',width:100},
    {field:'idNumber',title:'身份证号',width:100},
    {field:'category',title:'人员类别',width:100},
    //政治面貌信息3
    {field:'politicsStatus',title:'政治面貌',width:100},
    {field:'joinpartyTime',title:'民族',width:100},
    {field:'conversionTime',title:'转正时间',width:100},
    //原工作信息10
    {field:'identity',title:'身份',width:100},
    {field:'educationLevel',title:'文化水平',width:100},
    {field:'originWorkplace',title:'原工作单位',width:100},
    {field:'originDuties',title:'原职务',width:100},
    {field:'orginDutiesLevel',title:'原职务级别',width:100},
    {field:'originProfessional',title:'原职称',width:100},
    {field:'originProfessional_level',title:'原职务级别',width:100},
    {field:'treatment',title:'享受待遇',width:100},
    {field:'timeWork',title:'参加工作时间',width:100},
    {field:'timeRetirement',title:'离退休时间',width:100},
    //现工作信息20
    // {field:'partyBranch',title:'身份',width:100},
    // {field:'administration',title:'行政组',width:100},
    // {field:'basicpartyDuties',title:'基层党组织职务',width:100},
    // {field:'timeBasicparty',title:'基层党组织职务起时间',width:100},
    // {field:'endtimeBasicparty',title:'基层党组织职务止时间',width:100},
    // {field:'administrationDuties',title:'行政组职务',width:100},
    // {field:'timeAdministration',title:'行政组工作起时间',width:100},
    // {field:'endtimeAdministration',title:'行政组工作止时间',width:100},
    // {field:'committeeDuties',title:'关工委工作职务',width:100},
    // {field:'timeCommittee',title:'关工委工作起时间',width:100},
    // {field:'endtimeCommittee',title:'关工委工作起时间',width:100},
    // {field:'steeringMember',title:'督导组成员',width:100},
    // {field:'timeSteering',title:'导组督成员起时间',width:100},
    // {field:'endtimeSteering',title:'导组督成员止时间',width:100},
    // {field:'organizationMember',title:'特邀党建组织员',width:100},
    // {field:'timeOrganization',title:'特邀党建组织起时间',width:100},
    // {field:'endtimeOrganization',title:'特邀党建组织止时间',width:100},
    // {field:'corporationDuties',title:'老年文体社团职务',width:100},
    // {field:'timeCorporation',title:'老年文体社团职务起时间',width:100},
    // {field:'endtimeCorporation',title:'老年文体社团职务止时间',width:100},
    //联系信息8
    {field:'homeAddress',title:'家庭住址',width:100},
    {field:'phoneHome',title:'家庭电话',width:100},
    {field:'phoneOwn',title:'手机号码',width:100},
    {field:'phoneChildren',title:'子女电话',width:100},
    {field:'phoneOther',title:'其他联系电话',width:100},
    {field:'qq',title:'QQ',width:100},
    {field:'wechat',title:'微信',width:100},
    {field:'email',title:'邮箱',width:100},
    //备注信息4
    {field:'spouse',title:'配偶',width:100},
    {field:'statusChildren',title:'子女情况',width:100},
    {field:'livingCondition',title:'健在情况',width:100},
    {field:'statusOther',title:'其他情况',width:100}
];
var table;
var tableOptions = {
    elem:'#dataTable',
    height:450,
    cols:[ [
        {checkbox:true},
        //基本信息字段7
        {field:'name',title:'姓名',width:100},
        {field:'sex',title:'性别',width:100},
        {field:'nation',title:'民族',width:100},
        {field:'nativePlace',title:'籍贯',width:100},
        {field:'birthday',title:'出生年月',width:100},
        {field:'idNumber',title:'身份证号',width:100},
        {field:'category',title:'人员类别',width:100},
        //政治面貌信息3
        {field:'politicsStatus',title:'政治面貌',width:100},
        {field:'joinpartyTime',title:'民族',width:100},
        {field:'conversionTime',title:'转正时间',width:100},
        //原工作信息10
        {field:'identity',title:'身份',width:100},
        {field:'educationLevel',title:'文化水平',width:100},
        {field:'originWorkplace',title:'原工作单位',width:100},
        {field:'originDuties',title:'原职务',width:100},
        {field:'orginDutiesLevel',title:'原职务级别',width:100},
        {field:'originProfessional',title:'原职称',width:100},
        {field:'originProfessional_level',title:'原职务级别',width:100},
        {field:'treatment',title:'享受待遇',width:100},
        {field:'timeWork',title:'参加工作时间',width:100},
        {field:'timeRetirement',title:'离退休时间',width:100},
        //现工作信息20
        // {field:'partyBranch',title:'身份',width:100},
        // {field:'administration',title:'行政组',width:100},
        // {field:'basicpartyDuties',title:'基层党组织职务',width:100},
        // {field:'timeBasicparty',title:'基层党组织职务起时间',width:100},
        // {field:'endtimeBasicparty',title:'基层党组织职务止时间',width:100},
        // {field:'administrationDuties',title:'行政组职务',width:100},
        // {field:'timeAdministration',title:'行政组工作起时间',width:100},
        // {field:'endtimeAdministration',title:'行政组工作止时间',width:100},
        // {field:'committeeDuties',title:'关工委工作职务',width:100},
        // {field:'timeCommittee',title:'关工委工作起时间',width:100},
        // {field:'endtimeCommittee',title:'关工委工作起时间',width:100},
        // {field:'steeringMember',title:'督导组成员',width:100},
        // {field:'timeSteering',title:'导组督成员起时间',width:100},
        // {field:'endtimeSteering',title:'导组督成员止时间',width:100},
        // {field:'organizationMember',title:'特邀党建组织员',width:100},
        // {field:'timeOrganization',title:'特邀党建组织起时间',width:100},
        // {field:'endtimeOrganization',title:'特邀党建组织止时间',width:100},
        // {field:'corporationDuties',title:'老年文体社团职务',width:100},
        // {field:'timeCorporation',title:'老年文体社团职务起时间',width:100},
        // {field:'endtimeCorporation',title:'老年文体社团职务止时间',width:100},
        //联系信息5
        {field:'homeAddress',title:'家庭住址',width:100},
        {field:'phoneHome',title:'家庭电话',width:100},
        {field:'phoneOwn',title:'手机号码',width:100},
        {field:'phoneChildren',title:'子女电话',width:100},
        {field:'phoneOther',title:'其他联系电话',width:100},
        {field:'qq',title:'QQ',width:100},
        {field:'wechat',title:'微信',width:100},
        {field:'email',title:'邮箱',width:100},
        //备注信息4
        {field:'spouse',title:'配偶',width:100},
        {field:'statusChildren',title:'子女情况',width:100},
        {field:'livingCondition',title:'建在情况',width:100},
        {field:'statusOther',title:'其他情况',width:100},
        {fixed: 'right', width:150, align:'center', toolbar: '#barDemo'}
    ] ],
    page:true,
    width:1300
};
layui.use('table', function(){
    table = layui.table;
    table.render(tableOptions);
    table.on('tool(test)', function(obj){ //注：tool是工具条事件名，test是table原始容器的属性 lay-filter="对应的值"
        var data = JSON.stringify(obj.data); //获得当前行数据
        var layEvent = obj.event; //获得 lay-event 对应的值
        var tr = obj.tr; //获得当前行 tr 的DOM对象
        if(layEvent === 'detail'){ //查看
            $.post('/student/detail', {rowData:data,dataType:'html'}, function(str){
                layer.open({
                    type: 1,
                    content: str,//注意，如果str是object，那么需要字符拼接。
                    area:'860px'
                });
            });
        }else if (layEvent==='download'){
            /*$.post('/student/download', {data:data,dataType:'html'}, function(str){
                layer.open({
                    type: 1,
                    content: str //注意，如果str是object，那么需要字符拼接。
                });
            });*/
            window.location.href="download/"+obj.data.id;
        }
    });
});
/**
 * 获取数据
 * @param element
 * @param url
 */
function getData(element,url) {
    var time = 1500;
    element.on("click",function () {
        var inputs = element.parent().find("input");
        var selectors = inputs.next();
        var param = {};
        var input;
        var i;
        for(i=0;i<inputs.length;i++){
            input = $(inputs[i]);
            param[input.attr("name")]=input.val();
        }
        for(i=0;i<selectors.length;i++){
            input = $(selectors[i]);
            param[input.attr("name")]=input.val();
        }
        $.get(url,param,function (data,status,xhr) {
            if(status==="success") {
                tableOptions.data = data;
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
    var i;
    for (i=0;i<array.length;i++) {
        element.append(array[i].title + "<input type='radio' name='graphic-x-option' value='" + i + "'>&nbsp;&nbsp;&nbsp;")
    }
    var inputs = element.children("input");
    for (i=0;i<inputs.length;i++){
        $(inputs[i]).change(func);
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

