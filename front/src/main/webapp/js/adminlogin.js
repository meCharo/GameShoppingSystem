function login() {
    var username = document.getElementById("username").value;
    var password = document.getElementById("password").value;

    $.post("/api/user/admin/login", {username: username, password: password}, function (result) {
        if (result.success) {
            window.location.href = "/api/user/admin/home"
        } else {
            alert(result.msg);
        }
    })
}