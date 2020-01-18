//点击判断
var user = {
    username:"",
    password:""
}
$('#register').click(function () {
    //获取注册信息
    user.username = $('#username').val();
    user.password = $('#password').val();
    //注册
    register(user);
});
function register(user) {
    $.ajax({
        type:'post',
        url:'/user/addUser',
        data:JSON.stringify(user),
        dataType:'json',
        contentType: 'application/json',
        success:function (res) {
            console.log(res);
            if(res.rtnCode == 200){
                window.location.href = "/blog/index";
            }
        },
        error:function () {

        }
    });
}
