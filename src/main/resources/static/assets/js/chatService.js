/*board module*/

var chatService = (function(){

    function runtest(){alert("run chatService");}

    function getlist(callback){
        $.getJSON("/chating/roomlist",function(result){
            console.log('result')
            console.log(result)
            if(callback){
                callback(result)
            }
        });
    }












    return {runtest:runtest, getlist:getlist}

})();
