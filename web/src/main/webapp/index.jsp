<%--
  Created by IntelliJ IDEA.
  User: IceLee
  Date: 2017/4/8
  Time: 20:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>

<form action="${pageContext.request.contextPath}user/login.action">
    用户名： <input type="text" name="username"/><br/>
    密码:<input type="text" name="password"/><br/>
    <input type="submit"/><br/>
</form>

</body>
</html>
