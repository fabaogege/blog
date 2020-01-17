console.log("进入showArticle.js")
//获取所有tag
$.ajax({
    type:'get',
    url:'/article/findArticleList',
    dataType:'json',
    success:function (res) {
        console.log(res);
        if(res.rtnCode == 200){
            render_show_article(res.data);
        }
    },
    error:function () {

    }
});
//获取博客分页信息
$.ajax({
    type:'get',
    url:'/article/countArticle',
    dataType:'json',
    success:function (res) {
        console.log(res);
        if(res.rtnCode == 200){
            render_count_article(res.data);
        }
    },
    error:function () {

    }
});
function render_show_article(articleInfo) {
    console.log("进入render_show_article方法");
    var articleAll = '';
    for(i=0;i<articleInfo.length;i++){
        articleAll += '<input type="text" value='+articleInfo[i].articleTitle+' id = '+articleInfo[i].id+'/>';
    }
    $("#show-article").html(articleAll); //通过div的id给div赋值！
}
function render_count_article(articleLength) {
    console.log("进入render_count_article方法");
    var artclesCount =articleLength;
    $("#articleLength").html(artclesCount)
}