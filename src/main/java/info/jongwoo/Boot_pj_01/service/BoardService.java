package info.jongwoo.Boot_pj_01.service;

import info.jongwoo.Boot_pj_01.domain.BoardDTO;

import java.util.List;

public interface BoardService {



    List<BoardDTO> boardList();
    BoardDTO getItem(int bno);
    int register(BoardDTO bdto);

}
