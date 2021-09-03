<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="t" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<div id = "main-content">
    <div class = "main left">
        <h1>아 개발 너무 오랜만에 한다...</h1>
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
    </div>
    <div class ="main right">
        <form action="/" method="post">
            <input name = "id" type="text" placeholder="id입력하세요">
            <input name = "pw" type="text" placeholder="pw입력하세요">
            <button type="submit">가입</button>
        </form>
    </div>
</div>
