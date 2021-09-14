<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="t" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<!--study-content -->


<div id = "study-content">

    <!--main left-->
    <div class = "main left board">
        chatilst<div class = "interval-counter"></div>

        <div id = "chat-list-area">
            <div class = "chat-list-item top">
                <div class = "room-no">
                    <div>방번호</div>
                </div>
                <div class = "room-title">
                    <div>방제</div>
                </div>
                <div class = "room-max">
                    <div>최대인원</div>
                </div>
                <div class = "room-current">
                    <div>참여인원</div>
                </div>
                <div class = "room-master">
                    <div>방장</div>
                </div>
            </div>

            <div class = "contents-wrapper">

                <div class = "chat-list-item">
                    <div class = "room-no">
                        <div>방번호</div>
                    </div>
                    <div class = "room-title">
                        <div>방제</div>
                    </div>
                    <div class = "room-max">
                        <div>최대인원</div>
                    </div>
                    <div class = "room-current">
                        <div>참여인원</div>
                    </div>
                    <div class = "room-master">
                        <div>방장</div>
                    </div>
                </div>

            </div>
        </div>


    </div>
    <!--main left-->
    <!--main right-->
    <div class ="main right boardView">
        room
    </div>
    <!--main right-->
</div>
<!--study-content -->

<script>
var counter = 0;

    $(document).ready(function(){
        setInterval(getlistrotate,1000)
    })


    function getlistrotate() {
        chatService.getlist(function (result) {
            var tag = ''
            for (var i = 0; i < result.length; i++) {
                tag += '<div class = "chat-list-item">' +
                    '<div class = "room-no">' +
                    '<div>' + result[i].no + '</div>' +
                    '</div>' +
                    '<div class = "room-title">' +
                    '<div>' + result[i].title + '</div>' +
                    '</div>' +
                    '<div class = "room-max">' +
                    '<div>' + result[i].max_user + '</div>' +
                    '</div>' +
                    '<div class = "room-current">' +
                    '<div>' + result[i].current_user + '</div>' +
                    '</div>' +
                    '<div class = "room-master">' +
                    '<div>' + result[i].master_user_no + '</div>' +
                    '</div>' +
                    '</div>'
            }
            $(".contents-wrapper").html(tag);
            $(".interval-counter").html(counter++)
        });
    }

    $('chat-list-area').on('click','chat-list-item',function(){
        var roomNo = $(this).find('room-no').text();


    });

</script>