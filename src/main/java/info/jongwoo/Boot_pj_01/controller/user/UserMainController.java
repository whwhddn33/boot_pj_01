package info.jongwoo.Boot_pj_01.controller.user;

import info.jongwoo.Boot_pj_01.common.Const;
import info.jongwoo.Boot_pj_01.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class UserMainController {

    @Autowired
    UserDAO userDAO;

    @RequestMapping({"/"})
    public String main(Map<String, Object> map) {
        map.put("userList", userDAO.userList());
        return "/main" + Const.uTiles;
    }

}