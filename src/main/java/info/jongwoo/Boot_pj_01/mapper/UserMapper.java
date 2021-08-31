package info.jongwoo.Boot_pj_01.mapper;

import info.jongwoo.Boot_pj_01.domain.UserDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    List<UserDTO> userList() throws Exception;

}
