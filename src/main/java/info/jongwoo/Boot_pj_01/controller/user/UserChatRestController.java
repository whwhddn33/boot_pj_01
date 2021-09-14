package info.jongwoo.Boot_pj_01.controller.user;


import info.jongwoo.Boot_pj_01.domain.ChatRoomDTO;
import info.jongwoo.Boot_pj_01.service.ChatService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/chating")
@Log4j2
public class UserChatRestController {

    @Autowired
    ChatService chatService;

    @GetMapping(value = "/roomlist",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<ChatRoomDTO>> chatroomlist(){
        List<ChatRoomDTO> crdto = chatService.getRoomList();
        return new ResponseEntity<List<ChatRoomDTO>>(crdto, HttpStatus.OK);
    }



}
