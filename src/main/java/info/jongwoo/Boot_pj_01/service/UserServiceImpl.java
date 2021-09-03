package info.jongwoo.Boot_pj_01.service;

import info.jongwoo.Boot_pj_01.domain.UserDTO;
import info.jongwoo.Boot_pj_01.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserSerivce {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserDTO> userList(UserDTO udto) throws Exception {

        udto.setId(udto.getId());
        udto.setPassword(udto.getPassword());
        return userMapper.userList();
    }

    @Override
    public void userInsert(UserDTO userDTO) throws Exception {
        userMapper.userInsert(userDTO);
    }

}
