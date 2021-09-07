package info.jongwoo.Boot_pj_01.mapper;

import info.jongwoo.Boot_pj_01.domain.BoardDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    List<BoardDTO> boardList();

    BoardDTO getItem(int bno);

    int register(BoardDTO bdto);
}
