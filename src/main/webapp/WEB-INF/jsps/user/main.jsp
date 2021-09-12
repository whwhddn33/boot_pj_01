<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="t" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<div id = "main-content">
    <div class ="main left">
        <form action="/user/login" id="loginForm" method="post">
            <input type="text" name="id" id="id" placeholder="아이디를 입력하세요.">
            <input type="password" name="password" id="password" placeholder="패스워드를 입력하세요.">
            <a href="javascript:void(0)" id="loginBtn">로그인하기</a>
        </form>
    </div>

    <div class ="main right">
        <form action="/user/join" method="post">
            <input name = "id" type="text" placeholder="아이디를 입력하세요">
            <input name = "pw" type="text" placeholder="패스워드를 입력하세요">
            <button type="submit">가입</button>
        </form>
    </div>
</div>

<script>
    $(document).on("click", "#loginBtn", function(){
        var id = $("#id").val();
        var password = $("#password").val();

        if (!id) {
            alert("아이디를 입력해주세요.");
            return false;
        }

        if (!password) {
            alert("패스워드를 입력해주세요.");
            return false;
        }

        $("#loginForm").submit();
    });
</script>
