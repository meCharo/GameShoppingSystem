$(
    function () {
        var ul = document.getElementById("leixing");
        $.post("/api/game/kind/all",
            function (result) {
                var i = 0;
                var lli = document.createElement("lli");
                lli.innerHTML = "<li>Kinds</li>"
                ul.appendChild(lli);
                while (result.data[i]) {
                    var li = document.createElement("li");
                    var id = result.data[i].id;
                    li.innerHTML = "<a href='/api/game/kind/" + id + "/games" + "'><li class='list-group-item'><div class='bs'>" + result.data[i].name + "</div></li></a>";
                    ul.appendChild(li);
                    i++;
                }

            })
    }
);