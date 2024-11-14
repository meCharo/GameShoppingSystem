<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String id = request.getParameter("id");
    String user = request.getParameter("user");
    request.setAttribute("id", id);
    request.setAttribute("user", user);
%>
<nav class="navbar navbar-inverse">
    <div class="container-fluid headheight">
        <div class="col-md-offset-3">
            <div class="navbar-header">
                <a href="/">
                    <img alt="Brand" src="/img/logo.jpg" width="90" height="60">
                </a>
            </div>
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li>
                        <a href="/">Store</a>
                    </li>
                    <li class="navbar-form">
                        <div class="form-group">
                            <input type="text" class="form-control" placeholder="Search" id="searchbox">
                        </div>
                        <button type="submit" class="btn btn-default" onclick="search()"><span class="glyphicon glyphicon-search" aria-hidden="true"></span></button>
                    </li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <c:choose>
                        <c:when test="${user == null}">
                            <li><a href="/api/user/login" methods="get">Login</a></li>
                            <li><a href="/api/user/register" methods="get">Register</a></li>
                        </c:when>
                        <c:otherwise>
                            <li><a href="/api/user/personal">${user}，Hello</a></li>
                            <li><a href="/api/user/shoppingcart">Shopping cart</a></li>
                            <li><a onclick="outlogin()">Log out</a></li>
                        </c:otherwise>
                    </c:choose>
                </ul>
            </div>
        </div>
    </div>
</nav>
