<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 29.09.2020
  Time: 21:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<c:if test="${sessionScope.user == null}">
    Hello:)
</c:if>

<c:if test="${sessionScope.user != null}">
    ${sessionScope.user}
</c:if>
<br>
<a href="/home/registr">Registration</a>
<br>
<a href="/home/auth">Authorization</a>

</body>
</html>
