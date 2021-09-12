package info.jongwoo.Boot_pj_01.service;

import info.jongwoo.Boot_pj_01.domain.ChatRoomDTO;

import java.util.List;

public interface ChatService {

    List<ChatRoomDTO> getRoomList();
}
