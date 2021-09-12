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
@RequestMapping("/member")
public class UserMemberController {

    @Autowired
    private UserSerivce userService;

    @GetMapping("")
    public ModelAndView main() throws Exception {
        ModelAndView model = new ModelAndView("/main"+Const.uTiles); // 모델객체
        return model;
    }

    @PostMapping("/login")
    public ModelAndView login(@RequestParam("id") String id, @RequestParam("password") String pw, HttpServletRequest request){
    UserDTO udto = new UserDTO();

    log.info("/login");
    udto.setId(id);
    udto.setPassword(pw);
        udto.setNo(userService.loginCheck(udto).getNo());
    if(userService.loginCheck(udto)!=null){
        log.info("true");
        HttpSession session = request.getSession();
        session.setAttribute("userno",udto.getNo());
    }else{
        log.info("false");
    }

    ModelAndView model = new ModelAndView("/main"+Const.uTiles); // 모델객체
    return model;
    }

    @PostMapping("/join")
    public String main(HttpServletRequest request) throws Exception {

        UserDTO udto = new UserDTO(); // 디티오객체

        // 벨류 셋
        udto.setId(request.getParameter("id"));
        udto.setPassword(request.getParameter("pw"));

        //인서트 메서드 조건문
        if(request.getParameter("id")!=null){
            userService.userInsert(udto);
        }

        return "redirect:/member/";//get매핑으로 보내기
    }
}