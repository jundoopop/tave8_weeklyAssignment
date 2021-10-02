package week2.board_basic.controller;

import lombok.Getter;
import lombok.Setter;
import org.springframework.transaction.annotation.Transactional;

@Getter
@Setter
@Transactional
public class PostForm {
    private String username;
    private String password;
    private String content;

}
