package info.jongwoo.Boot_pj_01.service;

import info.jongwoo.Boot_pj_01.domain.UserDTO;

import java.util.List;

public interface UserSerivce {

    List<UserDTO> userList() throws Exception;

}
