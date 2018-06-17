function cancel() {
    window.location.href="/welcome/loginpage"
}

function register() {
    var UserBo={};
        UserBo.username = $("#username").val();
        UserBo.password = $("#password").val();
        UserBo.nickname = $("#nickname").val();
    $.ajax({
        type:"post",
        url:"/welcome/register",
        data:UserBo,
        success:function (data) {
            if (data.status == 1){
                window.location.href="/welcome/firstPage"
            } else{
                alert("Please enter the correct username or password");
            }
        }
    })
}