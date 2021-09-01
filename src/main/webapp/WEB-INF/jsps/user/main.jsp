<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="t" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<<<<<<< HEAD

<div class = "body">
	<h1>Hello World!</h1>
</div>
=======
<h1>Hello World!</h1>
<table class="user-list-table">
    <thead>
        <tr>
            <th>no</th>
            <th>id</th>
            <th>password</th>
        </tr>
    </thead>
    <tbody>
    <c:forEach var="userItem" items="${userList}" varStatus="status">
        <tr>
            <td>${userItem.no}</td>
            <td>${userItem.id}</td>
            <td>${userItem.password}</td>
        </tr>
    </c:forEach>

    </tbody>
</table>
>>>>>>> a54f255c03d116f7eeed24ecd9d64347fc485b12
