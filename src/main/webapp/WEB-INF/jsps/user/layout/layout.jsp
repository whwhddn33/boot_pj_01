<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="t" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html lang="ko">
<head>

    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <title>Community</title>
    <link href="/assets/css/swiper.min.css" rel="stylesheet">
    <link href="/assets/css/style.css" rel="stylesheet">
    <link href="/assets/css/responsive.css" rel="stylesheet">
    <link href="/assets/css/reset.css" rel="stylesheet">
    <link href="/assets/css/datepicker.css" rel="stylesheet" />
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@100;300;400;500;700;900&display=swap" rel="stylesheet">
    <script src="/assets/js/jquery-3.6.0.min.js"></script>
    <script src="/assets/js/swiper.min.js"></script>
    <script src="/assets/js/validation.js"></script>
    <script src="/assets/js/datepicker.js"></script>
    <script src="/assets/js/datepicker.kr.js"></script>
    <script src ="/assets/js/boardService.js"></script>
</head>

<body>
<div class="wrap">
    <t:insertAttribute name="header" />
    <div class = "body">
        <t:insertAttribute name="body" />
    </div>
    <t:insertAttribute name="footer" />
</div>
</body>

</html>