console.log("进入articleDetail.js");
var articleId = getArticleId();
$.ajax({
    type:'get',
    url:'/article/findArticle/'+articleId+'',
    dataType:'json',
    success:function (res) {
        console.log(res);
        if(res.rtnCode == 200){
            render_header(res.data.articleTitle)
            render_message(res.data);
            render_showImg();
            render_content(res.data.articleContent)
        }
    },
    error:function () {

    }
});
function getArticleId() {
    console.log(location.href);
    var url = location.href;
    var index=url.lastIndexOf("/");
    articleId=url.substring(index+1,url.length);
    return articleId;
}
//渲染标题
function render_header(articleTitle) {
    var titleDiv = '<h1 class="ui header">'+articleTitle+'</h1>';
    $("#article-header").html(titleDiv);
}
function render_message(articleInfo) {
    var messageDiv = '<div class=" ui medium horizontal list">\n' +
        '                        <div class="item">\n' +
        '                            <i class="user icon"></i>'+articleInfo.author+'\n' +
        '                        </div>\n' +
        '                        <div class="item">\n' +
        '                            <i class="calendar icon"></i>'+articleInfo.publishDate+'\n' +
        '                        </div>\n' +
        '                     </div>';
    $("#article-message").html(messageDiv);
}
function render_showImg() {
    var showImageDiv = '<img src="/img/1005.jpg"  class="ui fluid rounded image">';
    $('#article-showImg').html(showImageDiv);
}
function render_content(articleContent) {
    var contentDiv = '<p>'+articleContent+'</p>';
    $('#article-content').html(contentDiv);
}