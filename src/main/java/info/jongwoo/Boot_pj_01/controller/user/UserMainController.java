package info.jongwoo.Boot_pj_01.controller.user;

import info.jongwoo.Boot_pj_01.common.Const;
import info.jongwoo.Boot_pj_01.domain.UserDTO;
import info.jongwoo.Boot_pj_01.service.UserSerivce;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@Log4j2
@RequestMapping("/user")
public class UserMainController {

    @Autowired
    private UserSerivce userService;


    @GetMapping("")
    public ModelAndView goMain() throws Exception {

    ModelAndView model = new ModelAndView("/main"+Const.uTiles); // 모델객체
    return model;//list반환
    }

    @PostMapping("/join")
    public String join(HttpServletRequest request) throws Exception {

        UserDTO udto = new UserDTO(); // 디티오객체

        // 벨류 셋
        udto.setId(request.getParameter("id"));
        udto.setPassword(request.getParameter("pw"));

        //인서트 메서드 조건문
        if(request.getParameter("id")!=null){
            userService.userInsert(udto);
        }

        return "redirect:/user";//get매핑으로 보내기
    }

    @PostMapping("/login")
    public String login(UserDTO udto, HttpServletRequest request){
        log.info("================================");
        log.info("================================");
        log.info("================================");
        log.info("================================");
        log.info(udto.getId());
        log.info(udto.getPassword());
        log.info("================================");
        log.info("================================");
        log.info("================================");
        log.info("================================");
        log.info("================================");
        if(userService.loginCheck(udto)){
            HttpSession session = request.getSession();
            session.setAttribute("id",udto.getNo());
        }
        return "redirect:/user";
    }
}