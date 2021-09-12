package info.jongwoo.Boot_pj_01.controller;


import info.jongwoo.Boot_pj_01.common.Const;
import info.jongwoo.Boot_pj_01.service.UserSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomeController {

    @Autowired

    @RequestMapping("/")
    public String main(){return "/main"+ Const.uTiles;}
}
