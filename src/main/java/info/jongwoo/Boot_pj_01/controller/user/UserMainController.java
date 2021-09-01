package info.jongwoo.Boot_pj_01.controller.user;

import info.jongwoo.Boot_pj_01.common.Const;
import info.jongwoo.Boot_pj_01.domain.UserDTO;
import info.jongwoo.Boot_pj_01.service.UserSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UserMainController {

    @Autowired
    private UserSerivce userService;

    @RequestMapping({"/"})
    public ModelAndView main(Model model) throws Exception {
        ModelAndView modelAndView = new ModelAndView("/main"+Const.uTiles);

        UserDTO userDTO = new UserDTO();
        userDTO.setId("test4");
        userDTO.setPassword("4444");
        userService.userInsert(userDTO);
        userDTO.setId("test5");
        userDTO.setPassword("5555");
        userService.userInsert(userDTO);

        List<UserDTO> userList = userService.userList();
        modelAndView.addObject("userList", userList);

        return modelAndView;
    }

}