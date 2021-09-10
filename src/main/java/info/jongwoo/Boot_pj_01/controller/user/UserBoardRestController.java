package info.jongwoo.Boot_pj_01.controller.board;


import info.jongwoo.Boot_pj_01.domain.BoardDTO;
import info.jongwoo.Boot_pj_01.service.BoardService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Log4j2
@RequestMapping("/list/*")
public class BoardRestController {

    @Autowired
    BoardService boardService;

    @GetMapping(value = "/{bno}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BoardDTO> getItem(@PathVariable int bno){
        return new ResponseEntity<BoardDTO>(boardService.getItem(bno), HttpStatus.OK);
    }

    @PostMapping(value = "/regist",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.TEXT_PLAIN_VALUE)
    public ResponseEntity<String> write(@RequestBody BoardDTO bdto){
        int insertCnt = boardService.register(bdto);
        return insertCnt == 1 ? new ResponseEntity<String>("success", HttpStatus.OK):new ResponseEntity<String>("fail",HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping(value = "/getList",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<BoardDTO>> getList() {
        List<BoardDTO> blist = boardService.boardList();
        return new ResponseEntity<List<BoardDTO>>(blist, HttpStatus.OK);
    }


}
