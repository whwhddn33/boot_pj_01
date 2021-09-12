package info.jongwoo.Boot_pj_01.service;

import info.jongwoo.Boot_pj_01.domain.UserDTO;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface UserSerivce {

    List<UserDTO> userList(UserDTO udto) throws Exception;

    void userInsert(UserDTO userDTO) throws Exception;

    boolean loginCheck(UserDTO udto);
}
