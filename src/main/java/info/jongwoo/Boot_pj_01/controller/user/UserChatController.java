package info.jongwoo.Boot_pj_01.controller.user;


import info.jongwoo.Boot_pj_01.common.Const;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/chat")
public class UserChatController {


    @GetMapping("")
    public String chat(){return "/chat"+ Const.uTiles;}
}
