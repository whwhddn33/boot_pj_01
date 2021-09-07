/*board module*/

var boardService = (function(){

    function list(bno,callback,error){
        console.log("run board list")
        $.ajax({
            url:"/list/"+bno,
            dataType:"json",
            success:function (result){
                if (callback){
                    callback(result);
                }
            },
            error:function (xhr, status, err){
                alert("list fail")
                console.log("xhr : "+xhr)
                console.log("status : "+status)
                console.log("err : "+err);
            }
        });
    }

    function write(url,bdto,callback,error){
        console.log("run board write");

        $.ajax({
            type: "post",
            url: "/list"+url,
            data:JSON.stringify(bdto),
            contentType: "application/json;",
            success:function(result){
                if(callback){
                    callback(result);
                }
            },
            error: function (xhr, status, err) {
                alert("write fail")
                console.log("xhr : "+xhr)
                console.log("status : "+status)
                console.log("err : "+err);
            }
        });
    }
    function getList(callback){
        console.log("run board getList")
        $.getJSON("/list/getList",function(result){
            if (callback){
                callback(result)
            }
        });
    }





    return {list : list, write:write, getList:getList}

})();

/*
})();*/
