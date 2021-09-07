package info.jongwoo.Boot_pj_01.service;

import info.jongwoo.Boot_pj_01.domain.BoardDTO;
import info.jongwoo.Boot_pj_01.mapper.BoardMapper;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
public class BoardServiceImpl implements BoardService{

    @Autowired
    BoardMapper boardMapper;


    @Override
    public List<BoardDTO> boardList(){return boardMapper.boardList();}

    @Override
    public BoardDTO getItem(int bno){return boardMapper.getItem(bno);}

    @Override
    public int register(BoardDTO bdto){return boardMapper.register(bdto);}

}
