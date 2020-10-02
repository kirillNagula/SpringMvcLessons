<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 25.09.2020
  Time: 20:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>home</title>
</head>
<body>

<c:if test="${message != null}">
    <h1>${message}</h1>
</c:if>

<form action="/home/calc" method="post">
    значение1 <input  name="num1">
    значение2 <input  name="num2">
    операция <select name="type">
    <option value="sum">Суммировать</option>
    <option value="sub">Отнять</option>
    <option value="mult">Умножить</option>
    <option value="div">Разделить</option>
</select>
    <br>
    <button>Подсчитать</button>
</form>

</body>
</html>
