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
    <script>
        $("add").click(function (){
            var title = $("#title").val();

            $.ajax({
                url: "adding",
                data: {"title": title },
                type: "post"})})

    </script>
</table>
    <form>
        <table>
        <tr>
            <td><label for="title">Add </label> </td>
            <td><input type="text" name="title" id="title"/></td>
        </tr>
        </table>
    <input type="submit" value="Add" id="add" onClick="add()"/>
</form>

</body>
</html>