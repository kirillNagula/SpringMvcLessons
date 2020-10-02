<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 01.10.2020
  Time: 15:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>User Menu</title>
</head>
<body>
<h1>Список Всех зарегестрированныъ ползователей</h1>
<ul>
    <c:forEach items="${userList}" var="userList">
        <li> ${userList}</li>
        <form action="/home/users" method="get">
            <button>Delete</button>
        </form>
    </c:forEach>
</ul>

</body>
</html>
