package info.jongwoo.Boot_pj_01.controller.user;

import info.jongwoo.Boot_pj_01.common.Const;
import info.jongwoo.Boot_pj_01.domain.UserDTO;
import info.jongwoo.Boot_pj_01.service.UserSerivce;
import lombok.extern.log4j.Log4j;
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
public class UserMainController {

    @Autowired
    private UserSerivce userService;


    @RequestMapping({"/"})
    public ModelAndView main(HttpServletRequest request, Model md) throws Exception {
        ModelAndView model = new ModelAndView("/main"+Const.uTiles);
        UserDTO udto = new UserDTO();
        log.info("====================================");
        log.info(request.getParameter("id"));
        log.info("====================================");
        udto.setId(request.getParameter("id"));
        udto.setPassword(request.getParameter("pw"));

        if(request.getParameter("id")!=null){
            userService.userInsert(udto);
        }
            List<UserDTO> userList = userService.userList(udto);
            model.addObject("userList", userList);
            return model;
    }

}