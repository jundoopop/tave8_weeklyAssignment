package week2.board_basic.model;

import javax.persistence.*;

public class Post {

    @Entity(name = "PostObject")
    public static class PostObject {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        @Column
        private String username;

        @Column
        private String password;

        @Column
        private String content;
    }
}
