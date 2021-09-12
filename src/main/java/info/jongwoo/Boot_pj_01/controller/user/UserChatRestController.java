package info.jongwoo.Boot_pj_01.controller.user;


import info.jongwoo.Boot_pj_01.domain.ChatRoomDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chating")
public class UserChatRestController {

    @Autowired
    ChatService chatService;

    @GetMapping(value = "/list",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ChatRoomDTO> chatroomlist(){

        return new ResponseEntity<ChatRoomDTO>(ChatService);
    }

}
