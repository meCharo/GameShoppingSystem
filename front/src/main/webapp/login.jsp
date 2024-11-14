<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@ include file="common/head.jsp" %>
    <link href="/css/login.css" rel="stylesheet">
    <script src="/js/login.js" type="text/javascript" charset="utf-8"></script>
    <title>Login</title>
</head>
<body>
<%@ include file="common/top.jsp" %>
<div class="container">
    <div class="row">
        <div class="row bjys ztys dlkwz">
            <div class="col-xs-4">
                <h1 class="btys">Login</h1>
                <p> to existed WePlay Account</p> <br>
                <p>UserName</p>
                <input type="text" class="form-control" placeholder="User Name" id="name">
                <h5>Password</h5>
                <input type="password" class="form-control" placeholder="Password" id="password">
                <input type="checkbox" id="remember">Remember me
                <br/><br/>
                <button type="submit" class="btnys" onclick="login()"><p class="btys">Login</p></button>
                <br/><br/>
                <a href="/user/findpassword">Forget Password？</a>
            </div>
            <div class="col-xs-4">
                <h1 class="btys">Create</h1>
                <h5>A free Weplay Account</h5>
                <h5>Welcome to join in Weplay. Continue to create Weplay Account<br/>
                    digit solutions for PC and Mac players<br/>
                </h5>
                <a href="/register">
                    <button type="submit" class="btnys"><p class="btys">Join in Weplay</p></button>
                </a>
            </div>
            <div class="col-xs-4">
                <h3 class="btys">Why join in Weplay？</h3>
                <ul type="disc">
                    <li>Buy and download games</li>
                    <li>Join in Weplay community</li>
                    <li>Chat with friends</li>
                    <li>At any computers</li>
                    <li>Schedule game, contest and party</li>
                    <li>Obtain update automatically</li>
                    <img class="imgdx" src="/img/login.png"/>
                </ul>
            </div>
        </div>
    </div>
</div>

<%@ include file="common/bottom.jsp" %>
</body>
</html>
