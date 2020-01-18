//点击判断
var user = {
    username:"",
    password:""
}
$('#register').click(function () {
    if($('#username').val().length>0 && $('#password').val().length>0) {
        //获取注册信息
        user.username = $('#username').val();
        user.password = $('#password').val();
        //注册
        register(user);
    }else{
        alert("请输入用户名称或者密码");
    }
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
