console.log("进入tag.js")
//获取所有tag
$.ajax({
    type:'get',
    url:'/tag/getTags',
    dataType:'json',
    success:function (res) {
        console.log(res);
        if(res.rtnCode == 200){
            render_tag(res.data);
        }
    },
    error:function () {

    }
});
//渲染tag
function render_tag(tagInfo) {
    console.log("进入render_tag方法");
    var tagAll = '';
    for(i=0;i<tagInfo.length;i++){
        tagAll += '<input type="text" value='+tagInfo[i].tagname+' id = '+tagInfo[i].id+'/>';
    }
    $("#show-tag").html(tagAll); //通过div的id给div赋值！
}