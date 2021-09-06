package info.jongwoo.Boot_pj_01.service;

import info.jongwoo.Boot_pj_01.domain.ChatDTO;

import java.util.List;

public interface ChatService {

    List<ChatDTO> chatList(ChatDTO chatDTO) throws Exception;

}
