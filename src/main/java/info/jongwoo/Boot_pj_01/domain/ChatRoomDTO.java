package info.jongwoo.Boot_pj_01.domain;


import lombok.Data;

@Data
public class ChatRoomDTO {

    private int no;
    private int master_user_no;
    private String title;
    private int max_user;
    private int current_user;
    private String private_room;
}
