package info.jongwoo.Boot_pj_01.service;

import info.jongwoo.Boot_pj_01.domain.ChatRoomDTO;
import info.jongwoo.Boot_pj_01.mapper.ChatMapper;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Log4j2
public class ChatServiceImpl implements ChatService{

    @Autowired
    ChatMapper chatMapper;

    @Override
    public List<ChatRoomDTO> getRoomList() {
        log.info("chatserviceimpl getRoomList");
        log.info("chatserviceimpl getRoomList");
        log.info("chatserviceimpl getRoomList");
        log.info("chatserviceimpl getRoomList");
        log.info("chatserviceimpl getRoomList");
        log.info("chatserviceimpl getRoomList");
        return chatMapper.getRoomList();}
}
