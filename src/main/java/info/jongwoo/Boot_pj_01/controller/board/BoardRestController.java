package info.jongwoo.Boot_pj_01.controller.board;


import info.jongwoo.Boot_pj_01.domain.BoardDTO;
import info.jongwoo.Boot_pj_01.service.BoardService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Log4j2
@RequestMapping("/list/*")
public class BoardRestController {

    @Autowired
    BoardService boardService;

    @GetMapping(value = "/{bno}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BoardDTO> getItem(@PathVariable int bno){
        log.info("request");
        return new ResponseEntity<BoardDTO>(boardService.getItem(bno), HttpStatus.OK);
    }
}