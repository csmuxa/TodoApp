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

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>MyFirstServlet</title>

</head>
<table>
<div class="login">
    <table>
<c:forEach items="${todos}" var="todo">
    <tr id="todo_${todo.id }">
    <td>${todo.id}</td>
    <td>${todo.title}</td>
</div>
<div class="shadow"></div>
</c:forEach>
</table>
    <form action="addTodo" method="post">
    <br/>
    <textarea name="description" rows="5" cols="100"></textarea>
    <br/>
    <input type="submit" value="Add">
</form>
</body>
</html>