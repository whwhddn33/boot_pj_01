package info.jongwoo.Boot_pj_01.controller.boardController;


import info.jongwoo.Boot_pj_01.common.Const;
import info.jongwoo.Boot_pj_01.domain.BoardDTO;
import info.jongwoo.Boot_pj_01.service.BoardService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@Log4j2
@RequestMapping("/")
public class BoardController {


    @Autowired
    private BoardService boardService;

    @GetMapping("/board")
    public ModelAndView board() throws Exception{

        ModelAndView model = new ModelAndView("/board"+ Const.uTiles); // 모델객체
        BoardDTO bdto = new BoardDTO();

        List<BoardDTO> boardList = boardService.boardList(bdto);
        model.addObject("boardlist",boardList);
        log.info(model.toString());

        return model;
    }
}