<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@ include file="common/head.jsp" %>
    <link href="/css/personal.css" rel="stylesheet">
    <script src="/js/personal.js"></script>
    <title>个人中心</title>
</head>

<body>
<%@ include file="common/top.jsp" %>
<div class="row">
    <div class="col-md-6 col-md-offset-3">
        <div class="row divcolor" id="uname">
            <h3>${user} >> 个人资料</h3>
        </div>
        <div class="row">
            <!--左侧资料列-->
            <div class="col-md-7 col-md-offset-1 ziti">
                <div class="row setmargin" id="userinfo_0">用户名</div>
                <div class="row setmargin" id="userinfo_1">昵称</div>
                <div class="row setmargin" id="userinfo_2">邮箱</div>
                <div class="row setmargin" id="userinfo_3">电话</div>
                <div class="row setmargin ">
                    <a href="/api/user/update">
                        <button class="setbtnpadding">修改资料</button>
                    </a>
                </div>
            </div>
            <!--右侧选项列-->
            <div class="col-md-4 setmargin divcolor_1">
                <div class="row ziti">编辑</div>
                <div class="row ziti_1 setpadding setmargin">
                    <a href="/api/user/personal">我的个人资料</a>
                </div>
                <div class="row ziti_1 setmargin">
                    <a href="/api/order/orders">我的订单</a>
                </div>
                <div class="row ziti_1 setmargin">
                    <a href="/api/user/updatepassword">修改密码</a>
                </div>
            </div>
        </div>

        <div class="row">
            <div class="row divcolor setmargin_2">
                <h3>我的游戏</h3>
            </div>
            <div class="row">
                <div class="deletepadding">
                    <ul id="fenleixiangqing">
                    </ul>
                </div>
            </div>
        </div>
    </div>
</div>
</div>

<%@ include file="common/bottom.jsp" %>

</body>
</html>