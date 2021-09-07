<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="t" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<!--study-content -->


<div id = "study-content">

    <!--main left-->
    <div class = "main left board">

        <!--page-title-->
        <div class = "page-title">
            <span class = "title-span">DEV LOG</span>
        </div>
        <!--page-title-->

        <!--board-list-background-->
        <div id = "board-list-background">
            <div class="write-area">
                <div class = "write-title-wrapper">
                    <div class = "title-notice">제목 : </div>
                    <div class = "title-content" contenteditable="true"></div>
                </div>
                <div class = "write-content-wrapper">
                    <div class = "write-content" contenteditable="true"></div>
                </div>
            </div>

            <!--table head-->
            <div class = "board_list_wrap">
                <div class = "board_no">번호</div>
                <div class = "board_title">제목</div>
                <div class = "board_writer">작성자</div>
            </div>
            <!--table head-->
            <!--table element-->
            <!--table element-->
        </div>
        <!--board-list-background-->
        <div id ="board-btn-area">
            <a class = "basic-btn change">글쓰기</a>
            <div class = "basic-btn write-btn">작성</div>
        </div>
    </div>
    <!--main left-->


    <!--main right-->
    <div class ="main right boardView">

            <div class = "view_wrapper">
                <div class = "view-title">글제목</div>
                <div class = "view-contents">내용</div>
            </div>

    </div>
    <!--main right-->
</div>
<!--study-content -->

<script>
    //view-title writer
    $(document).ready(function(){
        boardService.getList(
            function(result){
                writeList(result)
            }
        );
    });

    $(".main").on("click",".board_list_wrap.contents",function() {
        $(".view-title").text($(this).find(".board_title").text());
    });


    //view ajax
    $(".main").on("click",".board_list_wrap.contents",function(){
        console.log("/list/"+$(this).find(".board_no").text());
        var bno = $(this).find(".board_no").text()
        boardService.list(
            bno,
            function(result){
                $(".view-contents").html(result.bcontent);
            }
        );
    });

    $("#board-btn-area").on("click",".basic-btn",function() {

        if ($(this).text() == "글쓰기") {
            $(this).text("목록으로")
            $(".board_list_wrap").hide();
            $(".write-area").show();
            $(".write-btn").css("visibility", "visible");
        } else if ($(this).text() == "목록으로") {
            $(this).text("글쓰기");
            $(".write-area").hide();
            $(".board_list_wrap").show();
            $(".write-btn").css("visibility", "hidden");
        } else {
            var url = "/regist";
            var btitle = $(".title-content").text();
            var bcontent = $(".write-content").text();
            var bdto = {btitle,bcontent};

            if(btitle != ''||bcontent!=''){
                boardService.write(url,bdto,
                    function(){
                        $(".basic-btn.change").text("글쓰기");
                        $(".write-area").hide();
                        $(".board_list_wrap").show();
                        $(".write-btn").css("visibility", "hidden");
                        boardService.getList(
                            function(result){
                                writeList(result)
                            }
                        );
                    }
                )

            }else{
                alert("제목,내용이 비었습니다.")
            }
        }
    });
    function writeList(result){
        let tag = '<div class="write-area"><div class = "write-title-wrapper"><div class = "title-notice">제목 : </div><div class = "title-content" contenteditable="true"></div></div><div class = "write-content-wrapper"><div class = "write-content" contenteditable="true"></div></div></div>';
        for (let i = 0; i<result.length; i++){
            tag += '<div class="board_list_wrap contents" style="user-select: auto;"><div class="board_no" style="user-select: auto;">'+result[i].bno+'</div><div class="board_title" style="user-select: auto;">'+result[i].btitle+'</div><div class="board_writer" style="user-select: auto;">작성자</div></div>';
        }
        $("#board-list-background").html(tag)
    }
</script>