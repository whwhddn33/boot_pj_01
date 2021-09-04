<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="t" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<div id = "study-content">


    <div class = "main left board">

        <div id = "board-list-background">

            <div class = "board_list_wrap">
                <div class = "board_no">번호</div>
                <div class = "board_title">제목</div>
                <div class = "board_writer">작성자</div>
            </div>

            <c:forEach var="blist" items="${boardlist}">
                <div class = "board_list_wrap contents">
                    <div class = "board_no">${blist.bno}</div>
                    <div class = "board_title">${blist.btitle}</div>
                    <div class = "board_writer">작성자</div>
                </div>
            </c:forEach>

        </div>


    </div>

    <div class ="main right boardView">

            <div class = "view_wrapper">
                <div class = "view-title">글제목</div>
                <div class = "view-contents">내용</div>
            </div>


    </div>
</div>


<script>

    $(".main").on("click",".board_list_wrap.contents",function() {
        $(".view-title").text($(this).find(".board_title").text());
    });

    $(".main").on("click",".board_list_wrap.contents",function(){
        console.log("/list/"+$(this).find(".board_no").text());
        $.ajax({
            url:"/list/"+$(this).find(".board_no").text(),
            dataType:"json",
            success:function (result){
                $(".view-contents").html(result.bcontent);
            },
            error:function (requestStatus,textStatus,err){
                alert("fail")
                console.log(requestStatus)
                console.log(textStatus)
                console.log(err)
            }
        });
    });


</script>