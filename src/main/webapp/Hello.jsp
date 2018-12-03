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
<form:form method="POST" action="/adding" modelAttribute="todo">
<table>
    <tr>
        <td><form:label path="title">Add todo</form:label></td>
        <td><form:input path="title"/></td>
        <td><form:errors path="title" /></td>
    </tr>
<tr>
    <td><input type="submit" value="Add"/></td>
</tr>
</table>
</form:form>
<form:form method="POST" action="/removing" modelAttribute="todo">
<table>
    <tr>
        <td><form:label path="id">Delete todo</form:label></td>
        <td><form:input path="id"/></td>
        <td><form:errors path="id" /></td>
    </tr>
    <tr>
        <td><input type="submit" value="Delete"/></td>
    </tr>
</table>
</form:form>
</body>
</html>