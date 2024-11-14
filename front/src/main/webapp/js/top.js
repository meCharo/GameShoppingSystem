function outlogin() {
    $.post("/api/user/logout", function (result) {
            if (result.success) {
                location.reload("true");
            } else {
                alert(result.msg);
            }
        }
    )
}
function search() {
    var info = document.getElementById("searchbox").value;
    $.post("/api/game/search", {info: info}, function (result) {
        if (result.success) {
            window.open("/api/game/search")
        } else {
            alert(result.msg);
        }
    })
}