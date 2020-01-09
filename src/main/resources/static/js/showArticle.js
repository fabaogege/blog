console.log("进入showArticle.js")
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
            '      <img src="https://unsplash.it/800/450?image=1005">' +
            '    </div>'+
                            '<div class="content">'+
                '                       <a class="header">'+articleInfo[i].articleTitle+'</a>' +
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
    /*for(i=0;i<articleInfo.length;i++){
        articleContent += '<div class="ui padded vertical segment m-padded-tb-large" id='+articleInfo[i].articleId+'>'+
            '<div class="ui mobile reversed stackable grid">' +
            '<!--左侧文章信息-->'+
                '<div class="eleven wide column">' +
                    '<h2 ><a href="#" class="black">'+articleInfo[i].articleTitle+'</a></h2>'+
                '<p class = "m-text">'+articleInfo[i].articleTabloid+'</p>'+
                '<div class="ui grid">\n' +
            '                                    <div class="eleven wide column">\n' +
            '                                        <div class="ui mini horizontal link list">\n' +
            '                                            <div class="item">\n'+
            '                                                <div "><a href="#" class="header">'+articleInfo[i].author+'</a></div>\n' +
            '                                            </div>\n' +
            '                                            <div class="item">\n' +
            '                                                <i class="calendar icon"></i> '+articleInfo[i].updateDate+'\n' +
            '                                            </div>\n' +
                                                        /!*
            '                                            <div class="item">\n' +
            '                                                <i class="eye icon"></i> 2342\n' +
            '                                            </div>\n' +
                                                        *!/
            '                                        </div>\n' +
            '                                    </div>\n' +
            '                                    <div class="right aligned five wide column">\n' +
            '                                        <a href="#" target="_blank" class="ui teal basic label m-padded-tiny m-text-thin">阅读全文</a>\n' +
            '                                    </div>\n' +
            '                                </div>'+
                '</div>'+
            '<!--右侧图片-->'+
            '<div class="five wide column">\n' +
            '                                <a href="#" target="_blank">\n' +
            '                                    <img src="https://unsplash.it/800/450?image=1005" alt="" class="ui rounded image">\n' +
            '                                </a>\n' +
            '                            </div>'+
                '</div>'+
            '</div>';
    }*/
    showArticle = articleContent+articleMessage;
    $("#show-article").html(showArticle); //通过div的id给div赋值！
}
function render_count_article(articleLength) {
    console.log("进入render_count_article方法");
    var artclesCount =articleLength;
    $("#articleLength").html(artclesCount)
}
/*function render_show_article(articleInfo) {
    console.log("进入render_show_article方法");
    var showArticle = '';
    for(i=0;i<articleInfo.length;i++){
        articleAll += '<input type="text" value='+articleInfo[i].articleTitle+' id = '+articleInfo[i].id+'/>';
    }
    $("#show-article").html(articleAll); //通过div的id给div赋值！
}*/