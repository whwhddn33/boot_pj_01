package info.jongwoo.Boot_pj_01.controller.user;

import info.jongwoo.Boot_pj_01.common.Const;
import info.jongwoo.Boot_pj_01.domain.UserDTO;
import info.jongwoo.Boot_pj_01.service.UserSerivce;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@Log4j2
@RequestMapping("/")
public class UserMainController {

    @Autowired
    private UserSerivce userService;


    @GetMapping("/")
    public ModelAndView goMain() throws Exception {

    ModelAndView model = new ModelAndView("/main"+Const.uTiles); // 모델객체
    UserDTO udto = new UserDTO(); // 디티오객체

    List<UserDTO> userList = userService.userList(udto);
    model.addObject("userList", userList);
    return model;//list반환
    }

    @PostMapping("/")
    public String main(HttpServletRequest request) throws Exception {

        UserDTO udto = new UserDTO(); // 디티오객체

        // 벨류 셋
        udto.setId(request.getParameter("id"));
        udto.setPassword(request.getParameter("pw"));

        //인서트 메서드 조건문
        if(request.getParameter("id")!=null){
            userService.userInsert(udto);
        }

        return "redirect:/";//get매핑으로 보내기
    }
}