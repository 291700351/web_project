<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: IceLee
  Date: 2017/4/4
  Time: 19:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<c:forEach items="${users}" var="user">
    ${user.name}--->${user.mobile}<br/>
</c:forEach>


</body>
</html>
