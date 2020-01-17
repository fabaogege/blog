console.log("进入showArticle.js")
var articleId = '';//文章id
//获取文章List
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
//填充文章展览
function render_show_article(articleInfo) {
    console.log("进入render_show_article方法");
    var showArticle = '';
    var articleContent = '';
    var articleMessage = '';
    for(i=0;i<articleInfo.length;i++){
        articleContent += '<div class="item" id='+articleInfo[i].articleId+'>'+
            '    <div class="image">' +
            '      <img src="../img/1005.jpg">' +
            '    </div>'+
                            '<div class="content">'+
                '                       <a class="header" id ="article-header" onclick="toArticleDetail(this)">'+articleInfo[i].articleTitle+'</a>' +
                '                    <div class="description"> <p>'+articleInfo[i].articleTabloid+'</p> </div>'+
            '                       <div class="extra">' +

            '                                        <div class="ui medium horizontal link list">\n' +
            '                                            <div class="item">\n'+
            '                                                <div "><a href="#" class="header">'+articleInfo[i].author+'</a></div>\n' +
            '                                            </div>\n' +
            '                                            <div class="item">\n' +
            '                                                <i class="calendar icon"></i> '+articleInfo[i].updateDate+'\n' +
            '                                            </div>\n' +
            '                                        </div>\n' +

            '</div>' +
            '</div>'+
            '</div>';
    }
    showArticle = articleContent+articleMessage;
    $("#show-article").html(showArticle); //通过div的id给div赋值！
}
function render_count_article(articleLength) {
    console.log("进入render_count_article方法");
    var artclesCount =articleLength;
    $("#articleLength").html(artclesCount)
}
//跳转指定文章详情页面
$('#article-header').click(function () {
    console.log('这个div的id:'+$('.item').attr("id"));
    /*articleId ='';*/
    /*href="/blog/articleDetail"*/
});
function toArticleDetail(headerA) {
    articleId = $(headerA).parent().parent().attr("id");
    window.location.href = "/blog/articleDetail/"+articleId;
}
/*function render_show_article(articleInfo) {
    console.log("进入render_show_article方法");
    var showArticle = '';
    for(i=0;i<articleInfo.length;i++){
        articleAll += '<input type="text" value='+articleInfo[i].articleTitle+' id = '+articleInfo[i].id+'/>';
    }
    $("#show-article").html(articleAll); //通过div的id给div赋值！
}*/