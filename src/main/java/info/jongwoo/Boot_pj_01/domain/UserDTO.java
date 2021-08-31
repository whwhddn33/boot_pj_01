package info.jongwoo.Boot_pj_01.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Data
public class UserDTO {

    private int no;
    private String id;
    private String password;

}
