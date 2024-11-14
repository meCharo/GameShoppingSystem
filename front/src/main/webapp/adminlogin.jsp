<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admin user login</title>
    <link rel="icon" href="/smile.ico" type="image/x-icon">
    <link href="/css/adminlogin.css" rel="stylesheet">
    <script src="https://cdn.bootcss.com/jquery/3.2.0/jquery.min.js"></script>
    <script src="/js/adminlogin.js"></script>
</head>

<body>
<div class="login">
    <h1>WePlay Admin</h1>
    <input id="username" type="text" placeholder="User name" required="required"/>
    <input id="password" type="password" name="p" placeholder="Password" required="required"/>
    <button onclick="login()" class="btn btn-primary btn-block btn-large">Login</button>
</div>
</body>
</html>
