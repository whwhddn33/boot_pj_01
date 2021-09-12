package info.jongwoo.Boot_pj_01.mapper;

import info.jongwoo.Boot_pj_01.domain.ChatRoomDTO;

import java.util.List;

public interface ChatMapper {

    List<ChatRoomDTO> getRoomList();
}
