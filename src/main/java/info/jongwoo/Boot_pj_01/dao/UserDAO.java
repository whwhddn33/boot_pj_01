package info.jongwoo.Boot_pj_01.dao;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface UserDAO {

    public List<Map<String, Object>> userList();

}
