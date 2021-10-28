package week2.board_basic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Post {

    @Entity(name = "PostObject")
    public static class PostObject {

        @Id
        @GeneratedValue
        private Integer id;

        @Column
        private String username;

        @Column
        private String password;

        @Column
        private String content;
    }
}
