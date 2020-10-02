<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 29.09.2020
  Time: 21:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
<form action="/home/registr" method="post">
    Name<input name="name">
    Login<input name="login">
    Password<input name="password">
    <button> Submit </button>
</form>

${message}

</body>
</html>
