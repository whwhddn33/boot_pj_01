package info.jongwoo.Boot_pj_01.service;

import info.jongwoo.Boot_pj_01.domain.ChatRoomDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ChatServiceImpl implements ChatService{

    @Autowired
    ChatMapper chatMapper;

    @Override
    public List<ChatRoomDTO> getRoomList() {

        return ChatMapper.getRoomList();
    }
}
