package week2.board_basic.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    private String content;

    public Post(String username, String password, String content) {
        this.username = username;
        this.password = password;
        this.content = content;
    }

    @Override
    public String toString() {
        return String.format(
                "id = %d, username = '%s', password = '%s', content = '%s'", id, username, password, content
        );
    }
}
