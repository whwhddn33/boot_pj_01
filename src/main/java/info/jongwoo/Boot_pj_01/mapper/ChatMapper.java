package info.jongwoo.Boot_pj_01.mapper;

import info.jongwoo.Boot_pj_01.domain.ChatRoomDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ChatMapper {

    List<ChatRoomDTO> getRoomList();

}
