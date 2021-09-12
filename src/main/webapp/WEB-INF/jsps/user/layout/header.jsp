<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="t" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<header>
    <c:set var="path" value="${requestScope['javax.servlet.forward.servlet_path']}" />

    <div class = "nav">
        <a class = "nava nava-1" href="/">HOME</a>
        <a class = "nava nava-2" href="/board">DEV LOG</a>
        <a class = "nava nava-3" href="/chat">CHAT ROOM</a>
        <a class = "nava nava-4" href="/">NAV4</a>
        <a class = "nava nava-5" href="/">임시헤더</a>
    </div>

    <div id = "dev-info">
        click
    </div>
    <div id = "info-window">
<%--        application<br><br>${applicationScope}<br><br>--%>
        session<br><br>${sessionScope}<br><br>
<%--        request<br><br>${requestScope}<br><br>--%>
<%--        page<br><br>${pageScope}<br><br>--%>
<%--        header<br><br>${header}<br><br>--%>
    </div>

</header>

<script>
    $(document).ready(function(){
        var path = "${path}";
        $(".nava").removeClass("active");
        switch(path){
            case "/":
                $(".nava-1").addClass("active");
                break;
            case "/board":
                $(".nava-2").addClass("active");
                break;
            case "/chat":
                $(".nava-3").addClass("active");
                break;
            case "/nav4":
                $(".nava-4").addClass("active");
                break;
            case "/header":
                $(".nava-5").addClass("active");
                break;
        }
    });

    $("#dev-info").click(function(){
        if ($("#info-window").hasClass("active")){
            $("#info-window").removeClass("active")
        }else $("#info-window").addClass("active");

    })
</script>