package info.jongwoo.Boot_pj_01.controller.chat;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log4j2
@RequestMapping("/chat")
public class ChatController {

    /*@Autowired
    private ChatService chatService;

    @RequestMapping("list")
    public ModelAndView board() throws Exception{

        ModelAndView model = new ModelAndView("/chat/list"+ Const.uTiles); // 모델객체
        return model;
    }*/

}
