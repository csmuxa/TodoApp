<%--
  Created by IntelliJ IDEA.
  User: Zver
  Date: 24.11.2018
  Time: 18:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="z" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>MyFirstServlet</title>

</head>
<body>
<div class="login">
    <table>
<c:forEach items="${todos}" var="todo">
    <tr id="todo_${todo.id }">
    <td>${todo.id}</td>
    <td>${todo.title}</td>
</div>
<div class="shadow"></div>
</c:forEach>
</body>
</body>
</html>